package github.enotvtapke.cobolsyntax;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import github.enotvtapke.cobolsyntax.psi.CobolTypes;
import com.intellij.psi.TokenType;

%%

%class CobolLexer
%implements FlexLexer
%unicode
%caseless
%function advance
%type IElementType
%eof{  return;
%eof}

WHITE_SPACE=[ \t\f]+
CRLF=\R
LINE_COMMENT=\*>.*
INTEGER=[0-9]+
IDENTIFIER=[A-Za-z][A-Za-z0-9\-]*
STRING='[^']*'

PICCHAR=[ABEGPSVXZabegpsvxz90\+\-\*\$]
REPEAT = \([0-9]+\)
PICTURE_STRING=(~[0-9ABCDPRSVXZa-z\*\+\-\/\,\.\;\(\)\=\'\"\ \n])? ({PICCHAR}+ {REPEAT}?)+ ([\/\,\.\:] ({PICCHAR}+ {REPEAT}?)+)*

%state WAITING_PICTURE

%%

<YYINITIAL> {
    {WHITE_SPACE}                   { return TokenType.WHITE_SPACE; }
    {CRLF}                          { return TokenType.WHITE_SPACE; }
    {LINE_COMMENT}                  { return CobolTypes.COMMENT; }

    "IDENTIFICATION"                { return CobolTypes.IDENTIFICATION; }
    "DIVISION"                      { return CobolTypes.DIVISION; }
    "PROGRAM-ID"                    { return CobolTypes.PROGRAM_ID; }
    "DATA"                          { return CobolTypes.DATA; }
    "WORKING-STORAGE"               { return CobolTypes.WORKING_STORAGE; }
    "SECTION"                       { return CobolTypes.SECTION; }
    "PROCEDURE"                     { return CobolTypes.PROCEDURE; }

    "PIC"                           { yybegin(WAITING_PICTURE); return CobolTypes.PIC; }
    "PICTURE"                       { yybegin(WAITING_PICTURE); return CobolTypes.PIC; }
    "VALUE"                         { return CobolTypes.VALUE; }

    "PERFORM"                       { return CobolTypes.PERFORM; }
    "VARYING"                       { return CobolTypes.VARYING; }
    "FROM"                          { return CobolTypes.FROM; }
    "BY"                            { return CobolTypes.BY; }
    "TO"                            { return CobolTypes.TO; }
    "UNTIL"                         { return CobolTypes.UNTIL; }
    "STOP"                          { return CobolTypes.STOP; }
    "RUN"                           { return CobolTypes.RUN; }
    "DISPLAY"                       { return CobolTypes.DISPLAY; }
    "COMPUTE"                       { return CobolTypes.COMPUTE; }
    "ADD"                           { return CobolTypes.ADD; }
    "SUBTRACT"                      { return CobolTypes.SUBTRACT; }
    "MULTIPLY"                      { return CobolTypes.MULTIPLY; }
    "DIVIDE"                        { return CobolTypes.DIVIDE; }
    "GIVING"                        { return CobolTypes.GIVING; }

    "."                             { return CobolTypes.DOT; }
    "("                             { return CobolTypes.LPAREN; }
    ")"                             { return CobolTypes.RPAREN; }
    "="                             { return CobolTypes.EQ; }
    "**"                            { return CobolTypes.POWER; }
    "+"                             { return CobolTypes.PLUS; }
    "-"                             { return CobolTypes.MINUS; }
    "*"                             { return CobolTypes.STAR; }
    "/"                             { return CobolTypes.SLASH; }

    {INTEGER}                       { return CobolTypes.INTEGER; }
    {STRING}                        { return CobolTypes.STRING; }

    {IDENTIFIER}                    { return CobolTypes.IDENTIFIER; }

    [^]                             { return TokenType.BAD_CHARACTER; }
}

<WAITING_PICTURE> {
    {WHITE_SPACE}                   { return TokenType.WHITE_SPACE; }
    "IS"                            { return CobolTypes.IS; }
    {PICTURE_STRING}                { yybegin(YYINITIAL); return CobolTypes.PICTURE_STRING; }
    [^]                             { yybegin(YYINITIAL); yypushback(1); }
}

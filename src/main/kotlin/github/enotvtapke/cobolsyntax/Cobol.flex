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

%{
    private int expectedLineNumber = 1;
%}

WHITE_SPACE=[ \t]+
CRLF=\R
LINE_COMMENT=\*>.*
INTEGER=[0-9]+
IDENTIFIER=[A-Za-z][A-Za-z0-9\-]*
STRING='[^']*'

PICCHAR=[ABEGPSVXZabegpsvxz90\+\-\*\$]
REPEAT = \([0-9]+\)
PICTURE_STRING=(\~[0-9ABCDPRSVXZa-z\*\+\-\/\,\.\;\(\)\=\'\"\ \n])?({PICCHAR}+ {REPEAT}?)+([\/\,\.\:]({PICCHAR}+ {REPEAT}?)+)*

%state WAITING_PICTURE
%state BEFORE_LINE_NUMBER
%state AFTER_LINE_NUMBER

%%

<YYINITIAL> {
    [^]                             { expectedLineNumber = 1; yypushback(1); yybegin(BEFORE_LINE_NUMBER); }
}

<BEFORE_LINE_NUMBER> {
    {WHITE_SPACE}                   { return TokenType.WHITE_SPACE; }
    {INTEGER}                       {
                                       int parsedNumber = Integer.parseInt(yytext().toString());
                                       if (parsedNumber == expectedLineNumber) {
                                           expectedLineNumber++;
                                           yybegin(AFTER_LINE_NUMBER);
                                           return CobolTypes.LINE_NUMBER;
                                       } else {
                                           return TokenType.BAD_CHARACTER;
                                       }
                                    }
    [^]                             { return TokenType.BAD_CHARACTER; }
}

<AFTER_LINE_NUMBER> {
    {WHITE_SPACE}                   { return TokenType.WHITE_SPACE; }
    {CRLF}                          { yybegin(BEFORE_LINE_NUMBER); return TokenType.WHITE_SPACE; }
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
    "THRU"                          { return CobolTypes.THRU; }
    "THROUGH"                       { return CobolTypes.THRU; }
    "STOP"                          { return CobolTypes.STOP; }
    "RUN"                           { return CobolTypes.RUN; }
    "DISPLAY"                       { return CobolTypes.DISPLAY; }
    "COMPUTE"                       { return CobolTypes.COMPUTE; }
    "ADD"                           { return CobolTypes.ADD; }
    "SUBTRACT"                      { return CobolTypes.SUBTRACT; }
    "MULTIPLY"                      { return CobolTypes.MULTIPLY; }
    "DIVIDE"                        { return CobolTypes.DIVIDE; }
    "GIVING"                        { return CobolTypes.GIVING; }
    "MOVE"                          { return CobolTypes.MOVE; }
    "ACCEPT"                        { return CobolTypes.ACCEPT; }
    "IF"                            { return CobolTypes.IF; }
    "THEN"                          { return CobolTypes.THEN; }
    "ELSE"                          { return CobolTypes.ELSE; }
    "END-IF"                        { return CobolTypes.END_IF; }
    "END-PERFORM"                   { return CobolTypes.END_PERFORM; }
    "NOT"                           { return CobolTypes.NOT; }
    "AND"                           { return CobolTypes.AND; }
    "OR"                            { return CobolTypes.OR; }

    "."                             { return CobolTypes.DOT; }
    "("                             { return CobolTypes.LPAREN; }
    ")"                             { return CobolTypes.RPAREN; }
    ">="                            { return CobolTypes.GE; }
    "<="                            { return CobolTypes.LE; }
    "<>"                            { return CobolTypes.NE; }
    "="                             { return CobolTypes.EQ; }
    ">"                             { return CobolTypes.GT; }
    "<"                             { return CobolTypes.LT; }
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
    {PICTURE_STRING}                { yybegin(AFTER_LINE_NUMBER); return CobolTypes.PICTURE_STRING; }
    [^]                             { yybegin(AFTER_LINE_NUMBER); yypushback(1); }
}

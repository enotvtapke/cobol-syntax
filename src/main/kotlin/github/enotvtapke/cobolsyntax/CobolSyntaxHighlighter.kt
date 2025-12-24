package github.enotvtapke.cobolsyntax

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import github.enotvtapke.cobolsyntax.psi.CobolTokenSets

class CobolSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = CobolLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return when {
            CobolTokenSets.KEYWORDS.contains(tokenType) -> KEYWORD_KEYS
            CobolTokenSets.STRINGS.contains(tokenType) -> STRING_KEYS
            CobolTokenSets.NUMBERS.contains(tokenType) -> NUMBER_KEYS
            CobolTokenSets.COMMENTS.contains(tokenType) -> COMMENT_KEYS
            CobolTokenSets.IDENTIFIERS.contains(tokenType) -> IDENTIFIER_KEYS
            CobolTokenSets.OPERATORS.contains(tokenType) -> OPERATOR_KEYS
            CobolTokenSets.PUNCTUATION.contains(tokenType) -> PUNCTUATION_KEYS
            CobolTokenSets.PICTURE_STRINGS.contains(tokenType) -> PICTURE_STRING_KEYS
            tokenType in CobolTokenSets.LINE_NUMBERS -> LINE_NUMBER_KEYS
            tokenType == TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS
            else -> EMPTY_KEYS
        }
    }

    companion object {
        val KEYWORD: TextAttributesKey = createTextAttributesKey(
            "COBOL_KEYWORD",
            DefaultLanguageHighlighterColors.KEYWORD
        )
        val STRING: TextAttributesKey = createTextAttributesKey(
            "COBOL_STRING",
            DefaultLanguageHighlighterColors.STRING
        )
        val NUMBER: TextAttributesKey = createTextAttributesKey(
            "COBOL_NUMBER",
            DefaultLanguageHighlighterColors.NUMBER
        )
        val COMMENT: TextAttributesKey = createTextAttributesKey(
            "COBOL_COMMENT",
            DefaultLanguageHighlighterColors.LINE_COMMENT
        )
        val LINE_NUMBER: TextAttributesKey = createTextAttributesKey(
            "COBOL_LINE_NUMBER",
            DefaultLanguageHighlighterColors.DOC_COMMENT
        )
        val IDENTIFIER: TextAttributesKey = createTextAttributesKey(
            "COBOL_IDENTIFIER",
            DefaultLanguageHighlighterColors.IDENTIFIER
        )
        val OPERATOR: TextAttributesKey = createTextAttributesKey(
            "COBOL_OPERATOR",
            DefaultLanguageHighlighterColors.OPERATION_SIGN
        )
        val PUNCTUATION: TextAttributesKey = createTextAttributesKey(
            "COBOL_PUNCTUATION",
            DefaultLanguageHighlighterColors.DOT
        )
        val PICTURE_STRING: TextAttributesKey = createTextAttributesKey(
            "COBOL_PICTURE_STRING",
            DefaultLanguageHighlighterColors.METADATA
        )
        val BAD_CHARACTER: TextAttributesKey = createTextAttributesKey(
            "COBOL_BAD_CHARACTER",
            HighlighterColors.BAD_CHARACTER
        )

        private val KEYWORD_KEYS = arrayOf(KEYWORD)
        private val STRING_KEYS = arrayOf(STRING)
        private val NUMBER_KEYS = arrayOf(NUMBER)
        private val COMMENT_KEYS = arrayOf(COMMENT)
        private val LINE_NUMBER_KEYS = arrayOf(LINE_NUMBER)
        private val IDENTIFIER_KEYS = arrayOf(IDENTIFIER)
        private val OPERATOR_KEYS = arrayOf(OPERATOR)
        private val PUNCTUATION_KEYS = arrayOf(PUNCTUATION)
        private val PICTURE_STRING_KEYS = arrayOf(PICTURE_STRING)
        private val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
        private val EMPTY_KEYS = emptyArray<TextAttributesKey>()
    }
}

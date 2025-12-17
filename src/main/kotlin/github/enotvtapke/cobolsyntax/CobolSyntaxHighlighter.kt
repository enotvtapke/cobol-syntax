package github.enotvtapke.cobolsyntax

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import github.enotvtapke.cobolsyntax.psi.CobolTypes

class CobolSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = CobolLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return when (tokenType) {
            CobolTypes.SEPARATOR -> SEPARATOR_KEYS
            CobolTypes.KEY -> KEY_KEYS
            CobolTypes.VALUE -> VALUE_KEYS
            CobolTypes.COMMENT -> COMMENT_KEYS
            TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS
            else -> EMPTY_KEYS
        }
    }

    companion object {
        val SEPARATOR: TextAttributesKey = createTextAttributesKey(
            "SIMPLE_SEPARATOR",
            DefaultLanguageHighlighterColors.OPERATION_SIGN
        )
        val KEY = createTextAttributesKey("SIMPLE_KEY", DefaultLanguageHighlighterColors.KEYWORD)
        val VALUE = createTextAttributesKey("SIMPLE_VALUE", DefaultLanguageHighlighterColors.STRING)
        val COMMENT = createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val BAD_CHARACTER = createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)


        private val BAD_CHAR_KEYS = arrayOf<TextAttributesKey>(BAD_CHARACTER)
        private val SEPARATOR_KEYS = arrayOf<TextAttributesKey>(SEPARATOR)
        private val KEY_KEYS = arrayOf<TextAttributesKey>(KEY)
        private val VALUE_KEYS = arrayOf<TextAttributesKey>(VALUE)
        private val COMMENT_KEYS = arrayOf<TextAttributesKey>(COMMENT)
        private val EMPTY_KEYS = arrayOf<TextAttributesKey>()
    }
}

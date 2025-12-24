package github.enotvtapke.cobolsyntax

import com.intellij.lexer.Lexer
import com.intellij.testFramework.LexerTestCase

class CobolLexerTest : LexerTestCase() {

    fun testLiterals() {
        doTest(
            "01 123 'HELLO' WS-NAME",
            """
            CobolTokenType.LINE_NUMBER ('01')
            WHITE_SPACE (' ')
            CobolTokenType.INTEGER ('123')
            WHITE_SPACE (' ')
            CobolTokenType.STRING (''HELLO'')
            WHITE_SPACE (' ')
            CobolTokenType.IDENTIFIER ('WS-NAME')
            """.trimIndent()
        )
    }

    fun testPictureClause() {
        doTest(
            "01 PIC 9(2)",
            """
            CobolTokenType.LINE_NUMBER ('01')
            WHITE_SPACE (' ')
            CobolTokenType.PIC ('PIC')
            WHITE_SPACE (' ')
            CobolTokenType.PICTURE_STRING ('9(2)')
            """.trimIndent()
        )
    }

    fun testComment() {
        doTest(
            "01 *> This is a comment",
            """
            CobolTokenType.LINE_NUMBER ('01')
            WHITE_SPACE (' ')
            CobolTokenType.COMMENT ('*> This is a comment')
            """.trimIndent()
        )
    }

    override fun createLexer(): Lexer = CobolLexerAdapter()

    override fun getDirPath(): String = "src/test/testData"
}

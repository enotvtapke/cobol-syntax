package github.enotvtapke.cobolsyntax

import com.intellij.lexer.Lexer
import com.intellij.testFramework.LexerTestCase

class CobolLexerTest : LexerTestCase() {

    fun testLiterals() {
        doTest(
            "123 'HELLO' WS-NAME",
            """
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
            "PIC 9(2)",
            """
            CobolTokenType.PIC ('PIC')
            WHITE_SPACE (' ')
            CobolTokenType.PICTURE_STRING ('9(2)')
            """.trimIndent()
        )
    }

    fun testComment() {
        doTest(
            "*> This is a comment",
            """
            CobolTokenType.COMMENT ('*> This is a comment')
            """.trimIndent()
        )
    }

    override fun createLexer(): Lexer = CobolLexerAdapter()

    override fun getDirPath(): String = "src/test/testData"
}

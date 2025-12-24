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

    fun testSeveralLines() {
        doTest(
            """
            01 *> This is a comment
            02 *> This is another comment
            03 *> This is another comment
            """.trimIndent(),
            """
            CobolTokenType.LINE_NUMBER ('01')
            WHITE_SPACE (' ')
            CobolTokenType.COMMENT ('*> This is a comment')
            WHITE_SPACE ('\n')
            CobolTokenType.LINE_NUMBER ('02')
            WHITE_SPACE (' ')
            CobolTokenType.COMMENT ('*> This is another comment')
            WHITE_SPACE ('\n')
            CobolTokenType.LINE_NUMBER ('03')
            WHITE_SPACE (' ')
            CobolTokenType.COMMENT ('*> This is another comment')
            """.trimIndent()
        )
    }

    fun testLineNumberWrongStart() {
        doTest(
            "02 DISPLAY 'HELLO'",
            """
            CobolTokenType.BAD_LINE_NUMBER ('02')
            WHITE_SPACE (' ')
            CobolTokenType.DISPLAY ('DISPLAY')
            WHITE_SPACE (' ')
            CobolTokenType.STRING (''HELLO'')
            """.trimIndent()
        )
    }

    fun testLineNumberSkipped() {
        doTest(
            """
            01 DISPLAY 'A'
            03 DISPLAY 'B'
            """.trimIndent(),
            """
            CobolTokenType.LINE_NUMBER ('01')
            WHITE_SPACE (' ')
            CobolTokenType.DISPLAY ('DISPLAY')
            WHITE_SPACE (' ')
            CobolTokenType.STRING (''A'')
            WHITE_SPACE ('\n')
            CobolTokenType.BAD_LINE_NUMBER ('03')
            WHITE_SPACE (' ')
            CobolTokenType.DISPLAY ('DISPLAY')
            WHITE_SPACE (' ')
            CobolTokenType.STRING (''B'')
            """.trimIndent()
        )
    }

    fun testLineNumberDuplicate() {
        doTest(
            """
            01 DISPLAY 'A'
            01 DISPLAY 'B'
            """.trimIndent(),
            """
            CobolTokenType.LINE_NUMBER ('01')
            WHITE_SPACE (' ')
            CobolTokenType.DISPLAY ('DISPLAY')
            WHITE_SPACE (' ')
            CobolTokenType.STRING (''A'')
            WHITE_SPACE ('\n')
            CobolTokenType.BAD_LINE_NUMBER ('01')
            WHITE_SPACE (' ')
            CobolTokenType.DISPLAY ('DISPLAY')
            WHITE_SPACE (' ')
            CobolTokenType.STRING (''B'')
            """.trimIndent()
        )
    }

    fun testLineNumberDecreasing() {
        doTest(
            """
            01 DISPLAY 'A'
            02 DISPLAY 'B'
            03 DISPLAY 'C'
            02 DISPLAY 'D'
            """.trimIndent(),
            """
            CobolTokenType.LINE_NUMBER ('01')
            WHITE_SPACE (' ')
            CobolTokenType.DISPLAY ('DISPLAY')
            WHITE_SPACE (' ')
            CobolTokenType.STRING (''A'')
            WHITE_SPACE ('\n')
            CobolTokenType.LINE_NUMBER ('02')
            WHITE_SPACE (' ')
            CobolTokenType.DISPLAY ('DISPLAY')
            WHITE_SPACE (' ')
            CobolTokenType.STRING (''B'')
            WHITE_SPACE ('\n')
            CobolTokenType.LINE_NUMBER ('03')
            WHITE_SPACE (' ')
            CobolTokenType.DISPLAY ('DISPLAY')
            WHITE_SPACE (' ')
            CobolTokenType.STRING (''C'')
            WHITE_SPACE ('\n')
            CobolTokenType.BAD_LINE_NUMBER ('02')
            WHITE_SPACE (' ')
            CobolTokenType.DISPLAY ('DISPLAY')
            WHITE_SPACE (' ')
            CobolTokenType.STRING (''D'')
            """.trimIndent()
        )
    }

    fun testLineNumberMissingAtStart() {
        doTest(
            "DISPLAY 'HELLO'",
            """
            CobolTokenType.BAD_LINE_NUMBER ('')
            CobolTokenType.DISPLAY ('DISPLAY')
            WHITE_SPACE (' ')
            CobolTokenType.STRING (''HELLO'')
            """.trimIndent()
        )
    }

    fun testLineNumberMissingOnSecondLine() {
        doTest(
            """
            01 DISPLAY 'A'
            DISPLAY 'B'
            """.trimIndent(),
            """
            CobolTokenType.LINE_NUMBER ('01')
            WHITE_SPACE (' ')
            CobolTokenType.DISPLAY ('DISPLAY')
            WHITE_SPACE (' ')
            CobolTokenType.STRING (''A'')
            WHITE_SPACE ('\n')
            CobolTokenType.BAD_LINE_NUMBER ('')
            CobolTokenType.DISPLAY ('DISPLAY')
            WHITE_SPACE (' ')
            CobolTokenType.STRING (''B'')
            """.trimIndent()
        )
    }

    fun testLineNumberWithLargeGap() {
        doTest(
            """
            01 DISPLAY 'A'
            99 DISPLAY 'B'
            """.trimIndent(),
            """
            CobolTokenType.LINE_NUMBER ('01')
            WHITE_SPACE (' ')
            CobolTokenType.DISPLAY ('DISPLAY')
            WHITE_SPACE (' ')
            CobolTokenType.STRING (''A'')
            WHITE_SPACE ('\n')
            CobolTokenType.BAD_LINE_NUMBER ('99')
            WHITE_SPACE (' ')
            CobolTokenType.DISPLAY ('DISPLAY')
            WHITE_SPACE (' ')
            CobolTokenType.STRING (''B'')
            """.trimIndent()
        )
    }

    override fun createLexer(): Lexer = CobolLexerAdapter()

    override fun getDirPath(): String = "src/test/testData"
}

package github.enotvtapke.cobolsyntax

import com.intellij.testFramework.ParsingTestCase

class CobolParsingTest : ParsingTestCase("", "cbl", CobolParserDefinition()) {

    fun testSimpleProgram() {
        doTest(true)
    }

    fun testArithmeticExpressions() {
        doTest(true)
    }

    fun testIfStatement() {
        doTest(true)
    }

    fun testPerformStatements() {
        doTest(true)
    }

    fun testAllFeatures() {
        doTest(true)
    }

    override fun getTestDataPath(): String = "src/test/testData"

    override fun includeRanges(): Boolean = true
}


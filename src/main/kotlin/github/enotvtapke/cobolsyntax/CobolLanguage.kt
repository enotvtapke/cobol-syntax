package github.enotvtapke.cobolsyntax

import com.intellij.lang.Language

object CobolLanguage : Language("Cobol") {
    private fun readResolve(): Any = CobolLanguage
}
package github.enotvtapke.cobolsyntax.psi

import com.intellij.psi.tree.IElementType
import github.enotvtapke.cobolsyntax.CobolLanguage
import org.jetbrains.annotations.NonNls

class CobolTokenType(debugName: @NonNls String) : IElementType(debugName, CobolLanguage) {
    override fun toString(): String {
        return "CobolTokenType." + super.toString()
    }
}

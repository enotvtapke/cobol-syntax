package github.enotvtapke.cobolsyntax.psi

import com.intellij.psi.tree.IElementType
import github.enotvtapke.cobolsyntax.CobolLanguage
import org.jetbrains.annotations.NonNls

class CobolElementType(debugName: @NonNls String) : IElementType(debugName, CobolLanguage)

package github.enotvtapke.cobolsyntax.psi

import com.intellij.psi.tree.TokenSet

interface CobolTokenSets {
    companion object {
        val IDENTIFIERS: TokenSet = TokenSet.create(CobolTypes.KEY)

        val COMMENTS: TokenSet = TokenSet.create(CobolTypes.COMMENT)
    }
}

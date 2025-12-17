package github.enotvtapke.cobolsyntax.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import github.enotvtapke.cobolsyntax.CobolFileType
import github.enotvtapke.cobolsyntax.CobolLanguage

class CobolFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, CobolLanguage) {
    override fun toString(): String {
        return "Cobol File"
    }

    override fun getFileType(): FileType = CobolFileType
}

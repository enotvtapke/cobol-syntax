package github.enotvtapke.cobolsyntax

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object CobolFileType : LanguageFileType(CobolLanguage) {
    override fun getName(): String {
        return "Cobol File"
    }

    override fun getDescription(): String {
        return "Cobol language file"
    }

    override fun getDefaultExtension(): String {
        return "cbl"
    }

    override fun getIcon(): Icon {
        return CobolIcons.FILE
    }

    @JvmStatic
    val INSTANCE = CobolFileType
}

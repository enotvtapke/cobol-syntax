package github.enotvtapke.cobolsyntax

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

internal class CobolColorSettingsPage : ColorSettingsPage {
    override fun getIcon(): Icon {
        return CobolIcons.FILE
    }

    override fun getHighlighter(): SyntaxHighlighter {
        return CobolSyntaxHighlighter()
    }

    override fun getDemoText(): String {
        return """
IDENTIFICATION DIVISION.
PROGRAM-ID. HELLO.
* This is a comment
DATA DIVISION.
WORKING-STORAGE SECTION.
01 WS-A PIC 9(2) VALUE 0.
01 WS-NAME PIC X(20) VALUE 'TEST'.
PROCEDURE DIVISION.
A-PARA.
    PERFORM B-PARA VARYING WS-A FROM 2 BY 2 UNTIL WS-A=12
    STOP RUN.
B-PARA.
    DISPLAY 'B-PARA ' WS-A.
    DISPLAY 'B-PARA'.
        """.trimIndent()
    }

    override fun getAdditionalHighlightingTagToDescriptorMap(): MutableMap<String?, TextAttributesKey?>? {
        return null
    }

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> {
        return DESCRIPTORS
    }

    override fun getColorDescriptors(): Array<ColorDescriptor?> {
        return ColorDescriptor.EMPTY_ARRAY
    }

    override fun getDisplayName(): String {
        return "Cobol"
    }

}

private val DESCRIPTORS = arrayOf(
    AttributesDescriptor("Keyword", CobolSyntaxHighlighter.KEYWORD),
    AttributesDescriptor("String", CobolSyntaxHighlighter.STRING),
    AttributesDescriptor("Number", CobolSyntaxHighlighter.NUMBER),
    AttributesDescriptor("Line number", CobolSyntaxHighlighter.LINE_NUMBER),
    AttributesDescriptor("Comment", CobolSyntaxHighlighter.COMMENT),
    AttributesDescriptor("Identifier", CobolSyntaxHighlighter.IDENTIFIER),
    AttributesDescriptor("Operator", CobolSyntaxHighlighter.OPERATOR),
    AttributesDescriptor("Punctuation", CobolSyntaxHighlighter.PUNCTUATION),
    AttributesDescriptor("Picture string", CobolSyntaxHighlighter.PICTURE_STRING),
    AttributesDescriptor("Bad character", CobolSyntaxHighlighter.BAD_CHARACTER)
)

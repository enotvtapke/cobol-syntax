package github.enotvtapke.cobolsyntax

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement
import github.enotvtapke.cobolsyntax.psi.CobolTypes

class CobolAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (element.node.elementType == CobolTypes.BAD_LINE_NUMBER) {
            val text = element.text
            val message = if (text.all { it.isDigit() }) {
                "Incorrect line number '$text'. Line number should be in order."
            } else {
                "Incorrect line number, expected a number in the beginning of each line."
            }
            holder.newAnnotation(HighlightSeverity.ERROR, message)
                .create()
        }
    }
}

package github.enotvtapke.cobolsyntax

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import github.enotvtapke.cobolsyntax.psi.CobolFile
import github.enotvtapke.cobolsyntax.psi.CobolTokenSets
import github.enotvtapke.cobolsyntax.psi.CobolTypes
import github.enotvtapke.cobolsyntax.psi.parser.CobolParser

class CobolParserDefinition : ParserDefinition {
    override fun createLexer(project: Project?): Lexer {
        return CobolLexerAdapter()
    }

    override fun getCommentTokens(): TokenSet {
        return CobolTokenSets.COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun createParser(project: Project?): PsiParser {
        return CobolParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return CobolFile(viewProvider)
    }

    override fun createElement(node: ASTNode?): PsiElement {
        return CobolTypes.Factory.createElement(node)
    }

}

val FILE = IFileElementType(CobolLanguage)

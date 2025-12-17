package github.enotvtapke.cobolsyntax

import com.intellij.lexer.FlexAdapter

class CobolLexerAdapter : FlexAdapter(CobolLexer(null))

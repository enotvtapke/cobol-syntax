package github.enotvtapke.cobolsyntax.psi

import com.intellij.psi.tree.TokenSet

object CobolTokenSets {
    val IDENTIFIERS: TokenSet = TokenSet.create(CobolTypes.IDENTIFIER)

    val COMMENTS: TokenSet = TokenSet.create(CobolTypes.COMMENT)

    val KEYWORDS: TokenSet = TokenSet.create(
        CobolTypes.IDENTIFICATION,
        CobolTypes.DIVISION,
        CobolTypes.PROGRAM_ID,
        CobolTypes.DATA,
        CobolTypes.WORKING_STORAGE,
        CobolTypes.SECTION,
        CobolTypes.PROCEDURE,
        CobolTypes.PIC,
        CobolTypes.IS,
        CobolTypes.VALUE,
        CobolTypes.PERFORM,
        CobolTypes.VARYING,
        CobolTypes.FROM,
        CobolTypes.BY,
        CobolTypes.TO,
        CobolTypes.UNTIL,
        CobolTypes.STOP,
        CobolTypes.RUN,
        CobolTypes.DISPLAY,
        CobolTypes.COMPUTE,
        CobolTypes.ADD,
        CobolTypes.SUBTRACT,
        CobolTypes.MULTIPLY,
        CobolTypes.DIVIDE,
        CobolTypes.GIVING
    )

    val STRINGS: TokenSet = TokenSet.create(CobolTypes.STRING)

    val NUMBERS: TokenSet = TokenSet.create(CobolTypes.INTEGER)

    val PICTURE_STRINGS: TokenSet = TokenSet.create(CobolTypes.PICTURE_STRING)

    val OPERATORS: TokenSet = TokenSet.create(
        CobolTypes.EQ,
        CobolTypes.PLUS,
        CobolTypes.MINUS,
        CobolTypes.STAR,
        CobolTypes.SLASH,
        CobolTypes.POWER
    )

    val PUNCTUATION: TokenSet = TokenSet.create(
        CobolTypes.DOT,
        CobolTypes.LPAREN,
        CobolTypes.RPAREN
    )
}

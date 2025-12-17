// This is a generated file. Not intended for manual editing.
package github.enotvtapke.cobolsyntax.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import github.enotvtapke.cobolsyntax.psi.impl.*;

public interface CobolTypes {

  IElementType PROPERTY = new CobolElementType("PROPERTY");

  IElementType COMMENT = new CobolTokenType("COMMENT");
  IElementType CRLF = new CobolTokenType("CRLF");
  IElementType KEY = new CobolTokenType("KEY");
  IElementType SEPARATOR = new CobolTokenType("SEPARATOR");
  IElementType VALUE = new CobolTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new CobolPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

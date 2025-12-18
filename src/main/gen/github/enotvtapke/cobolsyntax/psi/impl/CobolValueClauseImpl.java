// This is a generated file. Not intended for manual editing.
package github.enotvtapke.cobolsyntax.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static github.enotvtapke.cobolsyntax.psi.CobolTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import github.enotvtapke.cobolsyntax.psi.*;

public class CobolValueClauseImpl extends ASTWrapperPsiElement implements CobolValueClause {

  public CobolValueClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitValueClause(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CobolLiteral getLiteral() {
    return findNotNullChildByClass(CobolLiteral.class);
  }

}

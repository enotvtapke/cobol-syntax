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

public class CobolDivideStatementImpl extends ASTWrapperPsiElement implements CobolDivideStatement {

  public CobolDivideStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitDivideStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CobolArithmeticOperand> getArithmeticOperandList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolArithmeticOperand.class);
  }

  @Override
  @Nullable
  public CobolGivingClause getGivingClause() {
    return findChildByClass(CobolGivingClause.class);
  }

}

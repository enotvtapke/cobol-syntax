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

public class CobolStatementImpl extends ASTWrapperPsiElement implements CobolStatement {

  public CobolStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolAcceptStatement getAcceptStatement() {
    return findChildByClass(CobolAcceptStatement.class);
  }

  @Override
  @Nullable
  public CobolAddStatement getAddStatement() {
    return findChildByClass(CobolAddStatement.class);
  }

  @Override
  @Nullable
  public CobolComputeStatement getComputeStatement() {
    return findChildByClass(CobolComputeStatement.class);
  }

  @Override
  @Nullable
  public CobolDisplayStatement getDisplayStatement() {
    return findChildByClass(CobolDisplayStatement.class);
  }

  @Override
  @Nullable
  public CobolDivideStatement getDivideStatement() {
    return findChildByClass(CobolDivideStatement.class);
  }

  @Override
  @Nullable
  public CobolIfStatement getIfStatement() {
    return findChildByClass(CobolIfStatement.class);
  }

  @Override
  @Nullable
  public CobolMoveStatement getMoveStatement() {
    return findChildByClass(CobolMoveStatement.class);
  }

  @Override
  @Nullable
  public CobolMultiplyStatement getMultiplyStatement() {
    return findChildByClass(CobolMultiplyStatement.class);
  }

  @Override
  @Nullable
  public CobolPerformStatement getPerformStatement() {
    return findChildByClass(CobolPerformStatement.class);
  }

  @Override
  @Nullable
  public CobolStopStatement getStopStatement() {
    return findChildByClass(CobolStopStatement.class);
  }

  @Override
  @Nullable
  public CobolSubtractStatement getSubtractStatement() {
    return findChildByClass(CobolSubtractStatement.class);
  }

}

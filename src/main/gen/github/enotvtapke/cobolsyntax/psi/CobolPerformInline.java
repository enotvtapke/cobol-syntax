// This is a generated file. Not intended for manual editing.
package github.enotvtapke.cobolsyntax.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolPerformInline extends PsiElement {

  @NotNull
  List<CobolStatement> getStatementList();

  @Nullable
  CobolUntilClause getUntilClause();

  @Nullable
  CobolVaryingClause getVaryingClause();

}

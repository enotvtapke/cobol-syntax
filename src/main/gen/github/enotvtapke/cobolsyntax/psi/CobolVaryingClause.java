// This is a generated file. Not intended for manual editing.
package github.enotvtapke.cobolsyntax.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolVaryingClause extends PsiElement {

  @NotNull
  CobolCondition getCondition();

  @NotNull
  List<CobolLiteral> getLiteralList();

}

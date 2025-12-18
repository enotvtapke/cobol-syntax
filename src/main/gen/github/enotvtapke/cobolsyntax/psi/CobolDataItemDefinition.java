// This is a generated file. Not intended for manual editing.
package github.enotvtapke.cobolsyntax.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolDataItemDefinition extends PsiElement {

  @NotNull
  CobolDataName getDataName();

  @NotNull
  CobolLevelNumber getLevelNumber();

  @NotNull
  CobolPictureClause getPictureClause();

  @Nullable
  CobolValueClause getValueClause();

}

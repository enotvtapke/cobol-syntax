// This is a generated file. Not intended for manual editing.
package github.enotvtapke.cobolsyntax.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import github.enotvtapke.cobolsyntax.psi.impl.*;

public interface CobolTypes {

  IElementType ARITHMETIC_EXPRESSION = new CobolElementType("ARITHMETIC_EXPRESSION");
  IElementType CONDITION = new CobolElementType("CONDITION");
  IElementType DATA_DIVISION = new CobolElementType("DATA_DIVISION");
  IElementType DATA_ITEM_DEFINITION = new CobolElementType("DATA_ITEM_DEFINITION");
  IElementType DATA_NAME = new CobolElementType("DATA_NAME");
  IElementType DISPLAY_OPERAND = new CobolElementType("DISPLAY_OPERAND");
  IElementType DISPLAY_STATEMENT = new CobolElementType("DISPLAY_STATEMENT");
  IElementType IDENTIFICATION_DIVISION = new CobolElementType("IDENTIFICATION_DIVISION");
  IElementType LEVEL_NUMBER = new CobolElementType("LEVEL_NUMBER");
  IElementType LITERAL = new CobolElementType("LITERAL");
  IElementType PARAGRAPH = new CobolElementType("PARAGRAPH");
  IElementType PARAGRAPH_NAME = new CobolElementType("PARAGRAPH_NAME");
  IElementType PERFORM_STATEMENT = new CobolElementType("PERFORM_STATEMENT");
  IElementType PICTURE_CLAUSE = new CobolElementType("PICTURE_CLAUSE");
  IElementType PROCEDURE_DIVISION = new CobolElementType("PROCEDURE_DIVISION");
  IElementType PROGRAM_ID_PARAGRAPH = new CobolElementType("PROGRAM_ID_PARAGRAPH");
  IElementType STATEMENT = new CobolElementType("STATEMENT");
  IElementType STOP_STATEMENT = new CobolElementType("STOP_STATEMENT");
  IElementType VALUE_CLAUSE = new CobolElementType("VALUE_CLAUSE");
  IElementType VARYING_CLAUSE = new CobolElementType("VARYING_CLAUSE");
  IElementType WORKING_STORAGE_SECTION = new CobolElementType("WORKING_STORAGE_SECTION");

  IElementType BY = new CobolTokenType("BY");
  IElementType COMMENT = new CobolTokenType("COMMENT");
  IElementType DATA = new CobolTokenType("DATA");
  IElementType DISPLAY = new CobolTokenType("DISPLAY");
  IElementType DIVISION = new CobolTokenType("DIVISION");
  IElementType DOT = new CobolTokenType("DOT");
  IElementType EQ = new CobolTokenType("EQ");
  IElementType FROM = new CobolTokenType("FROM");
  IElementType IDENTIFICATION = new CobolTokenType("IDENTIFICATION");
  IElementType IDENTIFIER = new CobolTokenType("IDENTIFIER");
  IElementType INTEGER = new CobolTokenType("INTEGER");
  IElementType IS = new CobolTokenType("IS");
  IElementType LPAREN = new CobolTokenType("(");
  IElementType PERFORM = new CobolTokenType("PERFORM");
  IElementType PIC = new CobolTokenType("PIC");
  IElementType PICTURE_STRING = new CobolTokenType("PICTURE_STRING");
  IElementType PROCEDURE = new CobolTokenType("PROCEDURE");
  IElementType PROGRAM_ID = new CobolTokenType("PROGRAM_ID");
  IElementType RPAREN = new CobolTokenType(")");
  IElementType RUN = new CobolTokenType("RUN");
  IElementType SECTION = new CobolTokenType("SECTION");
  IElementType STOP = new CobolTokenType("STOP");
  IElementType STRING = new CobolTokenType("STRING");
  IElementType UNTIL = new CobolTokenType("UNTIL");
  IElementType VALUE = new CobolTokenType("VALUE");
  IElementType VARYING = new CobolTokenType("VARYING");
  IElementType WORKING_STORAGE = new CobolTokenType("WORKING_STORAGE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARITHMETIC_EXPRESSION) {
        return new CobolArithmeticExpressionImpl(node);
      }
      else if (type == CONDITION) {
        return new CobolConditionImpl(node);
      }
      else if (type == DATA_DIVISION) {
        return new CobolDataDivisionImpl(node);
      }
      else if (type == DATA_ITEM_DEFINITION) {
        return new CobolDataItemDefinitionImpl(node);
      }
      else if (type == DATA_NAME) {
        return new CobolDataNameImpl(node);
      }
      else if (type == DISPLAY_OPERAND) {
        return new CobolDisplayOperandImpl(node);
      }
      else if (type == DISPLAY_STATEMENT) {
        return new CobolDisplayStatementImpl(node);
      }
      else if (type == IDENTIFICATION_DIVISION) {
        return new CobolIdentificationDivisionImpl(node);
      }
      else if (type == LEVEL_NUMBER) {
        return new CobolLevelNumberImpl(node);
      }
      else if (type == LITERAL) {
        return new CobolLiteralImpl(node);
      }
      else if (type == PARAGRAPH) {
        return new CobolParagraphImpl(node);
      }
      else if (type == PARAGRAPH_NAME) {
        return new CobolParagraphNameImpl(node);
      }
      else if (type == PERFORM_STATEMENT) {
        return new CobolPerformStatementImpl(node);
      }
      else if (type == PICTURE_CLAUSE) {
        return new CobolPictureClauseImpl(node);
      }
      else if (type == PROCEDURE_DIVISION) {
        return new CobolProcedureDivisionImpl(node);
      }
      else if (type == PROGRAM_ID_PARAGRAPH) {
        return new CobolProgramIdParagraphImpl(node);
      }
      else if (type == STATEMENT) {
        return new CobolStatementImpl(node);
      }
      else if (type == STOP_STATEMENT) {
        return new CobolStopStatementImpl(node);
      }
      else if (type == VALUE_CLAUSE) {
        return new CobolValueClauseImpl(node);
      }
      else if (type == VARYING_CLAUSE) {
        return new CobolVaryingClauseImpl(node);
      }
      else if (type == WORKING_STORAGE_SECTION) {
        return new CobolWorkingStorageSectionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

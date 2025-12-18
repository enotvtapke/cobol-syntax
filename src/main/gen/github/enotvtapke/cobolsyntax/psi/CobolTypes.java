// This is a generated file. Not intended for manual editing.
package github.enotvtapke.cobolsyntax.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import github.enotvtapke.cobolsyntax.psi.impl.*;

public interface CobolTypes {

  IElementType ACCEPT_STATEMENT = new CobolElementType("ACCEPT_STATEMENT");
  IElementType ADDITIVE_EXPRESSION = new CobolElementType("ADDITIVE_EXPRESSION");
  IElementType ADD_STATEMENT = new CobolElementType("ADD_STATEMENT");
  IElementType AND_CONDITION = new CobolElementType("AND_CONDITION");
  IElementType ARITHMETIC_EXPRESSION = new CobolElementType("ARITHMETIC_EXPRESSION");
  IElementType ARITHMETIC_OPERAND = new CobolElementType("ARITHMETIC_OPERAND");
  IElementType COMPUTE_STATEMENT = new CobolElementType("COMPUTE_STATEMENT");
  IElementType CONDITION = new CobolElementType("CONDITION");
  IElementType DATA_DIVISION = new CobolElementType("DATA_DIVISION");
  IElementType DATA_ITEM_DEFINITION = new CobolElementType("DATA_ITEM_DEFINITION");
  IElementType DATA_NAME = new CobolElementType("DATA_NAME");
  IElementType DISPLAY_STATEMENT = new CobolElementType("DISPLAY_STATEMENT");
  IElementType DIVIDE_STATEMENT = new CobolElementType("DIVIDE_STATEMENT");
  IElementType ELSE_CLAUSE = new CobolElementType("ELSE_CLAUSE");
  IElementType GIVING_CLAUSE = new CobolElementType("GIVING_CLAUSE");
  IElementType IDENTIFICATION_DIVISION = new CobolElementType("IDENTIFICATION_DIVISION");
  IElementType IF_STATEMENT = new CobolElementType("IF_STATEMENT");
  IElementType LEVEL_NUMBER = new CobolElementType("LEVEL_NUMBER");
  IElementType LITERAL = new CobolElementType("LITERAL");
  IElementType MOVE_STATEMENT = new CobolElementType("MOVE_STATEMENT");
  IElementType MULTIPLICATIVE_EXPRESSION = new CobolElementType("MULTIPLICATIVE_EXPRESSION");
  IElementType MULTIPLY_STATEMENT = new CobolElementType("MULTIPLY_STATEMENT");
  IElementType NOT_CONDITION = new CobolElementType("NOT_CONDITION");
  IElementType PARAGRAPH = new CobolElementType("PARAGRAPH");
  IElementType PARAGRAPH_NAME = new CobolElementType("PARAGRAPH_NAME");
  IElementType PERFORM_STATEMENT = new CobolElementType("PERFORM_STATEMENT");
  IElementType PICTURE_CLAUSE = new CobolElementType("PICTURE_CLAUSE");
  IElementType POWER_EXPRESSION = new CobolElementType("POWER_EXPRESSION");
  IElementType PRIMARY_EXPRESSION = new CobolElementType("PRIMARY_EXPRESSION");
  IElementType PROCEDURE_DIVISION = new CobolElementType("PROCEDURE_DIVISION");
  IElementType PROGRAM_ID_PARAGRAPH = new CobolElementType("PROGRAM_ID_PARAGRAPH");
  IElementType RELATIONAL_OPERATOR = new CobolElementType("RELATIONAL_OPERATOR");
  IElementType RELATION_CONDITION = new CobolElementType("RELATION_CONDITION");
  IElementType SENTENCE = new CobolElementType("SENTENCE");
  IElementType STATEMENT = new CobolElementType("STATEMENT");
  IElementType STOP_STATEMENT = new CobolElementType("STOP_STATEMENT");
  IElementType SUBTRACT_STATEMENT = new CobolElementType("SUBTRACT_STATEMENT");
  IElementType UNARY_EXPRESSION = new CobolElementType("UNARY_EXPRESSION");
  IElementType VALUE_CLAUSE = new CobolElementType("VALUE_CLAUSE");
  IElementType VARYING_CLAUSE = new CobolElementType("VARYING_CLAUSE");
  IElementType WORKING_STORAGE_SECTION = new CobolElementType("WORKING_STORAGE_SECTION");

  IElementType ACCEPT = new CobolTokenType("ACCEPT");
  IElementType ADD = new CobolTokenType("ADD");
  IElementType AND = new CobolTokenType("AND");
  IElementType BY = new CobolTokenType("BY");
  IElementType COMMENT = new CobolTokenType("COMMENT");
  IElementType COMPUTE = new CobolTokenType("COMPUTE");
  IElementType DATA = new CobolTokenType("DATA");
  IElementType DISPLAY = new CobolTokenType("DISPLAY");
  IElementType DIVIDE = new CobolTokenType("DIVIDE");
  IElementType DIVISION = new CobolTokenType("DIVISION");
  IElementType DOT = new CobolTokenType("DOT");
  IElementType ELSE = new CobolTokenType("ELSE");
  IElementType END_IF = new CobolTokenType("END_IF");
  IElementType EQ = new CobolTokenType("EQ");
  IElementType FROM = new CobolTokenType("FROM");
  IElementType GE = new CobolTokenType(">=");
  IElementType GIVING = new CobolTokenType("GIVING");
  IElementType GT = new CobolTokenType(">");
  IElementType IDENTIFICATION = new CobolTokenType("IDENTIFICATION");
  IElementType IDENTIFIER = new CobolTokenType("IDENTIFIER");
  IElementType IF = new CobolTokenType("IF");
  IElementType INTEGER = new CobolTokenType("INTEGER");
  IElementType IS = new CobolTokenType("IS");
  IElementType LE = new CobolTokenType("<=");
  IElementType LPAREN = new CobolTokenType("(");
  IElementType LT = new CobolTokenType("<");
  IElementType MINUS = new CobolTokenType("-");
  IElementType MOVE = new CobolTokenType("MOVE");
  IElementType MULTIPLY = new CobolTokenType("MULTIPLY");
  IElementType NE = new CobolTokenType("<>");
  IElementType NOT = new CobolTokenType("NOT");
  IElementType OR = new CobolTokenType("OR");
  IElementType PERFORM = new CobolTokenType("PERFORM");
  IElementType PIC = new CobolTokenType("PIC");
  IElementType PICTURE_STRING = new CobolTokenType("PICTURE_STRING");
  IElementType PLUS = new CobolTokenType("+");
  IElementType POWER = new CobolTokenType("**");
  IElementType PROCEDURE = new CobolTokenType("PROCEDURE");
  IElementType PROGRAM_ID = new CobolTokenType("PROGRAM_ID");
  IElementType RPAREN = new CobolTokenType(")");
  IElementType RUN = new CobolTokenType("RUN");
  IElementType SECTION = new CobolTokenType("SECTION");
  IElementType SLASH = new CobolTokenType("/");
  IElementType STAR = new CobolTokenType("*");
  IElementType STOP = new CobolTokenType("STOP");
  IElementType STRING = new CobolTokenType("STRING");
  IElementType SUBTRACT = new CobolTokenType("SUBTRACT");
  IElementType THEN = new CobolTokenType("THEN");
  IElementType TO = new CobolTokenType("TO");
  IElementType UNTIL = new CobolTokenType("UNTIL");
  IElementType VALUE = new CobolTokenType("VALUE");
  IElementType VARYING = new CobolTokenType("VARYING");
  IElementType WORKING_STORAGE = new CobolTokenType("WORKING_STORAGE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ACCEPT_STATEMENT) {
        return new CobolAcceptStatementImpl(node);
      }
      else if (type == ADDITIVE_EXPRESSION) {
        return new CobolAdditiveExpressionImpl(node);
      }
      else if (type == ADD_STATEMENT) {
        return new CobolAddStatementImpl(node);
      }
      else if (type == AND_CONDITION) {
        return new CobolAndConditionImpl(node);
      }
      else if (type == ARITHMETIC_EXPRESSION) {
        return new CobolArithmeticExpressionImpl(node);
      }
      else if (type == ARITHMETIC_OPERAND) {
        return new CobolArithmeticOperandImpl(node);
      }
      else if (type == COMPUTE_STATEMENT) {
        return new CobolComputeStatementImpl(node);
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
      else if (type == DISPLAY_STATEMENT) {
        return new CobolDisplayStatementImpl(node);
      }
      else if (type == DIVIDE_STATEMENT) {
        return new CobolDivideStatementImpl(node);
      }
      else if (type == ELSE_CLAUSE) {
        return new CobolElseClauseImpl(node);
      }
      else if (type == GIVING_CLAUSE) {
        return new CobolGivingClauseImpl(node);
      }
      else if (type == IDENTIFICATION_DIVISION) {
        return new CobolIdentificationDivisionImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new CobolIfStatementImpl(node);
      }
      else if (type == LEVEL_NUMBER) {
        return new CobolLevelNumberImpl(node);
      }
      else if (type == LITERAL) {
        return new CobolLiteralImpl(node);
      }
      else if (type == MOVE_STATEMENT) {
        return new CobolMoveStatementImpl(node);
      }
      else if (type == MULTIPLICATIVE_EXPRESSION) {
        return new CobolMultiplicativeExpressionImpl(node);
      }
      else if (type == MULTIPLY_STATEMENT) {
        return new CobolMultiplyStatementImpl(node);
      }
      else if (type == NOT_CONDITION) {
        return new CobolNotConditionImpl(node);
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
      else if (type == POWER_EXPRESSION) {
        return new CobolPowerExpressionImpl(node);
      }
      else if (type == PRIMARY_EXPRESSION) {
        return new CobolPrimaryExpressionImpl(node);
      }
      else if (type == PROCEDURE_DIVISION) {
        return new CobolProcedureDivisionImpl(node);
      }
      else if (type == PROGRAM_ID_PARAGRAPH) {
        return new CobolProgramIdParagraphImpl(node);
      }
      else if (type == RELATIONAL_OPERATOR) {
        return new CobolRelationalOperatorImpl(node);
      }
      else if (type == RELATION_CONDITION) {
        return new CobolRelationConditionImpl(node);
      }
      else if (type == SENTENCE) {
        return new CobolSentenceImpl(node);
      }
      else if (type == STATEMENT) {
        return new CobolStatementImpl(node);
      }
      else if (type == STOP_STATEMENT) {
        return new CobolStopStatementImpl(node);
      }
      else if (type == SUBTRACT_STATEMENT) {
        return new CobolSubtractStatementImpl(node);
      }
      else if (type == UNARY_EXPRESSION) {
        return new CobolUnaryExpressionImpl(node);
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

// This is a generated file. Not intended for manual editing.
package github.enotvtapke.cobolsyntax.psi.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static github.enotvtapke.cobolsyntax.psi.CobolTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CobolParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return cobolFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // INTEGER | IDENTIFIER
  public static boolean arithmeticExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmeticExpression")) return false;
    if (!nextTokenIs(builder_, "<arithmetic expression>", IDENTIFIER, INTEGER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARITHMETIC_EXPRESSION, "<arithmetic expression>");
    result_ = consumeToken(builder_, INTEGER);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // identificationDivision dataDivision? procedureDivision?
  static boolean cobolFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cobolFile")) return false;
    if (!nextTokenIs(builder_, IDENTIFICATION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identificationDivision(builder_, level_ + 1);
    result_ = result_ && cobolFile_1(builder_, level_ + 1);
    result_ = result_ && cobolFile_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // dataDivision?
  private static boolean cobolFile_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cobolFile_1")) return false;
    dataDivision(builder_, level_ + 1);
    return true;
  }

  // procedureDivision?
  private static boolean cobolFile_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cobolFile_2")) return false;
    procedureDivision(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER EQ arithmeticExpression
  public static boolean condition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "condition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, EQ);
    result_ = result_ && arithmeticExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, CONDITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // DATA DIVISION DOT workingStorageSection?
  public static boolean dataDivision(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dataDivision")) return false;
    if (!nextTokenIs(builder_, DATA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DATA, DIVISION, DOT);
    result_ = result_ && dataDivision_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, DATA_DIVISION, result_);
    return result_;
  }

  // workingStorageSection?
  private static boolean dataDivision_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dataDivision_3")) return false;
    workingStorageSection(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // levelNumber dataName pictureClause valueClause? DOT
  public static boolean dataItemDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dataItemDefinition")) return false;
    if (!nextTokenIs(builder_, INTEGER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = levelNumber(builder_, level_ + 1);
    result_ = result_ && dataName(builder_, level_ + 1);
    result_ = result_ && pictureClause(builder_, level_ + 1);
    result_ = result_ && dataItemDefinition_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    exit_section_(builder_, marker_, DATA_ITEM_DEFINITION, result_);
    return result_;
  }

  // valueClause?
  private static boolean dataItemDefinition_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dataItemDefinition_3")) return false;
    valueClause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean dataName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dataName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, DATA_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // STRING | IDENTIFIER
  public static boolean displayOperand(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "displayOperand")) return false;
    if (!nextTokenIs(builder_, "<display operand>", IDENTIFIER, STRING)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DISPLAY_OPERAND, "<display operand>");
    result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // DISPLAY displayOperand+ DOT
  public static boolean displayStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "displayStatement")) return false;
    if (!nextTokenIs(builder_, DISPLAY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DISPLAY);
    result_ = result_ && displayStatement_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    exit_section_(builder_, marker_, DISPLAY_STATEMENT, result_);
    return result_;
  }

  // displayOperand+
  private static boolean displayStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "displayStatement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = displayOperand(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!displayOperand(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "displayStatement_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFICATION DIVISION DOT programIdParagraph
  public static boolean identificationDivision(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identificationDivision")) return false;
    if (!nextTokenIs(builder_, IDENTIFICATION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFICATION, DIVISION, DOT);
    result_ = result_ && programIdParagraph(builder_, level_ + 1);
    exit_section_(builder_, marker_, IDENTIFICATION_DIVISION, result_);
    return result_;
  }

  /* ********************************************************** */
  // INTEGER
  public static boolean levelNumber(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "levelNumber")) return false;
    if (!nextTokenIs(builder_, INTEGER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INTEGER);
    exit_section_(builder_, marker_, LEVEL_NUMBER, result_);
    return result_;
  }

  /* ********************************************************** */
  // INTEGER | STRING | IDENTIFIER
  public static boolean literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LITERAL, "<literal>");
    result_ = consumeToken(builder_, INTEGER);
    if (!result_) result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // paragraphName DOT statement*
  public static boolean paragraph(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "paragraph")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = paragraphName(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    result_ = result_ && paragraph_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARAGRAPH, result_);
    return result_;
  }

  // statement*
  private static boolean paragraph_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "paragraph_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "paragraph_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean paragraphName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "paragraphName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, PARAGRAPH_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // PERFORM IDENTIFIER varyingClause? DOT?
  public static boolean performStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "performStatement")) return false;
    if (!nextTokenIs(builder_, PERFORM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PERFORM, IDENTIFIER);
    result_ = result_ && performStatement_2(builder_, level_ + 1);
    result_ = result_ && performStatement_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, PERFORM_STATEMENT, result_);
    return result_;
  }

  // varyingClause?
  private static boolean performStatement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "performStatement_2")) return false;
    varyingClause(builder_, level_ + 1);
    return true;
  }

  // DOT?
  private static boolean performStatement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "performStatement_3")) return false;
    consumeToken(builder_, DOT);
    return true;
  }

  /* ********************************************************** */
  // PIC IS? PICTURE_STRING
  public static boolean pictureClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pictureClause")) return false;
    if (!nextTokenIs(builder_, PIC)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PIC);
    result_ = result_ && pictureClause_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PICTURE_STRING);
    exit_section_(builder_, marker_, PICTURE_CLAUSE, result_);
    return result_;
  }

  // IS?
  private static boolean pictureClause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pictureClause_1")) return false;
    consumeToken(builder_, IS);
    return true;
  }

  /* ********************************************************** */
  // PROCEDURE DIVISION DOT paragraph*
  public static boolean procedureDivision(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedureDivision")) return false;
    if (!nextTokenIs(builder_, PROCEDURE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PROCEDURE, DIVISION, DOT);
    result_ = result_ && procedureDivision_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, PROCEDURE_DIVISION, result_);
    return result_;
  }

  // paragraph*
  private static boolean procedureDivision_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedureDivision_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!paragraph(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "procedureDivision_3", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // PROGRAM_ID DOT IDENTIFIER DOT
  public static boolean programIdParagraph(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "programIdParagraph")) return false;
    if (!nextTokenIs(builder_, PROGRAM_ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PROGRAM_ID, DOT, IDENTIFIER, DOT);
    exit_section_(builder_, marker_, PROGRAM_ID_PARAGRAPH, result_);
    return result_;
  }

  /* ********************************************************** */
  // performStatement | stopStatement | displayStatement
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATEMENT, "<statement>");
    result_ = performStatement(builder_, level_ + 1);
    if (!result_) result_ = stopStatement(builder_, level_ + 1);
    if (!result_) result_ = displayStatement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // STOP RUN DOT
  public static boolean stopStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stopStatement")) return false;
    if (!nextTokenIs(builder_, STOP)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, STOP, RUN, DOT);
    exit_section_(builder_, marker_, STOP_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // VALUE literal
  public static boolean valueClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "valueClause")) return false;
    if (!nextTokenIs(builder_, VALUE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VALUE);
    result_ = result_ && literal(builder_, level_ + 1);
    exit_section_(builder_, marker_, VALUE_CLAUSE, result_);
    return result_;
  }

  /* ********************************************************** */
  // VARYING IDENTIFIER FROM arithmeticExpression BY arithmeticExpression UNTIL condition
  public static boolean varyingClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varyingClause")) return false;
    if (!nextTokenIs(builder_, VARYING)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, VARYING, IDENTIFIER, FROM);
    result_ = result_ && arithmeticExpression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, BY);
    result_ = result_ && arithmeticExpression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, UNTIL);
    result_ = result_ && condition(builder_, level_ + 1);
    exit_section_(builder_, marker_, VARYING_CLAUSE, result_);
    return result_;
  }

  /* ********************************************************** */
  // WORKING_STORAGE SECTION DOT dataItemDefinition*
  public static boolean workingStorageSection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "workingStorageSection")) return false;
    if (!nextTokenIs(builder_, WORKING_STORAGE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, WORKING_STORAGE, SECTION, DOT);
    result_ = result_ && workingStorageSection_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, WORKING_STORAGE_SECTION, result_);
    return result_;
  }

  // dataItemDefinition*
  private static boolean workingStorageSection_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "workingStorageSection_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!dataItemDefinition(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "workingStorageSection_3", pos_)) break;
    }
    return true;
  }

}

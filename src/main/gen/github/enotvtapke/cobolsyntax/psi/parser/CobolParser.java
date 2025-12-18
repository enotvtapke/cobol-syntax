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
  // ACCEPT IDENTIFIER
  public static boolean acceptStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "acceptStatement")) return false;
    if (!nextTokenIs(builder_, ACCEPT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ACCEPT, IDENTIFIER);
    exit_section_(builder_, marker_, ACCEPT_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // ADD arithmeticOperand TO IDENTIFIER givingClause?
  public static boolean addStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "addStatement")) return false;
    if (!nextTokenIs(builder_, ADD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ADD);
    result_ = result_ && arithmeticOperand(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, TO, IDENTIFIER);
    result_ = result_ && addStatement_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, ADD_STATEMENT, result_);
    return result_;
  }

  // givingClause?
  private static boolean addStatement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "addStatement_4")) return false;
    givingClause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
  public static boolean additiveExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additiveExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ADDITIVE_EXPRESSION, "<additive expression>");
    result_ = multiplicativeExpression(builder_, level_ + 1);
    result_ = result_ && additiveExpression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ((PLUS | MINUS) multiplicativeExpression)*
  private static boolean additiveExpression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additiveExpression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!additiveExpression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "additiveExpression_1", pos_)) break;
    }
    return true;
  }

  // (PLUS | MINUS) multiplicativeExpression
  private static boolean additiveExpression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additiveExpression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = additiveExpression_1_0_0(builder_, level_ + 1);
    result_ = result_ && multiplicativeExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // PLUS | MINUS
  private static boolean additiveExpression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additiveExpression_1_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    return result_;
  }

  /* ********************************************************** */
  // notCondition (AND notCondition)*
  public static boolean andCondition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "andCondition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, AND_CONDITION, "<and condition>");
    result_ = notCondition(builder_, level_ + 1);
    result_ = result_ && andCondition_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (AND notCondition)*
  private static boolean andCondition_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "andCondition_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!andCondition_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "andCondition_1", pos_)) break;
    }
    return true;
  }

  // AND notCondition
  private static boolean andCondition_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "andCondition_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, AND);
    result_ = result_ && notCondition(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // additiveExpression
  public static boolean arithmeticExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmeticExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARITHMETIC_EXPRESSION, "<arithmetic expression>");
    result_ = additiveExpression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // INTEGER | IDENTIFIER
  public static boolean arithmeticOperand(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmeticOperand")) return false;
    if (!nextTokenIs(builder_, "<arithmetic operand>", IDENTIFIER, INTEGER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARITHMETIC_OPERAND, "<arithmetic operand>");
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
  // COMPUTE IDENTIFIER EQ arithmeticExpression
  public static boolean computeStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "computeStatement")) return false;
    if (!nextTokenIs(builder_, COMPUTE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMPUTE, IDENTIFIER, EQ);
    result_ = result_ && arithmeticExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, COMPUTE_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // andCondition (OR andCondition)*
  public static boolean condition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "condition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONDITION, "<condition>");
    result_ = andCondition(builder_, level_ + 1);
    result_ = result_ && condition_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (OR andCondition)*
  private static boolean condition_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "condition_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!condition_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "condition_1", pos_)) break;
    }
    return true;
  }

  // OR andCondition
  private static boolean condition_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "condition_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OR);
    result_ = result_ && andCondition(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
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
  // DISPLAY (IDENTIFIER | literal)+
  public static boolean displayStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "displayStatement")) return false;
    if (!nextTokenIs(builder_, DISPLAY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DISPLAY);
    result_ = result_ && displayStatement_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, DISPLAY_STATEMENT, result_);
    return result_;
  }

  // (IDENTIFIER | literal)+
  private static boolean displayStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "displayStatement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = displayStatement_1_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!displayStatement_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "displayStatement_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER | literal
  private static boolean displayStatement_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "displayStatement_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = literal(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // DIVIDE arithmeticOperand BY arithmeticOperand givingClause?
  public static boolean divideStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "divideStatement")) return false;
    if (!nextTokenIs(builder_, DIVIDE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DIVIDE);
    result_ = result_ && arithmeticOperand(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, BY);
    result_ = result_ && arithmeticOperand(builder_, level_ + 1);
    result_ = result_ && divideStatement_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, DIVIDE_STATEMENT, result_);
    return result_;
  }

  // givingClause?
  private static boolean divideStatement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "divideStatement_4")) return false;
    givingClause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ELSE statement*
  public static boolean elseClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elseClause")) return false;
    if (!nextTokenIs(builder_, ELSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE);
    result_ = result_ && elseClause_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, ELSE_CLAUSE, result_);
    return result_;
  }

  // statement*
  private static boolean elseClause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elseClause_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "elseClause_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // GIVING IDENTIFIER
  public static boolean givingClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "givingClause")) return false;
    if (!nextTokenIs(builder_, GIVING)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, GIVING, IDENTIFIER);
    exit_section_(builder_, marker_, GIVING_CLAUSE, result_);
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
  // IF condition statement* elseClause? END_IF
  public static boolean ifStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ifStatement")) return false;
    if (!nextTokenIs(builder_, IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IF);
    result_ = result_ && condition(builder_, level_ + 1);
    result_ = result_ && ifStatement_2(builder_, level_ + 1);
    result_ = result_ && ifStatement_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_IF);
    exit_section_(builder_, marker_, IF_STATEMENT, result_);
    return result_;
  }

  // statement*
  private static boolean ifStatement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ifStatement_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ifStatement_2", pos_)) break;
    }
    return true;
  }

  // elseClause?
  private static boolean ifStatement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ifStatement_3")) return false;
    elseClause(builder_, level_ + 1);
    return true;
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
  // INTEGER | STRING
  public static boolean literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal")) return false;
    if (!nextTokenIs(builder_, "<literal>", INTEGER, STRING)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LITERAL, "<literal>");
    result_ = consumeToken(builder_, INTEGER);
    if (!result_) result_ = consumeToken(builder_, STRING);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // MOVE (IDENTIFIER | literal) TO IDENTIFIER
  public static boolean moveStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "moveStatement")) return false;
    if (!nextTokenIs(builder_, MOVE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MOVE);
    result_ = result_ && moveStatement_1(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, TO, IDENTIFIER);
    exit_section_(builder_, marker_, MOVE_STATEMENT, result_);
    return result_;
  }

  // IDENTIFIER | literal
  private static boolean moveStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "moveStatement_1")) return false;
    boolean result_;
    result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = literal(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // powerExpression ((STAR | SLASH) powerExpression)*
  public static boolean multiplicativeExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicativeExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MULTIPLICATIVE_EXPRESSION, "<multiplicative expression>");
    result_ = powerExpression(builder_, level_ + 1);
    result_ = result_ && multiplicativeExpression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ((STAR | SLASH) powerExpression)*
  private static boolean multiplicativeExpression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicativeExpression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!multiplicativeExpression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "multiplicativeExpression_1", pos_)) break;
    }
    return true;
  }

  // (STAR | SLASH) powerExpression
  private static boolean multiplicativeExpression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicativeExpression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = multiplicativeExpression_1_0_0(builder_, level_ + 1);
    result_ = result_ && powerExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // STAR | SLASH
  private static boolean multiplicativeExpression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicativeExpression_1_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, STAR);
    if (!result_) result_ = consumeToken(builder_, SLASH);
    return result_;
  }

  /* ********************************************************** */
  // MULTIPLY arithmeticOperand BY IDENTIFIER givingClause?
  public static boolean multiplyStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplyStatement")) return false;
    if (!nextTokenIs(builder_, MULTIPLY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MULTIPLY);
    result_ = result_ && arithmeticOperand(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, BY, IDENTIFIER);
    result_ = result_ && multiplyStatement_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, MULTIPLY_STATEMENT, result_);
    return result_;
  }

  // givingClause?
  private static boolean multiplyStatement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplyStatement_4")) return false;
    givingClause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // NOT? relationCondition
  public static boolean notCondition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notCondition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NOT_CONDITION, "<not condition>");
    result_ = notCondition_0(builder_, level_ + 1);
    result_ = result_ && relationCondition(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // NOT?
  private static boolean notCondition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notCondition_0")) return false;
    consumeToken(builder_, NOT);
    return true;
  }

  /* ********************************************************** */
  // paragraphName DOT sentence*
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

  // sentence*
  private static boolean paragraph_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "paragraph_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!sentence(builder_, level_ + 1)) break;
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
  // PERFORM IDENTIFIER varyingClause?
  public static boolean performStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "performStatement")) return false;
    if (!nextTokenIs(builder_, PERFORM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PERFORM, IDENTIFIER);
    result_ = result_ && performStatement_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, PERFORM_STATEMENT, result_);
    return result_;
  }

  // varyingClause?
  private static boolean performStatement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "performStatement_2")) return false;
    varyingClause(builder_, level_ + 1);
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
  // unaryExpression (POWER unaryExpression)*
  public static boolean powerExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "powerExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, POWER_EXPRESSION, "<power expression>");
    result_ = unaryExpression(builder_, level_ + 1);
    result_ = result_ && powerExpression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (POWER unaryExpression)*
  private static boolean powerExpression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "powerExpression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!powerExpression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "powerExpression_1", pos_)) break;
    }
    return true;
  }

  // POWER unaryExpression
  private static boolean powerExpression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "powerExpression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, POWER);
    result_ = result_ && unaryExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // INTEGER | IDENTIFIER | LPAREN arithmeticExpression RPAREN
  public static boolean primaryExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primaryExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PRIMARY_EXPRESSION, "<primary expression>");
    result_ = consumeToken(builder_, INTEGER);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = primaryExpression_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // LPAREN arithmeticExpression RPAREN
  private static boolean primaryExpression_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primaryExpression_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && arithmeticExpression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // PROCEDURE DIVISION DOT sentence* paragraph*
  public static boolean procedureDivision(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedureDivision")) return false;
    if (!nextTokenIs(builder_, PROCEDURE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PROCEDURE, DIVISION, DOT);
    result_ = result_ && procedureDivision_3(builder_, level_ + 1);
    result_ = result_ && procedureDivision_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, PROCEDURE_DIVISION, result_);
    return result_;
  }

  // sentence*
  private static boolean procedureDivision_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedureDivision_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!sentence(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "procedureDivision_3", pos_)) break;
    }
    return true;
  }

  // paragraph*
  private static boolean procedureDivision_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedureDivision_4")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!paragraph(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "procedureDivision_4", pos_)) break;
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
  // arithmeticExpression relationalOperator arithmeticExpression
  public static boolean relationCondition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relationCondition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RELATION_CONDITION, "<relation condition>");
    result_ = arithmeticExpression(builder_, level_ + 1);
    result_ = result_ && relationalOperator(builder_, level_ + 1);
    result_ = result_ && arithmeticExpression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // EQ | GT | LT | GE | LE | NE
  public static boolean relationalOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relationalOperator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RELATIONAL_OPERATOR, "<relational operator>");
    result_ = consumeToken(builder_, EQ);
    if (!result_) result_ = consumeToken(builder_, GT);
    if (!result_) result_ = consumeToken(builder_, LT);
    if (!result_) result_ = consumeToken(builder_, GE);
    if (!result_) result_ = consumeToken(builder_, LE);
    if (!result_) result_ = consumeToken(builder_, NE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // statement* DOT
  public static boolean sentence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sentence")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SENTENCE, "<sentence>");
    result_ = sentence_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // statement*
  private static boolean sentence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sentence_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "sentence_0", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // performStatement | stopStatement | displayStatement | computeStatement | addStatement | subtractStatement | multiplyStatement | divideStatement | moveStatement | acceptStatement | ifStatement
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATEMENT, "<statement>");
    result_ = performStatement(builder_, level_ + 1);
    if (!result_) result_ = stopStatement(builder_, level_ + 1);
    if (!result_) result_ = displayStatement(builder_, level_ + 1);
    if (!result_) result_ = computeStatement(builder_, level_ + 1);
    if (!result_) result_ = addStatement(builder_, level_ + 1);
    if (!result_) result_ = subtractStatement(builder_, level_ + 1);
    if (!result_) result_ = multiplyStatement(builder_, level_ + 1);
    if (!result_) result_ = divideStatement(builder_, level_ + 1);
    if (!result_) result_ = moveStatement(builder_, level_ + 1);
    if (!result_) result_ = acceptStatement(builder_, level_ + 1);
    if (!result_) result_ = ifStatement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // STOP RUN
  public static boolean stopStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stopStatement")) return false;
    if (!nextTokenIs(builder_, STOP)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, STOP, RUN);
    exit_section_(builder_, marker_, STOP_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // SUBTRACT arithmeticOperand FROM IDENTIFIER givingClause?
  public static boolean subtractStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "subtractStatement")) return false;
    if (!nextTokenIs(builder_, SUBTRACT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SUBTRACT);
    result_ = result_ && arithmeticOperand(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, FROM, IDENTIFIER);
    result_ = result_ && subtractStatement_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, SUBTRACT_STATEMENT, result_);
    return result_;
  }

  // givingClause?
  private static boolean subtractStatement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "subtractStatement_4")) return false;
    givingClause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (PLUS | MINUS)? primaryExpression
  public static boolean unaryExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unaryExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, UNARY_EXPRESSION, "<unary expression>");
    result_ = unaryExpression_0(builder_, level_ + 1);
    result_ = result_ && primaryExpression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (PLUS | MINUS)?
  private static boolean unaryExpression_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unaryExpression_0")) return false;
    unaryExpression_0_0(builder_, level_ + 1);
    return true;
  }

  // PLUS | MINUS
  private static boolean unaryExpression_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unaryExpression_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
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
  // VARYING IDENTIFIER FROM (IDENTIFIER | literal) BY (IDENTIFIER | literal) UNTIL condition
  public static boolean varyingClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varyingClause")) return false;
    if (!nextTokenIs(builder_, VARYING)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, VARYING, IDENTIFIER, FROM);
    result_ = result_ && varyingClause_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, BY);
    result_ = result_ && varyingClause_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, UNTIL);
    result_ = result_ && condition(builder_, level_ + 1);
    exit_section_(builder_, marker_, VARYING_CLAUSE, result_);
    return result_;
  }

  // IDENTIFIER | literal
  private static boolean varyingClause_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varyingClause_3")) return false;
    boolean result_;
    result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = literal(builder_, level_ + 1);
    return result_;
  }

  // IDENTIFIER | literal
  private static boolean varyingClause_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varyingClause_5")) return false;
    boolean result_;
    result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = literal(builder_, level_ + 1);
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

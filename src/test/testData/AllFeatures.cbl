*> Tests all implemented features

IDENTIFICATION DIVISION.

PROGRAM-ID. SYNTAX-TEST.

DATA DIVISION.

WORKING-STORAGE SECTION.

01 WS-A PIC 9(2) VALUE 0.
01 WS-B PIC 9(4) VALUE 100.
01 WS-C PIC 9(3) VALUE 50.
01 WS-NAME PIC X(20) VALUE 'HELLO COBOL'.
01 WS-RESULT PIC 9(6) VALUE 0.

PROCEDURE DIVISION.

MAIN-PARA.
    *> Basic DISPLAY statement
    DISPLAY 'Starting program'.
    DISPLAY WS-NAME.
    DISPLAY 'Value: ' WS-A.

    *> ACCEPT statement
    ACCEPT WS-A.

    *> MOVE statement
    MOVE 10 TO WS-A.
    MOVE WS-B TO WS-C.
    MOVE 'TEST' TO WS-NAME.

    *> COMPUTE with arithmetic expressions (operator priority)
    COMPUTE WS-RESULT = 2 + 3 * 4.
    COMPUTE WS-RESULT = (2 + 3) * 4.
    COMPUTE WS-RESULT = WS-A + WS-B * WS-C.
    COMPUTE WS-RESULT = 2 ** 3 + 4 * 5 - 10 / 2.
    COMPUTE WS-RESULT = ((WS-A + WS-B) * WS-C) / 2.
    COMPUTE WS-RESULT = -WS-A + +WS-B.

    *> ADD statement
    ADD 5 TO WS-A.
    ADD WS-B TO WS-C.
    ADD 10 TO WS-A GIVING WS-RESULT.

    *> SUBTRACT statement
    SUBTRACT 3 FROM WS-A.
    SUBTRACT WS-B FROM WS-C.
    SUBTRACT 5 FROM WS-A GIVING WS-RESULT.

    *> MULTIPLY statement
    MULTIPLY 2 BY WS-A.
    MULTIPLY WS-B BY WS-C.
    MULTIPLY 3 BY WS-A GIVING WS-RESULT.

    *> DIVIDE statement
    DIVIDE 10 BY 2 GIVING WS-RESULT.
    DIVIDE WS-B BY WS-C GIVING WS-RESULT.

    *> IF statement with relation conditions
    IF WS-A = 10 THEN
        DISPLAY 'A equals 10'
    END-IF.

    IF WS-A > WS-B THEN
        DISPLAY 'A is greater'
    ELSE
        DISPLAY 'B is greater or equal'
    END-IF.

    IF WS-A < 100 THEN
        DISPLAY 'A is less than 100'
    END-IF.

    IF WS-A >= 5 THEN
        DISPLAY 'A is >= 5'
    END-IF.

    IF WS-A <= 20 THEN
        DISPLAY 'A is <= 20'
    END-IF.

    IF WS-A <> 0 THEN
        DISPLAY 'A is not zero'
    END-IF.

    *> IF with logical operators AND, OR, NOT
    IF WS-A > 0 AND WS-B > 0 THEN
        DISPLAY 'Both positive'
    END-IF.

    IF WS-A = 0 OR WS-B = 0 THEN
        DISPLAY 'At least one is zero'
    END-IF.

    IF NOT WS-A = 0 THEN
        DISPLAY 'A is not zero'
    END-IF.

    IF WS-A > 0 AND WS-B > 0 OR WS-C > 0 THEN
        DISPLAY 'Complex condition'
    END-IF.

    IF NOT WS-A = 0 AND NOT WS-B = 0 THEN
        DISPLAY 'Neither is zero'
    END-IF.

    *> Basic PERFORM
    PERFORM PROCESS-PARA.

    *> PERFORM THRU
    PERFORM PROCESS-PARA THRU END-PARA.
    PERFORM PROCESS-PARA THROUGH END-PARA.

    *> PERFORM UNTIL
    PERFORM PROCESS-PARA UNTIL WS-A > 100.

    *> PERFORM THRU with UNTIL
    PERFORM PROCESS-PARA THRU END-PARA UNTIL WS-A >= 50.

    *> PERFORM VARYING
    PERFORM PROCESS-PARA VARYING WS-A FROM 1 BY 1 UNTIL WS-A > 10.
    PERFORM PROCESS-PARA VARYING WS-A FROM WS-B BY 2 UNTIL WS-A >= WS-C.

    *> Inline PERFORM
    PERFORM
        DISPLAY 'Inline perform'
        ADD 1 TO WS-A
    END-PERFORM.

    *> Inline PERFORM UNTIL
    PERFORM UNTIL WS-A > 20
        DISPLAY WS-A
        ADD 1 TO WS-A
    END-PERFORM.

    *> Inline PERFORM VARYING
    PERFORM VARYING WS-A FROM 1 BY 2 UNTIL WS-A > 10
        DISPLAY 'Counter: ' WS-A
        COMPUTE WS-RESULT = WS-A * 2
    END-PERFORM.

    *> Nested IF statements
    IF WS-A > 0 THEN
        IF WS-B > 0 THEN
            DISPLAY 'Both A and B positive'
        ELSE
            DISPLAY 'A positive, B not'
        END-IF
    ELSE
        DISPLAY 'A not positive'
    END-IF.

    STOP RUN.

PROCESS-PARA.
    DISPLAY 'Processing...'.
    ADD 1 TO WS-A.

END-PARA.
    DISPLAY 'End of processing'.

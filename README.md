## Cobol syntax highlighting

IntelliJ IDEA plugin for Cobol. Adds syntax highlighting for a subset of the Cobol language. Take a look at the
[AllFeatures.cbl](src/test/testData/AllFeatures.cbl) test to see what's supported.

Every line of a source file should be prepended with a line number. Line numbers should start from 1 and increase by 1
with each new line. Even empty lines should be prepended with a line number. This logic is implemented as part of the
lexer.

Open project in IntelliJ IDEA and run configuration `Run IDE with Plugin` to see highlighting in action.  
Use `./gradlew generateLexer` to regenerate lexer.  
Use `./gradlew generateParser` to regenerate parser.

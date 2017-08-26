@ECHO OFF
@CLS

SET top="%~dp0\.."

@CD "%top%\src\com\slang\frontend\parser
java -cp "%top%\lib\javacc-6.0\javacc.jar" jjtree ScriptlangParser.jjt
java -cp "%top%\lib\javacc-6.0\javacc.jar" javacc ScriptlangParser.jj
@CD "%~dp0"
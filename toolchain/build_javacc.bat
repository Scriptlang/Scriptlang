@ECHO OFF
@CLS

@CD "%~dp0"\..\src\com\parser
java -cp ..\..\..\lib\javacc-6.0\javacc.jar javacc ScriptlangParser.jj
@CD "%~dp0"\..
@echo off
REM Check if the .class file already exists in the out folder
IF EXIST "out\model\CharacterBase.class" (
    echo CharacterBase.class already compiled.
) ELSE (
    REM Create output directory if it doesn't exist
    if not exist "out\model" mkdir "out\model"
    REM Compile the Java file only if .class does not exist
    javac -d out src/model/CharacterBase.java
    echo Compilation complete.
)
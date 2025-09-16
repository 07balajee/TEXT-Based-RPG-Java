@echo off
REM filepath: e:\3rd Sem\Java\TEXT-Based-RPG-Java\run.bat
REM Check if the .class files already exist in the out folder
IF EXIST "out\model\CharacterBase.class" (
    echo CharacterBase.class already compiled.
) ELSE (
    if not exist "out\model" mkdir "out\model"
    javac -d out src/model/CharacterBase.java
    echo CharacterBase.class compilation complete.
)

IF EXIST "out\model\Item.class" (
    echo Item.class already compiled.
) ELSE (
    if not exist "out\model" mkdir "out\model"
    javac -d out src/model/Item.java
    echo Item.class compilation complete.
)
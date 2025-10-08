@echo off
REM filepath: e:\3rd Sem\Java\TEXT-Based-RPG-Java\run.bat
IF EXIST "out\model\CharacterBase.class" (
    echo CharacterBase.class already compiled.
) ELSE (
    if not exist "out\model" mkdir "out\model"
    javac -d out src/model/CharacterBase.java
    IF %ERRORLEVEL% NEQ 0 (
        echo Error compiling CharacterBase.java
        pause
        exit /b %ERRORLEVEL%
    )
    echo CharacterBase.class compilation complete.
)

IF EXIST "out\model\Item.class" (
    echo Item.class already compiled.
) ELSE (
    if not exist "out\model" mkdir "out\model"
    javac -d out src/model/Item.java
    IF %ERRORLEVEL% NEQ 0 (
        echo Error compiling Item.java
        pause
        exit /b %ERRORLEVEL%
    )
    echo Item.class compilation complete.
)

IF EXIST "out\model\Player.class" (
    echo Player.class already compiled.
) ELSE (
    if not exist "out\model" mkdir "out\model"
    javac -d out src/model/Player.java
    IF %ERRORLEVEL% NEQ 0 (
        echo Error compiling Player.java
        pause
        exit /b %ERRORLEVEL%
    )
    echo Player.class compilation complete.
)

IF EXIST "out\model\Enemy.class" (
    echo Enemy.class already compiled.
) ELSE (
    if not exist "out\model" mkdir "out\model"
    javac -d out src/model/Enemy.java
    IF %ERRORLEVEL% NEQ 0 (
        echo Error compiling Enemy.java
        pause
        exit /b %ERRORLEVEL%
    )
    echo Enemy.class compilation complete.
)

pause
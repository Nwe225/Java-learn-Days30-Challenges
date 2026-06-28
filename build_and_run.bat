@echo off
REM Build and run script for Windows
REM Tries Maven first (if available), then falls back to javac/java
where mvn >nul 2>&1
if %ERRORLEVEL%==0 (
  echo Running: mvn package
  mvn package
  if %ERRORLEVEL%==0 (
    if exist target\java-challenges-1.0.0.jar (
      echo Running jar...
      java -jar target\java-challenges-1.0.0.jar
      exit /b 0
    )
  )
)

echo Maven not available or build failed. Falling back to javac/java.
if not exist out (mkdir out)
javac -d out src\*.java
if %ERRORLEVEL%==0 (
  java -cp out Main
) else (
  echo Build failed.
  exit /b 1
)

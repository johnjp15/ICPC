@echo off
rem
rem pc2reset.bat - Completely reset and erase contest data
rem USE WITH EXTREME CAUTION 
rem 
rem $HeadURL: http://pc2.ecs.csus.edu/repos/pc2v9/branches/PC2_RELEASE_9_2_x/bin/pc2reset.bat $
rem

rem Windows 2000 and beyond syntax
set PC2BIN=%~dp0
if exist %PC2BIN%\pc2env.bat goto :continue

rem fallback to path (or current directory)
set PC2BIN=%0\..
if exist %PC2BIN%\pc2env.bat goto :continue

rem else rely on PC2INSTALL variable
set PC2BIN=%PC2INSTALL%\bin
if exist %PC2BIN%\pc2env.bat goto :continue

echo.
echo ERROR: Could not locate scripts.
echo.
echo Please set the variable PC2INSTALL to the location of
echo   the VERSION file (ex: c:\pc2-9.0.0)
echo.
pause
goto :end

:continue
call %PC2BIN%\pc2env.bat

set RMCMD=rmdir /s /q
if %OS%. == . set RMCMD=deltree /y

rem directories have "nul"
rem clients have a logs directory
if exist logs\nul goto backup
rem servers have a profiles directory
if exist profiles\nul goto backup
goto wrongdir

:backup
echo Backing up settings to archive 
call %PC2BIN%\pc2zip.bat

if exist logs/nul %RMCMD% logs
if exist packets/nul %RMCMD% packets
if exist reports/nul %RMCMD% reports
if exist profiles/nul %RMCMD% profiles
if exist profiles.properties del profiles.properties

rem the /D option requires "Command Extensions" to be enabled.
rem By default they are enabled, but are not available in win98 and before.
for /D %%F in (executes*) do if exist %%F/nul %RMCMD% %%F

goto end
:wrongdir

echo.
echo Not in directory to reset, should be run from dir with logs or profiles
echo.


goto end
:trouble

echo.
echo Could not find archive directory, was pc2zip successful?
echo.

:end

rem eof pc2reset.bat $Id: pc2reset.bat 2238 2010-10-26 22:53:19Z boudreat $

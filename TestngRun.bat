set projectLocation=D:\eclipse-workspace\SeleniumTestNGDemo

cd %projectLocation%

set classpath=%projectLocation%\bin;%projectLocation%\lib\*

java org.testng.TestNG %projectLocation%\testng.xml

pause
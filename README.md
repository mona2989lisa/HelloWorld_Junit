# Release 1.0
This release branch has all the codes as per the assignment. The codes can be broadly classified into two parts:-
1> Simple Hello World Program (Please refer the code HelloWorld.Java
2> Hello World Program with Junit Testing Framework : This program has two parts a) Failure (This includes the codes MessageUtil.java, TestUnit_Failure.java and TestRunner_Failure.java) b) Success (This includes the codes MessageUtil.java, TestUnit_Success.java and TestRunner_Success.java)

Please note that MessageUtil.java is common for both the failure and success case.

Execution Instruction:-
I have added the hamcrest-core-1.3.jar and junit-4.12.jar in the CLASSPATH, as I have not exported the class from the Eclipse.
To compile I have used the below command:-
javac MessageUtil.java TestUnit_Success.java TestRunner_Success.java TestUnit_Failure.java TestRunner_Failure.java
To execute I have used the below command in the appropriate folder for the package definition:-
C:\Users\msmon\workspace_Second\Target Assignment\src>java test.basic.helloworld.TestRunner_Success
Hello World
true

C:\Users\msmon\workspace_Second\Target Assignment\src>java test.basic.helloworld.TestRunner_Failure
Hello World
testPrintMessage(test.basic.helloworld.TestUnit_Failure): expected:<[Namaste India]> but was:<[Hello World]>
false

C:\Users\msmon\workspace_Second\Target Assignment\src>

# BbcAssignment

## Install Maven

Check whether maven is installed in your machine by typing `mvn -version` 
If you don't have maven installed, follow the below points:

1. go to : (https://brew.sh/)

2. Copy and paste the below in your terminal to install homebrew:  `/bin/bash -c "$(curl -fsSL [https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh](https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh))"`
3. In terminal enter : `brew install maven`
4. check now if maven is installed : `mvn -version`

## How to set Javapath for Mac:

1) Open the terminal

2) type vim ~/.bash_profile and then enter the letter "i"

3) copy/paste this line: export JAVA_HOME=$(/usr/libexec/java_home) (make sure the command is pasted correct)

4) Press Esc button THEN press Shift :wq and press enter

5) Type: source ~/.bash_profile

6) After you type: echo $JAVA_HOME you should see the response like :

/Library/Java/JavaVirtualMachines/jdk1.8.0_111.jdk/Contents/Home

## Visual Studio Code Extensions

Download the following extension package :

Extension Pack for Java

## How to run the automation code:

1. enter `mvn test` in your terminal and the browser automation should start running.
2. Once the tests have completed you can click on the Cucumber Report at link in your terminal to view the passed or failed test cases.
3. All the relevant files are located in : src/test/java



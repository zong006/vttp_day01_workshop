## To run
- Be at the root folder day01_workshop

## Compiling
command: javac -d ./target ./classes/*.java ./src/*.java 
- -d indicates where to create the .class files, in this case, the target folder
- ./classes/*.java ./src/*.java are parameters neccessary to include in the javac command to indicate which files to compile 

## Creating the jar file
command: jar -c -f ./dist/app.jar -e App -C target . 
- -c create class files
- -f the file path to create. here it is created in the dist directory from the project root folder.
- -e the name of the class containing the main function. Here it is the App class
- -C target tells the command to navigate to the target folder (where the .class files are)
- . after navigating to the target folder, include all files there to create the jar file 

## Run code
command: java -cp target App 
- -cp target indicates to look for compiled .class files inside the target folder 
- App indicates the name of the class containing the main function

## or Run code via jar file
command: java -jar ./dist/app.jar 
- indicates to look for the jar file at the specified directory ./dist/app.jar 
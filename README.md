##Java-Tryout

***#### This contains all the code for Java from basic to advanced level.***
---
To store .class files in the bin folder while compiling Java code, you can use the -d flag with the javac command. The -d option allows you to specify the destination directory for the compiled .class files.
Steps to Store .class Files in the bin Folder Set Up Your Project Directory Structure
---
Create the following structure:

```CSS
Project/
├── src/
│   └── MyClass.java
├── bin/
```

The src folder contains your .java source files. The bin folder is where you want the .class files to be stored.
Compile and Direct Output to bin Use the javac command with the -d flag to specify the bin directory:

```bash
javac -d bin src/MyClass.java
```

This compiles MyClass.java and places the resulting .class file in the bin folder.

##### Note: If your Java file uses a package, the bin directory will mirror the package structure. Run the Compiled Program To run the compiled .class file, include the bin folder in the classpath:
```bash
java -cp bin MyClass
```
Example
```java
Code File: src/MyClass.java
// File: src/MyClass.java
public class MyClass {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```
Compilation
```bash
javac -d bin src/MyClass.java
```
Result:
```CSS
bin/
└── MyClass.class
```
Execution Run:
```bash
java -cp bin MyClass
```

Output:
```Bash
Hello, Java!
```

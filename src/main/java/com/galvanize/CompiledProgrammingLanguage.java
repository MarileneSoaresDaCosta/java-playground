package com.galvanize;


/* Create a subclass of ProgrammingLanguage named CompiledProgrammingLanguage.
   Add a field called compilerCommand with the type of String.
   Add a getter and setter for your compilerCommand field.
   Declare a createString method, which concatenates the name of the language,
   defined in the parent ProgrammingLanguage class, with the string literal
   (compiled with <compilerCommand>),
   where compilerCommand is defined on the subclass,
   and returns that string.
   The method should return a string that looks like:
   "Java (compiled with javac)".
*/
public class CompiledProgrammingLanguage extends ProgrammingLanguage {
    private String compilerCommand;

    public String getCompilerCommand() {
        return compilerCommand;
    }

    public void setCompilerCommand(String compilerCommand) {
        this.compilerCommand = compilerCommand;
    }

    public String createString(){
        String result = this.getName() + " (compiled with " + compilerCommand+ ")";
        return result;
    }
}

package toyinterpreter;

/*
*
*This class only extends the Exception class. It is useful for handling
*undeclared variables errors during the execution of the interpreter.
*Attempting to use an undeclared variable will throw this exception that will be
*catched in some point of the program's flow.
*
*/
public class VariableNotDeclaredException extends Exception {}
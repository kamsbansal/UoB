package toyinterpreter;

import java.util.HashMap;
import java.util.Scanner;

public class ToyInterpreter {

    /*
    *
    *A hashmap to hold variables names and their values as Integer.
    *As a precondition it was stablished that all variables will be Integers.
    *
    */
    public static HashMap<String,Integer> values=new HashMap<>();
    
    //Current line to process
    public static String line="";
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Toy Interpreter! \n\n");
        
        //Keep looping and parsing instructions
        while(true){
            System.out.print("> ");
            
            //Read user's input line
            line = scanner.nextLine();
            
            //Parse it only if it is a valid one.
            if(is_valid(line))
                parse(line);
        }
    }
    
    /*
    *
    *Returns the value of a given token. If the token is an Integer parse it and return its value
    *Otherwise, try returning the value of the variable if it exists. If not, throw an UndeclaredVariable exception.
    *
    */
    public static int get_value(String token) throws VariableNotDeclaredException{
        try{
            return Integer.parseInt(token);
        }catch(Exception e){
            if(!values.containsKey(token))
                throw new VariableNotDeclaredException();
            return values.get(token);
        }
    }
    
    
    /*
    *
    *Static method to evaluate and expression read from the input
    *If the expression is an addition, perform the operation by getting the value from both operands.
    *If the expression doesn't contain the '+' sign, it is either an Integer or a variable.
    *
    */
    public static int evaluate(String expression) throws VariableNotDeclaredException{
        if(!expression.contains("+")){
            return get_value(expression.trim());
        
        }else
        {
            String[] operands=expression.split("\\+");
            return get_value(operands[0].trim())+get_value(operands[1].trim());
            
        }
        
    }
    
    
    /*
    *
    *Check whether a line read from input is valid or not by checking that every character
    *is a character from the list of valid ones.
    *
    */
    public static boolean is_valid(String line){
        String valid_characters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz+= 1234567890";
        
        for(int i=0;i<line.length();i++)
            if(!valid_characters.contains(""+line.charAt(i))){
                System.out.println("Error: invalid character '"+line.charAt(i)+"' found.");
                return false;
            }
        return true;
    }
    
    
    /*
    *
    *Static method to parse a line read from input. If the line contains a '=' it is an assignment
    *Otherwise it is a print statement.
    *
    */
    public static void parse(String line){
        if(line.contains("=")){
            String[] parts=line.split("=");

            String left=parts[0].trim();
            String right=parts[1];

            try{   
                values.put(left, evaluate(parts[1]));
            }catch (VariableNotDeclaredException e){
                System.out.println("Error: variable not declared.");
            }
        }else{
            
            try {
                System.out.println(get_value(line.trim()));
            } catch (VariableNotDeclaredException ex) {
                System.out.println("Error: variable not declared.");
            }
        }
        
    }
    
}

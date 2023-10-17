import java.util.ArrayList;  
public class Translator {
    public static String u_input;

    Translator(){
      //place holder u_input so i test out my functions
        u_input = "3+8*2";
        h_u_input = "9+ (3*(6+10 + (9*0)))"; 
        System.out.println("Hello world"); 
        //CalculatorFunctions calc = new CalculatorFunctions(); 
        //String u_input = getUserInput(); 
    }
  public static void main(String[] args) {
  	char[] equation = u_input.toCharArray(); 
  	ArrayList<Character> operators = new ArrayList<>(); 
    ArrayList<Integer> nums = new ArrayList<>();

      for (int i = equation.length; i > 0; i--){
        // changing the for each loop to a regular for bc i need to pass in a whole section of the equation that was in parenthesis and for that I 
          char n = equation[i]; 
          if (Character.isDigit(n)){
              int n_converted = n; 
              nums.add(n_converted); 
          }else if (Character.isWhitespace(n)){
            continue; 
          }else if(String.valueOf(n).matches("[^a-zA-Z0-9]")){
            // The parameters im passing into the matches method below is from chatGPT
            if (String.valueOf(n).matches(".*\\(")) {
              //loop through till you find the end parenthesis and pass in the seperated 
              for (int j = i; j < equation.length; j++){
                if (Cha)
              }
              recurSolve(); 
          } else {
              // Code to handle the absence of an open parenthesis '('
          }
          
            operators.add(n);
          }else{
            //not a charecter 
          }
          
      }
    }
    public static int recurSolve(String u){
      //to handle parenthesis within parenthesis within parenthesis 
      if (u_input.length() == 1){
        //base case - 1 digit left 
      }else if (Character.isDigit((u_input.substring(0,1)).charAt(0))){
      
      }
    }
    public String getInput(String u_input){
      return u_input; 
    }
  
  


}

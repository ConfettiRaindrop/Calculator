import java.util.ArrayList;  
public class Translator {
    public static String u_input;

    Translator(){
        u_input = "3+8*2"; //place holder u_input so i test out my functions 
        System.out.println("Hello world"); 
        //CalculatorFunctions calc = new CalculatorFunctions(); 
        //String u_input = calc.getUserInput(); 
    }
  public static void main(String[] args) {
  	ArrayList<Integer> nums = new ArrayList<Integer>(); 
  	ArrayList<Char> operators = new ArrayList<Char>(); 
      char[] chars = u_input.toCharArray();
      for (char n : chars){
          if (Character.isDigit(n)){
              nums.add(n); 
          }else if(String.valueOf(n).matches("[^a-zA-Z0-9]")){
            operators.add(n);
          }else{
            //not a charecter 
          }
          
      }
    public static int recurSolve(String u){
      if (u_input.length() == 1){
        //base case - 1 digit left 
      }else if (Character.isDigit(u_input.substring(0,1)){
      
      }
    public static String getInput(String u_input){
      int u = 
    }
    }
  
  


}
}
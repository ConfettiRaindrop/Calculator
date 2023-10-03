import java.util.ArrayList; 

public class Translator {
    Translator(){
        System.out.println("Hello world"); 
        CalculatorFunction calc = new CalculatorFunction(); 
        String u_input = calc.getUserInput(); 
    }
  public static void main(String[] args) {
  	ArrayList<Integer> nums = new ArrayList<Integer>(); 
  	ArrayList<Char> operators = new ArrayList<Char>(); 
      char[] chars = u_input.toCharArray();
      for (char n : chars){
          if (Charecter.isDigit(n)){
              nums.add(n);
          }else if()
      }
      if (String.valueOf(character).matches("[^a-zA-Z0-9]")) {
        //Your code
    }
    
    System.out.println("Hello World");
  }
  
  public static int recurSolve(String u){
    if (u_input.length() == 1){
        //base case - 1 digit left 
    }else if (Charecter.isDigit(u_input.substring(0,1)){

    }

}
}
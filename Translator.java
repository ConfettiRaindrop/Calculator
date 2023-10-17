import java.util.ArrayList;  
public class Translator {
    public static String u_input;
    public static String h_u_input;

    Translator(){
      //place holder u_input so i test out my functions
        u_input = "3+8*2";
        h_u_input = "9 + ( 3 * ( 6 + 10 + ( 9 * 0 ) ) )"; //how should i make 10 count as one num and not as 1 and 0?
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
            // The parameters im passing into the matches method above is from stack overflow:  https://stackoverflow.com/questions/1721602/regex-for-matching-a-z-a-z-0-9-and 
            if (n == '(') {
              //loop through till you find the end parenthesis and pass in the seperated eq.
              for (int j = i; j < equation.length; j++){
                n = equation[j]; 
                if (n == ')'){
                  int ultRizz = Translator.recurSolve(equation,i,j);
                  nums.add(ultRizz);
                  i = j; 
                  break;  
                }
              }
            }

            operators.add(n);
          }else{
            //not a charecter 
          }
          
      }
    }
    public static int recurSolve(char [] equation, int i, int j){
      ArrayList<Integer> rNums = new ArrayList<>();
      ArrayList<Character> rOperators = new ArrayList<>();
      //to handle parenthesis within parenthesis within parenthesis 
      if (equation.length == 1){
        //ultRizz reached 
        return equation[0]; 

      }else{
        char s = equation[0];
        if (Character.isDigit(s)){
          String tempNumString = ""; 
          rNums.add(Character.getNumericValue(s));

        }else if (Character.isWhitespace(s)){
          // continue; (in loop)
        }else if (String.valueOf(s).matches("[^a-zA-Z0-9]")){
          rOperators.add(s);
        }else{
          //weird characters 
        }
      }
      return 0; 
    }


    public String getInput(String u_input){
      return u_input; 
    }
  
  


}

import java.util.ArrayList;  
public class Translator {
    public static String u_input;
    public static String h_u_input;
    public static char[] equation;
    public static ArrayList<Character> operators;
    public static ArrayList<Integer> nums;
    private static CalculatorFunctions calc; 

    Translator(){
      //place holder u_input so i test out my functions
        u_input = "3+8*2";
        h_u_input = "9 + ( 3 * ( 6 + 10 + ( 9 * 0 ) ) )"; //how should i make 10 count as one num and not as 1 and 0? - wholeNum()
        equation = u_input.toCharArray();
        operators = new ArrayList<>(); 
        nums = new ArrayList<>();
        calc = new CalculatorFunctions();
    }
  public static void main(String[] args) {

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
            operators.add(n);

          }else{
            //not a charecter 
            
          }
          
      }
    }
    public static int parenthesesEd(int ind){
      
      //loop through till you find the end parenthesis and pass in the seperated eq.
      //if you find another open parenthesis, recurse through the method again
      // Return the ult_rizz, index of equation after evaluating parenthesis-ed sub equation & if the parenthesis was a coefficient(0) or another operator before it (1)
      for (int j = ind; j < equation.length; j++){
        char n = equation[j]; 
        if (n == '('){
          parenthesesEd(j+1);
        }
        if (n == ')'){
          int rInd = j+1;
          return recurSolve(ind, j); // j-1 ?
           
        }
      }
      // returning result from recurSolve (0) and end index after parenthesis -rInd (1)
    }
    // what happens when there isn't a 

    public static int recurSolve( int i, int j){
      ArrayList<Integer> rNums = new ArrayList<>();
      ArrayList<Character> rOperators = new ArrayList<>();
      //if statement to return a single 
      if (not(equation.matches("*[^a-zA-Z0-9]*"))){
        if (Character.isDigit(equation[0])){
          int ultRizz = (int)equation[0];
          return ultRizz; 
        }else{
          return 666; 
        }   

      }else{
        for(int e = i; e < j; e++){
          char s = equation[e];

          //accounts for a number 
          if (Character.isDigit(s)){
            int[] numRizz = wholeNum(s, e);
            rNums.add(numRizz[1]); 
            e = numRizz[0];  //index skips to end of multidigit number

          //accounts for opperators
          }else if (String.valueOf(s).matches("[^a-zA-Z0-9]")){
            //this method will be passed after parentheses are accounted for 
            rOperators.add(s);
            
          }else{
            // other non-operator character - jus so our code don't break
            return 666; 

          }
        }
        //evaluate
        return compiled(rNums,rOperators);

      }
      
    }
    public static int compiled(ArrayList<Integer> nums, ArrayList<Character> ops){
      if (nums.size() <= ops.size()){
        return 666;
      }else{
        for(int i = 0; i < ops.size(); i++){

          if (ops[i] == '^'){
            calc.power(nums.remove(i), nums.remove(i+1)); 
          }
        }

      }
    }

    public static String isValid(){
      if (nums.size() <= operators.size()){
        return "invalid input";
      }else{
        return Integer.toString(compiled(nums,operators)); 
      }
    }
     

    public static int[] wholeNum(char s, int index){
      // returns an array: ind 0 = full number, ind 1 = index of equation after number 
      String tempNumString = "" + s; 
      int [] rAr = new int[2];
      for(int d = index+1; d < equation.length; d++){
        if (Character.isDigit(equation[d])){
          tempNumString = tempNumString + equation[d]; 
        }else{
          rAr[0] = d-1;  
          break; 
        }
      }
      rAr[1] = Integer.parseInt(tempNumString);
      return rAr; 
    }

    public String getInput(String u_input){
      return u_input; 
    }
  
  


}

import java.util.ArrayList;  
public class Translator {
    public String u_input;
    public String h_u_input;
    public char[] equation;
    public ArrayList<Character> operators;
    public ArrayList<Double> nums;
    //private static CalculatorFunctions calc; 

    Translator(){
      //place holder u_input so i test out my functions
      u_input = "3+8*2"; //todo replace with getInput() 
      equation = u_input.toCharArray();
      operators = new ArrayList<>(); 
      nums = new ArrayList<>();
        
        //calc = new CalculatorFunctions(); 
    }
  
    public double parenthesesEd(int ind){
      
      //loop through till you find the end parenthesis and pass in the seperated eq.
      //if you find another open parenthesis, recurse through the method again
      // Return the ult_rizz, index of equation after evaluating parenthesis-ed sub equation & if the parenthesis was a coefficient(0) or another operator before it (1)
      for (int j = ind; j < equation.length; j++){
        char n = equation[j]; 
        if (n == '('){
          parenthesesEd(j+1);
        }
        if (n == ')'){
          return sortSolve(ind, j); // j-1 ?
           
        }
      }
      return 666.6;
      // returning result from sortSolve (0) and end index after parenthesis -rInd (1)
    }

    public double sortSolve( int i, int j){
      ArrayList<Double> rNums = new ArrayList<>();
      ArrayList<Character> rOperators = new ArrayList<>();
      //if statement to return a single 
      // if (operators.isEmpty()){//fix
      //   double [] vals = wholeNum(equation[i], i); 
      //   nums.set()
      //   if (nums.size() == ){
      //     double ultRizz = (double)equation[0];
      //     return ultRizz; 
      //   }else{
      //     return 666; 
      //   }   

      // }else{
      for(int e = i; e < j; e++){
        char s = equation[e];

        //accounts for a number 
        if (Character.isDigit(s)){
          double[] numRizz = wholeNum(s, e);
          rNums.add(numRizz[1]); 
          e = (int)numRizz[0];  //index skips to end of multidigit number

        //accounts for opperators
        }else if (String.valueOf(s).matches("[^a-zA-Z0-9]")){
          //this method will be passed after parentheses are accounted for 
          rOperators.add(s);
          
        }else{
          // other non-operator character - jus so our code don't break
          return 0;

        }
      }
        //evaluate
      return compiled(rNums,rOperators);

      //}
      
    }
    public static double compiled(ArrayList<Double> nums, ArrayList<Character> ops){
      if (nums.size() <= ops.size()){
        return 0;
      }else if (nums.size() == 1){
        return nums.get(0);
      }else{
        for(int i = 0; i < ops.size(); i++){
          if (ops.get(i) == '^'){
            nums.set(i, (double)CalculatorFunctions.power(nums.get(i), nums.get(i + 1)));
            nums.remove(i + 1);
            
          }
        }
        for(int i = 0; i < ops.size(); i++){
          char op = ops.get(i); 
          if (op == '*' || op == '/'){
            if (op == '*'){
              nums.set(i, (double)CalculatorFunctions.multiply(nums.get(i), nums.get(i + 1)));
              
            }else if (op == '/'){
              nums.set(i, (double)CalculatorFunctions.divide(nums.get(i), nums.get(i + 1)));
              
            }
            nums.remove(i + 1);
            ops.remove(i);

          }
        }

        for(int i = 0; i < ops.size(); i++){
          char op = ops.get(i); 
          if (op == '+' || op == '-'){
            if (op == '+'){
              nums.set(i, (double)CalculatorFunctions.summ(nums.get(i), nums.get(i + 1)));
              
            }else if (op == '-'){
              nums.set(i, (double)CalculatorFunctions.subtract(nums.get(i), nums.get(i + 1)));
              
            }
            
            ops.remove(i);

          }
        }
        if (ops.size() > 0){
          return compiled(nums, ops); 
        }
        return 0; 
      }
    }

    public String isValid(){
      if (nums.size() <= operators.size()){
        return "invalid input";
      }else{
        return Double.toString(compiled(nums,operators)); 
      }
    }
     

    public double[] wholeNum(char s, int index){
      // returns an array: ind 1 = full number, ind 0 = index of equation after number 
      String tempNumString = "" + s; 
      double [] rAr = new double[2];
      for(int d = index+1; d < equation.length; d++){
        if (Character.isDigit(equation[d]) || (equation[d] == '.')){
          tempNumString = tempNumString + equation[d]; 
        }else{
          rAr[0] = d-1;  
          break; 
        }
      }
      rAr[1] = Double.parseDouble(tempNumString);
      return rAr; 
    }

    public String getInput(String u_input){
      return u_input; 
    }

    public static void main(String[] args) {
      Translator tran = new Translator();

      for (int i = 0; i < tran.equation.length; i++){
        // changing the for each loop to a regular for bc i need to pass in a whole section of the equation that was in parenthesis and for that I 
          char n = tran.equation[i]; 
          if (Character.isDigit(n)){
              double [] numInds = tran.wholeNum(n, i);
              tran.nums.add(numInds[1]);
              i = (int)numInds[0];
          }else if (Character.isWhitespace(n)){
            continue; 

          }else if(String.valueOf(n).matches("[^a-zA-Z0-9]")){
            // The parameters im passing into the matches method above is from stack overflow:  https://stackoverflow.com/questions/1721602/regex-for-matching-a-z-a-z-0-9-and 
            if (n == '('){
              tran.parenthesesEd(i); 
            }else{
              tran.operators.add(n);
            }

          }else{
            //not a charecter 
            
          }
        }
        System.out.println(tran.nums);
      //   tran.isValid();
    }
    
  
  


}

import java.util.Stack;

public class Translator {
    public static double calculate(String s) {

        Stack<Double> numStack = new Stack<>();
        Stack<Character> opStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c) || c == '.') {
                double num = 0;
                double decimalPlace = 1.0; 
                boolean isDecimal = false; // checks for decimal num - keep forgetting that java's bools are all lowers
                while ((i < s.length())&&(Character.isDigit(s.charAt(i))|| s.charAt(i) == '.')) {
                    if (s.charAt(i) == '.') {
                        isDecimal = true;
                    } else if (isDecimal) {
                        // I used a lil bit of chat gpt help for figuring out how to do this part, but i fully understand what its doing
                        // If it's a decimal point, updates the decimal place
                        decimalPlace /= 10;
                        num += (s.charAt(i) - '0') * decimalPlace;
                    } else {
                        num = num * 10 + (s.charAt(i) - '0');
                    }
                    i++;
                }
                i--; 
                numStack.push(num);
            }else if (Character.isLetter(c)){
                String trig = "";
                while (i < s.length() && Character.isLetter(s.charAt(i))){
                    trig += s.charAt(i);
                    i++;
                }
                i--; 
                if (isTrig(trig)){
                    if (trig.equals("sin")){
                        opStack.push('s');
                    }else if (trig.equals("cos")){
                        opStack.push('c');
                    }else if (trig.equals("tan")){
                        opStack.push('t');
                    }else{
                        System.out.println("weird1 :" + trig);
                    }
                     
                }
                
            }else if (c == '(') {
                opStack.push(c);
            } else if (c == ')') {
                while (opStack.peek() != '(') {
                    double b = numStack.pop();
                    double a = numStack.pop();


                    char op = opStack.pop();
                    double result = performOperation(a, b, op);
                    numStack.push(result);
                }
                opStack.pop(); // Pops the opening parenthesis
            } else if ((c == '+')||(c =='-')||(c =='*') ||(c == '/')||(c=='^')) {
                while (!opStack.isEmpty() && precedence(opStack.peek()) >= precedence(c)) {
                    double b = numStack.pop();
                    double a = numStack.pop();
                    char op = opStack.pop();
                    double result = performOperation(a, b, op);
                    numStack.push(result);
                }
                opStack.push(c);
            }
        }

        while (!opStack.isEmpty()) {
    
            double b = numStack.pop();
            double a = numStack.pop();
            char op = opStack.pop();
            double result = performOperation(a, b, op);
            numStack.push(result);
        }
        return numStack.peek();
    }

    private static int precedence(char op) {
        if ((op == '+')|| (op == '-')) {
            return 1;
        } else if ((op == '*')||(op == '/')) {
            return 2;
        }else if ((op == 's') || (op == 'c') || (op == 't')){
            return 3; 
        }else if (op == '^'){
            return 4;
        }
        return 0;
    }

    private static boolean isTrig(String input){
        if ((input.toLowerCase()).equals("sin") || (input.toLowerCase()).equals("cos") || (input.toLowerCase()).equals("tan")){
            return true; 
        }else{
            return false; 
        }
    }

    private static double performOperation(double a, double b, char op) {
        if (op == '+'){
            return a+b; 
        }
        if (op == '-'){
            return a - b;
        } 
        if (op == '*'){
            return a * b;
        }
        if (op == '/'){
            return a / b;
        } 
        if (op == '^'){
            return Math.pow(a, b); 
        }
        if (op == 's'){
            return (a*Math.sin(b)); 
        }
        if (op == 'c'){
            return (a*Math.cos(b));
        }
        if (op == 't'){
            return (a*Math.tan(b)); 
        }
        return 0;
    }
    public String isValid(String input){
      return Double.toString(calculate(input)); 
    }
    private static String changeSqrt(String input){
        String fEquation = "";
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i); 
            if (Character.isLetter(c)){
                // checks if trig -> checks if sqrt() -> changes sqrt(x) to x^(1/2)
            }
        }
        return fEquation;
    }

    public static void main(String[] args) {
        //String expression = "2*(3+4)-5*(6/2)";
        String expression = "3+2";
        //expression = changeSqrt(expression); - calling in calculate func. better bc camilla will use isValid() to get result
        System.out.println("Result: " + calculate(expression));
    //make it for doubles - done 
    // get trig working - done
    //edit (from ui file?) when recieving sqrt(x) convert to x^(1/2)
    
    }
}

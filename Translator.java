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
                while (i < s.length() && (Character.isDigit(s.charAt(i)) || s.charAt(i) == '.')) {
                    if (s.charAt(i) == '.') {
                        isDecimal = true;
                    } else if (isDecimal) {
                        // I used a lil bit of chat gpt help for figuring out how to do this part, but i fully understand that the number is being multiplied by 10
                        //to get shift the leftmost value over by one to make space for the ones place value and the decimal's 
                        // If it's a decimal point, updates the decimal place
                        // by first magically converting the ACSCII value of number into an integer by subtracting it with '0'
                        // then multiply it by the correct decimal place - 1/10 for the first decimal value you traverse and then it keep dividing the decimalPlace by 10
                        //to add it to the right decimal place like multiply by 10 is doing 
                        decimalPlace /= 10;
                        num += (s.charAt(i) - '0') * decimalPlace;
                    } else {
                        num = num * 10 + (s.charAt(i) - '0');
                    }
                    i++;
                }
                i--; 
                numStack.push(num);
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
        }else if (op == '^'){
            return 3; 
        }
        return 0;
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
            return Math.pow((double)a,(double)b); 
        }
        return 0;
    }
    public String isValid(String input){
      return Double.toString(calculate(input)); 
    }

    public static void main(String[] args) {
        //String expression = "2*(3+4)-5*(6/2)";
        String expression = "2*(2-3.4)^3";
        System.out.println("Result: " + calculate(expression));
    //make it for doubles 
    // get trig working 
    
    }
}

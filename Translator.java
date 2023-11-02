import java.util.Stack;

public class Translator {
    public static int calculate(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<Character> opStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                //I used chatgpt for the below while loop part 
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                numStack.push(num);
            } else if (c == '(') {
                opStack.push(c);
            } else if (c == ')') {
                while (opStack.peek() != '(') {
                    int b = numStack.pop();
                    int a = numStack.pop();
                    char op = opStack.pop();
                    int result = performOperation(a, b, op);
                    numStack.push(result);
                }
                opStack.pop(); // Pop the opening parenthesis
            } else if ((c == '+')||(c =='-')||(c =='*') ||(c == '/')||(c=='^')) {
                while (!opStack.isEmpty() && precedence(opStack.peek()) >= precedence(c)) {
                    int b = numStack.pop();
                    int a = numStack.pop();
                    char op = opStack.pop();
                    int result = performOperation(a, b, op);
                    numStack.push(result);
                }
                opStack.push(c);
            }
        }

        while (!opStack.isEmpty()) {
            int b = numStack.pop();
            int a = numStack.pop();
            char op = opStack.pop();
            int result = performOperation(a, b, op);
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

    private static int performOperation(int a, int b, char op) {
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
            return (int)Math.pow((double)a,(double)b); 
        }
        return 0;
    }
    public String isValid(String input){
      return Integer.toString(calculate(input)); 
    }

    public static void main(String[] args) {
        //String expression = "2*(3+4)-5*(6/2)";
        String expression = "2*(5+2)^2";
        System.out.println("Result: " + calculate(expression));
    
    }
}

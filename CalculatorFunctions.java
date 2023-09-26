import java.util.HashMap;

public class CalculatorFunctions (){

    public CalculatorFunctions() {
        HashMap<String, double> stored_values = new HashMap<String, Double>();
    }

    public static double summ(double a, double b){
        return a + b;
    }

    public static double subtract(double a, double b){
        return a - b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static double divide(double a, double b){
        return a / b;
    }

    public static double power(double a, double b){
        return Math.pow(a, b);
    }

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double sin(double a) {
        return Math.sin(a);
    }

    public static double cos(double a) {
        return Math.cos(a);
    }

    public static double tan(double a) {
        return Math.tan(a);
    }

    public static void store(String s, double a){
        this.stored_values.remove(s);
        this.stored_values.put(s, a);
    }

    public static double get_stored_value(String s){
        return stored_values.get(s);
    }

    public static void main(String[] args){
        
    }

}

import java.util.HashMap;

public class CalculatorFunctions {
    HashMap<String, Double> stored_values;

    public CalculatorFunctions() {
        this.stored_values = new HashMap<String, Double>();
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

    public void store(String s, double a){
        stored_values.remove(s);
        stored_values.put(s, a);
    }

    public double get_stored_value(String s){
        return stored_values.get(s);
    }

    public static void main(String[] args){
        
    }

}

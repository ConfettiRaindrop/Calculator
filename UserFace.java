
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.Random;

//https://fxdocs.github.io/docs/html5/#_timing

public class UserFace extends Application implements EventHandler<ActionEvent>{

    Button button;
    String input = "";

    Button addition = new Button();
    Button subtraction = new Button();
    Button multiplication = new Button();
    Button division = new Button();
    Button equals = new Button();
    Button zero = new Button();
    Button one = new Button();
    Button two = new Button();
    Button three = new Button();
    Button four = new Button();
    Button five = new Button();
    Button six = new Button();
    Button seven = new Button();
    Button eight = new Button();
    Button nine = new Button();
    Button sin = new Button();
    Button cos = new Button();
    Button tan = new Button();
    Button root = new Button();
    Button log = new Button();
    Button exponent = new Button();
    Button pi = new Button();
    Button e = new Button();
    Button openParentheses = new Button();
    Button closeParentheses = new Button();

    Label textbox = new Label();

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Rage Against the Machine");

        button = new Button();
        button.setText("Rage Against the Machine");

        addition.setText("+");
        subtraction.setText("-");
        multiplication.setText("*");
        division.setText("/");
        equals.setText("=");
        zero.setText("0");
        one.setText("1");
        two.setText("2");
        three.setText("3");
        four.setText("4");
        five.setText("5");
        six.setText("6");
        seven.setText("7");
        eight .setText("8");
        nine.setText("9");
        sin.setText("sin");
        cos.setText("cos");
        tan.setText("tan");
        root.setText("√");
        log.setText("log");
        exponent.setText("^");
        pi.setText("π");
        e.setText("e");
        openParentheses.setText("(");
        closeParentheses.setText(")");

        button.setOnAction(this);
        addition.setOnAction(this);
        subtraction.setOnAction(this);
        multiplication.setOnAction(this);
        division.setOnAction(this);
        equals.setOnAction(this);
        zero.setOnAction(this);
        one.setOnAction(this);
        two.setOnAction(this);
        three.setOnAction(this);
        four.setOnAction(this);
        five.setOnAction(this);
        six.setOnAction(this);
        seven.setOnAction(this);
        eight.setOnAction(this);
        nine.setOnAction(this);
        sin.setOnAction(this);
        cos.setOnAction(this);
        tan.setOnAction(this);
        root.setOnAction(this);
        log.setOnAction(this);
        exponent.setOnAction(this);
        pi.setOnAction(this);
        e.setOnAction(this);
        openParentheses.setOnAction(this);
        closeParentheses.setOnAction(this);

        GridPane grid = new GridPane();
    
        grid.add(textbox, 0, 0);
        grid.add(addition, 3, 4);
        grid.add(subtraction, 3, 5);
        grid.add(multiplication, 3, 6);
        grid.add(division, 3, 7);
        grid.add(equals, 3, 8);
        grid.add(sin, 0, 1);
        grid.add(cos, 1, 1);
        grid.add(tan, 2, 1);
        grid.add(root, 0, 2);
        grid.add(log, 1, 2);
        grid.add(exponent, 2, 2);
        grid.add(pi, 0, 3);
        grid.add(e, 1, 3);
        grid.add(openParentheses, 2, 3);
        grid.add(closeParentheses, 3, 3);
        grid.add(seven, 0, 4);
        grid.add(eight, 1, 4);
        grid.add(nine, 2, 4);
        grid.add(four, 0, 5);
        grid.add(five, 1, 5);
        grid.add(six, 2, 5);
        grid.add(one, 0, 6);
        grid.add(two, 1, 6);
        grid.add(three, 2, 6);
        grid.add(zero, 1, 7);

        GridPane.setColumnSpan(textbox, 4);

        Scene scene = new Scene(grid, 300, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

        TranslateTransition translate = new TranslateTransition();  
        translate.setNode(addition);  
        translate.setAutoReverse(true);  

        addition.setOnMouseEntered(event -> {
            move(translate);
            }
        );
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() != equals) {
            String current_input = event.getSource().toString();
            input += event.getSource().toString().substring(current_input.indexOf("'") + 1, current_input.lastIndexOf("'"));
            textbox.setText(input);
            System.out.println(input);
        } else if (event.getSource() == equals) {
            //send input to Sindhura's code
        }
    }

    public void move(TranslateTransition translate){
        Random rand = new Random();
        int randomNum = 2;

        if (randomNum == 1) {
            translate.setByY(100);
            translate.setDuration(Duration.millis(50));
            translate.play();
        }
        else if (randomNum == 2){
            translate.setByX(-100);
            translate.setByY(-100);
            translate.setDuration(Duration.millis(1000));
            translate.play();
        }
        else if (randomNum == 3){
            translate.setByX(300);
            translate.setDuration(Duration.millis(1000));
            translate.play();
        }
        else if (randomNum == 4){
            translate.setByX(300);
            translate.setDuration(Duration.millis(1000));
            translate.play();
        }
        else if (randomNum == 5){
            translate.setByX(300);
            translate.setDuration(Duration.millis(1000));
            translate.play();
        }
        else if (randomNum == 6){
            translate.setByX(300);
            translate.setDuration(Duration.millis(1000));
            translate.play();
        }
        else if (randomNum == 7){
            translate.setByX(300);
            translate.setDuration(Duration.millis(1000));
            translate.play();
        }
        else if (randomNum == 8){
            translate.setByX(300);
            translate.setDuration(Duration.millis(1000));
            translate.play();
        }
        translate.setByX(300);
        translate.setDuration(Duration.millis(1000));
        translate.play();
    }
    
} 
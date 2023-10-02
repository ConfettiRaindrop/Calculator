
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

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
        sin.setText("sin(x)");
        cos.setText("cos(x)");
        tan.setText("tan(x)");
        root.setText("√");
        log.setText("log");
        exponent.setText("^");
        pi.setText("π");
        e.setText("e");

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

        GridPane grid = new GridPane();
    
        grid.add(addition, 3, 3);
        grid.add(subtraction, 3, 4);
        grid.add(multiplication, 3, 5);
        grid.add(division, 3, 6);
        grid.add(equals, 3, 7);
        grid.add(sin, 0, 0);
        grid.add(cos, 1, 0);
        grid.add(tan, 2, 0);
        grid.add(root, 0, 1);
        grid.add(log, 1, 1);
        grid.add(exponent, 2, 1);
        grid.add(pi, 0, 2);
        grid.add(e, 1, 2);
        grid.add(seven, 0, 3);
        grid.add(eight, 1, 3);
        grid.add(nine, 2, 3);
        grid.add(four, 0, 4);
        grid.add(five, 1, 4);
        grid.add(six, 2, 4);
        grid.add(one, 0, 5);
        grid.add(two, 1, 5);
        grid.add(three, 2, 5);
        grid.add(zero, 1, 6);

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
            input += event.getSource().toString();
            //input = input.substring(input.indexOf("'"), input.lastIndexOf("''"));
            System.out.println("First Index: " + input.indexOf("'"));
            System.out.println(input);
        }
    }

    public void move(TranslateTransition translate){
        translate.setByX(300);
        translate.setDuration(Duration.millis(1000));
        translate.play();
    }
    
} 
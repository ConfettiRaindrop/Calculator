
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
import java.util.Random;

//https://fxdocs.github.io/docs/html5/#_timing

public class UserFace extends Application implements EventHandler<ActionEvent>{

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Rage Against the Machine");

        button = new Button();
        button.setText("Rage Against the Machine");

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

        TranslateTransition translate_addition = new TranslateTransition();  
        translate_addition.setNode(addition);  
        TranslateTransition translate_subtraction = new TranslateTransition();  
        translate_subtraction.setNode(subtraction);
        TranslateTransition translate_multiplication = new TranslateTransition();  
        translate_multiplication.setNode(multiplication);
        TranslateTransition translate_division = new TranslateTransition();  
        translate_division.setNode(division);
        TranslateTransition translate_equals = new TranslateTransition();  
        translate_equals.setNode(equals);
        TranslateTransition translate_zero = new TranslateTransition();  
        translate_zero.setNode(zero);
        TranslateTransition translate_one = new TranslateTransition();  
        translate_one.setNode(one);
        TranslateTransition translate_two = new TranslateTransition();  
        translate_two.setNode(two);
        TranslateTransition translate_three = new TranslateTransition();  
        translate_three.setNode(three);
        TranslateTransition translate_four = new TranslateTransition();  
        translate_four.setNode(four);
        TranslateTransition translate_five = new TranslateTransition();  
        translate_five.setNode(five);
        TranslateTransition translate_six = new TranslateTransition();  
        translate_six.setNode(six);
        TranslateTransition translate_seven = new TranslateTransition();  
        translate_seven.setNode(seven);
        TranslateTransition translate_eight = new TranslateTransition();  
        translate_eight.setNode(eight);
        TranslateTransition translate_nine = new TranslateTransition();  
        translate_nine.setNode(nine);
        TranslateTransition translate_e = new TranslateTransition();  
        translate_e.setNode(e);
        TranslateTransition translate_pi = new TranslateTransition();  
        translate_pi.setNode(pi);
        TranslateTransition translate_sin = new TranslateTransition();  
        translate_sin.setNode(sin);
        TranslateTransition translate_cos = new TranslateTransition();  
        translate_cos.setNode(cos);
        TranslateTransition translate_tan = new TranslateTransition();  
        translate_tan.setNode(tan);
        TranslateTransition translate_root = new TranslateTransition();  
        translate_root.setNode(root);
        TranslateTransition translate_log = new TranslateTransition();  
        translate_log.setNode(log);
        TranslateTransition translate_exponent = new TranslateTransition();  
        translate_exponent.setNode(exponent);

        addition.setOnMouseEntered(event -> {
            move(translate_addition);
            });
        subtraction.setOnMouseEntered(event -> {
            move(translate_subtraction);
            });
        multiplication.setOnMouseEntered(event -> {
            move(translate_multiplication);
            });
        division.setOnMouseEntered(event -> {
            move(translate_division);
            }); 
        one.setOnMouseEntered(event -> {
            move(translate_one);
            }); 
        two.setOnMouseEntered(event -> {
            move(translate_two);
            }); 
        three.setOnMouseEntered(event -> {
            move(translate_three);
            }); 
        four.setOnMouseEntered(event -> {
            move(translate_four);
            }); 
        five.setOnMouseEntered(event -> {
            move(translate_five);
            }); 
        six.setOnMouseEntered(event -> {
            move(translate_six);
            }); 
        seven.setOnMouseEntered(event -> {
            move(translate_seven);
            }); 
        eight.setOnMouseEntered(event -> {
            move(translate_eight);
            }); 
        nine.setOnMouseEntered(event -> {
            move(translate_nine);
            }); 
        zero.setOnMouseEntered(event -> {
            move(translate_zero);
            }); 
        equals.setOnMouseEntered(event -> {
            move(translate_equals);
            }); 
        sin.setOnMouseEntered(event -> {
            move(translate_sin);
            }); 
        cos.setOnMouseEntered(event -> {
            move(translate_cos);
            }); 
        tan.setOnMouseEntered(event -> {
            move(translate_tan);
            }); 
        e.setOnMouseEntered(event -> {
            move(translate_e);
            }); 
        exponent.setOnMouseEntered(event -> {
            move(translate_exponent);
            }); 
        pi.setOnMouseEntered(event -> {
            move(translate_pi);
            }); 
        log.setOnMouseEntered(event -> {
            move(translate_log);
            }); 
        root.setOnMouseEntered(event -> {
            move(translate_root);
            });
    }

    @Override
    public void handle(ActionEvent event ) {
        if (event.getSource() == button) {
            button.setText("osdhfsndaf");
        }
    }

    public void move(TranslateTransition translate){
        Random rand = new Random();
        int randomNum = rand.nextInt((8) + 1);

        if (randomNum == 1) {
            translate.setByY(-100);
            translate.setDuration(Duration.millis(50));
            translate.play();
        }
        else if (randomNum == 2){
            translate.setByX(-100);
            translate.setByY(-100);
            translate.setDuration(Duration.millis(50));
            translate.play();
        }
        else if (randomNum == 3){
            translate.setByX(-100);
            translate.setDuration(Duration.millis(50));
            translate.play();
        }
        else if (randomNum == 4){
            translate.setByX(-100);
            translate.setByY(100);
            translate.setDuration(Duration.millis(50));
            translate.play();
        }
        else if (randomNum == 5){
            translate.setByY(100);
            translate.setDuration(Duration.millis(50));
            translate.play();
        }
        else if (randomNum == 6){
            translate.setByX(100);
            translate.setByY(100);
            translate.setDuration(Duration.millis(50));
            translate.play();
        }
        else if (randomNum == 7){
            translate.setByX(100);
            translate.setDuration(Duration.millis(50));
            translate.play();
        }
        else if (randomNum == 8){
            translate.setByX(100);
            translate.setByY(-100);
            translate.setDuration(Duration.millis(50));
            translate.play();
        }
    }
    
} 
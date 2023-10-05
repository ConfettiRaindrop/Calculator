
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.Random;

//https://fxdocs.github.io/docs/html5/#_timing

public class UserFace extends Application implements EventHandler<ActionEvent>{

    Scene scene;

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
    Button pun = new Button();
    Button translate = new Button();

    Button[] allButtons = {addition, subtraction, multiplication, division, equals,
                            zero, one, two, three, four, five, six, seven, eight, 
                            nine, sin, cos, tan, root, log, exponent, pi, e, 
                            openParentheses, closeParentheses, pun, translate};

    Label textbox = new Label();

    String input = "";

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Rage Against the Machine");

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
        openParentheses.setText("(");
        closeParentheses.setText(")");
        pun.setText("pun");
        translate.setText("translate");

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
        six.setOnAction(this);
        cos.setOnAction(this);
        tan.setOnAction(this);
        root.setOnAction(this);
        log.setOnAction(this);
        exponent.setOnAction(this);
        pi.setOnAction(this);
        e.setOnAction(this);
        openParentheses.setOnAction(this);
        closeParentheses.setOnAction(this);
        pun.setOnAction(this);
        translate.setOnAction(this);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(5));
        grid.setHgap(5);
        grid.setVgap(8);
    
        grid.add(textbox, 0, 0);
        grid.add(addition, 3, 4);
        grid.add(subtraction, 3, 5);
        grid.add(multiplication, 3, 6);
        grid.add(division, 3, 7);
        grid.add(equals, 3, 8);
        grid.add(sin, 0, 1);
        grid.add(cos, 1, 1);
        grid.add(tan, 2, 1);
        grid.add(pun, 3, 1);
        grid.add(translate, 4, 1);
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

        GridPane.setColumnSpan(textbox, 5);

        scene = new Scene(grid, 300, 600);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
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
        TranslateTransition translate_openParentheses = new TranslateTransition();
        translate_openParentheses.setNode(openParentheses);
        TranslateTransition translate_closeParentheses = new TranslateTransition();
        translate_closeParentheses.setNode(closeParentheses);


        addition.setOnMouseEntered(event -> {
            move(translate_addition, addition);
            });
        subtraction.setOnMouseEntered(event -> {
            move(translate_subtraction, subtraction);
            });
        multiplication.setOnMouseEntered(event -> {
            move(translate_multiplication, multiplication);
            });
        division.setOnMouseEntered(event -> {
            move(translate_division, division);
            }); 
        one.setOnMouseEntered(event -> {
            move(translate_one, one);
            }); 
        two.setOnMouseEntered(event -> {
            move(translate_two, two);
            }); 
        three.setOnMouseEntered(event -> {
            move(translate_three, three);
            }); 
        four.setOnMouseEntered(event -> {
            move(translate_four, four);
            }); 
        five.setOnMouseEntered(event -> {
            move(translate_five, five);
            }); 
        six.setOnMouseEntered(event -> {
            move(translate_six, six);
            }); 
        seven.setOnMouseEntered(event -> {
            move(translate_seven, seven);
            }); 
        eight.setOnMouseEntered(event -> {
            move(translate_eight, eight);
            }); 
        nine.setOnMouseEntered(event -> {
            move(translate_nine, nine);
            }); 
        zero.setOnMouseEntered(event -> {
            move(translate_zero, zero);
            }); 
        equals.setOnMouseEntered(event -> {
            move(translate_equals, equals);
            }); 
        sin.setOnMouseEntered(event -> {
            move(translate_sin, sin);
            }); 
        cos.setOnMouseEntered(event -> {
            move(translate_cos, cos);
            }); 
        tan.setOnMouseEntered(event -> {
            move(translate_tan, tan);
            }); 
        e.setOnMouseEntered(event -> {
            move(translate_e, e);
            }); 
        exponent.setOnMouseEntered(event -> {
            move(translate_exponent, exponent);
            }); 
        pi.setOnMouseEntered(event -> {
            move(translate_pi, pi);
            }); 
        log.setOnMouseEntered(event -> {
            move(translate_log, log);
            }); 
        root.setOnMouseEntered(event -> {
            move(translate_root, root);
            });
        openParentheses.setOnMouseEntered(event -> {
            move(translate_openParentheses, openParentheses);
            });
        closeParentheses.setOnMouseEntered(event -> {
            move(translate_closeParentheses, closeParentheses);
            });
    }

    @Override
    public void handle(ActionEvent event ) {
        if (event.getSource() != equals) {
            String currentInput = event.getSource().toString();
            input += event.getSource().toString().substring(currentInput.indexOf("'") + 1, currentInput.lastIndexOf("'"));
            textbox.setText(input);
            System.out.println(input);
        }
        if (event.getSource() == pun) {
            System.out.println(openParentheses.getLayoutX());
            System.out.println(scene.getHeight() + "| height");
            System.out.println(scene.getWidth() + "| width");
            System.out.println(scene.getX() + "| x");
            System.out.println(scene.getY() + "| y");
        }
        if (event.getSource() == translate) {
            System.out.println(openParentheses.getLayoutX());
            System.out.println(scene.getHeight() + "| height");
            System.out.println(scene.getWidth() + "| width");
            System.out.println(scene.getX() + "| x");
            System.out.println(scene.getY() + "| y");
        }
    }

    public void move(TranslateTransition translate, Button btn){
        Random rand = new Random();

        translate.setToX(rand.nextInt((120) + 1));
        translate.setToY(rand.nextInt((390) + 1));
        translate.setDuration(Duration.millis(50));
        translate.play();
    }

    public void checkCollision(){

    }
    
} 
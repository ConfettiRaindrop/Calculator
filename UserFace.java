
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.Random;
import javafx.scene.shape.Rectangle;

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

    StackPane additionPane = new StackPane();
    StackPane subtractionPane = new StackPane();
    StackPane multiplicationPane = new StackPane();
    StackPane divisionPane = new StackPane();
    StackPane equalsPane = new StackPane();
    StackPane zeroPane = new StackPane();
    StackPane onePane = new StackPane();
    StackPane twoPane = new StackPane();
    StackPane threePane = new StackPane();
    StackPane fourPane = new StackPane();
    StackPane fivePane = new StackPane();
    StackPane sixPane = new StackPane();
    StackPane sevenPane = new StackPane();
    StackPane eightPane = new StackPane();
    StackPane ninePane = new StackPane();
    StackPane sinPane = new StackPane();
    StackPane cosPane = new StackPane();
    StackPane tanPane = new StackPane();
    StackPane rootPane = new StackPane();
    StackPane logPane = new StackPane();
    StackPane exponentPane = new StackPane();
    StackPane piPane = new StackPane();
    StackPane ePane = new StackPane();
    StackPane openParenthesesPane = new StackPane();
    StackPane closeParenthesesPane = new StackPane();
    StackPane punPane = new StackPane();
    StackPane translatePane = new StackPane();
    StackPane textboxPane = new StackPane();

    Rectangle additionRect = new Rectangle(addition.getWidth() + 40, addition.getHeight() + 40);
    Rectangle subtractionRect = new Rectangle(subtraction.getWidth() + 40, subtraction.getHeight() + 40);
    Rectangle multiplicationRect = new Rectangle(multiplication.getWidth() + 40, multiplication.getHeight() + 40);
    Rectangle divisionRect = new Rectangle(division.getWidth() + 40, division.getHeight() + 40);
    Rectangle equalsRect = new Rectangle(equals.getWidth() + 40, equals.getHeight() + 40);
    Rectangle zeroRect = new Rectangle(zero.getWidth() + 40, zero.getHeight() + 40);
    Rectangle oneRect = new Rectangle(one.getWidth() + 40, one.getHeight() + 40);
    Rectangle twoRect = new Rectangle(two.getWidth() + 40, two.getHeight() + 40);
    Rectangle threeRect = new Rectangle(three.getWidth() + 40, three.getHeight() + 40);
    Rectangle fourRect = new Rectangle(four.getWidth() + 40, four.getHeight() + 40);
    Rectangle fiveRect = new Rectangle(five.getWidth() + 40, five.getHeight() + 40);
    Rectangle sixRect = new Rectangle(six.getWidth() + 40, six.getHeight() + 40);
    Rectangle sevenRect = new Rectangle(seven.getWidth() + 40, seven.getHeight() + 40);
    Rectangle eightRect = new Rectangle(eight.getWidth() + 40, eight.getHeight() + 40);
    Rectangle nineRect = new Rectangle(nine.getWidth() + 40, nine.getHeight() + 40);
    Rectangle sinRect = new Rectangle(sin.getWidth() + 40, sin.getHeight() + 40);
    Rectangle cosRect = new Rectangle(cos.getWidth() + 40, cos.getHeight() + 40);
    Rectangle tanRect = new Rectangle(tan.getWidth() + 40, tan.getHeight() + 40);
    Rectangle rootRect = new Rectangle(root.getWidth() + 40, root.getHeight() + 40);
    Rectangle logRect = new Rectangle(log.getWidth() + 40, log.getHeight() + 40);
    Rectangle exponentRect = new Rectangle(exponent.getWidth() + 40, exponent.getHeight() + 40);
    Rectangle piRect = new Rectangle(pi.getWidth() + 40, pi.getHeight() + 40);
    Rectangle eRect = new Rectangle(e.getWidth() + 40, e.getHeight() + 40);
    Rectangle openParenthesesRect = new Rectangle(openParentheses.getWidth() + 40, openParentheses.getHeight() + 40);
    Rectangle closeParenthesesRect = new Rectangle(closeParentheses.getWidth() + 40, closeParentheses.getHeight() + 40);
    Rectangle punRect = new Rectangle(pun.getWidth() + 40, pun.getHeight() + 40);
    Rectangle translateRect = new Rectangle(translate.getWidth() + 40, translate.getHeight() + 40);
    Rectangle textboxRect = new Rectangle(addition.getWidth() + 40, addition.getHeight() + 40);

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

        additionRect.setFill(Color.BLUEVIOLET);
        subtractionRect.setFill(Color.VIOLET);
        multiplicationRect.setFill(Color.PURPLE);
        divisionRect.setFill(Color.MAGENTA);
        equalsRect.setFill(Color.RED);
        zeroRect.setFill(Color.ORANGERED);
        oneRect.setFill(Color.ORANGE);
        twoRect.setFill(Color.YELLOW);
        threeRect.setFill(Color.YELLOWGREEN);
        fourRect.setFill(Color.OLIVE);
        fiveRect.setFill(Color.GREEN);
        sixRect.setFill(Color.TEAL);
        sevenRect.setFill(Color.BLUE);
        eightRect.setFill(Color.BLUEVIOLET);
        nineRect.setFill(Color.VIOLET);
        sinRect.setFill(Color.PURPLE);
        cosRect.setFill(Color.MAGENTA);
        tanRect.setFill(Color.RED);
        rootRect.setFill(Color.ORANGERED);
        logRect.setFill(Color.ORANGE);
        exponentRect.setFill(Color.YELLOW);
        piRect.setFill(Color.YELLOWGREEN);
        eRect.setFill(Color.OLIVE);
        openParenthesesRect.setFill(Color.GREEN);
        closeParenthesesRect.setFill(Color.TEAL);
        punRect.setFill(Color.BLUE);
        translateRect.setFill(Color.BLUEVIOLET);
        textboxRect.setFill(Color.VIOLET);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(5));
        grid.setHgap(5);
        grid.setVgap(8);

        grid.add(textboxPane, 0, 0);
        grid.add(additionPane, 3, 4);
        grid.add(subtractionPane, 3, 5);
        grid.add(multiplicationPane, 3, 6);
        grid.add(divisionPane, 3, 7);
        grid.add(equalsPane, 3, 8);
        grid.add(sinPane, 0, 1);
        grid.add(cosPane, 1, 1);
        grid.add(tanPane, 2, 1);
        grid.add(punPane, 3, 1);
        grid.add(translatePane, 4, 1);
        grid.add(rootPane, 0, 2);
        grid.add(logPane, 1, 2);
        grid.add(exponentPane, 2, 2);
        grid.add(piPane, 0, 3);
        grid.add(ePane, 1, 3);
        grid.add(openParenthesesPane, 2, 3);
        grid.add(closeParenthesesPane, 3, 3);
        grid.add(sevenPane, 0, 4);
        grid.add(eightPane, 1, 4);
        grid.add(ninePane, 2, 4);
        grid.add(fourPane, 0, 5);
        grid.add(fivePane, 1, 5);
        grid.add(sixPane, 2, 5);
        grid.add(onePane, 0, 6);
        grid.add(twoPane, 1, 6);
        grid.add(threePane, 2, 6);
        grid.add(zeroPane, 1, 7);

        additionPane.getChildren().add(additionRect);
        additionPane.getChildren().add(addition);
        subtractionPane.getChildren().add(subtractionRect);
        subtractionPane.getChildren().add(subtraction);
        multiplicationPane.getChildren().add(multiplicationRect);
        multiplicationPane.getChildren().add(multiplication);
        divisionPane.getChildren().add(divisionRect);
        divisionPane.getChildren().add(division);
        equalsPane.getChildren().add(equalsRect);
        equalsPane.getChildren().add(equals);
        zeroPane.getChildren().add(zeroRect);
        zeroPane.getChildren().add(zero);
        onePane.getChildren().add(oneRect);
        onePane.getChildren().add(one);
        twoPane.getChildren().add(twoRect);
        twoPane.getChildren().add(two);
        threePane.getChildren().add(threeRect);
        threePane.getChildren().add(three);
        fourPane.getChildren().add(fourRect);
        fourPane.getChildren().add(four);
        fivePane.getChildren().add(fiveRect);
        fivePane.getChildren().add(five);
        sixPane.getChildren().add(sixRect);
        sixPane.getChildren().add(six);
        sevenPane.getChildren().add(sevenRect);
        sevenPane.getChildren().add(seven);
        eightPane.getChildren().add(eightRect);
        eightPane.getChildren().add(eight);
        ninePane.getChildren().add(nineRect);
        ninePane.getChildren().add(nine);
        sinPane.getChildren().add(sinRect);
        sinPane.getChildren().add(sin);
        cosPane.getChildren().add(cosRect);
        cosPane.getChildren().add(cos);
        tanPane.getChildren().add(tanRect);
        tanPane.getChildren().add(tan);
        rootPane.getChildren().add(rootRect);
        rootPane.getChildren().add(root);
        logPane.getChildren().add(logRect);
        logPane.getChildren().add(log);
        exponentPane.getChildren().add(exponentRect);
        exponentPane.getChildren().add(exponent);
        piPane.getChildren().add(piRect);
        piPane.getChildren().add(pi);
        ePane.getChildren().add(eRect);
        ePane.getChildren().add(e);
        openParenthesesPane.getChildren().add(openParenthesesRect);
        openParenthesesPane.getChildren().add(openParentheses);
        closeParenthesesPane.getChildren().add(closeParenthesesRect);
        closeParenthesesPane.getChildren().add(closeParentheses);
        punPane.getChildren().add(punRect);
        punPane.getChildren().add(pun);
        translatePane.getChildren().add(translateRect);
        translatePane.getChildren().add(translate);
        textboxPane.getChildren().add(textboxRect);
        textboxPane.getChildren().add(textbox);

        GridPane.setColumnSpan(textboxPane, 5);

        scene = new Scene(grid, 300, 600);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

        TranslateTransition translate_addition = new TranslateTransition();  
        translate_addition.setNode(addition);  
        TranslateTransition translate_additionRect = new TranslateTransition();  
        translate_additionRect.setNode(additionRect); 

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


        additionRect.setOnMouseEntered(event -> {
            move(translate_addition, translate_additionRect, addition, additionRect);
            });
        //subtraction.setOnMouseEntered(event -> {
        //    move(translate_subtraction, subtraction, additionRect);
        //    });
        //multiplication.setOnMouseEntered(event -> {
        //    move(translate_multiplication, multiplication, additionRect);
        //    });
        //division.setOnMouseEntered(event -> {
        //    move(translate_division, division, additionRect);
        //    }); 
        //one.setOnMouseEntered(event -> {
        //    move(translate_one, one);
        //    }); 
        //two.setOnMouseEntered(event -> {
        //    move(translate_two, two);
        //    }); 
        //three.setOnMouseEntered(event -> {
        //    move(translate_three, three);
        //    }); 
        //four.setOnMouseEntered(event -> {
        //    move(translate_four, four);
        //    }); 
        //five.setOnMouseEntered(event -> {
        //    move(translate_five, five);
        //    }); 
        //six.setOnMouseEntered(event -> {
        //    move(translate_six, six);
        //    }); 
        //seven.setOnMouseEntered(event -> {
        //    move(translate_seven, seven);
        //    }); 
        //eight.setOnMouseEntered(event -> {
        //    move(translate_eight, eight);
        //    }); 
        //nine.setOnMouseEntered(event -> {
        //    move(translate_nine, nine);
        //    }); 
        //zero.setOnMouseEntered(event -> {
        //    move(translate_zero, zero);
        //    }); 
        //equals.setOnMouseEntered(event -> {
        //    move(translate_equals, equals);
        //    }); 
        //sin.setOnMouseEntered(event -> {
        //    move(translate_sin, sin);
        //    }); 
        //cos.setOnMouseEntered(event -> {
        //    move(translate_cos, cos);
        //    }); 
        //tan.setOnMouseEntered(event -> {
        //    move(translate_tan, tan);
        //    }); 
        //e.setOnMouseEntered(event -> {
        //    move(translate_e, e);
        //    }); 
        //exponent.setOnMouseEntered(event -> {
        //    move(translate_exponent, exponent);
        //    }); 
        //pi.setOnMouseEntered(event -> {
        //    move(translate_pi, pi);
        //    }); 
        //log.setOnMouseEntered(event -> {
        //    move(translate_log, log);
        //    }); 
        //root.setOnMouseEntered(event -> {
        //    move(translate_root, root);
        //    });
        //openParentheses.setOnMouseEntered(event -> {
        //    move(translate_openParentheses, openParentheses);
        //    });
        //closeParentheses.setOnMouseEntered(event -> {
        //    move(translate_closeParentheses, closeParentheses);
        //    });
    }

    @Override
    public void handle(ActionEvent event ) {
        if (event.getSource() != equals && event.getSource() != pun && event.getSource() != translate) {
            String currentInput = event.getSource().toString();
            input += event.getSource().toString().substring(currentInput.indexOf("'") + 1, currentInput.lastIndexOf("'"));
            textbox.setText(input);
            System.out.println(input);
        } else if (event.getSource() == translate) {
            Random rand = new Random();
            int lang = rand.nextInt(7) + 1;
            switch (lang) {
                case 1: //english
                    translate.setText("translate");
                    pun.setText("pun");
                    equals.setText("enter");
                    break;
                case 2: //portugese 
                    translate.setText("traduzir");
                    pun.setText("trocadilho");
                    equals.setText("digitar");
                    break;
                case 3: //spanish
                    translate.setText("traducir");
                    pun.setText("retruécano");
                    equals.setText("ingressar");
                    break;
                case 4: //french
                    translate.setText("traduire");
                    pun.setText("calembour");
                    equals.setText("équivaut à");
                    break;
                case 5: //italian
                    translate.setText("tradurre");
                    pun.setText("gioco di parole");
                    equals.setText("equivale");
                    break;
                case 6: //russian
                    translate.setText("переводить");
                    pun.setText("каламбур");
                    equals.setText("равно");
                    break;
                case 7:
                    translate.setText("వేరొక భాషలో చెప్పు");
                    pun.setText("తమాషా");
                    equals.setText("సమానం");
                    break;

            }
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

    public void move(TranslateTransition translate_bt, TranslateTransition translate_rect, Button bt, Rectangle rect){
        Random rand = new Random();
        int x = rand.nextInt((120) + 1);
        int y = rand.nextInt((390) + 1);

        translate_bt.setToX(x);
        translate_bt.setToY(y);
        translate_rect.setToX(x);
        translate_rect.setToY(y);
        
        translate_bt.setDuration(Duration.millis(50));
        translate_rect.setDuration(Duration.millis(50));
        translate_bt.play();
        translate_rect.play();
        for (Button other_butt : allButtons) {

            }
        }

    public void checkCollision(){

    }
    
} 
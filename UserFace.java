
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.Random;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

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
    Rectangle textboxRect = new Rectangle(textbox.getWidth() + 40, textbox.getHeight() + 40);

    Rectangle[] allRectangles = {additionRect, subtractionRect, multiplicationRect, divisionRect, equalsRect, 
                                zeroRect, oneRect, twoRect, threeRect, fourRect, fiveRect, sixRect, sevenRect, 
                                eightRect, nineRect, sinRect, cosRect, tanRect, rootRect, logRect, exponentRect,
                                piRect, eRect, openParenthesesRect, closeParenthesesRect, punRect, translateRect, textboxRect};



    String input = "";
    //Translator theRealMath = new Translator();

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

        additionRect.setFill(Color.web("FFB5E8"));
        subtractionRect.setFill(Color.web("FF9CEE"));
        multiplicationRect.setFill(Color.web("FFCCF9"));
        divisionRect.setFill(Color.web("FCC2FF"));
        equalsRect.setFill(Color.web("F6A6FF"));
        zeroRect.setFill(Color.web("B28DFF"));
        oneRect.setFill(Color.web("C5A3FF"));
        twoRect.setFill(Color.web("D5AAFF"));
        threeRect.setFill(Color.web("ECD4FF"));
        fourRect.setFill(Color.web("FBE4FF"));
        fiveRect.setFill(Color.web("DCD3FF"));
        sixRect.setFill(Color.web("A79AFF"));
        sevenRect.setFill(Color.web("B5B9FF"));
        eightRect.setFill(Color.web("97A2FF"));
        nineRect.setFill(Color.web("AFCBFF"));
        sinRect.setFill(Color.web("AFFB0B"));
        cosRect.setFill(Color.web("E7FFAC"));
        tanRect.setFill(Color.web("ffe985"));
        rootRect.setFill(Color.web("ACE7FF"));
        logRect.setFill(Color.web("C4FAF8"));
        exponentRect.setFill(Color.web("DBFFD6"));
        piRect.setFill(Color.web("85E3FF"));
        eRect.setFill(Color.web("6EB5FF"));
        openParenthesesRect.setFill(Color.web("B0FF82"));
        closeParenthesesRect.setFill(Color.web("BFFCC6"));
        punRect.setFill(Color.web("FFC9DE"));
        translateRect.setFill(Color.web("FFABAB"));
        textboxRect.setFill(Color.web("FFBEBC"));

        additionRect.setArcHeight(15.0);
        additionRect.setArcWidth(10.0);
        subtractionRect.setArcHeight(15.0);
        subtractionRect.setArcWidth(10.0);
        multiplicationRect.setArcHeight(15.0);
        multiplicationRect.setArcWidth(10.0);
        divisionRect.setArcHeight(15.0);
        divisionRect.setArcWidth(10.0);
        equalsRect.setArcHeight(15.0);
        equalsRect.setArcWidth(10.0);
        zeroRect.setArcHeight(15.0);
        zeroRect.setArcWidth(10.0);
        oneRect.setArcHeight(15.0);
        oneRect.setArcWidth(10.0);
        twoRect.setArcHeight(15.0);
        twoRect.setArcWidth(10.0);
        threeRect.setArcHeight(15.0);
        threeRect.setArcWidth(10.0);
        fourRect.setArcHeight(15.0);
        fourRect.setArcWidth(10.0);
        fiveRect.setArcHeight(15.0);
        fiveRect.setArcWidth(10.0);
        sixRect.setArcHeight(15.0);
        sixRect.setArcWidth(10.0);
        sevenRect.setArcHeight(15.0);
        sevenRect.setArcWidth(10.0);
        eightRect.setArcHeight(15.0);
        eightRect.setArcWidth(10.0);
        nineRect.setArcHeight(15.0);
        nineRect.setArcWidth(10.0);
        sinRect.setArcHeight(15.0);
        sinRect.setArcWidth(10.0);
        cosRect.setArcHeight(15.0);
        cosRect.setArcWidth(10.0);
        tanRect.setArcHeight(15.0);
        tanRect.setArcWidth(10.0);
        rootRect.setArcHeight(15.0);
        rootRect.setArcWidth(10.0);
        logRect.setArcHeight(15.0);
        logRect.setArcWidth(10.0);
        exponentRect.setArcHeight(15.0);
        exponentRect.setArcWidth(10.0);
        piRect.setArcHeight(15.0);
        piRect.setArcWidth(10.0);
        eRect.setArcHeight(15.0);
        eRect.setArcWidth(10.0);
        openParenthesesRect.setArcHeight(15.0);
        openParenthesesRect.setArcWidth(10.0);
        closeParenthesesRect.setArcHeight(15.0);
        closeParenthesesRect.setArcWidth(10.0);
        punRect.setArcHeight(15.0);
        punRect.setArcWidth(10.0);
        translateRect.setArcHeight(15.0);
        translateRect.setArcWidth(10.0);
        textboxRect.setArcHeight(15.0);
        textboxRect.setArcWidth(10.0);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(5));
        grid.setStyle(STYLESHEET_CASPIAN);
        //grid.setHgap(5);
        grid.setVgap(8);
        //grid.setGridLinesVisible(true);

        AnchorPane anchor = new AnchorPane();
       
        equals.prefHeight(60);
        equals.prefWidth(60);

        anchor.getChildren().add(equalsRect);
        AnchorPane.setTopAnchor(equalsRect, 10.0d);
        AnchorPane.setLeftAnchor(equalsRect, 120.0d);
        anchor.getChildren().add(additionRect);
        AnchorPane.setTopAnchor(additionRect, 60.0d);
        AnchorPane.setLeftAnchor(additionRect, 10.0d);
        anchor.getChildren().add(subtractionRect);
        AnchorPane.setTopAnchor(subtractionRect, 10.0d);
        AnchorPane.setLeftAnchor(subtractionRect, 10.0d);
        anchor.getChildren().add(multiplicationRect);
        AnchorPane.setTopAnchor(multiplicationRect, 120.0d);
        AnchorPane.setLeftAnchor(multiplicationRect, 10.0d);
        anchor.getChildren().add(divisionRect);
        AnchorPane.setTopAnchor(divisionRect, 10.0d);
        AnchorPane.setLeftAnchor(divisionRect, 170.0d);
        anchor.getChildren().add(zeroRect);
        AnchorPane.setTopAnchor(zeroRect, 10.0d);
        AnchorPane.setLeftAnchor(zeroRect, 60.0d);
        anchor.getChildren().add(oneRect);
        AnchorPane.setTopAnchor(oneRect, 10.0d);
        AnchorPane.setLeftAnchor(oneRect, 220.0d);
        anchor.getChildren().add(twoRect);
        AnchorPane.setTopAnchor(twoRect, 120.0d);
        AnchorPane.setLeftAnchor(twoRect, 10.0d);
        anchor.getChildren().add(threeRect);
        AnchorPane.setTopAnchor(threeRect, 180.0d);
        AnchorPane.setLeftAnchor(threeRect, 10.0d);
        anchor.getChildren().add(fourRect);
        AnchorPane.setTopAnchor(fourRect, 240.0d);
        AnchorPane.setLeftAnchor(fourRect, 10.0d);
        anchor.getChildren().add(fiveRect);
        AnchorPane.setTopAnchor(fiveRect, 300.0d);
        AnchorPane.setLeftAnchor(fiveRect, 10.0d);
        anchor.getChildren().add(sixRect);
        AnchorPane.setTopAnchor(sixRect, 360.0d);
        AnchorPane.setLeftAnchor(sixRect, 10.0d);
        anchor.getChildren().add(sevenRect);
        AnchorPane.setTopAnchor(sevenRect, 420.0d);
        AnchorPane.setLeftAnchor(sevenRect, 10.0d);
        anchor.getChildren().add(eightRect);
        AnchorPane.setTopAnchor(eightRect, 480.0d);
        AnchorPane.setLeftAnchor(eightRect, 10.0d);
        anchor.getChildren().add(nineRect);
        AnchorPane.setTopAnchor(nineRect, 530.0d);
        AnchorPane.setLeftAnchor(nineRect, 10.0d);
        anchor.getChildren().add(cosRect);
        AnchorPane.setTopAnchor(cosRect, 60.0d);
        AnchorPane.setLeftAnchor(cosRect, 60.0d);
        anchor.getChildren().add(sinRect);
        AnchorPane.setTopAnchor(sinRect, 60.0d);
        AnchorPane.setLeftAnchor(sinRect, 120.0d);
        anchor.getChildren().add(tanRect);
        AnchorPane.setTopAnchor(tanRect, 60.0d);
        AnchorPane.setLeftAnchor(tanRect, 180.0d);
        anchor.getChildren().add(rootRect);
        AnchorPane.setTopAnchor(rootRect, 60.0d);
        AnchorPane.setLeftAnchor(rootRect, 240.0d);
        anchor.getChildren().add(logRect);
        AnchorPane.setTopAnchor(logRect, 60.0d);
        AnchorPane.setLeftAnchor(logRect, 300.0d);
        anchor.getChildren().add(exponentRect);
        AnchorPane.setTopAnchor(exponentRect, 120.0d);
        AnchorPane.setLeftAnchor(exponentRect, 60.0d);
        anchor.getChildren().add(eRect);
        AnchorPane.setTopAnchor(eRect, 120.0d);
        AnchorPane.setLeftAnchor(eRect, 120.0d);
        anchor.getChildren().add(piRect);
        AnchorPane.setTopAnchor(piRect, 120.0d);
        AnchorPane.setLeftAnchor(piRect, 180.0d);
        anchor.getChildren().add(openParenthesesRect);
        AnchorPane.setTopAnchor(openParenthesesRect, 180.0d);
        AnchorPane.setLeftAnchor(openParenthesesRect, 60.0d);
        anchor.getChildren().add(closeParenthesesRect);
        AnchorPane.setTopAnchor(closeParenthesesRect, 180.0d);
        AnchorPane.setLeftAnchor(closeParenthesesRect, 120.0d);
        anchor.getChildren().add(punRect);
        AnchorPane.setTopAnchor(punRect, 180.0d);
        AnchorPane.setLeftAnchor(punRect, 180.0d);
        anchor.getChildren().add(translateRect);
        AnchorPane.setTopAnchor(translateRect, 180.0d);
        AnchorPane.setLeftAnchor(translateRect, 240.0d);
        anchor.getChildren().add(textboxRect);
        AnchorPane.setTopAnchor(textboxRect, 240.0d);
        AnchorPane.setLeftAnchor(textboxRect, 60.0d);
        


        anchor.getChildren().add(equals);
        AnchorPane.setTopAnchor(equals, 10.0d);
        AnchorPane.setLeftAnchor(equals, 120.0d);
        anchor.getChildren().add(addition);
        AnchorPane.setTopAnchor(addition, 60.0d);
        AnchorPane.setLeftAnchor(addition, 10.0d);
        anchor.getChildren().add(subtraction);
        AnchorPane.setTopAnchor(subtraction, 10.0d);
        AnchorPane.setLeftAnchor(subtraction, 10.0d);
        anchor.getChildren().add(multiplication);
        AnchorPane.setTopAnchor(multiplication, 120.0d);
        AnchorPane.setLeftAnchor(multiplication, 10.0d);
        anchor.getChildren().add(division);
        AnchorPane.setTopAnchor(division, 10.0d);
        AnchorPane.setLeftAnchor(division, 170.0d);
        anchor.getChildren().add(zero);
        AnchorPane.setTopAnchor(zero, 60.0d);
        AnchorPane.setLeftAnchor(zero, 10.0d);
        anchor.getChildren().add(one);
        AnchorPane.setTopAnchor(one, 10.0d);
        AnchorPane.setLeftAnchor(one, 10.0d);
        anchor.getChildren().add(two);
        AnchorPane.setTopAnchor(two, 60.0d);
        AnchorPane.setLeftAnchor(two, 10.0d);
        anchor.getChildren().add(three);
        AnchorPane.setTopAnchor(three, 10.0d);
        AnchorPane.setLeftAnchor(three, 10.0d);
        anchor.getChildren().add(four);
        AnchorPane.setTopAnchor(four, 60.0d);
        AnchorPane.setLeftAnchor(four, 10.0d);
        anchor.getChildren().add(five);
        AnchorPane.setTopAnchor(five, 300.0d);
        AnchorPane.setLeftAnchor(five, 10.0d);
        anchor.getChildren().add(six);
        AnchorPane.setTopAnchor(six, 360.0d);
        AnchorPane.setLeftAnchor(six, 10.0d);
        anchor.getChildren().add(seven);
        AnchorPane.setTopAnchor(seven, 420.0d);
        AnchorPane.setLeftAnchor(seven, 10.0d);
        anchor.getChildren().add(eight);
        AnchorPane.setLeftAnchor(eight, 480.0d);
        AnchorPane.setTopAnchor(eight, 10.0d);
        anchor.getChildren().add(nine);
        AnchorPane.setTopAnchor(nine, 530.0d);
        AnchorPane.setLeftAnchor(nine, 10.0d);
        anchor.getChildren().add(cos);
        AnchorPane.setTopAnchor(cos, 60.0d);
        AnchorPane.setLeftAnchor(cos, 60.0d);
        anchor.getChildren().add(sin);
        AnchorPane.setTopAnchor(sin, 60.0d);
        AnchorPane.setLeftAnchor(sin, 120.0d);
        anchor.getChildren().add(tan);
        AnchorPane.setTopAnchor(tan, 60.0d);
        AnchorPane.setLeftAnchor(tan, 180.0d);
        anchor.getChildren().add(root);
        AnchorPane.setTopAnchor(root, 60.0d);
        AnchorPane.setLeftAnchor(root, 240.0d);
        anchor.getChildren().add(log);
        AnchorPane.setTopAnchor(log, 60.0d);
        AnchorPane.setLeftAnchor(log, 300.0d);
        anchor.getChildren().add(exponent);
        AnchorPane.setTopAnchor(exponent, 120.0d);
        AnchorPane.setLeftAnchor(exponent, 60.0d);
        anchor.getChildren().add(e);
        AnchorPane.setTopAnchor(e, 120.0d);
        AnchorPane.setLeftAnchor(e, 120.0d);
        anchor.getChildren().add(pi);
        AnchorPane.setTopAnchor(pi, 120.0d);
        AnchorPane.setLeftAnchor(pi, 180.0d);
        anchor.getChildren().add(openParentheses);
        AnchorPane.setTopAnchor(openParentheses, 180.0d);
        AnchorPane.setLeftAnchor(openParentheses, 60.0d);
        anchor.getChildren().add(closeParentheses);
        AnchorPane.setTopAnchor(closeParentheses, 180.0);
        AnchorPane.setLeftAnchor(closeParentheses, 120.0d);
        anchor.getChildren().add(pun);
        AnchorPane.setTopAnchor(pun, 180.0d);
        AnchorPane.setLeftAnchor(pun, 180.0d);
        anchor.getChildren().add(translate);
        AnchorPane.setTopAnchor(translate, 180.0d);
        AnchorPane.setLeftAnchor(translate, 240.0d);
        anchor.getChildren().add(textbox);
        AnchorPane.setTopAnchor(textbox, 240.0d);
        AnchorPane.setLeftAnchor(textbox, 60.0d);
        

        //scene = new Scene(grid, 300, 600, Color.BLACK);
        anchor.setPrefSize(300, 600);
        scene = new Scene(anchor);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();


        TranslateTransition translate_addition = new TranslateTransition();  
        translate_addition.setNode(addition);  
        TranslateTransition translate_additionRect = new TranslateTransition();  
        translate_additionRect.setNode(additionRect); 

        TranslateTransition translate_subtraction = new TranslateTransition();  
        translate_subtraction.setNode(subtraction);
        TranslateTransition translate_subtractionRect = new TranslateTransition();  
        translate_subtractionRect.setNode(subtractionRect); 

        TranslateTransition translate_multiplication = new TranslateTransition();  
        translate_multiplication.setNode(multiplication);
        TranslateTransition translate_multiplicationRect = new TranslateTransition();  
        translate_multiplicationRect.setNode(multiplicationRect); 

        TranslateTransition translate_division = new TranslateTransition();  
        translate_division.setNode(division);
        TranslateTransition translate_divisionRect = new TranslateTransition();  
        translate_divisionRect.setNode(divisionRect); 

        TranslateTransition translate_equals = new TranslateTransition();  
        translate_equals.setNode(equals);
        TranslateTransition translate_equalsRect = new TranslateTransition();  
        translate_equalsRect.setNode(equalsRect); 

        TranslateTransition translate_zero = new TranslateTransition();  
        translate_zero.setNode(zero);
        TranslateTransition translate_zeroRect = new TranslateTransition();  
        translate_zeroRect.setNode(zeroRect); 

        TranslateTransition translate_one = new TranslateTransition();  
        translate_one.setNode(one);
        TranslateTransition translate_oneRect = new TranslateTransition();  
        translate_oneRect.setNode(oneRect);

        TranslateTransition translate_two = new TranslateTransition();  
        translate_two.setNode(two);
        TranslateTransition translate_twoRect = new TranslateTransition();  
        translate_twoRect.setNode(twoRect); 

        TranslateTransition translate_three = new TranslateTransition();  
        translate_three.setNode(three);
        TranslateTransition translate_threeRect = new TranslateTransition();  
        translate_threeRect.setNode(threeRect); 

        TranslateTransition translate_four = new TranslateTransition();  
        translate_four.setNode(four);
        TranslateTransition translate_fourRect = new TranslateTransition();  
        translate_fourRect.setNode(fourRect); 

        TranslateTransition translate_five = new TranslateTransition();  
        translate_five.setNode(five);
        TranslateTransition translate_fiveRect = new TranslateTransition();  
        translate_fiveRect.setNode(fiveRect); 

        TranslateTransition translate_six = new TranslateTransition();  
        translate_six.setNode(six);
        TranslateTransition translate_sixRect = new TranslateTransition();  
        translate_sixRect.setNode(sixRect); 

        TranslateTransition translate_seven = new TranslateTransition();  
        translate_seven.setNode(seven);
        TranslateTransition translate_sevenRect = new TranslateTransition();  
        translate_sevenRect.setNode(sevenRect); 

        TranslateTransition translate_eight = new TranslateTransition();  
        translate_eight.setNode(eight);
        TranslateTransition translate_eightRect = new TranslateTransition();  
        translate_eightRect.setNode(eightRect); 

        TranslateTransition translate_nine = new TranslateTransition();  
        translate_nine.setNode(nine);
        TranslateTransition translate_nineRect = new TranslateTransition();  
        translate_nineRect.setNode(nineRect); 

        TranslateTransition translate_e = new TranslateTransition();  
        translate_e.setNode(e);
        TranslateTransition translate_eRect = new TranslateTransition();  
        translate_eRect.setNode(eRect); 

        TranslateTransition translate_pi = new TranslateTransition();  
        translate_pi.setNode(pi);
        TranslateTransition translate_piRect = new TranslateTransition();  
        translate_piRect.setNode(piRect); 

        TranslateTransition translate_sin = new TranslateTransition();  
        translate_sin.setNode(sin);
        TranslateTransition translate_sinRect = new TranslateTransition();  
        translate_sinRect.setNode(sinRect); 

        TranslateTransition translate_cos = new TranslateTransition();  
        translate_cos.setNode(cos);
        TranslateTransition translate_cosRect = new TranslateTransition();  
        translate_cosRect.setNode(cosRect); 
        
        TranslateTransition translate_tan = new TranslateTransition();  
        translate_tan.setNode(tan);
        TranslateTransition translate_tanRect = new TranslateTransition();  
        translate_tanRect.setNode(tanRect); 

        TranslateTransition translate_root = new TranslateTransition();  
        translate_root.setNode(root);
        TranslateTransition translate_rootRect = new TranslateTransition();  
        translate_rootRect.setNode(rootRect); 

        TranslateTransition translate_log = new TranslateTransition();  
        translate_log.setNode(log);
        TranslateTransition translate_logRect = new TranslateTransition();  
        translate_logRect.setNode(logRect); 

        TranslateTransition translate_exponent = new TranslateTransition();  
        translate_exponent.setNode(exponent);
        TranslateTransition translate_exponentRect = new TranslateTransition();  
        translate_exponentRect.setNode(exponentRect); 

        TranslateTransition translate_openParentheses = new TranslateTransition();
        translate_openParentheses.setNode(openParentheses);
        TranslateTransition translate_openParenthesesRect = new TranslateTransition();  
        translate_openParenthesesRect.setNode(openParenthesesRect); 

        TranslateTransition translate_closeParentheses = new TranslateTransition();
        translate_closeParentheses.setNode(closeParentheses);
        TranslateTransition translate_closeParenthesesRect = new TranslateTransition();  
        translate_closeParenthesesRect.setNode(closeParenthesesRect); 


        additionRect.setOnMouseEntered(event -> {
            move(translate_addition, translate_additionRect, addition, additionRect);
            });
        subtractionRect.setOnMouseEntered(event -> {
            move(translate_subtraction, translate_subtractionRect, subtraction, subtractionRect);
            });
        multiplicationRect.setOnMouseEntered(event -> {
            move(translate_multiplication, translate_multiplicationRect, multiplication, multiplicationRect);
            });
        divisionRect.setOnMouseEntered(event -> {
            move(translate_division, translate_divisionRect, division, divisionRect);
            }); 
        oneRect.setOnMouseEntered(event -> {
            move(translate_one, translate_oneRect, one, oneRect);
            }); 
        twoRect.setOnMouseEntered(event -> {
            move(translate_two, translate_twoRect, two, twoRect);
            }); 
        threeRect.setOnMouseEntered(event -> {
            move(translate_three, translate_threeRect, three, threeRect);
            }); 
        fourRect.setOnMouseEntered(event -> {
            move(translate_four, translate_fourRect, four, fourRect);
            }); 
        fiveRect.setOnMouseEntered(event -> {
            move(translate_five, translate_fiveRect, five, fiveRect);
            }); 
        sixRect.setOnMouseEntered(event -> {
            move(translate_six, translate_sixRect, six, sixRect);
            }); 
        sevenRect.setOnMouseEntered(event -> {
            move(translate_seven,  translate_sevenRect, seven, sevenRect);
            }); 
        eightRect.setOnMouseEntered(event -> {
            move(translate_eight, translate_eightRect, eight, eightRect);
            }); 
        nineRect.setOnMouseEntered(event -> {
            move(translate_nine, translate_nineRect, nine, nineRect);
            }); 
        zeroRect.setOnMouseEntered(event -> {
            move(translate_zero, translate_zeroRect, zero, zeroRect);
            }); 
        equalsRect.setOnMouseEntered(event -> {
            move(translate_equals, translate_equalsRect, equals, equalsRect);
            }); 
        sinRect.setOnMouseEntered(event -> {
            move(translate_sin, translate_sinRect, sin, sinRect);
            }); 
        cosRect.setOnMouseEntered(event -> {
            move(translate_cos, translate_cosRect, cos, cosRect);
            }); 
        tanRect.setOnMouseEntered(event -> {
            move(translate_tan, translate_tanRect, tan, tanRect);
            }); 
        eRect.setOnMouseEntered(event -> {
            move(translate_e, translate_eRect, e, eRect);
            }); 
        exponentRect.setOnMouseEntered(event -> {
            move(translate_exponent, translate_exponentRect, exponent, exponentRect);
            }); 
        piRect.setOnMouseEntered(event -> {
            move(translate_pi, translate_piRect, pi, piRect);
            }); 
        logRect.setOnMouseEntered(event -> {
            move(translate_log, translate_logRect, log, logRect);
            }); 
        rootRect.setOnMouseEntered(event -> {
            move(translate_root, translate_rootRect, root, rootRect);
            });
        openParenthesesRect.setOnMouseEntered(event -> {
            move(translate_openParentheses, translate_openParenthesesRect, openParentheses, openParenthesesRect);
            });
        closeParenthesesRect.setOnMouseEntered(event -> {
            move(translate_closeParentheses, translate_closeParenthesesRect, closeParentheses, closeParenthesesRect);
            });
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
        if (event.getSource() == equals) {
            //theRealMath.getInput(input);
        }
        if (event.getSource() == addition) {
            System.out.println(addition.getLayoutX() + "| x");
            System.out.println(addition.getLayoutY() + "| y");
            System.out.println(allButtons.length);
        }
        if (event.getSource() == equals) {
            System.out.println(equals.getLayoutX() + "| x");
            System.out.println(equals.getLayoutY() + "| y");
        }
    }

    public void move(TranslateTransition translate_bt, TranslateTransition translate_rect, Button bt, Rectangle rect){
        Random rand = new Random();
        int x = rand.nextInt((120) + 1);
        int y = rand.nextInt((500) + 1);

        translate_bt.setToX(x);
        translate_bt.setToY(y);
        translate_rect.setToX(x);
        translate_rect.setToY(y);
        
        translate_bt.setDuration(Duration.millis(50));
        translate_rect.setDuration(Duration.millis(50));
        translate_bt.play();
        translate_rect.play();

        checkCollision(translate_bt, translate_rect, bt, rect);

    }

    public void checkCollision(TranslateTransition translate_bt, TranslateTransition translate_rect, Button bt, Rectangle rect){
        Random rand = new Random();
        int i = 0;
        for (Rectangle r: allRectangles) {
            boolean collisionDetected = false;
            Shape intersect = Shape.intersect(r, rect);
            if (intersect.getBoundsInParent().getWidth() != -1 && r != rect) {
                int x = rand.nextInt((120) + 1);
                int y = rand.nextInt((500) + 1);

                translate_bt.setToX(x);
                translate_bt.setToY(y);
                translate_rect.setToX(x);
                translate_rect.setToY(y);
                
                translate_bt.setDuration(Duration.millis(50));
                translate_rect.setDuration(Duration.millis(50));
                translate_bt.play();
                translate_rect.play();
        }
    }

    }}
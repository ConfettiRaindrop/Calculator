
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
        addition.setText("+");
        subtraction.setText("-");
        multiplication.setText("*");
        division.setText("/");

        button.setOnAction(this);

        GridPane grid = new GridPane();
    
        grid.add(addition, 0, 0);
        grid.add(subtraction, 0, 1);
        grid.add(multiplication, 0, 2);
        grid.add(division, 0, 3);

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
    public void handle(ActionEvent event ) {
        if (event.getSource() == button) {
            button.setText("osdhfsndaf");
        }
    }

    public void move(TranslateTransition translate){
        translate.setByX(300);
        translate.setDuration(Duration.millis(1000));
        translate.play();
    }
    
} 
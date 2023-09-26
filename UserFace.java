
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//https://fxdocs.github.io/docs/html5/#_timing

public class UserFace extends Application{

    Button button;
    Button addition;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Rage Against the Machine");

        button = new Button();
        button.setText("Rage Against the Machine");
        addition = new Button();
        addition.setText("+");

        StackPane layout = new StackPane();
        StackPane columnOne = new StackPane();
        StackPane columnTwo = new StackPane();
        layout.getChildren().add(columnOne);
        layout.getChildren().add(columnTwo);
        GridPane gridPane = new GridPane();
        columnOne.getChildren().add(gridPane);
        gridPane.getChildren().add(button);
        gridPane.getChildren().add(addition);

        Scene scene = new Scene(layout, 300, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
} 
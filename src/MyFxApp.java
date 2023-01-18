import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyFxApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Construct controls
        Label label1 = new Label("Happy New Year");
        Label label2 = new Label("It's");
        Label label3 = new Label("January");
        Label label4 = new Label("2023!");


        Button button1 = new Button("Press me!");
        button1.setOnAction(actionEvent -> {
            label4.setText("Siraj!");
        });

        // Layout the controls
        HBox hbox1 = new HBox(label2, label3, label4);
        VBox vbox1 = new VBox(label1, hbox1, button1);
        Scene scene = new Scene(vbox1, 400, 200);

        // Open the stage's curtains
        primaryStage.setScene(scene);
        primaryStage.setTitle("Siraj's JavaFX App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
package ee.khk;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.Parent;



public class Main extends Application{

    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) {

        Label first = new Label("First");
        Label second = new Label("Second");
        Label third = new Label("Third");

        GridPane root = new GridPane();
        root.getColumnConstraints().add(new ColumnConstraints(80));
        root.getColumnConstraints().add(new ColumnConstraints(150));
        root.getColumnConstraints().add(new ColumnConstraints(70));

        root.setGridLinesVisible(true);
        root.setColumnIndex(first,0);
        root.setColumnIndex(second,1);
        root.setColumnIndex(third,2);
        root.getChildren().addAll(first,second,third);





        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);

        stage.setTitle("GridPane in JavaFX");

        stage.show();
    }
}




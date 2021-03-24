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
        Label sixth = new Label("Sixth");

        GridPane root = new GridPane();
        root.getColumnConstraints().add(new ColumnConstraints(80));
        ColumnConstraints column2 = new ColumnConstraints(150,150,Double.MAX_VALUE);
        column2.setHgrow(Priority.ALWAYS);
        root.getColumnConstraints().add(column2);
        ColumnConstraints column3 = new ColumnConstraints(70,70,Double.MAX_VALUE);
        column3.setHgrow(Priority.ALWAYS);
        root.getColumnConstraints().add(column3);

        RowConstraints row1 = new RowConstraints(80,80,Double.MAX_VALUE);
        row1.setVgrow(Priority.ALWAYS);
        RowConstraints row2 = new RowConstraints(80,80,Double.MAX_VALUE);
        row2.setVgrow(Priority.ALWAYS);

        root.getRowConstraints().add(row1);
        root.getRowConstraints().add(row2);



        root.setGridLinesVisible(true);
        root.add(first,0,0);
        root.add(second,1,0);
        root.add(third,2,0);
        root.add(sixth,2,1);





        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);

        stage.setTitle("GridPane in JavaFX");

        stage.show();
    }
}




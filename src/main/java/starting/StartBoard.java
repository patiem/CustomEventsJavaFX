package starting;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class StartBoard extends Application {

    @Override
    public void start(final Stage stage) throws Exception {

        stage.setResizable(false);
        Group startRoot = new Group();
        final Scene startScene = new Scene(startRoot, 800, 600);

        FXMLLoader startLoader = new FXMLLoader(getClass().getResource("/startBoard.fxml"));
        AnchorPane startBoard = startLoader.load();
        startRoot.getChildren().addAll(startBoard);

        stage.setTitle("FXML Welcome");
        stage.setScene(startScene);
        stage.show();
    }

    public static void run(String[] args) {
        Application.launch(args);
    }
}

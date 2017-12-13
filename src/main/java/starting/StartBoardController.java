package starting;

import conection.MockedServer;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StartBoardController implements Initializable {

    MockedServer mockedServer = new MockedServer();

    @FXML
    TextField userName;

    @FXML
    TextField ipNumber;

    @FXML
    TextField portNumber;

    @FXML
    Button connectButton;

    @FXML
    Button getButton;

    public void initialize(URL location, ResourceBundle resources) {
        userName.setText("Głupek Kamil");
        getButton.addEventHandler(InputEvent.MESSAGE, getInput);

    }

    @FXML
    void connect(MouseEvent event) throws IOException {
        mockedServer.startRunnung(getButton);
    }


    EventHandler<InputEvent> getInput = event -> {
        userName.setText(event.message);
    };



}

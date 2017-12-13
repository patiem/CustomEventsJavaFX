package conection;


import javafx.scene.control.Button;

public class MockedServer {


    public void startRunnung(Button button) {
        Thread thread = new Thread(new Connect(button));
        thread.start();
    }
}

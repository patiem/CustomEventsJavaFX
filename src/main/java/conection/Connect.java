package conection;

import javafx.scene.control.Button;
import starting.InputEvent;

import java.io.*;

public class Connect implements Runnable{

    PrintWriter printWriter;
    BufferedReader reader;
    private Button button;

    public Connect() {
        printWriter = new PrintWriter(System.out,true);

        try {
            reader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public Connect(Button button) {
        this();
        this.button = button;
    }

    @Override
    public void run() {
        while (true) {
            String s = null;
            try {
                s = reader.readLine();
                button.fireEvent(new InputEvent(s));


            } catch (IOException e) {
                e.printStackTrace();
            }
            printWriter.println(s);
        }
    }
}

package starting;

import javafx.event.Event;
import javafx.event.EventTarget;
import javafx.event.EventType;

public class InputEvent extends Event{

    public static final EventType<InputEvent> MESSAGE =
            new EventType<>(Event.ANY, "MESSAGE");


    String message;

    public InputEvent(String s) {
        super(MESSAGE);
        message = s;
    }


    public InputEvent(Object source, EventTarget target) {
        super(source, target, MESSAGE);
    }
}

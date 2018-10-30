package observer.model;

import observer.interfaces.Observer;
import observer.interfaces.Subject;

public class EmailTopicSubscriber implements Observer<String> {

    private String name;

    // Reference to our Subject class
    private Subject<String> topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if (topic == null) {
            return;
        }
        String msg = topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + " No mesg for this topic");
        } else {
            System.out.println(name + " Retrieving new message: " + msg);
        }
    }

    @Override
    public void setSubject(Subject<String> subject) {
        this.topic = subject;
    }
}

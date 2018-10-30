package observer;

import observer.interfaces.Observer;
import observer.model.EmailTopic;
import observer.model.EmailTopicSubscriber;

public class Main {

    public static void main(String[] args) {
        EmailTopic topic = new EmailTopic();

        Observer<String> firstObserver = new EmailTopicSubscriber("First observer");
        Observer<String> secondObserver = new EmailTopicSubscriber("Second observer");
        Observer<String> thirdObserver = new EmailTopicSubscriber("Third observer");

        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);


        firstObserver.update();

        topic.postMessage("Hello Subscribers");

//        topic.notifyObservers();
    }
}

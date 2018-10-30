package observer.interfaces;

public interface Observer<T> {

    void update();
    void setSubject(Subject<T> subject);
}

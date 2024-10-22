package advanced.designpatterns.observer;

/*
 * This represents the channel subject objects in the Observer Design Pattern,
 * and it's role is notify all subscribers when a new video is uploaded
 */

public interface Subject {
    public void subscribe(Subscriber sub);

    public void unsubscribe(Subscriber sub);

    public void notifySubscribers();

    public void uploadVideo(String title);
}

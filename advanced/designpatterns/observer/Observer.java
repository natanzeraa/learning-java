package advanced.designpatterns.observer;

/*
 * This represents the subscriber subject objects in the Observer Design Pattern,
 * because the subs will be notified about new video uploads
 */

public interface Observer {
    public void update();

    public void subscribeToChannel(Channel ch);
}

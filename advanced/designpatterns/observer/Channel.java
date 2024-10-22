package advanced.designpatterns.observer;

import java.util.*;

public class Channel implements Subject {

    private List<Subscriber> subs = new ArrayList<>();

    private String title;

    private String channel;

    public Channel(String channelName) {
        this.channel = channelName;
    }

    public Channel() {
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void subscribe(Subscriber sub) {
        subs.add(sub);
        System.out.println("Hey " + sub + " welcome to my channel :)");
    }

    @Override
    public void unsubscribe(Subscriber sub) {
        subs.remove(sub);
        System.out.println("Hope you come back soon :(");
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber s : subs)
            s.update();
    }

    @Override
    public void uploadVideo(String title) {
        this.title = title;
        notifySubscribers();
    }

    @Override
    public String toString() {
        return this.channel;
    }
}

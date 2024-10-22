package advanced.designpatterns.observer;

/**
 * The Observer Design Pattern is a behavioral design pattern that defines a
 * one-to-many dependency between objects. When one object (the subject) changes
 * state, all its dependents (observers) are notified and updated automatically.
 */

public class Youtube {
    public static void main(String[] args) {
        Channel myChannel = new Channel("Learn Java with Natan");

        Subscriber s1 = new Subscriber("Nate");
        Subscriber s2 = new Subscriber("Megh");
        Subscriber s3 = new Subscriber("Liza");

        myChannel.subscribe(s1);
        myChannel.subscribe(s2);
        myChannel.subscribe(s3);

        s1.subscribeToChannel(myChannel);
        s2.subscribeToChannel(myChannel);
        s3.subscribeToChannel(myChannel);

        myChannel.uploadVideo("How to implement Observer Design Pattern in Java :()");
    }
}

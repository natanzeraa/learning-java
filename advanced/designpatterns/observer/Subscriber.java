package advanced.designpatterns.observer;

public class Subscriber implements Observer {

    private String name;
    private Channel channel = new Channel();

    public void setName(String name) {
        this.name = name;
    }

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Hey you " + name + "! New video " + channel.getTitle() + " from " + channel + "!");
    }

    @Override
    public void subscribeToChannel(Channel ch) {
        this.channel = ch;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

package Observer;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();
        NewsSubscriber subscriber1 = new NewsSubscriber("Subscriber 1");
        NewsSubscriber subscriber2 = new NewsSubscriber("Subscriber 2");
        NewsSubscriber subscriber3 = new NewsSubscriber("Subscriber 3");

        publisher.addObserver(subscriber1);
        publisher.addObserver(subscriber2);
        publisher.addObserver(subscriber3);

        publisher.publishNews("News 1");
        publisher.publishNews("News 2");
        publisher.publishNews("News 3");

    }

}

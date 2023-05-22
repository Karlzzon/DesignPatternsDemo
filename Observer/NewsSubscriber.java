package Observer;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class NewsSubscriber implements Observer {
    private String subcriberName;

    public NewsSubscriber(String subcriberName) {
        this.subcriberName = subcriberName;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof NewsPublisher) {
            String news = (String) arg;
            System.out.println("Subscriber " + subcriberName + " received news: " + news);
            System.out.println();
        }
    }
}

package Observer;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class NewsPublisher extends Observable {

    public void publishNews(String news) {
        setChanged();
        notifyObservers(news);
    }
}

package notificationManagement;

/**
 * Created by sheebanshaikh on 8/9/16.
 */

public abstract class Notification {

    public Long notificationId;

    public abstract void createNotifications();

    public abstract void addNotification();

    public abstract void deleteNotification();

    public abstract void notifyObserver();

}

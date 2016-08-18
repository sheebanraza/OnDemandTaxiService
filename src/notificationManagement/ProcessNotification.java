package notificationManagement;

import notificationManagement.Model.NotificationMessages;

/**
 * Created by sheebanshaikh on 8/17/16.
 */


public class ProcessNotification extends Notification {
    @Override
    public NotificationMessages getNotifications(NotificationMessages NotificationMessage) {
        return NotificationMessages.START;
    }

    @Override
    public void notifyObserver() {
        System.out.print("Start Observer");
    }
}

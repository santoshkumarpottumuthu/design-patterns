package org.santosh.design.observerPattern.Observer;

import org.santosh.design.observerPattern.Observable.StocksObservable;

public class MobileNotificationAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StocksObservable observable;

    public MobileNotificationAlertObserverImpl(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMobileNotification();
    }

    private void sendMobileNotification() {

        System.out.println("Triggering Push Notification to user : "+userName);

    }
}

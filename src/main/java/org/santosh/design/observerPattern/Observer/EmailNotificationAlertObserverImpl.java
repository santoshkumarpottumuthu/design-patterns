package org.santosh.design.observerPattern.Observer;

import org.santosh.design.observerPattern.Observable.StocksObservable;

public class EmailNotificationAlertObserverImpl implements NotificationAlertObserver {

    String email;
    StocksObservable observable;


    public EmailNotificationAlertObserverImpl(String email, StocksObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("Email Triggered to user "+email);
    }
}

package org.santosh.design.observerPattern;

import org.santosh.design.observerPattern.Observable.IphoneStockObservableImpl;
import org.santosh.design.observerPattern.Observable.StocksObservable;
import org.santosh.design.observerPattern.Observer.EmailNotificationAlertObserverImpl;
import org.santosh.design.observerPattern.Observer.MobileNotificationAlertObserverImpl;
import org.santosh.design.observerPattern.Observer.NotificationAlertObserver;

public class Stocks {

    public static void main(String[] args) {
        StocksObservable observable = new IphoneStockObservableImpl();

        NotificationAlertObserver notificationAlertObserver1 = new EmailNotificationAlertObserverImpl("santosh@skp.com",observable);
        NotificationAlertObserver notificationAlertObserver2 = new MobileNotificationAlertObserverImpl("skpottumuthu12",observable);
        observable.add(notificationAlertObserver1);
        observable.add(notificationAlertObserver2);

        observable.setStockCount(10);
    }
}

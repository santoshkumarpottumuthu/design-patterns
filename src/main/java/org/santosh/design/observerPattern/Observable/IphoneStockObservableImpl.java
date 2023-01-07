package org.santosh.design.observerPattern.Observable;

import org.santosh.design.observerPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StocksObservable{

    public List<NotificationAlertObserver> observers = new ArrayList<>();
    public int stockCount =0;
    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {

        for (NotificationAlertObserver observer : observers){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {

        if (stockCount == 0)
            notifySubscribers();
        stockCount+=newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}

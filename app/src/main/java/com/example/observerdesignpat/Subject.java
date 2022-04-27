package com.example.observerdesignpat;

public interface Subject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers();
}

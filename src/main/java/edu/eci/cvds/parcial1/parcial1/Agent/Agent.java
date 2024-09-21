package edu.eci.cvds.parcial1.parcial1.Agent;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;


public abstract class Agent {

    List<Observer> observers;
    public Agent(){
        observers = new ArrayList<>();
    }
    public abstract void notifyObservers();
    public void addObserver(Observer o){
        observers.add(o);
    }

    public List<Observer> getObservers(){
        return observers;
    }
}
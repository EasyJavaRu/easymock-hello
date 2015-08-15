package ru.easyjava.easymock;

public class Consumer {
    private ServiceInterface serviceInterface;

    public String opinion() {
        return "Service was: " + serviceInterface.doSomething();
    }
}

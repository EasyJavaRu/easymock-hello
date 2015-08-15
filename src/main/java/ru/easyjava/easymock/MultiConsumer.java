package ru.easyjava.easymock;

public class MultiConsumer {
    private ServiceInterface firstService;
    private ServiceInterface secondService;

    public String opinion() {
        return "Service was: " + firstService.doSomething() + " and " + secondService.doSomething();
    }
}

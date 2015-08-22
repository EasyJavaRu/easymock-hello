package ru.easyjava.easymock;

/**
 * Sample class.
 */
public class MultiConsumer {
    /**
     * Example of same type dependencies.
     */
    private ServiceInterface firstService;
    /**
     * Example of same type dependencies.
     */
    private ServiceInterface secondService;

    /**
     * A method to test.
     * @return Some value, based on dependencies.
     */
    public final String opinion() {
        return "Service was: "
                + firstService.doSomething()
                + " and "
                + secondService.doSomething();
    }
}

package ru.easyjava.easymock;

/**
 * Sample class.
 */
public class Consumer {
    /**
     * Some sample dependency.
     */
    private ServiceInterface serviceInterface;

    /**
     * A method to test.
     * @return Some value, based on dependency.
     */
    public final String opinion() {
        return "Service was: " + serviceInterface.doSomething();
    }
}

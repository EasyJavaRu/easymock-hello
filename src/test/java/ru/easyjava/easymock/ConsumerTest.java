package ru.easyjava.easymock;

import org.easymock.EasyMockRule;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Rule;
import org.junit.Test;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConsumerTest {
    @Rule
    public EasyMockRule em = new EasyMockRule(this);

    @TestSubject
    Consumer testedObject = new Consumer();

    @Mock
    ServiceInterface service;

    @Test
    public void testOpinion() {
        expect(service.doSomething()).andStubReturn("for testing purposes only");
        replay(service);

        assertThat(testedObject.opinion(), is("Service was: for testing purposes only"));
    }
}
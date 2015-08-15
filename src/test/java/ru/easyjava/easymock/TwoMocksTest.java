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

public class TwoMocksTest {
    @Rule
    public EasyMockRule em = new EasyMockRule(this);

    @TestSubject
    MultiConsumer testedObject = new MultiConsumer();

    @Mock(fieldName = "firstService")
    ServiceInterface firstService;

    @Mock(fieldName = "secondService")
    ServiceInterface secondService;

    @Test
    public void testOpinion() {
        expect(firstService.doSomething()).andStubReturn("great");
        expect(secondService.doSomething()).andStubReturn("superior");

        replay(firstService);
        replay(secondService);

        assertThat(testedObject.opinion(), is("Service was: great and superior"));
    }
}
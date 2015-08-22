package ru.easyjava.easymock;

import org.easymock.EasyMockRule;
import org.easymock.Mock;
import org.easymock.MockType;
import org.easymock.TestSubject;
import org.junit.Rule;
import org.junit.Test;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class GreeterTargetImplTest {
    @Rule
    public EasyMockRule em = new EasyMockRule(this);

    @Mock(type = MockType.NICE)
    private Coin coinMock;

    @TestSubject
    private GreeterTargetImpl testedObject = new GreeterTargetImpl(coinMock);

    @Test
    public void testTrue() {
        expect(coinMock.toss()).andReturn(true);
        replay(coinMock);

        assertThat(testedObject.get(), is("World"));
    }

    @Test
    public void testFalse() {
        replay(coinMock);
        assertThat(testedObject.get(), is("Spring"));
    }
}
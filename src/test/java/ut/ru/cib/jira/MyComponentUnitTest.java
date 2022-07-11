package ut.ru.cib.jira;

import org.junit.Test;
import ru.cib.jira.api.MyPluginComponent;
import ru.cib.jira.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}
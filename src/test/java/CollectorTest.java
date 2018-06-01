import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CollectorTest {
    Collector collector;

    @Before
    public void before() {
        collector = new Collector("Finn");
    }

    @Test
    public void hasName() {
        assertEquals("Finn", collector.getName());
    }
}

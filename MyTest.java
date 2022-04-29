import static org.junit.Assert.*;
import org.junit.*;

public class MyTest {
    @Test
    public void testHello() {
        assertEquals("hello", Hello.returnHello());
    }
}

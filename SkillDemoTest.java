import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    
    @Test
    public void testMultiply(){
        assertEquals(3, SkillDemo.multiply(2, 3)); //test that fails
    }

}

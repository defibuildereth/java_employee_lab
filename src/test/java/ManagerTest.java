import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Accounting", "John Smith", "123456789AB", 12345.6);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Accounting", manager.getDeptName());
    }

}

import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director(100000.0, "Board", "Jeremy W", "0192837465BY", 150000.0);
    }

    @Test
    public void canRaiseDirectorSalary() {
        assertEquals(160000, director.raiseSalary(10000.0), 0.01);
    }

    @Test
    public void canPayDirectorBonus() {
        assertEquals(1500.0, director.payBonus(), 0.01);
    }
}

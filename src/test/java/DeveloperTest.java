import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Maggie P", "987654321BA", 50000.0);
    }

    @Test
    public void canRaiseDeveloperSalary() {
        assertEquals(51000.0, developer.raiseSalary(1000.0), 0.01);
    }

    @Test
    public void canPayDeveloperBonus() {
        assertEquals(500.0, developer.payBonus(), 0.01);
    }
}

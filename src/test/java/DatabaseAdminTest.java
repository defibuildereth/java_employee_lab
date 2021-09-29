import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Donald R", "5463728190ZA", 20000.0);
    }

    @Test
    public void canRaiseDatabaseAdminSalary() {
        assertEquals(20500.0, databaseAdmin.raiseSalary(500.0), 0.01);
    }

    @Test
    public void canPayDatabaseAdminBonus() {
        assertEquals(200.0, databaseAdmin.payBonus(), 0.01);
    }
}

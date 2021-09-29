import management.Manager;
import org.junit.Test;
import staff.Employee;
import org.junit.Before;

import static org.junit.Assert.assertEquals;


public class EmployeeTest {

    Employee employee;

    @Before
    public void before() {
        employee = new Manager("Accounting", "John Smith", "123456789AB", 12000.0);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(12100.0, employee.raiseSalary(100.0), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(120.0, employee.payBonus(), 0.01);
    }
}

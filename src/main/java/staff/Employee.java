package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    protected Double salary;

    public Employee(String name, String niNumber, Double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public void setName(String name) {
        if (name != null) {
        this.name = name;}
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public Double raiseSalary(Double raise) {
        if (raise > 0.0) {
            return salary + raise;
        } else {
            return salary;}
        }

    public Double payBonus() {
        return this.salary * 0.01;
    }

}

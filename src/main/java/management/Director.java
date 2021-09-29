package management;

public class Director extends Manager{

    private Double budget;

    public Director(Double budget, String deptName, String name, String niNumber, Double salary){
        super(deptName, name, niNumber, salary);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }
}

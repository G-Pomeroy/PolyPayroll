
public class Salaried extends Employee {

    int yearsOfService;

    public Salaried(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public Salaried(String fName, String lName, int yearsOfService) {
        super(fName, lName);
        this.yearsOfService = yearsOfService;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    @Override
    public double calculateMonthlySalary() {

        yearsOfService = 10;

        return (yearsOfService * 0.01) + 4166.66;

    }
}


public class Manager extends Employee{

    double monthlyBonusAmount;

    public Manager(double monthlyBonusAmount) {
        this.monthlyBonusAmount = monthlyBonusAmount;
    }

    public Manager(String fName, String lName, double monthlyBonusAmount) {
        super(fName, lName);
        this.monthlyBonusAmount = monthlyBonusAmount;
    }

    public double getMonthlyBonusAmount() {
        return monthlyBonusAmount;
    }

    public void setMonthlyBonusAmount(double monthlyBonusAmount) {
        this.monthlyBonusAmount = monthlyBonusAmount;
    }

    @Override
    public double calculateMonthlySalary() {

        monthlyBonusAmount = 2000.00;

        return (100000 / 12) + monthlyBonusAmount;
    }
}

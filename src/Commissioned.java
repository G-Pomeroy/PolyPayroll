
public class Commissioned extends Employee {

    double grossSales;


    public Commissioned(double grossSales) {
        this.grossSales = grossSales;
    }

    public Commissioned(String fName, String lName, double grossSales) {
        super(fName, lName);
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    public double calculateMonthlySalary() {

    grossSales = (40000.00/100) + 2000.00;



    return grossSales;


    }
}

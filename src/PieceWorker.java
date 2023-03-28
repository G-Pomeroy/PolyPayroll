
public class PieceWorker extends Employee {

    int unitsProduced;

    public PieceWorker(int unitsProduced) {
        this.unitsProduced = unitsProduced;
    }

    public PieceWorker(String fName, String lName, int unitsProduced) {
        super(fName, lName);
        this.unitsProduced = unitsProduced;
    }

    public int getUnitsProduced() {
        return unitsProduced;
    }

    public void setUnitsProduced(int unitsProduced) {
        this.unitsProduced = unitsProduced;
    }

    @Override
    public double calculateMonthlySalary() {

        unitsProduced = 1000;

        return unitsProduced * 1;
    }
}

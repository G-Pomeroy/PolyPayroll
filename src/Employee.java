


public abstract class Employee {
    String fName;
    String lName;


    public Employee(){};

    public Employee(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }


    public String getFname() {
        return fName;
    }

    public void setFname(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return lName;
    }

    public void setLname(String lName) {
        this.lName = lName;
    }

    public abstract double calculateMonthlySalary();
}



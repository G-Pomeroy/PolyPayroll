import java.util.*;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {



        ArrayList<Employee> emp = new ArrayList<>();


        Employee emp1 = new Manager("Richard","Rich",2000);
        Employee emp2 = new PieceWorker("Tina","Zena",1000);
        Employee emp3 = new Salaried("Sue","Me",10);
        Employee emp4 = new Commissioned("Richard","Rich",40000);

        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        emp.add(emp4);

        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

        for(int i = 0;i < emp.size();i++){
            System.out.println("Name: " + emp.get(i).fName + " " + emp.get(i).lName);
            System.out.println("Pay Type: " + emp.get(i).getClass().getName());
            System.out.println("Monthly Pay: " + defaultFormat.format(emp.get(i).calculateMonthlySalary()));
            System.out.println("\n");
        }







    }
}
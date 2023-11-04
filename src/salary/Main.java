

package salary;



public class Main {

   
    public static void main(String[] args) {
         Employe employee1 = new Employe("Shad", "Srwd", 45000);
        Employe employee2 = new Employe("Ahmed", "Jamal", 80000);

       
         System.out.println("Name\t\t\tYearly Salary");
        System.out.println("--------\t------------------");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + "\t\t" + employee1.getYearlySalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + "\t\t" + employee2.getYearlySalary());

        
        employee1.applyRaise(10);
        employee2.applyRaise(10);

        System.out.println("\n10 Percent SALARY raised!!");
        System.out.println("Name\t\t\tYearly Salary");
        System.out.println("--------\t------------------");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + "\t\t" + employee1.getYearlySalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + "\t\t" + employee2.getYearlySalary());
    }
    
}
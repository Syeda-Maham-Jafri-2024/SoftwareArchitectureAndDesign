
// Name: Syeda Maham Jafri, 22796

public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void getDescription(){
        System.out.println( "Name: " + this.name + " ID: " + this.id + " Salary: " + this.salary);
    }

    // public double calculateTax() {
    //     // Calculate income tax logic here
    //     double taxPercentage = 0.2;
    //     return salary * taxPercentage;
    // }

    // public void saveToDatabase() {
    //     // Save employee data to the database
    //     // Database interaction logic here
    // }

    // public void generatePayrollReport() {
    //     // Generate a payroll report
    //     // Payroll report generation logic here
    // }
}

class PayrollReport{
   public void generatingPayrollReport(Employee employee){
    System.out.println("Generating the Payroll Report for " + employee.name);
   }
}
class Database{
   public void saveToDatabase(Employee employee){
    System.out.println("Saving the details for: " employee.name + " to the database");
   }
}
class Tax{
    public double calculateTax(Employee employee){
        double taxPercentage = 0.2;
        System.out.println("The tax for Employee: " employee.name + "is " +  employee.salary * taxPercentage);
    }
}
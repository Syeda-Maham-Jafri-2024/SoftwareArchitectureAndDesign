abstract class Employee {
    public abstract double calculatePay();
}

class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculatePay() {
        return annualSalary / 12; // Monthly salary
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee salariedEmployee = new SalariedEmployee(60000);
        Employee hourlyEmployee = new HourlyEmployee(20, 160);

        System.out.println("Salaried Employee Pay: " + salariedEmployee.calculatePay());
        System.out.println("Hourly Employee Pay: " + hourlyEmployee.calculatePay());
    }
}

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InheritanceChallenge1 {
    public static void main(String[] args) throws ParseException {
        System.out.println("------------------WORKER--------------------");
        Worker john = new Worker("John", "10/25/1995");
        System.out.println(john);
        System.out.println(john.getAge());
        System.out.println(john.collectPay());
        john.terminate("08/20/2025");
        System.out.println(john);

        System.out.println("------------------EMPLOYEE--------------------");
        Employee jane = new Employee("Jane", "10/25/1995", "10/25/2020");
        System.out.println(jane);
        System.out.println(jane.getAge());
        System.out.println(jane.collectPay());
        jane.terminate("08/20/2025");
        System.out.println(jane);

        System.out.println("------------------SALARIED EMPLOYEE--------------------");
        SalariedEmployee jade = new SalariedEmployee("Jade", "10/25/1995", "06/14/2020", 60000, false);
        System.out.println(jade);
        System.out.println(jade.getAge());
        System.out.println(jade.collectPay());
        jade.retire();
        System.out.println(jade.collectPay());
        System.out.println(jade);

        System.out.println("------------------HOURLY EMPLOYEE--------------------");
        HourlyEmployee jake = new HourlyEmployee("Jake", "10/25/1995", "06/14/2020", 15);
        System.out.println(jake);
        System.out.println(jake.getAge());
        System.out.println(jake.collectPay());
        System.out.println(jake.getDoublePay());
        jake.terminate("08/20/2025");
        System.out.println(jake);
    }
}

class Worker {
    protected String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public int getAge() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        int bithYear = sdf.parse(this.birthDate).getYear();
        int currentYear = (new Date()).getYear();

        return Math.abs(currentYear - bithYear);
    }

    public double collectPay() {
        System.out.println("Generic pay collected");
        return 0.00;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
        System.out.println("Worker terminated on " + this.endDate);
    }
}

class Employee extends Worker {
    private static long employeeIdStatic = 1;
    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = employeeIdStatic++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}

class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }

    public void retire() {
        terminate("02/18/2024");
        isRetired = true;
        System.out.println(this.name + " retired.");
    }

    @Override
    public double collectPay() {
        System.out.println(this.name + " Collected Pay");
        return isRetired ? 0.9 * (annualSalary / 26) : (annualSalary / 26);
    }
}

class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }

    public double getDoublePay() {
        System.out.println(this.name + " has doubled his hourly pay rate ");
        return 2 * collectPay();
    }

    @Override
    public double collectPay() {
        System.out.println(this.name + " Collected Hourly Pay");
        return 40 * hourlyPayRate;
    }
}




















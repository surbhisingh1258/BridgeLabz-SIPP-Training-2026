public class PayrollSystem {
    public static void main(String[] args) {

        // Full-Time Employee
        FullTimeEmployee fullTime = new FullTimeEmployee();
        fullTime.setEmployeeId(101);
        fullTime.setEmployeeName("Alice");
        fullTime.setMonthlySalary(50000);

        // Part-Time Employee
        PartTimeEmployee partTime = new PartTimeEmployee();
        partTime.setEmployeeId(102);
        partTime.setEmployeeName("Bob");
        partTime.setHoursWorked(80);
        partTime.setHourlyRate(500);

        // Display Full-Time Employee Details
        System.out.println("Full-Time Employee Details:");
        fullTime.displayEmployeeInfo();
        System.out.println("Salary: " + fullTime.calculateSalary());

        System.out.println();

        // Display Part-Time Employee Details
        System.out.println("Part-Time Employee Details:");
        partTime.displayEmployeeInfo();
        System.out.println("Salary: " + partTime.calculateSalary());
    }
}
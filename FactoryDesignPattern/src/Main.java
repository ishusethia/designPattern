import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        employee emp=employeeFactory.getEmployee("Android");
        int salary=emp.salary();
        System.out.println("Salary: "+salary);
    }
}
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeInfo {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("EmpInfo.txt"))) {
            for (int i = 1; i <= 50; i++) {
                String empName = "Employee" + i;
                int empAge = 25 + i;
                int empId = i;

                String employeeInfo = String.format("Name: %s, Age: %d, ID: %d%n", empName, empAge, empId);
                writer.write(employeeInfo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

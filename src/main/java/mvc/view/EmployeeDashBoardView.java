package mvc.view;

import mvc.model.Employee;

public class EmployeeDashBoardView {

    public void printEployeeInfo(Employee employee) {
        System.out.println(employee.getName());
        System.out.println(employee.getLastName() + employee.getName());
    }
}

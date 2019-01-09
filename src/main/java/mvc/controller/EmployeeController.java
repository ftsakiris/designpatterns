package mvc.controller;

import mvc.model.Employee;
import mvc.view.EmployeeDashBoardView;

public class EmployeeController {

    private Employee employee;
    private EmployeeDashBoardView view;

    public EmployeeController(Employee employee, EmployeeDashBoardView view) {
        this.employee = employee;
        this.view = view;
    }

    public void setEmployee(String name, String lastName) {
        employee.setName(name);
        employee.setLastName(lastName);
    }
}

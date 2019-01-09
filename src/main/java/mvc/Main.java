package mvc;

import mvc.controller.EmployeeController;
import mvc.model.Employee;
import mvc.view.EmployeeDashBoardView;

public class Main {

    public static void main(String[] args) {

        EmployeeController employeeController = new EmployeeController(new Employee(), new EmployeeDashBoardView());

        employeeController.setEmployee("fotis", "Tsakiris");
    }

}
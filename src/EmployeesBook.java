public class EmployeesBook {
    private static final Integer EMPLOYEES_SIZE = 10;
    private final Employee[] EMPLOYEES = new Employee[EMPLOYEES_SIZE];

    public void printAllEmployers() {
            for (Employee Employee : EMPLOYEES) {
                if (EMPLOYEES != null) {
                    System.out.println(Employee);
            }
        }
    }

    public int calculateAllSalary() {
        int sum = 0;
        for (Employee Employee : EMPLOYEES) {
            if (EMPLOYEES != null) {
                sum += Employee.getSalaryEmployee();
            }
        }
        return sum;
    }

    public Employee minSalary() {
        int min = Integer.MAX_VALUE;
        Employee target = EMPLOYEES[0];
        for (Employee Employee : EMPLOYEES) {
            if (EMPLOYEES != null && min >= Employee.getSalaryEmployee()) {
                min = Employee.getSalaryEmployee();
                target = Employee;
            }
        }
        return target;
    }

    public Employee maxSalary() {
        int max = Integer.MIN_VALUE;
        Employee target = EMPLOYEES[0];
        for (Employee Employee : EMPLOYEES) {
            if (EMPLOYEES != null && max <= Employee.getSalaryEmployee()) {
                max = Employee.getSalaryEmployee();
                target = Employee;
            }
        }
        return target;
    }

    public float averageSalary() { //возможно this лишне
        int average = 0;
        float i = 0f;
        for (Employee Employee : EMPLOYEES) {
            if (EMPLOYEES != null) {
                average += Employee.getSalaryEmployee();
                i++;
            }
        }
        return average / i;
    }

    public void pintAllFIO() {
        for (Employee Employee : EMPLOYEES) {
            if (EMPLOYEES != null) {
                System.out.println(Employee.getFullNameEmployee());
            }
        }
    }

    public void increaseSalary(int percent) {
        double increasingCoefficient = (double) percent / 100 + 1;
        for (Employee Employee : EMPLOYEES) {
            if (EMPLOYEES != null) {
                Employee.setSalaryEmployee((int) (Employee.getSalaryEmployee() * increasingCoefficient));

            }
        }
    }

    public Employee toFindDepartmentMinSalary(int department) {
        Employee.checkDepartment(department);
        int min = Integer.MAX_VALUE;
        Employee target = null;
        for (Employee Employee : EMPLOYEES) {
            if (EMPLOYEES != null && Employee.getEmployeeDepartment() == department && min >= Employee.getSalaryEmployee()) {
                min = Employee.getSalaryEmployee();
                target = Employee;
            }
        }
        return target;
    }


    public Employee toFindDepartmentMaxSalary(int department) {
        Employee.checkDepartment(department);
        int max = Integer.MIN_VALUE;
        Employee target = null;
        for (Employee Employee : EMPLOYEES) {
            if (EMPLOYEES != null && max <= Employee.getSalaryEmployee()) {
                max = Employee.getSalaryEmployee();
                target = Employee;
            }
        }
        return target;
    }

    public int toFindDepartmentTotalCost(int department) {
        Employee.checkDepartment(department);
        int sum = 0;
        for (Employee Employee : EMPLOYEES) {
            if (EMPLOYEES != null && Employee.getEmployeeDepartment() == department) {
                sum += Employee.getSalaryEmployee();
            }
        }
        return sum;
    }

    public float averageSalaryInDepartment(int department) {
        Employee.checkDepartment(department);
        int average = 0;
        float i = 0f;
        for (Employee Employee : EMPLOYEES) {
            if (EMPLOYEES != null && Employee.getEmployeeDepartment() == department) {
                average += Employee.getSalaryEmployee();
                i++;
            }
        }
        return average / (float) i;
    }

    public void pintAllFIODepartment(int department) {
        Employee.checkDepartment(department);
        for (Employee Employee : EMPLOYEES) {
            if (Employee.getEmployeeDepartment() == department) {
                System.out.println(Employee.getFullNameEmployee());
            }
        }
    }

    public void increaseSalaryDepartment(int percent, int department) {
        Employee.checkDepartment(department);
        double increasingCoefficient = (double) percent / 100 + 1;
        for (Employee Employee : EMPLOYEES) {
            if (EMPLOYEES != null && Employee.getEmployeeDepartment() == department) {
                Employee.setSalaryEmployee((int) (Employee.getSalaryEmployee() * increasingCoefficient));
            }
        }
    }

    public void printEmployeeWithSalaryBelow(int salary) {
        for (Employee Employee : EMPLOYEES) {
            if (EMPLOYEES != null && salary >= Employee.getSalaryEmployee()) {
                System.out.println("id " + Employee.getId() + " сотрудник " + Employee.getFullNameEmployee() + " зарплата " + Employee.getSalaryEmployee());
            }
        }
    }

    public void printEmployeeWithSalaryAbove(int salary) {
        for (Employee Employee : EMPLOYEES) {
            if (EMPLOYEES != null && salary <= Employee.getSalaryEmployee()) {
                System.out.println("id " + Employee.getId() + " сотрудник " + Employee.getFullNameEmployee() + " зарплата " + Employee.getSalaryEmployee());
            }
        }
    }

    public void addEmployee(String fullName, int department, int salary) {
        boolean check = false;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i] == null) {
                check = true;
                EMPLOYEES[i] = new Employee(fullName, department, salary);
                return;
            }
        }
        if (!check) {
            System.out.println("Нет вакансий");
        }
    }

    public void fireEmployeeById(int id) {
        boolean check = false;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i].getId() == id) {
                check = true;
                System.out.println(EMPLOYEES[i].getId() + "  уволен.");
                EMPLOYEES[i] = null;
                return;
            }
        }
        if (!check) {
            System.out.println("Не удалось найти сотрудника с ID:" + id);
        }
    }

    public void fireEmployeeByName(String fullName) {
        boolean check = false;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i].getFullNameEmployee().equals(fullName)) {
                check = true;
                System.out.println(EMPLOYEES[i] + " - уволен.");
                EMPLOYEES[i] = null;
                return;
            }
        }
        if (!check) {
            System.out.println("Не удалось найти сотрудника");
        }
    }

    public void toChangeSalaryForOneEmployee(String fullName, int newSalary) {
        boolean check = false;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i].getFullNameEmployee().equals(fullName)) {
                check = true;
                System.out.println("Зарплата для " + fullName + " повышена.");
                EMPLOYEES[i].setSalaryEmployee(newSalary);
            }
        }
        if (!check) {
            System.out.println("Сотрудник не найден");
        }
    }

    public void toChangeDepartmentForOneEmployee(String fullName, int newDepartment) {
        Employee.checkDepartment(newDepartment);
        boolean check = false;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i].getFullNameEmployee().equals(fullName)) {
                check = true;
                System.out.println("Отдел для " + fullName + " изменен.");
                EMPLOYEES[i].setEmployeeDepartment(newDepartment);
            }
        }
        if (!check) {
            System.out.println("Сотрудник не найден");
        }
    }

    public void printDepartmentAndFullNameOfAllEmployers() {
        for (int j = 1; j <= Employee.DEPARTMENT_SIZE; j++) {
            System.out.println("Отдел №" + j + ": ");
            for (int i = 0; i < EMPLOYEES.length; i++) {
                if (EMPLOYEES[i].getEmployeeDepartment() == j) {
                    System.out.println(EMPLOYEES[i].getFullNameEmployee());
                }
            }
            System.out.println();
        }
    }
}

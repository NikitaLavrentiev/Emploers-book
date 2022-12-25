public class EmployeesBook {
    public final Employees[] employees = new Employees[10];
    private void employeesBook (String[] args) {
        employees[0] = new Employees("Гаврилова Алена Юрьевна", 1, 160000);
        employees[1] = new Employees("Фатницкий Никита Андреевич", 2, 90000);
        employees[2] = new Employees("Басов Георгий Юрьевич", 3, 152000);
        employees[3] = new Employees("Иванов Сергей Дмитриевич", 2, 120000);
        employees[4] = new Employees("Марков Сергей Анатольевич", 4, 128000);
        employees[5] = new Employees("Петров Вадим Юрьевич", 1, 76000);
        employees[6] = new Employees("Андреева Наталья Дмитриевна", 5, 65000);
        employees[7] = new Employees("Иванова Елизавета Петровна", 1, 92000);
        employees[8] = new Employees("Ершова Татьяна Сергеевна", 4, 76000);
        employees[9] = new Employees("Смирнов Михаил Дмитриевич", 3, 68000);
    }


    public void printAllEmployers() {
        if (employees != null) {
            for (Employees Employees : employees) {
                System.out.println(Employees);
            }
        }
    }

    public  int calculateAllSalary() {
        int sum = 0;
        for (Employees Employees : employees) {
            if (employees != null) {
                sum += Employees.getSalaryEmployee();
            }
        }
        return sum;
    }

    public  int minSalary() {
        int min = Integer.MAX_VALUE;
        for (Employees Employees : employees) {
            if (employees != null) {
                if (min >= Employees.getSalaryEmployee()) {
                    min = Employees.getSalaryEmployee();
                }
            }
        }
        return min;
    }

    public  int maxSalary() {
        int max = Integer.MIN_VALUE;
        for (Employees Employees : employees) {
            if (employees != null) {
                if (max <= Employees.getSalaryEmployee()) {
                    max = Employees.getSalaryEmployee();
                }
            }
        }
        return max;
    }

    public  int averageSalary() {
        int average = 0;
        int i = 0;
        for (Employees Employees : employees) {
            if (employees != null) {
                average += Employees.getSalaryEmployee();
                i++;
            }
        }
        return average / i;
    }

    public  void pintAllFIO() {
        for (Employees Employees : employees) {
            if (employees != null) {
                System.out.println(Employees.getFullNameEmployee());
            }
        }
    }

    public  void increaseSalary(int percent) {
        double increasingCoefficient = (double) percent / 100 + 1;
        for (Employees Employees : employees) {
            if (employees != null) {
                Employees.setSalaryEmployee((int) (Employees.getSalaryEmployee() * increasingCoefficient));

            }
        }
    }

    public  int toFindDepartmentMinSalary(int department) {
        Employees.checkDepartment(department);
        int min = Integer.MAX_VALUE;
        for (Employees Employees : employees) {
            if (employees != null && Employees.getEmployeeDepartment() == department) {
                if (min >= Employees.getSalaryEmployee()) {
                    min = Employees.getSalaryEmployee();
                }
            }
        }
        return min;
    }


    public  int toFindDepartmentMaxSalary(int department) {
        Employees.checkDepartment(department);
        int max = Integer.MIN_VALUE;
        for (Employees Employees : employees) {
            if (employees != null) {
                if (max <= Employees.getSalaryEmployee()) {
                    max = Employees.getSalaryEmployee();
                }
            }
        }
        return max;
    }

    public  int toFindDepartmentTotalCost(int department) {
        Employees.checkDepartment(department);
        int sum = 0;
        for (Employees Employees : employees) {
            if (employees != null && Employees.getEmployeeDepartment() == department) {
                sum += Employees.getSalaryEmployee();
            }
        }
        return sum;
    }

    public  int averageSalaryInDepartment(int department) {
        Employees.checkDepartment(department);
        int average = 0;
        int i = 0;
        for (Employees Employees : employees) {
            if (employees != null && Employees.getEmployeeDepartment() == department) {
                average += Employees.getSalaryEmployee();
                i++;
            }
        }
        return average / i;
    }

    public  void pintAllFIODepartment(int department) {
        Employees.checkDepartment(department);
        {
            for (Employees Employees : employees) {
                if (employees != null && Employees.getEmployeeDepartment() == department) {
                    System.out.println(Employees.getFullNameEmployee());
                }
            }
        }
    }

    public  void increaseSalaryDepartment ( int percent, int department){
        Employees.checkDepartment(department);
        double increasingCoefficient = (double) percent / 100 + 1;
        for (Employees Employees : employees) {
            if (employees != null && Employees.getEmployeeDepartment() == department) {
                Employees.setSalaryEmployee((int) (Employees.getSalaryEmployee() * increasingCoefficient));
            }
        }
    }
    public  void printEmployeeWithSalaryBelow(int salary) {
        for (Employees Employees : employees) {
            if (employees != null) {
                if (salary >= Employees.getSalaryEmployee()) {
                    System.out.println("id " + Employees.getId() + " сотрудник " + Employees.getFullNameEmployee() + " зарплата " + Employees.getSalaryEmployee());
                }
            }
        }
    }
    public  void printEmployeeWithSalaryAbove(int salary) {
        for (Employees Employees : employees) {
            if (employees != null) {
                if (salary <= Employees.getSalaryEmployee()) {
                    System.out.println("id " + Employees.getId() + " сотрудник " + Employees.getFullNameEmployee() + " зарплата " + Employees.getSalaryEmployee());
                }
            }
        }
    }
    public void addEmployee( String fIO, int department, int salary) {
        boolean check = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                check = true;
                employees[i] = new Employees(fIO, department, salary);
                return;
            }
        }
        if (!check) {
            System.out.println("Нет вакансий");
        }
    }
    public void fireEmployeeById(int id) {
        boolean check = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                check = true;
                System.out.println(employees[i].getId() + "  уволен.");
                employees[i] = null;
                return;
            }
        }
        if (!check) {
            System.out.println("Не удалось найти сотрудника с ID:" + id);
        }
    }
    public void fireEmployeeByName(String fullName) {
        boolean check = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullNameEmployee().equals(fullName)) {
                check = true;
                System.out.println(employees[i] + " - уволен.");
                employees[i] = null;
                return;
            }
        }
        if (!check) {
            System.out.println("Не удалось найти сотрудника");
        }
    }
    public int toChangeSalaryForOneEmployee(String fullName, int newSalary) {
        boolean check = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullNameEmployee().equals(fullName)) {
                check = true;
                System.out.println("Зарплата для " + fullName + " повышена.");
                employees[i].setSalaryEmployee(newSalary);
            }
        }
        if (!check) {
            System.out.println("Сотрудник не найден");
        }
        return newSalary;
    }
    public int toChangeDepartmentForOneEmployee(String fullName, int newDepartment) {
       Employees.checkDepartment(newDepartment);
        boolean check = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullNameEmployee().equals(fullName)) {
                check = true;
                System.out.println("Отдел для " + fullName + " изменен.");
                employees[i].setEmployeeDepartment(newDepartment);
            }
        }
        if (!check) {
            System.out.println("Сотрудник не найден");
        }
        return newDepartment;
    }
    public void printDepartmentAndFullNameOfAllEmployers() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("Отдел №" + j + ": ");
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getEmployeeDepartment() == j) {
                    System.out.println(employees[i].getFullNameEmployee());
                }
            }
            System.out.println();
        }
    }
}

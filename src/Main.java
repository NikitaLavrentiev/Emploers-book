public class Main {

    public static final Employees[] employees = new Employees[10];

    public static void main(String[] args) {

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
        printAllEmployers();
        System.out.println("calculateAllSalary() = " + calculateAllSalary());
        System.out.println("maxSalary() = " + maxSalary());
        System.out.println("minSalary() = " + minSalary());
        System.out.println("averageSalary() = " + averageSalary());
        pintAllFIO();
        System.out.println("toFindDepartmentMaxSalary(1) = " + toFindDepartmentMaxSalary(1));
        System.out.println("toFindDepartmentMinSalary(2) = " + toFindDepartmentMinSalary(2));
        System.out.println("toFindDepartmentTotalCost(3) = " + toFindDepartmentTotalCost(3));
        printEmployeeWithSalaryBelow(100000);
        printEmployeeWithSalaryAbove(120000);
    }

    public static void printAllEmployers() {
        if (employees != null) {
            for (Employees Employees : employees) {
                System.out.println(Employees);
            }
        }
    }

    public static int calculateAllSalary() {
        int sum = 0;
        for (Employees Employees : employees) {
            if (employees != null) {
                sum += Employees.getSalaryEmployee();
            }
        }
        return sum;
    }

    public static int minSalary() {
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

    public static int maxSalary() {
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

    public static int averageSalary() {
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

    public static void pintAllFIO() {
        for (Employees Employees : employees) {
            if (employees != null) {
                System.out.println(Employees.getFullNameEmployee());
            }
        }
    }

    public static void increaseSalary(int percent) {
        double increasingCoefficient = (double) percent / 100 + 1;
        for (Employees Employees : employees) {
            if (employees != null) {
                Employees.setSalaryEmployee((int) (Employees.getSalaryEmployee() * increasingCoefficient));
            }
        }
    }

    //Получить в качестве параметра номер отдела (1–5) и найти (всего 6
    //методов):
    //a. Сотрудника с минимальной зарплатой.
    //b. Сотрудника с максимальной зарплатой.
    //c. Сумму затрат на зарплату по отделу.
    //d. Среднюю зарплату по отделу (учесть, что количество людей в отделе
    //отличается от Employees.length).
    //e. Проиндексировать зарплату всех сотрудников отдела на процент,
    //который приходит в качестве параметра.
    //f. Напечатать всех сотрудников отдела (все данные, кроме отдела).

    public static int toFindDepartmentMinSalary(int department) {
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


    public static int toFindDepartmentMaxSalary(int department) {
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

    public static int toFindDepartmentTotalCost(int department) {
        Employees.checkDepartment(department);
        int sum = 0;
        for (Employees Employees : employees) {
            if (employees != null && Employees.getEmployeeDepartment() == department) {
                sum += Employees.getSalaryEmployee();
            }
        }
        return sum;
    }

    public static int averageSalaryInDepartment(int department) {
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

    public static void pintAllFIODepartment(int department) {
        Employees.checkDepartment(department);
        {
            for (Employees Employees : employees) {
                if (employees != null && Employees.getEmployeeDepartment() == department) {
                    System.out.println(Employees.getFullNameEmployee());
                }
            }
        }
    }

    public static void increaseSalaryDepartment ( int percent, int department){
        Employees.checkDepartment(department);
        double increasingCoefficient = (double) percent / 100 + 1;
        for (Employees Employees : employees) {
            if (employees != null && Employees.getEmployeeDepartment() == department) {
                Employees.setSalaryEmployee((int) (Employees.getSalaryEmployee() * increasingCoefficient));
            }
        }
    }
    public static void printEmployeeWithSalaryBelow(int salary) {
        for (Employees Employees : employees) {
            if (employees != null) {
                if (salary >= Employees.getSalaryEmployee()) {
                    System.out.println("id " + Employees.getId() + " сотрудник " + Employees.getFullNameEmployee() + " зарплата " + Employees.getSalaryEmployee());
                }
            }
        }
    }
    public static void printEmployeeWithSalaryAbove(int salary) {
        for (Employees Employees : employees) {
            if (employees != null) {
                if (salary <= Employees.getSalaryEmployee()) {
                    System.out.println("id " + Employees.getId() + " сотрудник " + Employees.getFullNameEmployee() + " зарплата " + Employees.getSalaryEmployee());
                }
            }
        }
    }
}




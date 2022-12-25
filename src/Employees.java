public class Employees {
    private final String fullNameEmployee;
    private final int employeeDepartment;
    private int salaryEmployee;
    private final int id;
    private static int counterId;

    public Employees(String fullName, int department, int salary) {
            if (department < 1 || department > 5) {
                throw new IllegalArgumentException("Отдела с таким номером не существует. Доступные отделы 1-5");
            } else {
            this.fullNameEmployee =fullName;
            this.employeeDepartment = department;
            this.salaryEmployee = salary;
            this.id = counterId++;
        }
    }


    public String getFullNameEmployee() {
        return fullNameEmployee;
    }

    public int getEmployeeDepartment() {
        return employeeDepartment;
    }

    public int getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(int money) {
        salaryEmployee = money;
    }

    @Override
    public String toString() {
        return fullNameEmployee + " работает в отделе №" + employeeDepartment + " зарплата " + salaryEmployee;
    }

}



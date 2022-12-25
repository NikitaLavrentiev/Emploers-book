public class Employees {
    private final String fullNameEmployee;
    private int employeeDepartment;
    private int salaryEmployee;
    private final int id;
    private static int counterId;
    private static final Integer DEPARTMENT_SIZE = 5;

    public Employees(String fullName, int department, int salary) {
        checkDepartment(department);
        this.fullNameEmployee = fullName;
        this.employeeDepartment = department;
        this.salaryEmployee = salary;
        this.id = counterId++;
    }

    public static void checkDepartment(int department) {
        if (department <= 0 || department > DEPARTMENT_SIZE) {
            throw new IllegalArgumentException("Отдела с таким номером не существует. Доступные отделы 1-5");
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

    public int getId() {
        return id;
    }

    public void setSalaryEmployee(int money) {
        salaryEmployee = money;
    }

    public void setEmployeeDepartment(int department) {
        employeeDepartment = department;
    }

    @Override
    public String toString() {
        return fullNameEmployee + " работает в отделе №" + employeeDepartment + " зарплата " + salaryEmployee;
    }

}



public class Employer {
    private final String fullNameEmployer;
    private final int employeeDepartment; // потенциально переделать в int и в разделе ниже поменяй если будешь тут крутить
    private final int salaryEmployer;
    private final int id;
    private static int counterId;

    public Employer(String fullName, int department, int salary) {
        if (department <1 || department>5) {
            throw new IllegalArgumentException("Отдела с таким номером не существует. Доступные отделы 1-5");
        }
        this.fullNameEmployer=fullName;
        this.employeeDepartment = department;
        this.salaryEmployer = salary;
        this.id = counterId++;
    }


    public String getFullNameEmployer() {
        return fullNameEmployer;
    }

    public int getEmployeeDepartment() {
        return employeeDepartment;
    }

    public int getSalaryEmployer() {
        return salaryEmployer;
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return fullNameEmployer + " работает в отделе №" + employeeDepartment + " зарплата " + salaryEmployer;
    }
}



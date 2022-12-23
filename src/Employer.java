public class Employer {
    private final String surnameEmployer;
    private final String nameEmployer;
    private final String patronymicEmployer;
    private final String employeeDepartment; // потенциально переделать в int и в разделе ниже поменяй если будешь тут крутить
    private final int salaryEmployer;
    public static int id; //мб public и Employer.id ниже

    public Employer(String surname, String name, String patronymic, String department, int salary) {
        this.surnameEmployer = surname;
        this.nameEmployer = name;
        this.patronymicEmployer = patronymic;
        this.employeeDepartment = department;
        this.salaryEmployer = salary;
        this.id = id++;
    }


    public String getSurnameEmployer() {
        return surnameEmployer;
    }

    public String getNameEmployer() {
        return nameEmployer;
    }

    public String getPatronymicEmployer() {
        return patronymicEmployer;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public int getSalaryEmployer() {
        return salaryEmployer;
    }

    public static int getId() {
        return id;
    }
}



public class Employer {
    private final String surnameEmployer;
    private final String nameEmployer;
    private final String patronymicEmployer;
    private final String employeeDepartment; // потенциально переделать в int и в разделе ниже поменяй если будешь тут крутить
    private final int salaryEmployer;
    private static int id; //мб public и Employer.id ниже

    public Employer(String surname, String name, String patronymic, String department, int salary) {
        this.surnameEmployer = surname;
        this.nameEmployer = name;
        this.patronymicEmployer = patronymic;
        this.employeeDepartment = department;
        this.salaryEmployer = salary;
        //id не должно быть в конструкторе
    }


/* пока не понятно куда этот счётчик отправить да и может быть его нужно будет ещё допилить)
    public static int getId() {
        while (id == 0) {
            id = 1;
            return 0;
        }
        return id++;
    }
 */


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
}



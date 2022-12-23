public class Employer {
    private final String surnameEmployer;
    private final String nameEmployer;
    private final String patronymicEmployer;
    private final String employeeDepartment;
    private final int salaryEmployer;
    public static int id; //мб public и Employer.id ниже

    public Employer(String surname, String name, String patronymic, String department, int salary) {
        this.surnameEmployer = surname;
        this.nameEmployer = name;
        this.patronymicEmployer = patronymic;
        this.employeeDepartment = department;
        this.salaryEmployer = salary;
        //добавить счётчик
    }

    public int getId() {
        while (id = 0) {
            id =1;
            return 0;
        } return id++;
    }
}



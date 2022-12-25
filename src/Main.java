public class Main {

    public static final Employer[] employer = new Employer[10];

    public static void main(String[] args) {

        employer[0] = new Employer("Гаврилова Алена Юрьевна", 1, 160000);
        employer[1] = new Employer("Фатницкий Никита Андреевич", 2, 90000);
        employer[2] = new Employer("Басов Георгий Юрьевич", 3, 152000);
        employer[3] = new Employer("Иванов Сергей Дмитриевич", 2, 120000);
        employer[4] = new Employer("Марков Сергей Анатольевич", 4, 128000);
        employer[5] = new Employer("Петров Вадим Юрьевич", 1, 76000);
        employer[6] = new Employer("Андреева Наталья Дмитриевна", 5, 65000);
        employer[7] = new Employer("Иванова Елизавета Петровна", 1, 92000);
        employer[8] = new Employer("Ершова Татьяна Сергеевна", 4, 76000);
        employer[9] = new Employer("Смирнов Михаил Дмитриевич", 5, 68000);
        printAllEmployers();
        System.out.println("calculateAllSalary() = " + calculateAllSalary());
        System.out.println("maxSalary() = " + maxSalary());
        System.out.println("minSalary() = " + minSalary());
        System.out.println("averageSalary() = " + averageSalary());
        pintAllFIO();

    }

    public static void printAllEmployers() {
        if (employer != null) {
            for (Employer Employer : employer) {
                System.out.println(Employer);
            }
        }
    }

    public static int calculateAllSalary() {
        int sum = 0;
        for (Employer Employer : employer) {
            if (employer != null) {
                sum += Employer.getSalaryEmployer();
            }
        }
        return sum;
    }

    public static int minSalary() {
        int min = Integer.MAX_VALUE;
        for (Employer Employer : employer) {
            if (employer != null) {
                if (min >= Employer.getSalaryEmployer()) {
                    min = Employer.getSalaryEmployer();
                }
            }
        }
        return min;
    }
    public static int maxSalary() {
        int max = Integer.MIN_VALUE;
        for (Employer Employer : employer) {
            if (employer != null) {
                if (max <= Employer.getSalaryEmployer()) {
                    max = Employer.getSalaryEmployer();
                }
            }
        }
        return max;
    }
    public static int averageSalary() {
        int average = 0;
        int i =0;
        for (Employer Employer:employer) {
            if (employer != null) {
                average += Employer.getSalaryEmployer();
                i++;
            }
        } return average / i;
    }
    public static void pintAllFIO() {
        for (Employer Employer:employer) {
            if (employer != null) {
                System.out.println(Employer.getFullNameEmployer());
            }

        }
    }
}


import java.lang.reflect.Array;

public class Main {
    public static final Employer [] employer = new Employer[10];
    public static void main(String[] args) {

        employer [0] = new Employer("Гаврилова Алена Юрьевна", 1 , 160000);
        employer [1] = new Employer("Фатницкий Никита Андреевич", 2, 90000);
        employer [2] = new Employer("Басов Георгий Юрьевич", 3, 152000);
        employer [3] = new Employer("Иванов Сергей Дмитриевич",2,120000);
        employer [4] = new Employer("Марков Сергей Анатольевич",4,128000);
        employer [6] = new Employer("Андреева Наталья Дмитриевна",5,65000);
        employer [7] = new Employer("Иванова Елизавета Петровна",1,92000);
        employer [8] = new Employer("Ершова Татьяна Сергеевна",4,76000);
        employer [9] = new Employer("Смирнов Михаил Дмитриевич",5,68000);

    }

}
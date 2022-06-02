public class Main {
    public static void main(String[] args) {

        String firstName = ("Ivan");
        String middleName = ("Ivanovich");
        String lastName = ("Ivanov");
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        String fullName2 = fullName.replace("Ivanov Ivan Ivanovich","Иванов Семён Семёнович");
        if (fullName2.contains("ё")) {
            System.out.println("Данные ФИО сотрудника (исправлены) — " + fullName2.replace('ё', 'е'));
        } else System.out.println("Данные ФИО сотрудника — " + fullName2);


//        String [] words = fullName2.split(" ");
//
//        System.out.println(words [0] + " " + words [1] + " " + words [2]);

    }
}
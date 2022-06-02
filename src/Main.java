public class Main {
    public static void main(String[] args) {

        String firstName = ("Ivan");
        String middleName = ("Ivanovich");
        String lastName = ("Ivanov");
        String fullName = ("Ivanov Ivan Ivanovich");
        System.out.println("ФИО сотрудника - " + fullName);

        String fullNameToUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameToUpperCase);

        String fullName2 = fullName.replace("Ivanov Ivan Ivanovich","Иванов Семён Семёнович");
        if (fullName2.contains("ё")) {
            String e = fullName2.replace('ё', 'е');
            System.out.println("Данные ФИО сотрудника (исправлены) — " + e);
        } else System.out.println("Данные ФИО сотрудника — " + fullName2);


//        String [] words = fullName2.split(" ");
//
//        System.out.println(words [0] + " " + words [1] + " " + words [2]);

    }
}
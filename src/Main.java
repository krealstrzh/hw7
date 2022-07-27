public class Main {
    public static void main(String[] args) {
//        Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника -- " + fullName);
//        Задание 2
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);
//        Задание 3
        fullName = "Семёнов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        fullName = fullName.replace('Ё', 'Е');
        System.out.println("Данные ФИО сотрудника -- " + fullName);
        if (fullName.contains("ё") || fullName.contains("Ё")) {
            throw new RuntimeException("В ФИО НЕ МОЖЕТ БЫТЬ БУКВЫ Ё!");
        }
//        Задание 4
        fullName = "Ivanov Ivan Ivanovich";
        String lastNameA = fullName.substring(0, fullName.indexOf(' '));
        String firstNameA = fullName.substring(fullName.indexOf(' '), fullName.lastIndexOf(' '));
        String middleNameA = fullName.substring(fullName.lastIndexOf(' '), fullName.length());
        System.out.println("Фамилия сотрудника -- " + lastNameA);
        System.out.println("Имя сотрудника -- " + firstNameA);
        System.out.println("Отчество сотрудника -- " + middleNameA);
//        Задание 5

    }
}
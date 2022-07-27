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
        String fullNameA = "Ivanov Ivan Ivanovich";
        String lastNameA = fullNameA.substring(0, fullNameA.indexOf(' '));
        String firstNameA = fullNameA.substring(fullNameA.indexOf(' '), fullNameA.lastIndexOf(' '));
        String middleNameA = fullNameA.substring(fullNameA.lastIndexOf(' '), fullNameA.length());
        System.out.println("Фамилия сотрудника -- " + lastNameA);
        System.out.println("Имя сотрудника -- " + firstNameA);
        System.out.println("Отчество сотрудника -- " + middleNameA);
//        Задание 5
        fullName = "ivanov ivan ivanovich";
        char fullNameChar[] = fullName.toCharArray();
        fullNameChar[0] = Character.toUpperCase(fullNameChar[0]);
        for (int i = 0; i < fullNameChar.length; i++) {
            if (fullNameChar[i] == ' ') {
                fullNameChar[i+1] = Character.toUpperCase(fullNameChar[i+1]);
            }
        }
        String fullNameAgain = new String (fullNameChar);
        System.out.println("Правильное написание ФИО -- " + fullNameAgain);
//        Задание 6
        StringBuilder A = new StringBuilder("1357");
        StringBuilder B = new StringBuilder("2468");
        int d = A.length() + B.length();
        for (int i = 0; i < d; i=i+2) {
            char c = B.charAt(i/2);
            A.insert(i + 1, c);
        }
        System.out.println(A);
//        Задание 7
        String E = "aabccddefgghiijjkkllmmnoppqrrsstuvwwxyyz";
        StringBuilder F = new StringBuilder();
        for (int i = 0; i < E.length()-1; i++) {
            if (E.charAt(i) == E.charAt(i+1)) {
                F.append(E.charAt(i));
            }
        }
        System.out.println(F);
    }
}
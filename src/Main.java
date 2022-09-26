public class Main {
    public static void main(String[] args) {
        homeWork1();
        homeWork2();
        homeWork3();
    }
    private static void homeWork1(){
        System.out.println("Задача 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " +  middleName + " " +lastName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();
    }
    private static void homeWork2(){
        System.out.println("Задача 2");
        String fullName = "Ivanov Ivan Ivanovich";
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);
        System.out.println();
    }
    private static void homeWork3(){
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";

        System.out.println();
        String fullName1 = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName1);
        System.out.println();
    }

}
public class Main {
    public static void main(String[] args) {
        //Задание 1
        int age = 25;
        if (age >= 18) {
            System.out.println("Поздравляем, вы совершеннолетний!");
        }
        if (age < 18)  {
            System.out.println("Вы пока не достигли совершеннолетия, нужно немного подождать.");
        }
        //Задание 2
        int yearsOld = 25;
        if (yearsOld < 7) {
            System.out.println("Ребёнку пока рано в школу");
        }
        if (yearsOld >=7 && yearsOld < 18) {
            System.out.println("Ребёнок ходит в школу");
        }
        if (yearsOld >=18 && yearsOld < 24) {
            System.out.println("Ученик закончил школу и может поступить в университет");
        }
        if (yearsOld > 24) {
            System.out.println("Человеку пора искать первую работу");
        }
    }
}
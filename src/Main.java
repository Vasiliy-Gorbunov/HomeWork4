public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("\nЗадание 1:");
        int age = 25;
        if (age >= 18) {
            System.out.println("Поздравляем, вы совершеннолетний!");
        }
        if (age < 18)  {
            System.out.println("Вы пока не достигли совершеннолетия, нужно немного подождать.");
        }
        //Задание 2
        System.out.println("\nЗадание 2:");
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
        //Задание 3
        System.out.println("\nЗадание 3:");
        int summPlaces = 102;
        int sitPlaces = 60;
        int standPlaces = summPlaces-sitPlaces;
        int actualSitPeoples = 60;
        int actualStandPeoples = 42;
        int actualSitPlaces = sitPlaces-actualSitPeoples;
        int actualStandPlaces = standPlaces-actualStandPeoples;
        if (actualSitPlaces > 0 || actualStandPlaces > 0) {
            System.out.println("В вагоне осталось "+actualSitPlaces+" сидячих мест и "+actualStandPlaces+" стоячих мест.");
        }
        if (actualSitPlaces == 0 && actualStandPlaces == 0) {
            System.out.println("Вагон полностью заполнен!");
        }
    }
}
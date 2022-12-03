public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("\nЗадание 1:");
        int age = 15;
        if (age >= 18) {
            System.out.println("Поздравляем, вы совершеннолетний!");
        }
            else {
            System.out.println("Вы пока не достигли совершеннолетия, нужно немного подождать.");
            }

        //Задание 2
        System.out.println("\nЗадание 2:");
        int yearsOld = 25;
        if (yearsOld < 7) {
            System.out.println("Ребёнку пока рано в школу");
        }else {
            if (yearsOld >= 7 && yearsOld < 18) {
                System.out.println("Ребёнок ходит в школу");
            } else {
                if (yearsOld >= 18 && yearsOld < 24) {
                    System.out.println("Ученик закончил школу и может поступить в университет");
                } else {
                    System.out.println("Человеку пора искать первую работу");
                }
            }
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
        }else {
            System.out.println("Вагон полностью заполнен!");
        }

        //Задание 2-1
        System.out.println("\nЗадание 2-1:");
        int humanAge = 25;
        boolean kinderGarten = humanAge >= 2 && humanAge < 7;
        boolean school = humanAge >=7 && humanAge <=18;
        boolean university = humanAge > 18 && humanAge <24;
        if (kinderGarten) {
            System.out.println("Если возраст человека равен "+humanAge+", то ему нужно ходить в детский сад");
        }else {
            if (school) {
                System.out.println("Если возраст человека равен "+humanAge+", то ему нужно ходить в школу");
            }else {
                if (university) {
                    System.out.println("Если возраст человека равен "+humanAge+", то его место в университете");
                }else {
                    System.out.println("Если возраст человека равен "+humanAge+", то ему уже пора на работу");
                }
            }
        }

        //Задание 2-2
        System.out.println("\nЗадание 2-2:");
        int childAge = 15;
        if (childAge < 5) {
            System.out.println("Ты пока не можешь кататься на аттракционе");
        }else {
            if (childAge >=5 && childAge < 14) {
                System.out.println("Ты можешь кататься, но только в сопровождении взрослого");
            }else {
                System.out.println("Ты можешь кататься сам!");
            }
        }

        //Задание 2-3
        System.out.println("\nЗадание 2-3:");
        int one = 6;
        int two = 6;
        int three = 6;
        if (one > two) {
            System.out.println("Больше первое значение и оно равно "+one);
        }else {
            if (two > three) {
                System.out.println("Больше второе значение и оно равно "+two);
            }else {
                if (three != two) {
                    System.out.println("Больше третье значение и оно равно "+three);
                }else {
                    System.out.println("Все три значения одинаковы и равны "+one);
                }
            }
        }
    }
}
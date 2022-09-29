public class Main {
    public static void main(String[] args) {
        int age = 20;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно подождать");
        }

        // Задание 2
        int humanAge = 8;
        if (humanAge >= 7 && humanAge < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (humanAge >= 18 && humanAge < 24) {
            System.out.println("Человек в университете");
        } else if (humanAge >= 24) {
            System.out.println("Человек ходит на работу");
        }

            // Задание 3
            int capacity = 102;
            int seatsCount = 60;
            int stayCount = capacity - seatsCount; // стоячие места
            int seatsUsed = 50;
            int stayUsed = 40;
            if (seatsUsed < seatsCount) {
                System.out.println("Есть еще " + (seatsCount - seatsUsed) + " сидячих мест ");
            } else {
                System.out.println("Сидячих мест нет");
            }
            if (stayUsed < stayCount) {
                System.out.println("Есть еще " + (stayCount - stayUsed) + " сидячих мест ");
            } else {
                System.out.println("Стоячих мест нет");
            }
        }
        }

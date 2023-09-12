

public class MainClass {
    public static void main(String[] args) {


        //task 2

        int trainingTimeInMinutes = 15;
        int intensityLevel = 2;

        double caloriesBurned = calculateCaloriesBurned(trainingTimeInMinutes, intensityLevel);
        System.out.println("2.Количество сожженных калорий: " + caloriesBurned + " ккал");


        // task 3

        int boxesCount = 3;
        int bagsCount = 4;
        int barrelsCount = 2;

        int totalItems = calculateTotalItems(boxesCount, bagsCount, barrelsCount);
        System.out.println("3. Общее количество товаров на складе: " + totalItems);


        // task 4

        String triangleType = determineTriangleType(5, 5, 6);
        System.out.println("4. Тип треугольника: " + triangleType);

        // task 5

        int result = findLargerNumber(5, 9);
        System.out.println("5. Большее число: " + result);



        // task 7

        int n = 5;
        long factorial = calculateFactorial(n);
        System.out.println("7. Факториал " + n + " равен " + factorial);

        // task 8
        int num1 = 36;
        int num2 = 48;

        int gcd = findGCD(num1, num2);
        System.out.println("8. Наибольший общий делитель чисел " + num1 + " и " + num2 + " равен " + gcd);


        // task 9
        int Tickets1 = 70;
        double ticketPrice1 = 1500;
        double revenue1 = ticketSaler(Tickets1, ticketPrice1);
        System.out.println("9. Общая выручка: " + revenue1);

        // task 10
        int students1 = 5;
        int desks1 = 2;
        int shortage1 = tables(students1, desks1);
        System.out.println("10. Не хватает " + shortage1 + " столов.");




        // task 1

        int gallons = 10;
        float liters = convert(gallons);
        System.out.println(gallons + " галлонов = " + liters + " литров");

    }


    // task 1
    public static float convert(int x) {
        float gallon = 3.785f;
        return x * gallon;
    }

    // task 2
    public static double calculateCaloriesBurned(int minutes, int intensity) {
        double caloriesPerMinute = 0;

        switch (intensity) {
            case 1:
                caloriesPerMinute = 1.0;
                break;
            case 2:
                caloriesPerMinute = 2.0;
                break;
            case 3:
                caloriesPerMinute = 3.0;
                break;
        }

        return caloriesPerMinute * minutes;
    }

    //task 3
    public static int calculateTotalItems(int boxesCount, int bagsCount, int barrelsCount) {

        int itemsInBox = 20;
        int itemsInBag = 50;
        int itemsInBarrel = 100;

        int totalItems = (boxesCount * itemsInBox) + (bagsCount * itemsInBag) + (barrelsCount * itemsInBarrel);

        return totalItems;
    }

    // task 4
    public static String determineTriangleType(int x, int y, int z) {
        if (x <= 0 || y <= 0 || z <= 0) {
            return "Не является треугольником";
        }

        if (x + y <= z || x + z <= y || y + z <= x) {
            return "Не является треугольником";
        }

        if (x == y && y == z) {
            return "Равносторонний треугольник";
        } else if (x == y || x == z || y == z) {
            return "Равнобедренный треугольник";
        } else {
            return "Разносторонний треугольник";
        }
    }


    // task 5
    public static int findLargerNumber(int a, int b) {
        int largerNumber = (a > b) ? a : b;
        return largerNumber;
    }


    //task 7
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен");
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    //task 8
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    //task 9
    public static double ticketSaler(int numberOfTickets, double ticketPriceWithCommission) {
        double totalRevenue = numberOfTickets * ticketPriceWithCommission;
        double commission = totalRevenue * 0.28;
        totalRevenue -= commission;
        return totalRevenue;
    }

    // task 10
    public static int tables(int students, int desks) {
        int tablesNeeded = (students + 1) / 2;


        int shortage = Math.max(0, tablesNeeded - desks);

        return shortage;
    }



}





/*void - функкия ничего не возвращает и примает она масив args
 * system. ссыламся к объектам, функциям.print and println("добавляет новую стоку
 * ")"*/
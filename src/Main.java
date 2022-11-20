public class Main {
    public static void main(String[] args) {
        //задача1
        int apple = 20;
        byte box = 100;
        short books = 500;
        long money = 100000L;
        float c = 2.5F;
        double height = 200.5;
        System.out.println( "Значение переменной apple" + " с типом int равно " + apple);
        System.out.println( "Значение переменной box" + " с типом byte равно " + box);
        System.out.println( "Значение переменной books" + " с типом short равно " + books );
        System.out.println( "Значение переменной money" + " с типом long равно " + money );
        System.out.println( "Значение переменной c" + " с типом float равно " + c );
        System.out.println( "Значение переменной height" + " с типом double равно " + height);

        //задача2
        double z = 27.12;
        int m = 965;
        long num = 987678965549L;
        float age = 2.786F;
        boolean picture = false;
        short time = 569;
        double cat = -159;
        long tasks = 2789;
        double city = 67.;
        System.out.println(z);
        System.out.println(m);
        System.out.println(num);
        System.out.println(age);
        System.out.println(picture);
        System.out.println(time);
        System.out.println(cat);
        System.out.println(tasks);
        System.out.println(city);

        //задание3
        var studentsOfLiudmylaPavlovna = 23;
        var studentsOfAnnaSergeevna = 27;
        var studentsOfEkaterinaAndreevna = 30;
        var quantitySheetsOfPaper = 480;
        var quantityOfstudents = studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna + studentsOfLiudmylaPavlovna;
        System.out.println( "На каждого ученика рассчитано " + quantitySheetsOfPaper / quantityOfstudents +" листов бумаги");

        //задание4
        byte twoMinutes = 16;
        int twentyminutes = twoMinutes * 20;
        int oneDay = twoMinutes * 24;
        int threDays = twoMinutes * (2 * 24);
        int onemonths = twoMinutes * ( 30* 24);
        System.out.println("За 2 минуты машина произвела бутылок " + twoMinutes + " штук");
        System.out.println("За 20 минут машина произвела бутылок " + twentyminutes + " штук");
        System.out.println("За 1 день машина произвела бутылок " + oneDay + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + threDays + " штук");
        System.out.println("За 1 месяц машина произвела бутылок " + onemonths + " штук");

        // task 5
        byte colorSchool = 120;
        byte brownColor = 4;
        byte whiteColor = 2;
        int schoolClasses = colorSchool / (brownColor + whiteColor);
        int totalBrownColor = colorSchool -(schoolClasses * brownColor);
        int totalWhiteColor = colorSchool - (schoolClasses * whiteColor);
        System.out.println ("В школе, где " + schoolClasses + " классов, нужно " + totalWhiteColor +
                " банок белой краски и " + totalBrownColor + " банок коричневой краски");

        //task 6
        byte banana = 5;
        int fiveBananaInGram = banana * 80;
        int milk = 200;
        int twoHundredMilkInGram = milk * 105;
        int iceCream = 2;
        int twoIceCreamInGram = iceCream * 100;
        int eggs = 4;
        int fourEggsInGram = eggs * 70;
        int totalWeightBreakfastInGram = fiveBananaInGram + twoHundredMilkInGram + twoIceCreamInGram + fourEggsInGram;
        System.out.println( "Колличество завтрака в граммах " + totalWeightBreakfastInGram +
                ", колличество завтрака в килограммах " + totalWeightBreakfastInGram / 1000.);
        //task 7  не могу решить
        int totalSlimKG = 7;
        double program1LostGramPerDay = 250 / 1000;
        double program2LostGramPerDay = 500 / 1000;
        double periodBySlimProgram1InKG = totalSlimKG / program1LostGramPerDay;
        double periodBySlimProgram2InKg = totalSlimKG / program2LostGramPerDay;


        //task 8 не знаю как решить
        int MashaSalary = 67760;
        int DenisSlary = 83690;
        int KristinaSalry = 76230;












    }
}
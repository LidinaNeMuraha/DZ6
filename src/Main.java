public class Main {
    public static void main(String[] args) {

        //zadanie 1

        int salary = 15000;
        int total = 0;
        int i = 0;

        while (total <= 2_459_000) {
            total = total + salary;
            i = i + 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рубдлей");

        }

        //zadanie 2

        int a = 0;

        while (a < 10) {
            a = a + 1;
            System.out.print(" " + a);
        }
        System.out.println();

        for (int b = 10; b > 0; b--){
            System.out.print(" " + b);
        }
        System.out.println( );

        // zadanie 3

        int gorodUrupinsk = 1_200_000;
        int rodilos = 17;
        int smert = 8;
        int year = 0;
        int rosdaemostVGod = 0;
        int smertVGod = 0;
        int chislennoct = 0;

        while (year <= 9){

            rosdaemostVGod = gorodUrupinsk * rodilos/1000;
            smertVGod = gorodUrupinsk * smert/1000;
            chislennoct = rosdaemostVGod - smertVGod;
            gorodUrupinsk = gorodUrupinsk + chislennoct;
            year = year + 1;
            System.out.println("Год " + year + " численность населения составляет " + gorodUrupinsk);

        }

        //zadanie 4 5

        int vklad = 15000;
        int procent = 0;

        for (int m = 1; vklad <= 12_000_000; m++) {
            procent = (vklad * 7) / 100;
            vklad = vklad + procent;
            if (m % 6 == 0){
                System.out.println("месяц " + m + " сумма вклада " + vklad);
            }
        }

        // zadanie 6

        int vkladishe = 15000;
        int protsent = 0;
        for (int k = 1; k <= 109; k++) {
            protsent = (vkladishe * 7) / 100;
            vkladishe = vkladishe + protsent;
            if (k % 6 == 0)  {
                System.out.println("Месяц " + k + " сумма " + vkladishe);
            }
        }

        // zadanie 7

        int chislo = 5;
        System.out.println("Сегодня пятница " + chislo + "-е число. Необходимо подговоить отчет");

        while (chislo <= 31) {
            chislo = chislo + 7;
            System.out.println("Сегодня пятница " + chislo + "-е число. Необходимо подговоить отчет");
        }

        // zadanie 8

        int god = 2017;
        int proshloe = god - 200;
        int budushee = god + 100;

        while (proshloe < budushee) {
            if (proshloe % 79 == 0) {
                if (proshloe != 1817){
                    System.out.println(proshloe);
                }

            }
            proshloe = proshloe + 79;




        }










    }
}
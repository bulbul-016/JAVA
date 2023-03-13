//2 12.02.2023
// import java.lang.FdLibm.Pow;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        /*
         * Домашняя работа:
         * 
         * // 12.03
         * 
         * // 1. Найти расстояние между двумя точками с заданными координатами (x1, y1)
         * и (x2, y2) на плоскости. Расстояние вычисляется по формуле sqrt((x2 − x1)2 +
         * (y2 − y1)2). Цифры указанные после скобок это степени.
         * // Input: 4 2 4 2
         * // Output: 2.8282.
         * //
         */

        // float x1 = scanner.nextFloat();
        // float x2 = scanner.nextFloat();
        // float y1 = scanner.nextFloat();
        // float y2 = scanner.nextFloat();

        // System.out.println((Math.sqrt((Math.pow((x2-x1),2)) + (Math.pow((y2-y1),
        // 2)))));

        // 2
        // Найти значение функции y = 4(x−3)6 − 7(x−3)3 + 2 при данном значении x.
        // Цифры указанные после скобок это степени.
        // Input: 4
        // Output: -13.

        // int x = scanner.nextInt();
        // double y = (4*(Math.pow((x-3), 6))) - (7*(Math.pow((x-3), 3))) + 2;
        // System.out.println(y);

        // 3
        // Дано значение угла α в радианах (0 < α < 2·π). Определить значение этого же
        // угла в градусах, учитывая, что 180◦ = π радианов. В качестве значения π
        // использовать 3.14.
        // Input: 2
        // Output: 114,64.

        // int alpha = scanner.nextInt();
        // System.out.println((180*alpha)/3.14);


        // Дано значение температуры T в градусах Фаренгейта. Определить значение этой
        // же температуры в градусах Цельсия. Температура по Цельсию TC и температура по
        // Фаренгейту TF связаны следующим соотношением: TC = (TF − 32)·5/9.
        //  * Input: 500
        //  * Output: 2605.

        // int tf = scanner.nextInt();
        // System.out.println((tf-32)*5/9);



        // Скорость первого автомобиля V1 км/ч, второго — V2 км/ч,
        //  * расстояние между ними S км. Определить расстояние между ними через T часов,
        //  * если автомобили удаляются друг от друга. Данное расстояние равно сумме
        //  * начального расстояния и общего пути, проделанного автомобилями; общий путь =
        //  * время · суммарная скорость.
        //  * Input: 200км.ч 230км.ч 50км 2часа
        //  * Output: 9106. 

        // int v1 = scanner.nextInt();
        // int v2 = scanner.nextInt();
        // int s = scanner.nextInt();
        // int t = scanner.nextInt();

        // Даны целые положительные числа A и B (A > B). На отрезке длины
        // * A размещено максимально возможное количество отрезков длины B (без
        // * наложений). Используя операцию деления нацело, найти количество отрезков B,
        // * размещенных на отрезке A.
        // * Input: 10 4
        // * Output: 27.

        


        // int num = scanner.nextInt();
        // System.out.println((num/10)+", " +(num%10));
        // System.out.println(num%10 + "," + (num/10)%10);

        /*
         * 
         * 
         *  Дано двузначное число. Вывести вначале его левую цифру (десятки),
         * а затем — его правую цифру (единицы). Для нахождения десятков использовать
         * операцию деления нацело, для нахождения единиц — операцию взятия остатка от
         * деления.
         * Input: 10
         * Output: 1, 0
         * Input: 49
         * Output: 4, 98. 
         * 
         * Дано трехзначное число. Вывести вначале его последнюю цифру
         * (единицы), а затем — его среднюю цифру (десятки).
         * Input: 914
         * Output: 4, 1
         */

        //  int a= scanner.nextInt();
        //  int b= scanner.nextInt();
        //  int c= scanner.nextInt();
         
        //  System.out.println((int)(Math.pow(a, 3))+ (2*(int)(Math.pow(b, 2))) - (3*a*b) + (int)(Math.pow(c, 3)));

        // String university = scanner.nextLine();
        // String faculty = scanner.nextLine();
        // String subject = scanner.nextLine();

        // System.out.println("University: " + university);
        // System.out.println("Faculty: "+ faculty);
        // System.out.println("Subject: "+ subject);

        //3
        // System.out.print("Inserrt a: ");
        // int a = scanner.nextInt();
        // System.out.print("Inserrt b: ");
        // int b = scanner.nextInt();
        // System.out.print("Inserrt c: ");
        // int c = scanner.nextInt();

        // boolean trorf = (a+b)>=c;

        // System.out.println(trorf);

        //4
        // final double PI = 3.14;
        // System.out.print("Insert diametr: ");
        // double d = scanner.nextDouble();
        // System.out.println(PI*d);

        //5
        // int a= scanner.nextInt();
        // int b= scanner.nextInt();

        // double result = Math.sqrt(a*b);
        // double result1 = Math.pow((a*b), 1/2);
        // System.out.println(result);
        // System.out.println(result1);

        //6
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        System.out.println(Math.abs(x2-x1));



    }

}

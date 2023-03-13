import java.util.Locale;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        //if else

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // int a = scanner.nextInt();
        // if(a>10 && a<=20) System.out.println("a greater than 10");
        // else System.out.println("a less than 10");

        // String color = scanner.next();

        // if(color.equals("green")) System.out.println("GO");
        // else if (color.equals("yellow")) System.out.println("Wait Wait");
        // else if (color.equals("red")) System.out.println("Stop!");
        // else System.out.println("Which color?");

        // switch (color){
        //     case "green": System.out.println("goooooooo"); break;
        //     case "yellow": System.out.println("waaaaaaitt"); break;
        //     case "red": System.out.println("stoooooop"); break;
        //     default: System.out.println("which color???");
        // } 

        //ternary operater
        // int a= scanner.nextInt();
        // int b= scanner.nextInt();
        // String aorb = a>=b ? "a greater than b" : "a less than b";
        // System.out.println(aorb);

        // var n = 10;
        // System.out.println(n+16);

        // final int m = 12;
        // System.out.println(m*2);


        //1
        // int n = scanner.nextInt();
        // if (n>=10 && n<=20) System.out.println("YES");
        // else System.out.println("NO");

        // String answer = n>=10 && n<=20? "YES": "NO";
        // System.out.println(answer);


        //2
        // System.out.println("insert amount in KZT: ");
        // float amount = scanner.nextFloat();
        // System.out.println("Choose currency: ");
        // System.out.println("[1] USD");
        // System.out.println("[2] EUR");
        // System.out.println("[3] GBP");
        // int currency = scanner.nextInt();
        
        // switch (currency){
        //     case 1: System.out.println((amount/438)+" USD"); break;
        //     case 2: System.out.println((amount/500)+" EUR"); break;
        //     case 3: System.out.println((amount/602)+" GBP");break;
        //     default: System.out.println("How much ????????");
        // }

        //3
        // int a =scanner.nextInt();
        // int b=scanner.nextInt();
        // String answer = (a%b==0) ? "divisible": "not divisible";
        // System.out.println(answer);

        // 1. Дано целое число A. Проверить истинность высказывания: «Число A является положительным».
        // Input: 10
        // Output: Yes
        // Input: -5
        // Output: No

        // int a=scanner.nextInt();
        // String answer = a>=0 ? "Yes": "No";
        // System.out.println(answer);

        // 2. Даны два целых числа: A, B. Проверить истинность высказывания: «Справедливы неравенства A > 2 и B ≤ 3».
        // Input: 4 3
        // Output: Yes
        // Input: 1 6
        // Output: No
        // int a= scanner.nextInt();
        // int b = scanner.nextInt();
        // String answer = (a>2 && b<=3) ? "Yes": "No";
        // System.out.println(answer);

        // 3. Даны три целых числа: A, B, C. Проверить истинность высказывания: «Справедливо двойное неравенство A < B < C».
        // Input: 2 6 9
        // Output: Yes
        // Input: 4 2 9
        // Output: No

        // int a= scanner.nextInt();
        // int b= scanner.nextInt();
        // int c= scanner.nextInt();
        // String answer= (a<b && b<c) ? "Yes": "No";
        // System.out.println(answer);

        // 4. Дано целое число. Если оно является положительным, то прибавить к нему 1; в противном случае не изменять его. Вывести полученное число.
        // Input: 9
        // Output: 10
        // Input: -6
        // Output: -6

        // int n = scanner.nextInt();
        // if(n>=0) System.out.println(n+1);
        // else System.out.println(n);

        // 5. Даны две переменные вещественного типа: A, B. Перераспределить значения данных переменных так, чтобы в A оказалось меньшее из значений, а в B — большее. Вывести новые значения переменных A и B.
        // Input: 3.18 2.8
        // Output: 2.8 3.18

        // double a= scanner.nextDouble();
        // double b= scanner.nextDouble();
        // if (a>b) System.out.println(b+" "+a);
        // else System.out.println(a+" "+b);


        // 6. Даны три числа. Найти наименьшее из них.
        // Input: 1 2 3
        // Output: 1
        // Input: 8 4 7
        // Output: 4

        // int q= scanner.nextInt();
        // int w= scanner.nextInt();
        // int e= scanner.nextInt();

        // if (q<=w &&q<=w) System.out.println(q);
        // if (w<=q &&w<=e) System.out.println(w);
        // if (e<=w &&e<=q) System.out.println(e);

        // 7. Даны три числа. Найти сумму двух наибольших из них.
        // Input: 8 4 7
        // Output: 15

        // int z=scanner.nextInt();
        // int x=scanner.nextInt();
        // int c=scanner.nextInt();
        // if (z>c && x>c) System.out.println(z+x);
        // else if(x>z && c>z) System.out.println(x+c);
        // else if (z>x && c>x) System.out.println(c+z);

        // 8. Даны три переменные вещественного типа: A, B, C. Если их значения упорядочены по возрастанию или убыванию, то удвоить их; в противном случае заменить значение каждой переменной на противоположное. Вывести новые значения переменных A, B, C.
        // Input: 2 4 6
        // Output: 4 8 12
        // Input: 8 4 7
        // Output: -8 -4 -7

        // int a= scanner.nextInt();
        // int b= scanner.nextInt();
        // int c= scanner.nextInt();

        // if((a>b && b>c) || (c>b && b>a)) System.out.println(a*2 + " "+ b*2+ " "+ c*2);
        // else System.out.println(-a + " "+ (-b)+ " "+ (-c));

        // 9. Дано целое число в диапазоне 1–7. Вывести строку — название дня недели, соответствующее данному числу (1 — «понедельник», 2 — «вторник» и т. д.).
        // Input: 1
        // Output: Monday
        // Input: 5
        // Output: Friday

        // int n = scanner.nextInt();
        // switch (n){
        //     case 1: System.out.println("Monday"); break;
        //     case 2: System.out.println("Tuesday"); break;
        //     case 3: System.out.println("Wednesday");break;
        //     case 4: System.out.println("Thursday");break;
        //     case 5: System.out.println("Friday");break;
        //     case 6: System.out.println("Saturday");break;
        //     case 7: System.out.println("Sunday");break;
        // }

        
        // 10. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 — февраль и т. д.). Определить количество дней в этом месяце для невисокосного года.
        // Input: 1
        // Output: 31
        // Input: 2
        // Output: 28

        int n = scanner.nextInt();
        switch (n){
            case 1: System.out.println(31); break;
            case 2: System.out.println(28); break;
            case 3: System.out.println(31);break;
            case 4: System.out.println(30);break;
            case 5: System.out.println(31);break;
            case 6: System.out.println(30);break;
            case 7: System.out.println(31);break;
            case 8: System.out.println(31);break;
            case 9: System.out.println(30);break;
            case 10: System.out.println(31);break;
            case 11: System.out.println(30);break;
            case 12: System.out.println(31);break;

        }



    }
}

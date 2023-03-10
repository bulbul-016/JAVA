//lesson 1, 11.03.2023
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);


        //task1
        // int a= scanner.nextInt();
        // int b= scanner.nextInt();
        // System.out.println(a+b);

        // System.out.println("Insert c: ");
        // int c= scanner.nextInt();
        // System.out.println("Insert d: ");
        // int d= scanner.nextInt();
        // System.out.println("sum = "+ (c+d));


        // task2
        // System.out.println("Insert name: ");
        // String name =scanner.next();
        // System.out.println("Insert surname: ");
        // String surname =scanner.next();
        // System.out.println("Insert age: ");
        // int age =scanner.nextInt();
        // System.out.println("Insert country: ");
        // String country =scanner.next();

        // System.out.println("Name: " + name);
        // System.out.println("Surname: " + surname);
        // System.out.println("Age: " + age);
        // System.out.println("Country : " + country);

        // System.out.println("Name: " + name + "\n" + "Surname: " + surname + "\n"+ "Age: " + age + "\n"+"Country : " + country);


        //task3
        // System.out.print("Insert first number: ");
        // int first= scanner.nextInt();
        // System.out.print("Insert second number: ");
        // int second= scanner.nextInt();

        // // if (first>=second){
        // //     System.out.print("true");
        // // } else {System.out.print("false");}

        // boolean firstOrSecond = first>=second;
        // System.out.println(firstOrSecond);

        //task4 
        System.out.print("Birinshi sandy zhaz: ");
        int birinshi=scanner.nextInt();
        System.out.print("Ekinshi sandy zhaz: ");
        int ekinshi= scanner.nextInt();
        System.out.print("Ushinshi sandy zhaz: ");
        int ushinshi=scanner.nextInt();
        System.out.println(birinshi+ " + " + ekinshi +" + " + ushinshi + " = "+ (birinshi+ekinshi+ushinshi));
        System.out.println(birinshi+ " - " + ekinshi +" - " + ushinshi + " = "+ (birinshi-ekinshi-ushinshi));
        System.out.println(birinshi+ " * " + ekinshi +" * " + ushinshi + " = "+ (birinshi*ekinshi*ushinshi));




    }
}

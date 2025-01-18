import java.util.Scanner;

public class MyRightangleHypotenuse {
    public static void main(String[] args){
        //hypotenuse c = Math.sqrt(a² + b²)
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A : ");
        a = scanner.nextDouble();
        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

       //System.out.println(a);
        //System.out.println(b);
        c =Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse of side c is : " + c + "cm");


        scanner.close();

    }
}

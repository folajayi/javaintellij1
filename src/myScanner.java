import java.util.Scanner;

public class myScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello "+ name);
        System.out.println("You are "+ age + " years old");
        System.out.println("Your gpa is: "+ gpa);
        System.out.println("Student: "+ isStudent);
        if(isStudent){
            System.out.println("You are enrolled as a student");
        }
        else {
            System.out.println("You are NOT enrolled");
        }
        // Common issues
        //if you accept int or double , the accept a string, the next character is
        // taken as the nextInt method input
        // To resolve this , use scanner  to
        // call the next line but don't accept anything ( to clear the input buffer)


        System.out.print("Enter your year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favourite colour: ");
        String colour = scanner.nextLine();

        System.out.println("This is "+ year);
        System.out.println("You like the colour "+ colour);

        scanner.close();

    }
}

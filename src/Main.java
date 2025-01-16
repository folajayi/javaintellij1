public class Main {
    public  static void main(String[] args){
        // this the first java program in this project
        System.out.print("I like pizza!\n");
        System.out.print("It's really good\n");
        System.out.println("Buy me pizza!");
        System.out.println("It always taste so good");

        int age = 30;
        int year = 2025;
        int quantity = 1;

        double price = 19999.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol ='!';
        char currency = '$';


        boolean isStudent = true;
        boolean forSale = true;
        boolean isOnline =  true;

        System.out.println(age);
        System.out.println(year);
        System.out.println(quantity);
        System.out.println("The year is " + year);
        System.out.println("$" + price);
        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);

        if(isStudent){
            System.out.println("You are a student!");
        }
        else {
            System.out.println("You are NOT a student!");
        }

        String name = "Bro code";
        String food = "pizza";
        String email = "email@email.com";
        String car = "Mustang";
        String colour = "Red";
        {
            System.out.println("Hello "+ name);
            System.out.println("You are "+ age + " years old");
            System.out.println("Your gpa is : "+ gpa);
            System.out.println("Your average letter grade is : "+ grade);
            System.out.println("Your choice is a "+ colour +" "+ 2025+" "+ car);
            System.out.println("The price is : " + currency +price);

            if(forSale){
                System.out.println("There is a "+ car + " for sale");
            }
            else {
                System.out.println("The "+ car + " for Not sale");
            }
        }




    }
}

import java.util.Random;

public class MyRandom {
    public static void main(String[] args){
        Random random = new Random();

        int number1;
        int number2;
        int number3;
        double number;
        boolean isHeads;

        number1 = random.nextInt(7);
        number2 = random.nextInt(7);
        number3 = random.nextInt(7);
        number = random.nextDouble();
        isHeads = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number);
        if(isHeads) {
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }


    }
}

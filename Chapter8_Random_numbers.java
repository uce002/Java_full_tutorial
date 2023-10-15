import java.util.Random;
public class Chapter8_Random_numbers {

    public static void main(String[] args) {

        //generate random values, good for game design?
        Random random = new Random(); //access to a random instance to generate random values

        int x = random.nextInt(6)+1; //computers start from 0 so 0 to 5, +1 gives 1 to 6 (dice)
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(x);

    }
}

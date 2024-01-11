import java.util.Scanner;
public class Chapter12and13_For_and_while_loops {

    public static void main (String[] args) {

        //WHILE LOOP

        //while loop executes a block of code (like an if statement) but only as long as it's condition remains true
        // which could be indefinetly

        Scanner scanner = new Scanner(System.in);
        String name = "";

        //while the user hasn't entered their name, prompt them to enter their name else print Hello name
        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        //FOR LOOP

        // for loop executes a block of code a limited amount of times

        //3 statements in the for loop. declare index/counter (i), iterate until index meets the condition (i<=10)
        // and plus 1 each time (i++). This for loop prints from 0 to 10.
        for(int i = 0; i<=10; i++) {
            System.out.println(i);
        }

        //a decrementing example
        for(int x = 10; x>=0; x--) {
            System.out.println(x);
        }

        System.out.println("Happy New Year!");
    }
}

import java.util.Scanner;
public class Chapter11_Logical_operators {

    public static void main (String[] args) {

        //logical operator - used to connect 2 or more expressions

        // &&   (AND) both conditions must be true
        //||    (OR) either condition must true
        //!     (NOT) reverses boolean value of condition x = 3 is usually true but its false

        int temp = 15;

        if(temp > 30) {
            System.out.println("It's hot outside");
        }
        else if(temp>= 20 && temp<=30) {
            System.out.println("It's warm outside");
        }
        else {
            System.out.println("It's cold outside");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("you're playing a game! Press q or Q to quit");
        String response = scanner.next();

//        if(response.equals("q") || response.equals("Q")) {
//            System.out.println("You quit the game");
//        }
//        else {
//            System.out.println("You're still playing the game");
//        }

//         to use the ! in the above case
        if(!response.equals("q") && !response.equals("Q")) {
          System.out.println("You are still playing the game");
        }
        else {
            System.out.println("You quit the game");
        }
    }
}

import java.util.Scanner;
public class Chapter4_User_input {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in); //Create scanner object and import it to use it
        //Scanners can read user input and scan files

        System.out.println("What's your name? ");
        String name = scanner.nextLine(); //nextLine gets the input from the console
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine(); //clears the scanner otherwise it reads the int which has a new line at the end of it so
        //the input of the new line isn't read
        System.out.println("What is your favourite food? ");
        String food = scanner.nextLine();


        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("You like "+food);


    }
}

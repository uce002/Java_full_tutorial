public class Chapter10_Switches {

    public static void main(String[] args) {

        //switch - allows a variable (int, double, char, string,etc) to be tested for equality against a list of values
        //better used when lots of if statements

        String day = "Friday";

        switch(day) {
            case "Sunday": System.out.println("It's Sunday!");
            break; //breaks out of this line of code to move onto the next one
            case "Monday": System.out.println("It's Monday!");
            break;
            case "Tuesday": System.out.println("It's Tuesday!");
            break;
            case "Wednesday": System.out.println("It's Wednesday!");
            break;
            case "Thursday": System.out.println("It's Thursday!");
            break;
            case "Friday": System.out.println("It's Friday!");
            break;
            case "Saturday": System.out.println("It's Saturday!");
            break;
            default: System.out.println("That's not a day"); //if variable isn't in the switch list provides a default message
        }


    }
}

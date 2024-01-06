public class Chapter9_if_statements {

    public static void main(String[] args) {

        //if statement performs a block of code if it's condition is true

        int age = 45;

        if (age>=75) {
            System.out.println("ok boomer");
        }
        else if(age>=18) {
            System.out.println("you are an adult");//check an additional condition
        }
        else {
            System.out.println("you are not an adult");
        }

    }
}

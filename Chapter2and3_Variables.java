public class Chapter2and3_Variables {

    public static void main(String[] args) {

        //CHAPTER 2

        //primitive and references data types - 5 main ones
        /*primitive
        *data type  size     value
        *boolean    1 bit    true/false
        *int        4 bytes  -2bn to 2bn (just under and just over)
        *double     8 bytes  fractional number upto 15 digits e.g. 3.141592653589793
        *char       2 bytes  single character/letter/ASCII value e.g. 'f'
        *
        * reference
        * String    varies   sequence of characters e.g. "Hello World!"
        */

//        int x; //declaration
//        x = 123; //assignment

        int x = 123; // initialisation
        double y = 1.23;
        boolean z = true;
        char symbol = '@';
        String name = "Uce";


        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(symbol);
        System.out.println("My name is " + name);

        //CHAPTER 3

        String a = "Water";
        String b = "Kool-Aid";
        String temp; //same as declaring it a null

        temp = a;
        a = b;
        b = temp;

        System.out.println("a: " +a);
        System.out.println("b: "+b);
    }
}

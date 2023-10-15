import java.util.Scanner;
public class Chapter7_Math_class {

    public static void main(String[] args) {

        double x = 3.49;
        double y = 10;
        double d = -8;

        //max. finds larger of 2 numbers, assign it to z. min - finds smaller of 2 numbers
//        double z = Math.max(x, y);
//        double b = Math.abs(d); //absolute value. gives number without - sign
//        double c = Math.sqrt(y);
        double e = Math.round(x); //round does normal round. floor = round down. ceil = round up
//
//        System.out.println(z);
//        System.out.println(b);
//        System.out.println(c);
        System.out.println(e);

        //hypotenuse
        double l;
        double m;
        double n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        l = scanner.nextDouble();
        System.out.println("Enter side y ");
        m = scanner.nextDouble();

        n = Math.sqrt((l*l)+(m*m));

        System.out.println("The hypotenuse is "+n);

        scanner.close();


    }
}

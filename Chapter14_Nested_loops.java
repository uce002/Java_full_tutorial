import java.util.Scanner;
public class Chapter14_Nested_loops {

    public static void main(String[] args) {

        //nested loop = a loop inside another loop

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use");
        symbol = scanner.next();

        //iterates through each row, row1, col 1, 2, 3, 4, 5. row2, col 1, 2, 3, 4, 5. row3 etc
        for(int i=1; i<=rows; i++) { //iterate through all rows <= includes all rows incl the last one
            System.out.println();

            for(int j=1; j<=columns; j++) {
                System.out.print(symbol);
            }
        }

    }
}

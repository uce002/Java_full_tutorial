public class Chapter16_2D_Arrays {

    public static void main(String[] args) {

        //2D array = an array of arrays
        //                       rows and   columns
        //2[] as 2 arrays.   [3] arrays [3] elements


//        String[][] cars = new String[3][3];
//
//        //assigning cars to each parking space (row and column)
//        cars[0][0] = "Golf";
//        cars[0][1] = "RS7";
//        cars[0][2] = "Focus";
//        cars[1][0] = "F-Pace";
//        cars[1][1] = "Model S";
//        cars[1][2] = "G-Wagon";
//        cars[2][0] = "Fiesta";
//        cars[2][1] = "Punto";
//        cars[2][2] = "Defender";

        //assign elements at 2D array declaration
        String[][] cars = {
                {"Golf","RS7","Focus"},
                {"F-Pace","Model S","G-Wagon"},
                {"Fiesta","Punto","Defender"},
        };

        //outer for loop for rows
        for(int i=0; i<cars.length; i++) {
            System.out.println(); //new line for each row
            //inner for loop for columns. as long as the position of j(column) is less than the length of
            // the amount of rows, keep iterating
            for(int j=0; j<cars[i].length; j++) {
                System.out.print(cars[i][j]+ " "); //space after every element [0][0] [1][1] etc
            }
        }
    }

}

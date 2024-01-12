public class Chapter15_Arrays {

    public static void main(String[] args) {

        //array = stores multiple values in a single variable

        //the list of strings 'cars' is the single variable storing several string values (cars)
        String[] cars = {"Audi", "VW", "Tesla"};

        cars[0] = "Lamborghini"; //change array value
        System.out.println(cars[0]);

        //another way to create an array. first allocate element number/size then add values later
        String[] phones = new String[4];

        phones[0] = "Apple iPhone";
        phones[1] = "Motorola Razr";
        phones[2] = "Samsung Galaxy Fold";
        phones[3] = "Blackberry 7290";

        System.out.println(phones[0]); //access element value

        //use for loop to iterate through all elements of an array
        for (int i=0; i<phones.length; i++) {
            System.out.println(phones[i]);
        }

    }
}

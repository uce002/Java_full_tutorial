public class Chapter17_String_methods {

    public static void  main(String[] args) {

        //String = reference data type that can store 1 or more characters.
        //          reference data types have access to useful methods

        String name = "Uce";

        //compare 2 strings to see if they're equal. returns boolean T/F
        boolean result = name.equals("Uce"); //.equalsIgnoreCase to ignore upper & lower cases

        int result1 = name.length(); //returns length of string

        char result2 = name.charAt(0); //returns character at index 0, choose whichever you want

        int result3 = name.indexOf("c"); //returns index number of given character in a string

        boolean result4 = name.isEmpty(); //returns T/F if string is empty

        String result5 = name.toUpperCase(); //also name.toLowerCase();

        String result6 = name.replace('U', 'a'); //replace all instances of U with a

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

    }
}

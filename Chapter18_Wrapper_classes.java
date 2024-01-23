public class Chapter18_Wrapper_classes {

    public static void main(String[] args) {

        //wrapper class provides a way to use primitive data types as reference data types.
        // reference data types have useful methods (Strings in the last chapter) String is already reference
        // can be used with collections e.g. ArrayList

        //primitive    wrapper
        //
        //boolean      Boolean
        //char         Character ''     String = ""
        //int          Int
        //double       Double
        //primitive is faster than reference

        //autoboxing = directly assigns primitive types to wrapper class automatically
        // the automatic conversion that the Java compiler makes between the primitive types
        // and their corresponding object wrapper class
        //unboxing = the reverse of above. Automatic conversion of wrapper class to primitive.

        //have autoboxed these
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.16;
        String e = "Uce";

        //unboxing
        if(a==true) {
            System.out.println("This is true");
        }
        if(b=='a') {
            System.out.println("this is true");
        }

        //primitive data types are faster than reference as they have one less step
    }
}

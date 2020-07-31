package JTproject.Pack;

public class ErrorInput {

    public static void invalidWidthAndHeight() {

        System.err.print("Error! The values must be between 1 and 1000.");
        System.exit(1);
    }

    public static void invalidInputValuesToArray() {

        System.err.print("To many values. They have to be the  same size as rows.");
        System.exit(1);
    }

    public static void invalidIndex() {
        System.err.print("Error! The searched index is bigger than the array size.");
        System.exit(1);
    }

}

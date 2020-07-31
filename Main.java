package JTproject.Pack;

import javax.imageio.ImageTranscoder;
import javax.swing.text.StyleContext;
import java.util.Scanner;



public class Main {


    public static void main(String[] args) {

        int rows ;
        int cols;
        Scanner inputElements = new Scanner(System.in);
        GreenVsRed gr = new GreenVsRed();

        String input;
        String[] vectorInput;
        System.out.print("Enter width and height split by \", \" :");

        input = inputElements.nextLine();
        vectorInput = input.split(", "); // split the values to make width and height for array
         rows = Integer.parseInt(vectorInput[0]);
         cols = Integer.parseInt(vectorInput[1]);

        int[][] createNewArray = CheckArraySize.checkSize(rows, cols);
        gr.createArray(createNewArray, rows, cols);

        System.out.print("Enter searched index and generation split by \", \" ");
        input = inputElements.nextLine();
        vectorInput = input.split(", ");
        int firstIndex = Integer.parseInt(vectorInput[0]);
        if (firstIndex > createNewArray.length) {
            ErrorInput.invalidIndex();
        }
        int secondIndex = Integer.parseInt(vectorInput[1]);
        if (secondIndex > createNewArray.length) {
            ErrorInput.invalidIndex();
        }
        int generation = Integer.parseInt(vectorInput[2]);

        System.out.println(rows + ", " + cols);
        gr.outputArray(createNewArray);


       int result = 0;
        while (result < generation) {
            int[][] RSArrays = new int[rows][cols];
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                   GreenVsRed.checkForSimilarValues(row, col, createNewArray, firstIndex, secondIndex, RSArrays);
                }
            }
            createNewArray = RSArrays;
            result++;
        }

        System.out.print(firstIndex + ", " + secondIndex + ", " + generation + "\n" + "Result: " +
                GreenVsRed.getCountNeighbors());
    }


}



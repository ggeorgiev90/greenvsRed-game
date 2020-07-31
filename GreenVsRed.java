package JTproject.Pack;

import java.util.Scanner;

public class GreenVsRed {

    protected static int countNeighbors = 0;

    Scanner inputElements = new Scanner(System.in);

    public static int getCountNeighbors() {

        return countNeighbors;
    }




    //User enters values -> matrix[][]; x, y, g; UserInputCollector;.collectMatrixSize;
    //Game/GreenVsRedCalculator;
    //Inheritance; Interface;
    //Define constants so not to have magic numbers;
    //Do not check for string numbers - "1", "0", use normal numbers


    public void createArray(int[][] newArray, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter values of the rows : ");
            String[] values = inputElements.nextLine().split(""); //splitting the input to values  ot  array
            if (values.length > rows) {
                ErrorInput.invalidInputValuesToArray();
            }
            for (int j = 0; j < cols; j++) {
                newArray[i][j] = Integer.parseInt(values[j]);
            }
        }
    }



    public void outputArray(int[][] outputArray) {
        // Output the array with for-each
        for (int[] x : outputArray) {
            for (int y : x) {

                System.out.print(y + " ");
            }
            System.out.println();
        }
    }


    protected static void checkForSimilarValues(int x, int y, int[][] grid, int
            ArrayX, int ArrayY, int[][] toNewArray) {

        int greenNeighbours = getGreenNeighbours(grid, x, y);

            if (grid[x][y] == 0) {
                if (greenNeighbours == 3 || greenNeighbours == 6) {
                    toNewArray[x][y] = 1;
                    if (x == ArrayX && y == ArrayY) {
                        countNeighbors++;
                    }
                } else {
                    toNewArray[x][y] = 0;
                }
            if (grid[x][y] == 1) {
                if (greenNeighbours == 2 || greenNeighbours == 3 || greenNeighbours == 6) {
                    toNewArray[x][y] = 1;
                    if (x == ArrayX && y == ArrayY) {
                        countNeighbors++;
                    }
                } else {
                    toNewArray[x][y] = 0;
                }
            }
        }
    }


    private static int getGreenNeighbours(int[][] grid, int x, int y) {
        int greenNeighbours = 0;
        int height = grid.length;
        int width = grid[0].length;
        if (width > x - 1 && height > y - 1 && x - 1 >= 0 && y - 1 >= 0) {

            if (grid[x - 1][y - 1] == 1) {
                greenNeighbours++;
            }
        }
        if (width > x - 1 && height > y && x - 1 >= 0) {
            if (grid[x - 1][y] == 1) {
                greenNeighbours++;
            }
        }
        if (width > x && height > y - 1 && y - 1 >= 0) {
            if (grid[x][y - 1] == 1) {
                greenNeighbours++;
            }
        }
        if (width > x + 1 && height > y + 1) {
            if (grid[x + 1][y + 1] == 1) {
                greenNeighbours++;
            }
        }
        if (width > x + 1 && height > y) {
            if (grid[x + 1][y] == 1) {
                greenNeighbours++;
            }
        }
        if (width > x && height > y + 1) {
            if (grid[x][y + 1] == 1) {
                greenNeighbours++;
            }
        }
        if (width > x - 1 && height > y + 1 && x - 1 >= 0) {
            if (grid[x - 1][y + 1] == 1) {
                greenNeighbours++;
            }
        }
        if (width > x + 1 && height > y - 1 && y - 1 >= 0) {
            if (grid[x + 1][y - 1] == 1) {
                greenNeighbours++;
            }
        }
        return greenNeighbours;
    }


}















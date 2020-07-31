package JTproject.Pack;

public class CheckArraySize {

    public static int[][] checkSize(int rows, int cols) {
        if (rows < 0 || rows >= 1000) {
            ErrorInput.invalidWidthAndHeight();

        }

        if (cols < 0 || cols >= 1000) {
            ErrorInput.invalidWidthAndHeight();
        }
        return new int[rows][cols];
    }
}

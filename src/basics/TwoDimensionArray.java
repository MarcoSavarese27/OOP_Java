package basics;

/**
 * Write a program that creates a two-dimensional array initialized with test
 * data. Use any primitive data type you wish. The program should have the
 * following methods.
 * <p>
 * getTotal - This method should accept a two-dimensional array as its argument
 * and return the total of all the values in the array.
 * <p>
 * getAverage - This method should accept a two-dimensional array as its
 * argument and return the average of all the values in the array.
 * <p>
 * getRowTotal. - This method should accept a two-dimensional array as its first
 * argument and an integer as its second argument. The second argument should be
 * the subscript of a row in the array. The method should return the total of
 * the values in the specified row.
 * <p>
 * getColumnTotal - This method should accept a two-dimensional array as its
 * First argument and an integer as its second argument. The second argument
 * should be the subscript of a column in the array. The method should return
 * the total of the values in the specified column.
 * <p>
 * getHighestInRow - This method should accept a two-dimensional array as its
 * First argument and an integer as its second argument. The second argument
 * should be the subscript of a row in the array. The method should return the
 * Highest values in the specified row in the array.
 * <p>
 * getLowestInRow - This method should accept a two-dimensional array as its
 * First argument and an integer as its second argument. The second argument
 * should be the subscript of a row in the array. The method should return the
 * lowest values in the specified row in the array. Demonstrate each of the
 * methods in this program.
 *
 * @author Nicola Bicocchi
 */

public class TwoDimensionArray {
    public static void main(String[] args){
        int[][] mat= {{6, 4, 5}, {3, 1, 2}};
        int tot = getTotal(mat);
        double av = getAverage(mat);


        System.out.println("Total elements:\t " + tot);
        System.out.println("Average:\t\t" + av);

        System.out.println("Row 1:\t\t\t" + getRowTotal(mat,0));
        System.out.println("Row 2:\t\t\t" + getRowTotal(mat,1));

        System.out.println("Column 1:\t\t" + getColumnTotal(mat, 0));
        System.out.println("Column 2:\t\t" + getColumnTotal(mat, 1));
        System.out.println("Column 3:\t\t" + getColumnTotal(mat, 2));

        System.out.println("Highest in row 1:\t" + getHighestInRow(mat, 0));
        System.out.println("Highest in row 2:\t" + getHighestInRow(mat, 1));

        System.out.println("Lowest in row 1:\t" + getLowestInRow(mat, 0));
        System.out.println("Lowest in row 2:\t" + getLowestInRow(mat, 1));
    }

    private static int getLowestInRow(int[][] mat, int Row) {
        int L = 2147483647;
        for(int i = 0; i < mat[Row].length; ++i){
            if(L > mat[Row][i]){
                L = mat[Row][i];
            }
        }
        return L;
    }

    private static int getHighestInRow(int[][] mat, int Row) {
        int H = 0;
        for(int i = 0; i < mat[Row].length; ++i){
            if(H < mat[Row][i]){
                H = mat[Row][i];
            }
        }
        return H;
    }

    private static String getColumnTotal(int[][] mat, int Col) {
        String col = "";
        for(int i = 0; i < mat.length; ++i){
            col += mat[i][Col];
            col += " ";
        }
        return col;
    }

    private static String getRowTotal(int[][] mat, int Row) {
        String row = "";
        for(int i = 0; i < mat[Row].length; ++i){
            row += mat[Row][i];
            row += " ";
        }
        return row;
    }

    private static double getAverage(int[][] mat) {
        int tot = getTotal(mat);
        double av = 0;
        for(int i = 0; i < mat.length; ++i){
            for(int j = 0; j < mat[i].length; ++j){
                av+=mat[i][j];
            }
        }
        av = av/tot;
        return av;
    }

    public static int getTotal(int[][] mat){
        int cnt = 0;
        for(int i = 0; i < mat.length; ++i){
           for(int j = 0; j < mat[i].length; ++j){
               ++cnt;
           }
        }
        return cnt;
    }
}

package Array2D_DSATheory_Lec2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class lecture_2_Practice {
    public static void main(String[] args) {

        char[][] array2D = {
                {'a','b','c','d'},
                {'e','f','g','h'},
                {'i','j','k','l'},
        };
        //get the number of rows and columns
        int rows = array2D.length;
        int columns= array2D[0].length;


        //convert a 2D array into a 1D array using row-major order
        char[] rowMajorArray = new char[rows * columns];
        int index = 0;
        for (int i = 0 ; i<rows ; i++){
            for (int j = 0 ; j<columns ; j++){
                rowMajorArray[index] = array2D[i][j];
                index++;
            }
        }
        for (char show : rowMajorArray){
            System.out.print(show+", ");
        }

        System.out.println("");
        //Convert a 2D array into a 1D array using row-major order
        char[] ColumnMajorArray = new char[rows * columns];
        int counter = 0;
        for (int i = 0 ; i<columns ; i++){
            for (int j = 0 ; j<rows ; j++){
                ColumnMajorArray[counter] = array2D[j][i];
                counter++;
            }
        }
        for (char show : ColumnMajorArray){
            System.out.print(show+", ");
        }
    }
}

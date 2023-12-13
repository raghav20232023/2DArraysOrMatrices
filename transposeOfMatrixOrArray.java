package com.example5;

//problem statement
//for a given matrix n*m print its transpose

import java.util.Scanner;

public class transposeOfMatrixOrArray {

    public static void main(String[] args){

        System.out.println("program to find transpose of array/matrix : ");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows in matrix/array : ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns in matrix/array : ");
        int columns = sc.nextInt();

        int numbers [][] = new int[rows][columns];   //array definition

        // we iterate through a 2d array by using two nested for loops.

        //loop for entering elements in the 2d array by the user
        //input loop

        System.out.println("enter the elements of the 2d array/ matrix");
        for (int i = 0; i<rows; i++){   //outer loop iterates through rows
            for (int j = 0; j< columns; j++){   //inner loop iterates through columns present in a row
                //at a time
                numbers[i][j] = sc.nextInt();   //input value in the (i,j) cell in the 2d array/matrix

            }
        }

        System.out.println("the entered array/ matrix is : ");
        //output loop
        for (int i = 0; i< rows; i++){
            for (int j = 0; j<columns; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();   //cursor enters newline after printing one rows elements when
            //moving to another row
        }

//        System.out.println("The transpose of the given matrix is : ");
//        for (int i = 0; i< rows; i++){
//            for (int j = 0; j<columns; j++){
//                System.out.print(numbers[j][i] + " ");
//            }
//            System.out.println();   //cursor enters newline after printing one rows elements when
//            //moving to another row
//
//        }

        //the above approach is wrong as it would throw index out of bounds exception
        //correct approach given below:

        System.out.println("The transpose of the given matrix is : ");
        for (int j = 0; j< columns; j++){
            for (int i = 0; i<rows; i++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();   //cursor enters newline
        }

    }
}

package com.example5;

//problem statement
// create a user defined 2d array where
// size of array (rows * columns) and elements in the array
// are entered by the user

import java.util.Scanner;

public class twoDArrays1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number of rows in the 2D array : ");
        int rows = sc.nextInt();    //user enters the the size of the rows

        System.out.print("enter the number of columns in the 2D array : ");
        int columns = sc.nextInt();

        int [][] numbers = new int[rows][columns];   //2D Array definition

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
    }
}

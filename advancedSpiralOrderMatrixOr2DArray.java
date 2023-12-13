package com.example5;

//problem statement
//print the spiral order matrix as output for a given matrix of numbers

//this is a popular interview question
//algorithm to solve this problem
//we start from the top left of the matrix
//we move right then down then left then up until we traverse the entire boundary of the matrix
//after we have traversed the entire boundary of the matrix we are left with a sub -matrix
//i.e. a smaller matrix at the centre of our original matrix
// we have to repeat the same procedure with this left over sub matrix and keep on repeating
//till we are left with no sub matrices or smaller matrices.
// notice as we traverse the boundary of the matrix, after one complete clockwise traversal
// the sub matrix left has the right, left, upper and lower boundary
// at location one less than the original boundary location of bigger matrix
// so the algorithm is to dynamically shift boundaries
// i.e. update the value of left, right upper and lower limits
// by 1 as you traverse through the boundary of the matrix
// we can stop our algorithm once the top-bottom or the left-right boundaries overlap

import java.util.Scanner;

public class advancedSpiralOrderMatrixOr2DArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number of rows in the 2D array : ");
        int rows = sc.nextInt();    //user enters the the size of the rows

        System.out.print("enter the number of columns in the 2D array : ");
        int columns = sc.nextInt();

        int [][] numbers = new int[rows][columns];   //2D Array definition

        // we iterate through a 2d array by using two nested for loops.

        System.out.println("enter the elements of the 2d array/ matrix");
        //loop for entering elements in the 2d array by the user
        //input loop
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

        //algorithm in action
        //we define 4 pointers:
        int rowStart = 0;   //upper pointer
        int rowEnd = rows-1;  //lower pointer
        int columnStart = 0;    //left pointer
        int columnEnd = columns-1;   //right pointer
        // note -1 is added as maximum index is 1 less than the length of the array

        //remember the condition for algorithm to run i.e. not stop
        // we can stop our algorithm once the top-bottom or the left-right boundaries overlap
        //so

        while (rowStart < rowEnd && columnStart < columnEnd){

            //going in clockwise order starting from top left corner of matrix
            //traversing the top row first
            for (int i = columnStart; i<=columnEnd; i++){
                System.out.print(numbers[rowStart][i]+ " ");
            }
            rowStart++; //after complete traversal of top row, upper limit shifts down by 1
            //so upper limit variable i.e. rowstart will increase by 1


            //traversing the right column next
            for (int i = rowStart; i<=rowEnd; i++){
                System.out.print(numbers[i][columnEnd] + " ");
            }
            columnEnd--;    //after complete traversal of right most column, the right limit
            //shifts left by 1
            //i.e. columnend variable will decrease by 1

            //traversing the lowermost row next
            for (int i = columnEnd; i>=columnStart; i--){
                System.out.print(numbers[rowEnd][i]+" ");
            }
            rowEnd--;   //after complete traversal of lower most row, the lower limit shifts up
            //by 1 i.e. rowEnd variable will decrease by 1

            //traversing the leftmost column next
            for(int i = rowEnd; i>= rowStart; i--){
                System.out.print(numbers[i][columnStart]+ " ");
            }
            columnStart ++; //after complete traversal of leftmost column the left limit
            //shifts right by 1 i.e. the variable columnStart increases by 1

        }
    }
}



/* An array is a collection of similar data types stored in a contiguous memory location.
It’s used to store multiple values in a single variable, instead of declaring separate variables for each value.


int[] marks = {78, 85, 90, 69, 88}; // 1D array used to store the marks of eyudent


//Types of Array= 1D, 2D, 3D


Syntax:

arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
arr[3] = 40;
arr[4] = 50;


//Accessing Elements with loop in array

for(int i = 0; i < arr.length; i++) {
    System.out.println("Element at index " + i + " = " + arr[i]);
}



Real time Example:*/

public class StudentResult {
    public static void main(String[] args) {
        int[] marks = {75, 45, 60, 85, 30};  // marks of 5 subjects
        int total = 0;

        for(int i = 0; i < marks.length; i++) {
            total += marks[i];
            if(marks[i] >= 40) {
                System.out.println("Subject " + (i+1) + ": Pass");
            } else {
                System.out.println("Subject " + (i+1) + ": Fail");
            }
        }

        double average = total / (double)marks.length;
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }
}


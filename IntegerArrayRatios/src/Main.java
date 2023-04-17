import java.util.Scanner;

public class Main {

    /*Set count for ratios*/
    static int positiveCount = 0;
    static int negativeCount = 0;
    static int zeroCount = 0;

    /*Create a scanner to read input from keyboard*/
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        /*Given an array of integers, calculate the ratios
        of its elements that are positive,
        negative, and zero. Print the decimal value
        of each fraction on a new line with places after the decimal*/
        System.out.println("Array Ratios Program");

        System.out.println("Enter the desired array size: ");

        /*Set the number of elements the array will hold*/
        int arraySize = scanner.nextInt();

        /*Call the arrayRatio Function*/
        arrayRatio(arraySize);
    }

    public static void arrayRatio (int size){
        /*Initialize array and assign size*/
        int [] integerArray = new int[size];

        System.out.println("Enter Integers. Ensure one of them is a negative and one is 0");
        /*Capture and store integers into the array*/
        for (int i = 0; i<size; i++){
            integerArray[i] = scanner.nextInt();

            /*If element at [i] is greater than zero, add one to positiveCount*/
            if (integerArray[i]>0){
                positiveCount +=1;
            }
            /*If element at [i] is less than zero, add one to negativeCount*/
            else if (integerArray[i]<0){
                negativeCount +=1;

            /*If element at [i] is zero, add one to zeroCount*/
            }else {
                zeroCount +=1;
            }
        }

        /*compute and output the ratios*/
        double positiveRatio = (double) positiveCount/size;
        System.out.printf("%.6f\n", positiveRatio);
        double negativeRatio = (double) negativeCount/size;
        System.out.printf("%.6f\n",negativeRatio);
        double zeroRatio = (double) zeroCount/size;
        System.out.printf("%.6f\n",zeroRatio);

        scanner.close();
    }
}
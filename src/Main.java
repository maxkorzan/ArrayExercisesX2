import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //print string in reverse
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversedInput = "";

        for (int i = input.length(); i > 0; i--) {
            reversedInput += input.charAt(i - 1);
        }
        System.out.println(reversedInput);


    //find length of string
        int count = 0;
        for (char c : input.toCharArray()) {
            count++;
        }
        System.out.println("There are " + count + " characters in this string");


    //input 10 values, remove any duplicates
        int[] array = new int[10];
        int[] arrayClone = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a value in the array: ");
            array[i] = sc.nextInt();
            arrayClone[i] = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < arrayClone.length; j++) {
                if (array[i] == arrayClone[j] && i < j) {
                    System.out.println(array[i] + " and " + arrayClone[i] + " are duplicates");
                }
            }


        }

    //print all pairs in 2 arrays that sum to "13"
        int[] array1 = {1, 7, 6, 5, 9};
        int[] array2 = {2, 7, 6, 3, 4};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] + array2[j] == 13) {
                    System.out.printf("(%d, %d)%n", array1[i], array2[j]);
                }
            }
        }


    //input 10 values to array, output # of even and # of odd
        int[] array3 = new int[10];
        int evenTotal = 0;
        int oddTotal = 0;

        for (int i = 0; i < array3.length; i++) {
            System.out.print("Please enter a value:  ");
            array3[i] = sc.nextInt();
            //System.out.println();
        }
        //evens
        for (int num : array3) {
            if (num % 2 == 0) {
                evenTotal += 1;
            }
        }
        System.out.println("# of Evens: " + evenTotal);
        //odds
        for (int num : array3) {
            if (num % 2 != 0) {
                oddTotal += 1;
            }
        }
        System.out.println("# of Odds: " + oddTotal);
    }
}
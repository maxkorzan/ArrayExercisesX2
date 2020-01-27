import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //print string in reverse
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversedInput = "";

        for(int i=input.length(); i>0; i--) {
            reversedInput += input.charAt(i - 1);
        }
        System.out.println(reversedInput);


        //find length of string
        int count=0;
        for(char c:input.toCharArray()){
            count++;
        }
        System.out.println("There are "+count+" characters in this string");


        //input 10 values, remove any duplicates
        int[] array = new int[10];
        int[] arrayClone = new int[10];

        for(int i=0; i<array.length; i++) {
            System.out.println("Enter a value in the array: ");
            array[i] = sc.nextInt();
            arrayClone[i] = array[i];
        }

        for(int i=0; i<array.length; i++) {
            for (int j = 0; j<arrayClone.length; j++) {
                if (array[i] == arrayClone[j] && i<j) {
                    System.out.println(array[i] + " and " + arrayClone[i] + " are duplicates");
                }
            }


        }



//
//
//        for(int i=0; i<array.length; i++) {
//
//            for (int j=1; j < array.length-1; j++){
//                if(array[i]==array[j]){
//                    System.out.println(array[i]+" and "+array[j]+" are duplicates");
//                }
//            }
//        }















        //create array from string
//        String[] stringArray = new String[input.length()];
//        for(int i=0; i<stringArray.length; i++){
//            stringArray[i] = input.charAt(i));
//            System.out.println(stringArray[i]);
//        }

//
//        //convert string to chars
//        String reverseString = reverse(input);
//
//        //display reversed string
//        System.out.println(reverseString);
//
//

    }
}

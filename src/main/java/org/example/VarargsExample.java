package org.example;

public class VarargsExample {

    public static void printMessages(String... messages) {
        System.out.println("Number of messages: " + messages.length);
        for (String msg : messages) {
            System.out.print(msg + " ");
        }
        System.out.println("\n");
    }

    public static void findLargest(int... numbers){
        if (numbers.length == 0){
            System.out.println("Largest with no numbers is: " + Integer.MIN_VALUE);
        } else {
            int largest = numbers[0];
            System.out.print("Largest in ( ");
            for(int i = 0; i < numbers.length ; i++){
                if (largest < numbers[i]){
                    largest = numbers[i];
                }
                System.out.print(numbers[i] + " ");
            }
            System.out.print(") is: " + largest);
            System.out.println();
        }



    }
}
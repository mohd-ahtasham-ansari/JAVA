import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // // For loop example
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("For loop iteration: " + i);
        // }

        // // While loop example
        // int j = 0;
        // while (j < 5) {
        //     System.out.println("While loop iteration: " + j);
        //     j++;
        // }

        // // Do-while loop example
        // int k = 0;
        // do {
        //     System.out.println("Do-while loop iteration: " + k);
        //     k++;
        // } while (k < 5);

        java.util.Scanner scanner = new Scanner(System.in);


        for (int i=0;i<=3;i++){
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            
        }


    }
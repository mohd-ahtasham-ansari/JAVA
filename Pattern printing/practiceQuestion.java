import java.util.Scanner;
public class practiceQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int digit=1;
        int product =1;
        while(number!=0){
            digit = number%10;
            product = product*digit;
            number=number/10;
        }
        System.out.println(product);
    }
}

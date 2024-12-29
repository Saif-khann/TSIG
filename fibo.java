import java.util.Scanner;

public class fibo{
    public static void fibon(int n){
        if(n < 0){
            System.out.println("Enter positive number");
            return;
        }
        long first = 0, second = 1;
        for(int i = 0; i < n; i++){
            System.out.println(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = scan.nextInt();
        fibon(n);
    }
}
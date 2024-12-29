public class Main
{
    public static void main(String[] args) {
        System.out.println("Armstrong Numbers between 1 and 1000: ");
        for (int i= 1; i <= 1000; i++){
            if(armstrong(i)){
                System.out.println(i);
            }
        }
    }
    
    
    public static boolean armstrong(int n){
        int originalno = n;
        int sum = 0;
        int digitlength = Integer.toString(n).length();
        
        while (n!=0){
            int digit = n % 10;
            sum += Math.pow(digit, digitlength);
            n /= 10;
        }
        return sum == originalno;
    }
}
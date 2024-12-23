public class factorial {
    public static void main(String[] args) {
       int m = factorial(5);
       System.out.println(m); 
    }
    public static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
        
    }
}

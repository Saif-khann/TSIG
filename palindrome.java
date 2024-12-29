class Main {
    public static void palindrome(int n){
        int c = n;
        int rev = 0;
        while(n!=0){
            int digit = n % 10;
            rev = (rev * 10) + digit;
            n /= 10;
        }
        if (c == rev){
            System.out.print("This is palindrome " + rev);

        } else {
            System.out.print("This is not a palindrome "+ rev);
        }
    }

    public static void main(String[] args){
        palindrome(111);
    }
}
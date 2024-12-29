public class Main
{
    public static void main(String[] args){
        int number = 123456;
        int sum = 0;
        while(number!=0){
            sum += number%10;
            number /= 10;
        }
        System.out.println("The sum of the digits is: "+ sum);
    }
}
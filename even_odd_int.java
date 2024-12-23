import java.util.ArrayList;

public class even_odd_int {
    public static void main(String[] args) {
        even_odd_int qwerty = new even_odd_int();
        ArrayList<Integer> c = new ArrayList<>();
         c = qwerty.eo(123);
         System.out.println("even: " + c.get(0)); 
         System.out.println("odd: " + c.get(1)); 
    }
    public ArrayList<Integer> eo (int n) {
        int even = 0;
        int odd = 0;
        int r = 0; 
        while (n!=0){
            r = n%10;
            if (r % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
            n = n/10;

        }
        ArrayList<Integer> qw = new ArrayList<>();
        qw.add(even);
        qw.add(odd);
        return qw;
        
    } 
}

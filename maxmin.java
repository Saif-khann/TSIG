public class maxmin {
    public static void main(String[] args) {
        int[] junaid = {1,2,3,4,5};
        int min=junaid[0];
        int max=junaid[0];
        for (int i=0; i<junaid.length; i++){
            min = min > junaid[i] ? junaid[i] : min;
            max = max < junaid[i] ? junaid[i] : max;
        }
        System.out.println("max = "+ max + " " + "min = " + min);
    }
}

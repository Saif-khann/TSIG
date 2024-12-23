//User function Template for Java

class Solution{
    public static void main(String[] args) {
       int[] ps = new int[2]; 
       ps = get(13,9);
       System.out.println(ps[0]+ " " + ps[1]); 
    }
    static int[] get(int a,int b)
    {
       int [] sp = new int[2] ;
       a = a + b;
       b = a - b;
       a = a - b;
       sp[0]=a;
       sp[1]=b;

       return sp;
    }
    
    
}
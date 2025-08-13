public class MathUtils {
    private MathUtils(){

    }
    public static int square(int n){
        return n*n;
    }
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static boolean isPrime(int n){
        int f=0;
        if(n==0||n==1)
            return false;
        if(n==2)
            return true;
        for(int i=3;i<n;i++){
            if(n%i==0) {
                f++;
                break;
            }
        }
        if(f>0)
            return false;
        else
            return true;
    }
}

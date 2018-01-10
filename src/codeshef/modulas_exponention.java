

public class modulas_exponention {
public static void main(String[] args)
{
	int x=modulo(485810,380249,569477);
	System.out.println((char)x);
}
static int modulo(int a,int b,int c) {
    long x=1;
    long y=a;
    while(b > 0){
        if(b%2 == 1){
            x=(x*y)%c;
        }
        y = (y*y)%c; // squaring the base
        b /= 2;
    }
    return (int) x%c;
}
}

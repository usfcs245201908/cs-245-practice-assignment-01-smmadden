public class Practice01MathIterative implements Practice01Math
{
    public int fact(int n) throws Exception
    {
        if(n < 0){
            throw new Exception();
        }
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    public int fib(int n) throws Exception
    {
        if(n < 0){
            throw new Exception();
        }
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i = 0; i < n; i++){
            a = b;
            b = c;
            c = a + b;
        }
        return a;

    }
}

public class Practice01MathRecursive implements Practice01Math
{
    public int fact(int n) throws Exception
    {
        if(n < 0)
            throw new Exception();
        if(n == 1 || n == 0)
            return 1;
        return n*fact(n-1);
    }

    public int fib(int n) throws Exception
    {
        if(n < 0)
            throw new Exception();
        if(n == 0 || n == 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

}

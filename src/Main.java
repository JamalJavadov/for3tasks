class Solution {
    public int fib(int n) {

        int a =0;
        int b=1;
        int fibono=0;
        if(n==0){
            return 0;
        }
        for(int i=2;i<=n;i++){
            fibono = a+b;
            a=b;
            b=fibono;
        }
        return b;
    }
}
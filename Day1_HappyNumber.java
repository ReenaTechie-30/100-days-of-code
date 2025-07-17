class Solution {
    public boolean isHappy(int n) {
        while(n!=1&&n!=4)
        {
            n=issquare(n);

        }
        return n==1;

    }
    public int issquare(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            int rem=n%10;
            sum+=rem*rem;
            n/=10;
        }
        return sum;
    }
}

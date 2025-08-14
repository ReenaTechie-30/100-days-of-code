class Solution {
    public String largestGoodInteger(String num) 
    {
        char max='0';
        int count=0;
        char prev='#';
        boolean found=false;
        for(char a:num.toCharArray())
        {
            if(prev=='#'||prev==a)
            {
                count++;
            }
            else
            {
                count=1;
            }
            prev=a;

            if(count==3)
            {
            max=(char)Math.max((int)max,(int)a);
            found=true;
            }
        }
        if(found)
        return max+""+max+""+max;
        else
        {
            return "";
        }
        
    }
}

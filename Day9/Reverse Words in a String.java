class Solution {
    public String reverseWords(String s) {
        String[] results =s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = results.length-1;i>=0;i--)
        {
            sb.append(results[i]);
            if(i !=0)
            sb.append(" ");

        }
        return sb.toString();
        
    }
}

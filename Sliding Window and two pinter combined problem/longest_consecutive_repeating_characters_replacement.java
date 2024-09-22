public class longest_consecutive_repeating_characters_replacement 
{
    public int longest(String s,int k)
    {
        int[] count=new int[26];
        int left=0;
        int maxfreq=0;
        int maxlength=0;
        for(int right=0;right<s.length();right++)
        {
            char curr=s.charAt(right);
            count[curr-'A']++;

            maxfreq=Math.max(maxfreq,count[curr-'A']);
            int windowslength=right-left+1;

            if(windowslength-maxfreq>k)
            {
                char leftchar=s.charAt(left);
                count[leftchar-'A']--;
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
    
}

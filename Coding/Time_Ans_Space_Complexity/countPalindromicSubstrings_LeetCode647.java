public class countPalindromicSubstrings_LeetCode647 {
    public static void main(String[] args) {
        String s="nitini";
        System.out.println(CountPalindrome(s));
    }
    public static int CountPalindrome(String s) {
        int  count=0;
        
            for (int axis = 0; axis < s.length(); axis++) {
                for (int orbit = 0; orbit < s.length() && axis-orbit>=0 && axis+orbit<s.length(); orbit++) {
                    if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit)))
                    {
                        break;
                    }
                    
                        count++;
                }
            }
        
        
            for (double axis = 0.5; axis < s.length(); axis++) {
                for (double orbit = 0.5; orbit < s.length() && axis-orbit>=0 && axis+orbit<s.length(); orbit++) {
                    if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit)))
                    {
                        break;
                    }
                    else
                        count++;
                }
            }
        
        return count;
        
    }
}

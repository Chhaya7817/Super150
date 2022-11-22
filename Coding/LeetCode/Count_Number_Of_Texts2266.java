public class Count_Number_Of_Texts2266 {
    public static void main(String[] args) {
        String pressedKeys="335566";
        countTexts(pressedKeys);
        System.out.println(count);
    }
    public static int countTexts(String pressedKeys) {
  
        String[] keys={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int[] digitCount=new int[10];
        for(int i=0;i<pressedKeys.length();i++)
        {
            digitCount[(int)(pressedKeys.charAt(i))-48]++;
            
        }
        // for(int i=0;i<digitCount.length;i++)
        //     System.out.println(digitCount[i]);
        combination(pressedKeys,"",keys,digitCount);
        return count%100000007;
    }
    public static int count=0;
    public static void combination(String digits,String ans,String[] keys,int[] digitCount)
    {
        if(digits.length()==0)
        {
            count++;
            System.out.println(ans);
            return;
        }
        int d=(int)(digits.charAt(0)) -48;
        for(int i=0;i<keys[d].length() ;i++)
        {
            if(digitCount[d]-i>0 )
            {
                digitCount[d]=digitCount[d]-(i+1) ;

                combination(digits.substring(i+1),ans+keys[d].charAt(i),keys,digitCount);

                digitCount[d]=digitCount[d]+i+1 ;

            }

        }
        
    }
}

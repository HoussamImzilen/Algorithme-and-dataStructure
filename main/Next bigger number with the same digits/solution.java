
import java.util.Arrays;
public class Main
{
    public static long nextBiggerNumber(long n)
    {
      //change the string into sequance of character 
      char [] s = String.valueOf(n).toCharArray();
      // strat the first loop from i = s.length -1 
      for(int i = s.length - 2; i >= 0; i--){
        // strat the second loop from j = s.length -1 
         for (int j = s.length-1; j > i; j--){
           // try to find a number greather than the next starting from the left  and swip that number with the smaller Number greather than that Number
           // that's why we need the second loop
           if(s[i] < s[j]){
             char tmp = s[i];
             s[i] = s[j];
             s[j] = tmp;
             //Now we have a number bigger than the first but not the next bigger we need to sort in the ascending order to find the Next Smaller Number
             Arrays.sort(s, i+1, s.length);
             return Long.valueOf(String.valueOf(s));
           }
         }
      }
      return -1;
    }
}

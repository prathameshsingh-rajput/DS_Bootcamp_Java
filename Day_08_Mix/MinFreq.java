public class MinFreq{
    public static char minFreqChar(String s){
        int arr[] = new int[26];

        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                arr[s.charAt(i)-65]++;
            }else if(s.charAt(i) >= 97 && s.charAt(i) <= 122) { // Lowercase letters
                arr[s.charAt(i) - 65]++;
            }
        }

        int minFreq = Integer.MAX_VALUE;
        char result = ' ';

        for(int i = 0; i < arr.length; ++i){
            if(arr[i] > 0 && minFreq > arr[i]){
                minFreq = arr[i];
                result = (char)(i+65);
            }
        }

        return result;  
    }
    public static void main(String[]a){
        char c = MinFreq.minFreqChar("aaabbcccccccccggcccccccdd");
        System.out.println(c);
    }
}
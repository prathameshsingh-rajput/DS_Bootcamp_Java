public class CheckString{
    public static boolean check(String s1, String s2){
        if(s1 == null || s2 == null || s1.length() <= 0 || s2.length() <= 0 || s1.length() != s2.length()){
            return false;
        }

        for(int i = 0; i < s1.length(); ++i){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if (ch1 >= 65 && ch1 <= 90) {
                ch1 += 32;  
            }
            if (ch2 >= 65 && ch2 <= 90) {
                ch2 += 32;  
            }

            if (ch1 != ch2) {
                return false;
            }
        }

        return true;
    }
    public static void main (String[]a){
        String s1 = new String("Mayur");
        String s2 = new String("mayur");
        System.out.println(CheckString.check(s1, s2));
    }
}
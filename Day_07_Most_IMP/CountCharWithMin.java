import java.util.*;

public class CountCharWithMin{
	public static int countMinChar(String s){
		Map<Character, Integer> map = new LinkedHashMap<>();

		for(int i = 0; i < s.length(); ++i){
			char ch = s.charAt(i);

			map.put(ch, map.getOrDefault(ch, 0)+1);
		}

		int sum = 0;

		for(Map.Entry<Character, Integer> result : map.entrySet()){
			if(result.getValue() < 2){
				sum += 2;
			}else{
				sum += result.getValue();
			}
		}

		return sum;
	}
	public static void main(String[]a){
	Scanner in = new Scanner(System.in);

	String s = in.next();

	System.out.println("Result: "+countMinChar(s));
}
}
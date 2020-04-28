import java.util.HashSet;
import java.util.Set;

public class UniqueStringUsingArray {
	
	public boolean isUnique(String input) {
		
		//Using ASCII character set. For Unicode, it will become 256 instead of 128
		boolean[] charArray = new boolean[128];
		
		//Exit condition if the length of string exceeds number of characters in the character set used
		if(input.length() > 128)
			return false;
		for(char c : input.toCharArray()) {
			if(!charArray[c])
				charArray[c] = true;
			else
				return false;
		}
		return true;
	}
}

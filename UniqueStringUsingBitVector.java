import java.util.HashSet;
import java.util.Set;

public class UniqueStringUsingBitVector {
	
	public  boolean isUnique(String input) {
		
		if(input.length() > 26 )
			return false;
		
		int checker = 0;
		for(char c : input.toCharArray()) {
			int charBitVector = 1 << (c-'a');
			if((checker & charBitVector) > 0 )
				return false;
			checker = checker | charBitVector;	
		}
		return true;
	}
}

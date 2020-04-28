import java.util.HashSet;
import java.util.Set;

public class UniqueStringUsingSet {
	
	public boolean isUnique(String input) {
		Set<Character> s = new HashSet<Character>();
		for(char c : input.toCharArray()) {
			if(s.contains(c))
				return false;
			else
				s.add(c);
		}
		return true;
	}
}

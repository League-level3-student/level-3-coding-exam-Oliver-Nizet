import java.util.ArrayList;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		int p = 0;
		int e = 0;
		for (int i = 0; i < votes.size(); i++) {
			if (votes.get(i).equalsIgnoreCase("pope francis")) {
				p++;
			} else if (votes.get(i).equalsIgnoreCase("edward snowden")) {
				e++;
			}
		}
		if (p > e) {
			return "pope francis";
		} else if (e > p) {
			return "edward snowden";
		} else if (p==e) {
			return "TIE";
		} 
		return null;
	}

}

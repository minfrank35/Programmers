package beginner;

public class PToTheY {
	boolean solution(String s) {
        boolean answer = false;
        int countY = 0;
        int countP = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == 'y') {
        		countY++;
        	} else if(s.charAt(i) =='p') {
        		countP++;
        	} 
        }
        
        if(countY == countP) {
        	answer = true;
        }

        return answer;
    }
}

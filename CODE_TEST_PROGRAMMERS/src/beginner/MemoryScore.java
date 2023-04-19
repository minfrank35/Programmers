package beginner;

import java.util.HashMap;
import java.util.Map;

public class MemoryScore {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		HashMap<String,Integer> scoreMap = new HashMap<String,Integer>();
		
		for(int i = 0; i < name.length; i++) {
			scoreMap.put(name[i], yearning[i]);
		}
		
		
        int[] answer = new int[photo.length];
        
        for(int i = 0; i<photo.length; i++) {
        	for(int j = 0; j< photo[i].length; j++) {
        		if(scoreMap.get(photo[i][j]) != null) {
        			answer[i] = answer[i] + scoreMap.get(photo[i][j]);
        		}
        	}
        }
        
        return answer;
    }
}
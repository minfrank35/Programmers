package beginner;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RunCompetition {
	public String[] solution(String[] players, String[] callings) {
		HashMap<String, Integer> playersMap = new HashMap();
		String[] answer = new String[players.length];
		//해쉬맵에 인덱스 정보가 있어요
		for(int i = 0; i < players.length; i++) {
			playersMap.put(players[i], i);
		}
		
		for(int i = 0; i< callings.length; i++) {
			String changedString = players[playersMap.get(callings[i]) - 1];
			change(playersMap.get(callings[i]),playersMap.get(callings[i])-1, players);
			playersMap.replace(changedString, playersMap.get(changedString) + 1);
			playersMap.replace(callings[i], playersMap.get(callings[i]) - 1);
		}
		
		Iterator<Entry<String, Integer>> entry = playersMap.entrySet().iterator();
		while(entry.hasNext()) {
	        Entry<String, Integer> element = entry.next();
	        answer[element.getValue()] = element.getKey();
		}
		
		
		
//        for(String calling : callings) {
//        	int findedIndex = find(calling, players);
//        	change(findedIndex, findedIndex - 1, players);
//        }
        return answer;
    }
	
	/**
	 * @param String 값
	 * @return index
	 */
	public int find(String calling, String[] players) {
		int findedIndex = -100;
		
		for(int i = 1; i < players.length; i++) {
			if(players[i].equals(calling)) {
				findedIndex = i;
				break;
			}
		}
		
		return findedIndex;
	}
	
	public void change(int changeIndex, int changedIndex, String[] players) {
		String temp = players[changedIndex];
		players[changedIndex] = players[changeIndex];
		players[changeIndex] = temp;
	}
}
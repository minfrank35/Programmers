package beginner;

import java.util.HashMap;

//무지의 이메일 신고
class MuziEmailReport {
	public int[] solution(String[] id_list, String[] report, int k) {
		HashMap<String, Integer> hashmap = new HashMap<>();
      int[] answer = new int[id_list.length];

      
		for(int i = 0; i< id_list.length; i++) {
			hashmap.put(id_list[i], 0);
		}
		
      for(int i = 0; i< report.length; i++) {
      	String[] temp = report[i].split(" ");
      	int number = hashmap.get(temp[1]);
      	hashmap.replace(temp[1], ++number);
      }
      
      return answer;
  }
}

package beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

//카카오 테스트
class FailRate {
  public int[] solution(int N, int[] stages) {
      //스테이지 통과 인원수 배열을 하나 만든다
      int[] stageReach = new int[N];

      System.out.println(Arrays.toString(stageReach));
      //배열에다가 계속 추가한다.
  	for(int j = 0; j< stages.length; j++) {
  		for(int t = 0; t<stages[j]; t++) {
  			if(t < N) {
  				stageReach[t]++;
  			}
  	        System.out.println(Arrays.toString(stageReach));
  		}
  	}
      
      //스테이지 통과인원수 배열이 나온다
      System.out.println(Arrays.toString(stageReach));
      //스테이지에 머무르고 사람 수 배열을 하나 만든다.
      int[] stageStay = new int[N];
      //배열에다가 추가한다.
      for(int i = 0; i< stages.length; i++) {
      	if(stages[i] < N) {
          	stageStay[stages[i]-1]++;
      	}
          System.out.println(Arrays.toString(stageStay));
      }
      //HashMap을 만들어서 각 스테이지별 실패율을 저장한다.
      HashMap<Integer, Integer> hashMap = new HashMap<>();
      for(int i = 1; i<= N; i++) {
      	hashMap.put(i, stageStay[i-1]/stageReach[i-1]);
      }
      
      List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>((Collection<? extends Entry<String, Integer>>) hashMap.entrySet());

		// 비교함수 Comparator를 사용하여 오름차순으로 정렬
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			// compare로 값을 비교
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				// 오름 차순 정렬
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});        
      
      //hashmap을 sort한다.
      /*for(int i : stages) {
      	if(i != N+1) {
          	stageFailArr[i]++;
      	}
      }
      
      HashMap hashMap = new HashMap();
      
      for(int i = 1; i<= N; i++) {
      	hashMap.put(i, )
      }
      
      
     */
      int[] answer = new int[N];
      for(int i = 0; i< answer.length; i++) {
      	answer[i] = hashMap.get(i+1);
      }
      System.out.println(Arrays.toString(answer));

      return answer;
  }
}
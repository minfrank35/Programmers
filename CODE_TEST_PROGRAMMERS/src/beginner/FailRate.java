package beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

//īī�� �׽�Ʈ
class FailRate {
  public int[] solution(int N, int[] stages) {
      //�������� ��� �ο��� �迭�� �ϳ� �����
      int[] stageReach = new int[N];

      System.out.println(Arrays.toString(stageReach));
      //�迭���ٰ� ��� �߰��Ѵ�.
  	for(int j = 0; j< stages.length; j++) {
  		for(int t = 0; t<stages[j]; t++) {
  			if(t < N) {
  				stageReach[t]++;
  			}
  	        System.out.println(Arrays.toString(stageReach));
  		}
  	}
      
      //�������� ����ο��� �迭�� ���´�
      System.out.println(Arrays.toString(stageReach));
      //���������� �ӹ����� ��� �� �迭�� �ϳ� �����.
      int[] stageStay = new int[N];
      //�迭���ٰ� �߰��Ѵ�.
      for(int i = 0; i< stages.length; i++) {
      	if(stages[i] < N) {
          	stageStay[stages[i]-1]++;
      	}
          System.out.println(Arrays.toString(stageStay));
      }
      //HashMap�� ���� �� ���������� �������� �����Ѵ�.
      HashMap<Integer, Integer> hashMap = new HashMap<>();
      for(int i = 1; i<= N; i++) {
      	hashMap.put(i, stageStay[i-1]/stageReach[i-1]);
      }
      
      List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>((Collection<? extends Entry<String, Integer>>) hashMap.entrySet());

		// ���Լ� Comparator�� ����Ͽ� ������������ ����
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			// compare�� ���� ��
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				// ���� ���� ����
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});        
      
      //hashmap�� sort�Ѵ�.
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
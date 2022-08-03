package beginner;

import java.util.Arrays;
import java.util.HashSet;

//두개 뽑아서 더하기 
class PickTwoAndPlus {
  public int[] solution(int[] numbers) {
  	HashSet<Integer> set = new HashSet<>();
  		
  	for(int i = 0; i < numbers.length - 1; i++) {
  		for(int j = i + 1; j < numbers.length; j++) {
  			set.add(numbers[i]+numbers[j]);
  		}
  	}
  	
  	Integer[] answer;
  	answer = set.toArray(new Integer[0]);
  	
  	
  	for(int i = 0; i < answer.length - 1; i++) {
			int min_index = i;	 
			for(int j = i + 1; j < answer.length; j++) {
				if(answer[j] < answer[min_index]) {
					min_index = j;
				}
			}
			swap(answer, min_index, i);
		}
  
       
      return Arrays.stream(answer).mapToInt(Integer::intValue).toArray();
  }
  
  private void swap(Integer[] answer, int i, int j) {
		int temp = answer[i];
		answer[i] = answer[j];
		answer[j] = temp;
	}
}

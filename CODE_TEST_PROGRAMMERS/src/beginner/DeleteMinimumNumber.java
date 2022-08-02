package beginner;

import java.math.BigInteger;
import java.util.Arrays;

//배열 최소값 제거 
class DeleteMinimumNumber {
 public int[] solution(int[] arr) {
     int[] answer;
     int minIndex = 0;
     int min = arr[0];
 	if(arr.length > 1) {
 		for(int i = 0; i < arr.length; i++) {
 			if(min > arr[i]) {
 				min = arr[i];
 				minIndex = i;
 			}
 		}
 		System.out.println(minIndex);

 		answer = new int[arr.length-1];
 		for(int i = 0; i < arr.length; i++) {
 			if(i > minIndex) {
 				answer[i-1] = arr[i];
 			} else if(i == minIndex) {
 				
 			}else {
     			answer[i] = arr[i];
 			}
 		}
 		System.out.println(Arrays.toString(answer));
 		return answer;
 		
 	} else {
 		answer = new int[1];
 		answer[0] = -1;
         return answer;
 	}
 	
 	
 }
 
 
}
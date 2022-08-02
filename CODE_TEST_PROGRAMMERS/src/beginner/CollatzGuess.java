package beginner;

import java.util.HashMap;

//콜라츠의 추측
class CollatzGuess {
 HashMap hashmap = new HashMap<Integer, Integer>();

 public int solution(int num) {
     int count = 0;
     int numtemp = num;
     
     for(;;) {
     	if(memoization(num) == 0) {
     		if(num % 2 == 0) {
         		num /= 2;
         	} else if(num % 2 == 1) {
         		num = num * 3 + 1;
         	}

     		count++;
     		
         	if(num== 1) {
         		hashmap.put(numtemp, count);
         		break;
         	} 
         	
         	if(count == 500) {
         		count = -1;
     			break;
     		}
         
     	} else {
     		count = memoization(num);
     	}        	
     }
     return count;
 }
 
 int memoization(int num) {
		if(hashmap.containsKey(num)) {
			return (int) hashmap.get(num);
		} else {
			return 0;
		}
	}
 
 
}



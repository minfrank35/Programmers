package beginner;

import java.util.HashMap;

//네오와 프로도의 영어숫자게임
class NeoAndProdoEnglishNumberGame {
  public int solution(String s) {  	
  	final HashMap<String, Integer> numberEnglishMap = new HashMap<>();
  	numberEnglishMap.put("zero", 1);
  	numberEnglishMap.put("one", 2);
  	numberEnglishMap.put("two", 3);
  	numberEnglishMap.put("three", 4);
  	numberEnglishMap.put("four", 5);
  	numberEnglishMap.put("five", 6);
  	numberEnglishMap.put("six", 7);
  	numberEnglishMap.put("seven", 8);
  	numberEnglishMap.put("eight", 9);
  	numberEnglishMap.put("nine", 10);

		StringBuilder sb = new StringBuilder();

  	//string 배열에서 정수가 나올때까지 돌리면서 stringbuilder에 그동안의 값을 저장하고 치환
  	for(int i = 0; i < s.length(); i++) {
  		
  		if(Character.digit(s.charAt(i), i) > 0) {
  			int changedNumber = numberEnglishMap.get(sb.toString());
  			s = changedNumber + s.substring(i, s.length());
  			sb.setLength(0);
  		} else {
  			sb.append(s.charAt(i));
  		}
  	}
  	
  	if(sb.length() != 0) {
			int changedNumber = numberEnglishMap.get(sb.toString());
			s = changedNumber + s.substring(s.indexOf(sb.toString()), s.length());
  	}
      return Integer.parseInt(s);
  }
}
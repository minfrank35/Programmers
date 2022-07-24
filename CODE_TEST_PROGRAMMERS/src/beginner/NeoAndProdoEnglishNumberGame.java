package beginner;

import java.util.HashMap;

//�׿��� ���ε��� ������ڰ���
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

  	//string �迭���� ������ ���ö����� �����鼭 stringbuilder�� �׵����� ���� �����ϰ� ġȯ
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
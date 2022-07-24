package beginner;

import java.util.HashMap;

//�׿��� ���ε��� ������ڰ���
class NeoAndProdoEnglishNumberGame {
  public int solution(String s) {  	
  	final HashMap<String, Integer> numberEnglishMap = new HashMap<>();
  	numberEnglishMap.put("zero", 0);
  	numberEnglishMap.put("one", 1);
  	numberEnglishMap.put("two", 2);
  	numberEnglishMap.put("three", 3);
  	numberEnglishMap.put("four", 4);
  	numberEnglishMap.put("five", 5);
  	numberEnglishMap.put("six", 6);
  	numberEnglishMap.put("seven", 7);
  	numberEnglishMap.put("eight", 8);
  	numberEnglishMap.put("nine", 9);

	StringBuilder sb = new StringBuilder();

	String temps = "";
  	//string �迭���� ������ ���ö����� �����鼭 stringbuilder�� �׵����� ���� �����ϰ� ġȯ
  	for(int i = 0; i < s.length(); i++) {
  		if(Character.isDigit(s.charAt(i))) {
  			temps += s.charAt(i);
  		} else {
  			sb.append(s.charAt(i));
  			if(sb.toString() != null && sb.toString() != "") {
  				if(numberEnglishMap.containsKey(sb.toString())) {
  	  				int changedNumber = numberEnglishMap.get(sb.toString());
  	  	  			temps += changedNumber;
  	  	  			sb.setLength(0);
  				} 
  			}
  		}
  		
  
  	}
  	
      return Integer.parseInt(temps);
  }
}
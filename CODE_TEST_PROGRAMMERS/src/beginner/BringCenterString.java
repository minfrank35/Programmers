package beginner;

//string 가운데 문자 추출 하
class BringCenterString {
  public String solution(String s) {
  	
  	String answer = "";
      
      //짝수일때
      if(s.length() % 2 == 0) {
          answer = s.substring(s.length()/2 - 1, s.length()/2 + 1);
      } else { // 홀수일때
          answer = String.valueOf(s.charAt(s.length()/2));
      }     

      return answer;	
  }
}
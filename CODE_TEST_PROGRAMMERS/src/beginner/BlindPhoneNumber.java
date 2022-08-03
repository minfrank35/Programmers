package beginner;

//핸드폰 번호 가리기
public class BlindPhoneNumber {
	public String solution(String phone_number) {
        String answer = "";
        
        int temp = phone_number.length() - 4;
        
        for(int i = 0; i < temp; i++) {
            answer+="*";
        }
        
        answer+= phone_number.substring(temp,phone_number.length());
        
        return answer;
    }
}

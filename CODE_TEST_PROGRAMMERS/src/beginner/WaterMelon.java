package beginner;

public class WaterMelon {
    public String solution(int n) {
        String answer = "";
        for(int i = 0; i< n; i++ ) {
        	if(i% 2 == 0) {
	        	answer += "��";
        	} else {
	        	answer += "��";
        	}
        }
        return answer;
    }
}
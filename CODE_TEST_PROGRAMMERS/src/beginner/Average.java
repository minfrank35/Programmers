package beginner;

//Æò±Õ±¸ÇÏ±â
public class Average {
	public double solution(int[] arr) {
        double answer = 0;
        for(int i : arr) {
        	answer += i;
        }
        return answer/arr.length;
    }
}

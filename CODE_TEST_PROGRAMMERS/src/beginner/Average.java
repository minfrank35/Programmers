package beginner;

//��ձ��ϱ�
public class Average {
	public double solution(int[] arr) {
        double answer = 0;
        for(int i : arr) {
        	answer += i;
        }
        return answer/arr.length;
    }
}

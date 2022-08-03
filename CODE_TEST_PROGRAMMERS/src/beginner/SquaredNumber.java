package beginner;

//정수 제곱근 판별
public class SquaredNumber {
	public long solution(long n) {
		long sqrt = -1;
		if(Math.sqrt(n) % 1 == 0) {
	         sqrt = (long) Math.sqrt(n);
	         return (sqrt + 1) * (sqrt + 1);
		} 
		
		return sqrt;
        
        
    }
}

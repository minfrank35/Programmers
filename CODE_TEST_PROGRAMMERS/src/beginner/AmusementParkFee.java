package beginner;

import java.math.BigInteger;

//놀이동산 요금 계산
class AmusementParkFee {
 public long solution(int price, int money, int count) {
 	long answer = -1;
     BigInteger moneytemp = new BigInteger(String.valueOf(money));;
     BigInteger count2 = new BigInteger(String.valueOf(count));
     BigInteger price2 = new BigInteger(String.valueOf(price));
     BigInteger temp = count2.multiply(price2.add(price2.multiply(count2))).divide(new BigInteger("2")) ;
     
     
     /*if(moneytemp - temp < 0) {
     	answer = - ( moneytemp - temp);
     } else {
     	answer = 0;
     }*/
     
     return answer;
 }
}
package beginner;

import java.util.Scanner;

//직사각형 별찍기
class RectangleStarPrint {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      for(int t = 0; t < b; t++) {
      	for(int i = 0; i < a; i++) {
          	System.out.print("*");
          }
      	System.out.println();
      }
  }
}

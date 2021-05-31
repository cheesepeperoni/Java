package co.yedam.app.baseball;

import java.util.Scanner;

/* 작성자: 백명진 
 * 수정 예정
 * 임의의 수 3개
 * 사용자 수 입력
 * 스트라이크, 볼 카운터
 */
public class BaseballApp {

   Scanner scanner = new Scanner(System.in);

   int s;
   int b;
   int c1, c2, c3;
   int u1, u2, u3;

   void makeRnd() {
      c1 = (int) Math.random()*9+1;
      c2 = (int) Math.random()*9+1;
      c3 = (int) Math.random()*9+1;

   }

   void input() {
      System.out.println("첫번째 숫자를 입력하세요:");
      u1 = scanner.nextInt();
      System.out.println("두번째 숫자를 입력하세요:");
      u2 = scanner.nextInt();
      System.out.println("세번째 숫자를 입력하세요:");
      u3 = scanner.nextInt();
   }

   void count() {
      // s,b 카운터
      if (c1 == u1) {
         s = s + 1;
      } else if (c1 == u2 | c1 == u3) {
         b = b + 1;
      }
      if (c2 == u2) {
         s = s + 1;
      } else if (c2 == u1 | c2 == u3) {
         b = b + 1;
      }
      if (c3 == u3) {
         s = s + 1;
      } else if (c3 == u1 | c3 == u2) {
         b = b + 1;
      }
   }

   void start() {
      makeRnd();
      while (s < 3) {
         s = b = 0;
         input();
         count();
         System.out.println("스트라이크는 :"+s+"볼은"+b);
        
      }
      System.out.println("정답!!!");
   }
}
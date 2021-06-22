package phoebeBaekJoon;

import java.util.Scanner;

public class BaekJoon2839 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int sugar = scn.nextInt();
        int five = 0;
        int three = 0;
        
        
        while(sugar%5!=0&&sugar>=0){
        	sugar-=3;
            three++;
        }
        if(sugar<0){
            System.out.println(-1);
        }
        else{
            five = sugar/5;
            System.out.println(five+three);     
            scn.close();
        }  
    }
}
package edu.wctc;

import java.util.Scanner;

public class Main {
	public int scorecalc(int a, int b){
		int sum = a+b;
		return sum;
	}
    public static void main(String[] args) {
    String[] op1={"Mild","Tea","Breakfast","Summer","Paper"};
    String[] op2={"Spicy","Coffee","Brunch","Winter","Plastic"};
	System.out.println("1 is to the left and 0 is to the right");
	Scanner sc= new Scanner(System.in);
	int score=0;
	Main obj= new Main();
	for(int x=0;x<op1.length;x++) {
		System.out.println(op1[x] + " or " + op2[x]);
		int a = sc.nextInt();
		score =obj.scorecalc(score, a);
	}
	if(score<3){
		System.out.println("You prefer life to be calm and organized");
	}
	else if(score>3){
		System.out.println("You prefer life to be spontaneous and active");
	}
	else{
		System.out.println("You prefer a good balance in life.");
	}
    }
}

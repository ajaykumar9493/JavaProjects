package com.learing.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Mani_ChoclatePuzzle {


	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<3;i++) {
			Scanner ab=new Scanner(System.in);
			System.out.println(">> Enter number :");
			list.add(ab.nextInt());
		}
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		int first=diff(list.get(0),list.get(1));
	
		if(first == 0) {
			System.out.println(">> Total days : "+list.get(0));
		}else if(first == 1) {
			if(list.get(2)>=1) {
				System.out.println(">> Total days : "+(list.get(1)+first));
			}else {
				System.out.println(">> Total days : "+list.get(1));
			}
		}else {
			if(first>list.get(2)) {
				System.out.println(">> Total days : "+(list.get(2)+list.get(1)));
			}else {
				System.out.println(">> Total days : "+(first+list.get(1)));
				
			}
		}
	}

	private static int diff(int a, int b) {		
	return a-b;
	}
}

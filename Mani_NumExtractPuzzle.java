package com.learing.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Mani_NumExtractPuzzle {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(">> Eneter the Sentence :");
		ArrayList<Integer> num=new ArrayList<Integer>();
		String str=sc.nextLine();
		String numstr=returnnumonly(str);
		if(numstr == "-1") {
			System.out.println(">> No Numbers in given String ");
		}else {
			String[] strval=numstr.split(" ");
			int sum=0;
			for(String a:strval) {
				sum=sum+Integer.parseInt(a);
			}
			System.out.println(">> Sum  :"+sum);
			System.out.println(">> Average :"+(sum/strval.length));
		}
	}

	private static String returnnumonly(String indnum) {
		
		indnum= indnum.replaceAll("[^0-9]", " ");
		indnum= indnum.replaceAll(" +", " ");
		indnum= indnum.trim();
		System.out.println(">>  "+indnum);
		if(indnum == "") {
			return "-1";
		}else {
			return indnum;
		}
	}

}

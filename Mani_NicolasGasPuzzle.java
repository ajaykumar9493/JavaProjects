package com.learing.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Mani_NicolasGasPuzzle {

	public static void main(String[] args) {

		System.out.println(">> Enter the Number of Tests : ");
		Scanner sc= new Scanner (System.in);

		ArrayList<Integer> result = new ArrayList<>();		
		int numTests = sc.nextInt();
		for(int i =0;i<numTests;i++) {
			HashMap<Integer,Integer> map = new HashMap<>();
			Map<Integer,Integer> sortedmap = new HashMap<>();
			System.out.println(">> Enter N value :");
			int N = sc.nextInt();
			System.out.println(">> Enter P value :");
			int P = sc.nextInt();
			System.out.println(">> Enter K value :");
			int K = sc.nextInt();

			map=gettheValIndices(N,K);
			sortedmap=sortByValue(map);
			//			System.out.println(map);

//			System.out.println(">> Sorted Map : "+ sortedmap);
			Set<Integer> aa=sortedmap.keySet();
			int days=1;
			for(Integer a: aa) {
				if(a==P) {
					//	        		System.out.println(">> NUmber of days : "+days);
					result.add(days);
				}
				days++;
			}
		}
		for(Integer ab:result) {
			System.out.println(ab);
		}
	}

	private static HashMap<Integer, Integer> gettheValIndices(int n,int k) {

		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++) {
			int val=i%k;
			map.put(i, val);
		}

//		System.out.println(">> Unsorted Map : " + map);

		//		System.out.println(">> Sorted Map : " + map);

		return map;
	}

    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
 
}

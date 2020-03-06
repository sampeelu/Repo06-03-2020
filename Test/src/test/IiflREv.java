package test;

import java.util.Arrays;
public class IiflREv {
	public static void main(String[] args) {
		String str = "Write a code to reverse its words. Reverse sentence order if full stop";
		String []spt = str.split("\\.");
		for(int i=0;i<spt.length;i++){
			spt[i] = revREcursion(spt[i]);
		}
		for(int i=0;i<spt.length;i++){
			if(i==spt.length-1){
				System.out.print(spt[i]);
			}else{
				System.out.print(spt[i]+". ");
			}
		}
	}
	public static String revREcursion(String str){
		
		String[] str1 = str.split(" ");
		String temp="";
		for(int i=str1.length-1;i>=0;i--){
			temp = temp+str1[i]+" "; 
		}
		return temp;
	}
}

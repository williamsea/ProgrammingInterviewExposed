package Recursion;

import java.io.Console;

public class CombinationOfString {
	public static void main(String[] args){
		String str = "wxyz";
		combine(str);
	}
	
	static void combine( String str ){
		int length = str.length();
		char[] instr = str.toCharArray();
		StringBuilder outstr = new StringBuilder();
		doCombine( instr, outstr, length, 0, 0 );
	}
	static void doCombine( char[] instr, StringBuilder outstr, int length,
				   int level, int start ){
		for( int i = start; i < length; i++ ){
			outstr.append( instr[i] );
			System.out.println(outstr);
			if( i < length - 1 ){
				doCombine( instr, outstr, length, level + 1, i + 1 );
			}
			outstr.deleteCharAt(outstr.length()-1);
		}
	}
}

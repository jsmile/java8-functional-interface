package com.jsmile.lumda;

import java.util.function.IntBinaryOperator;

/**
 *  Operator 함수기능 인터페이스
 *  - 매개 변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있음.
 *  - 매개값을 이용해서 연산을 수행한 후 동일한 타입으로 리턴값을 제공하는 역할
 * */
public class OperatorExam
{
	private static int[] scores = {100, 92, 81, 78, 88, 96, 55, 94};
	
	public static int maxOrMin( IntBinaryOperator _operator ) 
	{
		int result = scores[ 0 ];
		
		for( int score : scores ) 
		{
			result = _operator.applyAsInt( result, score );
		}
		
		return result;
	}
	
	
	public static void main( String[] _args ) 
	{
		
		int max = maxOrMin( ( a, b ) -> 
		{ 
			if( a > b ) { return a;}
			else { return b;}
		} );
		System.out.println( "최대값 : " + max );
		
		int min = maxOrMin( ( a, b ) -> 
		{
			if( a < b ) return a;
			else return b;
		} );
		System.out.println( "최소값 : " + min );
		
	}
	
}

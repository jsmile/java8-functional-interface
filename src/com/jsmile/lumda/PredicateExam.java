package com.jsmile.lumda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *  Predicate 함수기능 인터페이스
 *  - 매개 변수와 boolean 리턴값이 있는 testXXX() 메소드를 가지고 있음.
 *  - 매개값을 조사해서 true 또는 false를 리턴함.
 * */
public class PredicateExam
{
	private static List<Student> list = Arrays.asList(
      new Student("Martin", 80, 90, "Male"),    
      new Student("Jolie", 74, 88, "Female"),    
      new Student("Sophie", 66, 100, "Female"),    
      new Student("Pierre", 100, 78, "Male"),    
      new Student("anne", 80, 90, "Female"),    
      new Student("Paul", 42, 91, "Male"),    
      new Student("cristianne", 99, 100, "Female"),    
      new Student("Mcg", 100, 90, "Male")    
  );
	
	public static double[] avg( Predicate<Student> _predicate ) 
	{
		int count = 0, englishSum = 0, mathSum = 0; 
		
		for( Student std : list ) 
		{
			if( _predicate.test( std ) ) 
			{
				count++;
				englishSum += std.getEnglishScore();
				mathSum += std.getMathScore();
			}
		}
		
		double avg[] = { ( englishSum / count ), ( mathSum / count ) };
		
		return avg;
	} 
	
	
	public static void main( String[] args )
	{
		double[] maleAvg = avg( t -> t.getSex().equals( "Male" ) );
		System.out.println( "남자 평균점수( 영어, 수학 ) : " );
		
		for( double avg : maleAvg ) 
		{
			System.out.print( avg + " " );
		}
		System.out.println( "###################" );
		
		double[] femaleAvg = avg( t -> t.getSex().equals( "Female" ) );
		System.out.println( "여자 평균점수( 영어, 수학 )" );
		
		for( double avg : femaleAvg ) 
		{
			System.out.print( avg + " " );
		}

	}

}

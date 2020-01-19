package com.jsmile.lumda;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;


/**
 *  Function 함수기능 인터페이스
 *  - 매개값과 리턴값이 있는 applyXXX() 메소드
 *  - 매개값을 리턴값으로 매핑하는 역할
 * */
public class FunctionExam2
{

	private static List<Student> list = Arrays.asList(
      new Student("Jolie", 100, 89),
      new Student("Martin", 77, 94),
      new Student("Pierre", 49, 100),
      new Student("Paul", 80, 78)
  );
	
	
	public static double avg( ToIntFunction<Student> _toIntFunction ) 
	{
		int sum = 0;		
		for( Student std : list ) 
		{
			sum += _toIntFunction.applyAsInt( std );
		}
		
		double avg = (double)( sum / list.size() );
		
		return avg;
	}
	
	
	public static void main( String[] args )
	{
		
		double englishAvg = avg( s -> s.getEnglishScore() );
		System.out.println( englishAvg );
		
		double mathAvg = avg( s -> s.getMathScore() );
		System.out.println( mathAvg );

	}

}

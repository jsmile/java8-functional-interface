package com.jsmile.lumda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;


/**
 *  Function 함수기능 인터페이스
 *  - 매개값과 리턴값이 있는 applyXXX() 메소드
 *  - 매개값을 리턴값으로 매핑하는 역할
 * */
public class FunctionExam1
{

	private static List<Student> list = Arrays.asList( new Student( "Jackie", 90, 65 ),
			new Student( "Jolie", 100, 100 ) );

	// Student 를 String 으로 반환하도록 하는 Function 인터페이스를 파라메터로 사용
	public static void printString( Function<Student, String> function )
	{
		// list 를 가져와서 for 문을 돌린다.
		for ( Student std : list ) {
			System.out.print( function.apply( std ) + " " );
		}
		System.out.println();
	}

	// Student 를 int 로 반환하도록 하는 Function 인터페이스를 파라메터로 사용
	public static void printInt( ToIntFunction<Student> function )
	{

		for ( Student std : list ) {
			System.out.print( function.applyAsInt( std ) + " " );
		}
		System.out.println();

	}

	public static void main( String[] args )
	{
		System.out.println( "학생 이름: " );
		printString( t -> t.getName() );			// list 의 for 문을 돌릴 때 apply() 를 t.getName() 으로 동작시켜라.

		System.out.println( "영어 점수: " );
		printInt( t -> t.getEnglishScore() );	// list 의 for 문을 돌릴 때 applyAsInt() 를 t.getEnglishScore() 으로 동작시켜라.

		System.out.println( "수학 점수: " );
		printInt( t -> t.getMathScore() );		// list 의 for 문을 돌릴 때 applyAsInt() 를 t.getMathScore() 으로 동작시켜라.

	}

}

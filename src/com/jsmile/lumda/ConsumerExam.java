package com.jsmile.lumda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;


/**
 *  Consumer 함수기능 인터페이스
 *  - return 값이 없이 소비만 하는 accept() 를 가지고 있음. *  
 * */
public class ConsumerExam
{

	public static void main( String[] args )
	{
		Consumer<String> consumer = t -> System.out.println( t + "8" );
		consumer.accept( "Java" );
		
		BiConsumer<String, String> biConsumer = ( t, u ) -> System.out.println( t + u );
		biConsumer.accept( "Java", "8" );
		
		DoubleConsumer doubleConsumer = d -> System.out.println( "Java" + d );
		doubleConsumer.accept( 8.0 );
		
		ObjIntConsumer<String> objIntConsumer = ( t, i ) -> System.out.println( t + i );
		objIntConsumer.accept( "java", 8 );
	}

}

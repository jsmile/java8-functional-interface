package com.jsmile.lumda;

import java.util.function.IntSupplier;

/**
 *  Supplier 함수기능 인터페이스
 *  - 매개 변수는 없고 리턴값이 있는 getXXX() 메소드
 *  - 메소드들은 실행 후 호출한 곳으로 데이터를 리턴(공급)하는 역할
 * */
public class SupplierExam
{

	public static void main( String[] args )
	{
		IntSupplier intSupplier = () -> 
		{
			int num = (int)((Math.random() * 6 ) + 1 );
			
			return num;
		};
		
		int iNum = intSupplier.getAsInt();
		System.out.println( "주사위 눈의 수 : " + iNum );

	}

}

package com.sabre.ocp;

import org.junit.Test;

public class CrazyEnumTest {

	@Test
	public void test() {
		System.out.println(CrazyEnum.INSTANCE.getSomeLocalField());
		System.out.println(CrazyEnum.CUSTOM_INSTANCE.getSomeLocalField());
		System.out.println(CrazyEnum.CUSTOM_INSTANCE.getSomeLocalField2());
		
		System.out.println(CrazyEnum.iterateOverFields());
		
	}

}

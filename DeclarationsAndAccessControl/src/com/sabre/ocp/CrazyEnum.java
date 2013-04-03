package com.sabre.ocp;

public enum CrazyEnum {

	INSTANCE(1),
	CUSTOM_INSTANCE(2) {
	public int getSomeLocalField() {
			return 3;
		}
	};
	
	private volatile transient int someLocalField;
	
	CrazyEnum(int someLocalField) {
		this.someLocalField = someLocalField;
	}
	
	public int getSomeLocalField() {
		return someLocalField;
	}
	
	public int getSomeLocalField2() {
		return someLocalField;
	}
	
	public static final strictfp synchronized String iterateOverFields() {
		StringBuilder sb = new StringBuilder();
		for(CrazyEnum crazyEnum : values()) {
			sb.append(crazyEnum.getSomeLocalField());
		}
		return sb.toString();
	}
}

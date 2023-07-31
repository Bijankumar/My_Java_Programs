package com.technoelevate.interfacework;
@FunctionalInterface
public interface Magazine {
	 void sam() ;
	 static void dd() {};
	 default boolean equals() {
		return false;};
}

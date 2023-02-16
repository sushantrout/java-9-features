package com.tech;

public interface I1 {
	default void f2() {
		helper();
	}

	default void f1() {
		helper();
	}

	private void helper() {
		System.out.println("Helper");
	}
}

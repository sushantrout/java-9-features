package com.tech;

public class TechResource implements AutoCloseable {
	public TechResource() {
		System.out.println("TechResource..............");
	}

	public void p1() {
		System.out.println("P1");
	}

	public void close() {
		System.out.println("Clean up...");
	}
}

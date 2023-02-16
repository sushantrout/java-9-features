package com.tech;

public class TryWithResourceTest {
	public static void main(String[] args) {
		try(TechResource resource = new TechResource()) {
			resource.p1();
		}
		
		//java9
		TechResource resource = new TechResource();
		try(resource){
			resource.p1();
		}
		
	}
}

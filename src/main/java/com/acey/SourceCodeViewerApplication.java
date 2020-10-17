package com.acey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.AnnotatedType;

@SpringBootApplication
public class SourceCodeViewerApplication {

	public static void main(String[] args) {
        int modifiers = AbstractMethodError.class.getModifiers();
        SpringApplication.run(SourceCodeViewerApplication.class, args);
	}

}

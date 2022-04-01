package com.example.demo;

import java.io.IOException;

import org.springframework.core.io.ClassPathResource;

public class ImgService {
	
public ClassPathResource getImage() throws IOException {
		
	int num = (int) (Math.random() * 100);
	ClassPathResource imgFile;
	if (num < 33) {
		imgFile = new ClassPathResource("img/berg2.jpg");
	}
	else if (num<66)
		imgFile = new ClassPathResource("img/berg1.jpg");
	else 
		imgFile = new ClassPathResource("img/berg3.jpg");
	
	return imgFile;

	}
	
	

}

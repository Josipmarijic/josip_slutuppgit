package com.example.demo;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CSVController {
	
	
	
	@RequestMapping(
			value = "/showCsvFile",
			method = RequestMethod.GET,
			produces = MediaType.TEXT_PLAIN_VALUE)
	public void showCsvFile(HttpServletResponse response) throws IOException {
		var csvFile = new ClassPathResource("sample.csv");
		
		response.setContentType(MediaType.TEXT_PLAIN_VALUE);
		StreamUtils.copy(csvFile.getInputStream(), response.getOutputStream());
	}
	
	@RequestMapping(
			value = "/showCsvFileScanner",
			method = RequestMethod.GET)
	public String showCsvFileScanner() throws IOException {
		CSVFileReader filereader = new CSVFileReader();
		String json = "";
		List<CSVBean> orders = filereader.readFile("sample.csv");
		for (CSVBean csvBean : orders) {
			json += csvBean.toJason() + ",";
			
		}
		if(json.length()>2) {
			json = json.substring(0, json.length()-1);
		}
	
		
		
		return "{ \"orders\": [" + json + "]}";
		
		
	}
	
	

}

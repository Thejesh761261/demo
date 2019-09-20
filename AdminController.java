package com.pixogram.controller;
import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdminController {

	
	RestTemplate rest=new RestTemplate();
	@GetMapping(path = "/blockUser/{uid}")
	public String blockUser(@PathVariable Long uid) {
		HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <Long> entity = new HttpEntity<Long>(headers);
		return rest.exchange("http://localhost:8082/user/block/"+uid,HttpMethod.GET, entity, String.class).getBody();
		
		
	}

}

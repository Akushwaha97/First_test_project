package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.ActorDto;
import com.example.demo.Service.SpringVaultConfigService;

@RestController
public class SpringVaultConfigController {
	
	@Autowired 
	SpringVaultConfigService vaultConfigService;
	
	@GetMapping("/getAllActor")
	public List<ActorDto> getActorByName() {
		
		List<ActorDto> actorList = vaultConfigService.getAllActor();
		return actorList;
		
		
	}

}

package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.ActorDto;
import com.example.demo.Entity.Actor;
import com.example.demo.Repository.SpringVaultConfigRepository;

@Service
public class SpringVaultConfigService {
	
@Autowired
SpringVaultConfigRepository vaulConfigRepository;

public List<ActorDto> getAllActor() {
	
	List<Actor> actorList =  vaulConfigRepository.findAll();
	List<ActorDto> actors = new ArrayList<>();
	actorList.stream().forEach(a->
	{
		ActorDto actorDto = new ActorDto ();
		actorDto.setId(a.getActorId());
		actorDto.setFirstName(a.getFirstName());
		actorDto.setLastName(a.getLastName());
		actors.add(actorDto);
	
	});
	
	return actors;
}


}

package com.devops.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service 
public class MissionService {
	@Autowired  
	MissionRepository missionRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Mission> getAllMission()   
	{  
	List<Mission> mission = new ArrayList<Mission>();  
	missionRepository.findAll().forEach(mission1 -> mission.add(mission1));  
	return mission;  
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public void getMissionById(int id)   
	{ 
	missionRepository.findById(id).ifPresent(mission ->missionRepository.findById(id).get());
	 
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Mission mission)   
	{  
		missionRepository.save(mission);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		missionRepository.deleteById(id);  
	}  
	//updating a record  
	public void update(Mission mission, int id)   
	{  
		missionRepository.save(mission);  
	} 
	

}

package com.devops.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/MissioController")
public class MissionController {
	//autowire the BooksService class  
		@Autowired  
		MissionService missionService;  
		//creating a get mapping that retrieves all the mission detail from the database   
		@GetMapping("/AfficherMission")  
		public List<Mission> getAllMission()   
		{  
		return missionService.getAllMission();  
		}  
		//creating a get mapping that retrieves the detail of a specific book  
		@GetMapping("/mission/{missionid}")  
		public void getMission(@PathVariable("missionid") int missionid)   
		{  
		missionService.getMissionById(missionid);  
		}  
		//creating a delete mapping that deletes a specified book  
		@DeleteMapping("/mission/{missionid}")  
		public void deleteBook(@PathVariable("missionid") int missionid)   
		{  
		missionService.delete(missionid);  
		}  
		//creating post mapping that post the book detail in the database  
		@PostMapping("/mission")  
		public int saveMission(@RequestBody Mission mission)   
		{  
			missionService.saveOrUpdate(mission);  
		return mission.getId();  
		}  
		//creating put mapping that updates the book detail   
		@PutMapping("/mission")  
		public Mission update(@RequestBody Mission mission)   
		{  
			missionService.saveOrUpdate(mission);  
		return mission;  
		}  
	

}

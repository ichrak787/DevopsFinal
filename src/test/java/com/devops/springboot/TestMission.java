package com.devops.springboot;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;




@RunWith(SpringRunner.class)
@WebMvcTest(value = MissionService.class)
public class TestMission {
	@Autowired
	private MockMvc mockMvc;
	@Autowired MissionService es;
	
	@MockBean
	private MissionService missionService;
	Mission mockCourse = new Mission(1, "Spring", "10Steps");
	Logger logger = LoggerFactory.getLogger(TestMission.class);
	
	@Test(timeout = 5000)
	public void testgetAllMisson() {
		List<Mission> mission = missionService.getAllMission(); 
		logger.info("retrieveUser : "+mission); 
		}
	@Test(timeout = 5000)
	public void tesajouterMission() throws ParseException {
	Mission e = new Mission(2,"Salhi","ahmed.salhi@esprit.tn");
	assertTrue(e.getName().equals("Salhi"));
	es.saveOrUpdate(e);
	}      
	
	@Test(timeout = 5000)
	public void testDeleteProduit()
	{
		es.delete(1);
	}

	@Test
	public void testUpdateProduit()
	{
	Mission e = new Mission(3,"Salhi","ahmed.salhi@esprit.tn");
	e.setName("ichrak_bouslimiµµµ****");
	es.update(e,3);
	System.out.println(e);
	logger.info("Modification : "+e);
	logger.info("modif avec succès");
	}
	
	
	
	
}

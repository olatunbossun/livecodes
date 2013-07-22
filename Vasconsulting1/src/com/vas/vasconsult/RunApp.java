package com.vas.vasconsult;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.vas.dao.VasconDao;
import com.vas.home.Vascon;

public class RunApp {
public static void main (String []args){
	VasconDao dao = new VasconDao();
	Vascon vas = new Vascon();
	
	//Add new Staff
    /*vas.setId(1012);
	vas.setFirstName("Akinmolayan");
	vas.setLastName("Olushola");
	vas.setEmail("oakinmolayan@vas-consulting.com");
	vas.setPassword("navalforce");
	vas.setComment("System analyst");
	try{
		Date dob = new SimpleDateFormat("yyyy-mm-dd").parse("1985-09-22");
		vas.setDob(dob);
	}catch(ParseException pex){
		pex.printStackTrace();
	}
	dao.addVascon(vas);
	System.out.println("Staff Record is Successfully Added");
	*/
	
	//Update Staff
	/* vas.setFirstName("Deolu");
	vas.setPassword("GodOfPossibilities");
	dao.updateVascon(vas);
	*/
	
	//Delete Staff 
     /*dao.deleteVascon(1015);
     System.out.println("Staff Record Successfully Deleted");
   */
	
     //Get Staff By ID
    System.out.println(dao.getVasconById(1010));
     
     //List All Staff 
    /*
     for(Vascon iter: dao.getAllVascon()){
    	    System.out.println(iter); 
    	    }*/
}
}






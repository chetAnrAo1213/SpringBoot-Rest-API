package com.boot.auditing;

import java.util.Calendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AudtingService 
{
	
	@Autowired
	private AudtingDao ado;
	
	public String saveUser(AudtingRequest<AudtingModel> req)
	{
		String cuurentUser = req.getLoggedInUser();
		req.setTimezone(Calendar.getInstance().getTimeZone().getDisplayName());
		
		AudtingModel aum = req.getEmployee();
		aum.setCreatedBy(cuurentUser);
		ado.save(aum);
		return "Employee Saved Successfully";
	}
	
	public String updateUser(int id,double salary,AudtingRequest<AudtingModel> req)
	{
		AudtingModel aum = ado.findById(id).get();
		if(aum!=null)
		{
			aum.setSalary(salary);
			aum.setModifiedBy(req.getLoggedInUser());
			ado.saveAndFlush(aum);
		}
		else
		{
			throw new RuntimeException("Employee did not updated :"+id);
		}
		return "Employee has been updated";
	}
}

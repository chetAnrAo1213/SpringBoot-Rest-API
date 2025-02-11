package com.boot.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Versioning/api")
public class VersioningController 
{
	
/*___________________________________URL BASED VERSIONS________________________________________________________*/
	@GetMapping("v1/GetVersions")
	public VersioningModel1 getVersion1URL()
	{
		return new VersioningModel1("James Bond");
	}
	
	@GetMapping("v2/GetVersions")
	public VersioningModel2 getVersion2URL()
	{
		return new VersioningModel2(new VersioningModel("007-MI6","James Bond"));
	}

	/*___________________________________PARAMETER BASED VERSIONS________________________________________________________*/
	@GetMapping(value="/GetVersion",params = "version=1")
	public VersioningModel1 getVersion1Parameter()
	{
		return new VersioningModel1("The Jackal");
	}
	
	@GetMapping(value="/GetVersion",params = "version=2")
	public VersioningModel2 getVersion2Parameter()
	{
		return new VersioningModel2(new VersioningModel("The Jackal","The Day of "));
	}
	
	/*___________________________________HEADER BASED VERSIONS________________________________________________________*/
	@GetMapping(value="/GetVersion",headers = "version=1")
	public VersioningModel1 getVersion1Header()
	{
		return new VersioningModel1("The Jackal");
	}
	
	@GetMapping(value="/GetVersion",headers = "version=2")
	public VersioningModel2 getVersion2Header()
	{
		return new VersioningModel2(new VersioningModel("The Jackal","The Day of "));
	}	
	/*___________________________________MEDIA BASED VERSIONS________________________________________________________*/
	@GetMapping(value="/GetVersionMedia1", produces="application/v1+json")
	public VersioningModel1 getVersion1Media()
	{
		return new VersioningModel1("The Jackal");
	}
	
	@GetMapping(value="/GetVersionMedia2", produces="application/v2+json")
	public VersioningModel2 getVersion2Media()
	{
		return new VersioningModel2(new VersioningModel("The Jackal","The Day of "));
	}		
}

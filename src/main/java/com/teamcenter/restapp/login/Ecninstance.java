package com.teamcenter.restapp.login;

import com.a2.services.strong.bom.BomService;
import com.a2.services.strong.ecndata.ExtractECNdataService;
import com.teamcenter.clientx.AppXSession;

public class Ecninstance {

	public String getString(String ecnUID) {
		// TODO Auto-generated method stub
		String serverHost = "http://teamcv1:8080/tc";
        String host = System.getProperty("host");
        if (host != null && host.length() > 0)
        {
            serverHost = host;
        }

        System.out.println("The ID is "+ecnUID);

        AppXSession   session = new AppXSession(serverHost);
        //HomeFolder   home = new HomeFolder();
      //  Query       query = new Query();
       // DataManagement dm = new DataManagement();
     // Establish a session with the Teamcenter Server
        session.login();
        //String RevUid="genVxFpNZ2KVcC";
       // dm.getuid();
        
        
        System.out.println("BOM running");
       ExtractECNdataService ecnserviceop=ExtractECNdataService.getService(session.getConnection());
        System.out.println("sesson login");
      //Bomoperationresponse responce=bomserviceop.bomOperation("genVxFpNZ2KVcC");
        String operation=ecnserviceop.apiExtractECNdata(ecnUID);
        System.out.println("The BOM code is success");
        System.out.println(operation);
	 
	return operation;
		
	}
	
	

}

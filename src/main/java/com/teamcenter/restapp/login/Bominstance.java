package com.teamcenter.restapp.login;

import com.a2.services.strong.bom.BomService;
import com.teamcenter.clientx.AppXSession;

public class Bominstance {

	 public String getString(String revisonuidvalue) {
		 
		 String serverHost = "http://teamcv1:8080/tc";
	        String host = System.getProperty("host");
	        if (host != null && host.length() > 0)
	        {
	            serverHost = host;
	        }

	        System.out.println("The ID is "+revisonuidvalue);

	        AppXSession   session = new AppXSession(serverHost);
	        //HomeFolder   home = new HomeFolder();
	      //  Query       query = new Query();
	       // DataManagement dm = new DataManagement();
         // Establish a session with the Teamcenter Server
	        session.login();
	        //String RevUid="genVxFpNZ2KVcC";
	       // dm.getuid();
	        
	        
	        System.out.println("BOM running");
	       BomService bomserviceop=BomService.getService(session.getConnection());
	        System.out.println("sesson login");
	      //Bomoperationresponse responce=bomserviceop.bomOperation("genVxFpNZ2KVcC");
	        String operation=bomserviceop.apibomOperation(revisonuidvalue);
	        System.out.println("The BOM code is success");
	        System.out.println(operation);
		 
		return operation;
		
//		String jarpath = "D:\\REST\\RestCall.jar";
//		String UID = "genVxFpNZ2KVcC";
//		String outfile = "D:\\REST\\A14.txt";
//
//		try {
//			Process process=Runtime.getRuntime().exec(new String[]{"java", "-jar",jarpath,UID,outfile});
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//			
		
		
		
//		String line = null;
//		String alllines="";
//		FileReader fileReader;
//		try {
//			fileReader = new FileReader("D:\\REST\\123.txt");
//			BufferedReader bufferedReader = new BufferedReader(fileReader);
//       
//
//	        try {
//				while ((line = bufferedReader.readLine()) != null) {
//				    
//				    alllines = alllines + line;
//				    System.out.println(alllines);
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//	        try {
//				bufferedReader.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        
//		return alllines;
//		
//	
////				} catch (IOException e) {
////					
////					// TODO Auto-generated catch block
////					e.printStackTrace();
////				}
////			}
////		});
////		
////		Thread t2 = new Thread();
////		t2.run(new Runnable() {
////			public void run() {
////				
////			}
////		});
//		
//
//		
	}

	
}

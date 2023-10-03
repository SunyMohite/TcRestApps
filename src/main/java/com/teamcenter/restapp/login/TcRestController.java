/**
 * 
 */
package com.teamcenter.restapp.login;

import java.io.IOException;

/**
 * 
 */
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TcRestController {

    @GetMapping(value="/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String index() {

        return "This is Home1 page";
    }

    @GetMapping(value="/getinfo", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getrevisioninfo() {

        return "Rest API Tc13 Success";
    }
    @GetMapping(value="/getinfo/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getEcnid(@PathVariable(value="id")String ecnUID) {
    	String stringecn=null;
    	Ecninstance ecninstance=new Ecninstance();
    	stringecn = ecninstance.getString(ecnUID);
		return stringecn;
    	
       // return revisonuid+"Rest API Tc13 Success";
    }
    @GetMapping(value="/getbominfo/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getbominfoid(@PathVariable(value="id")String revisonuid) {
    	String bom1 = null;
    /*	String[] command = {"cmd.exe","/C","Start","D:\\REST\\API.bat"};
		try {
			Process process=Runtime.getRuntime().exec(command);
			try {
				Thread.sleep(120*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "APIBAT";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    /*	String jarFilePath = "C:\\Users\\teamcv\\Desktop\\RestAPIjar\\RestCall.jar"; // Replace with the actual path to your JAR file
    	String Testfile="C:\\Users\\teamcv\\Desktop\\RestAPIjar\\123.txt";
        //try {
            // Create a ProcessBuilder to run the JAR file
           
			try {
				System.out.println("the File Path is "+Testfile);
				System.out.println("the Jar path is "+jarFilePath);
				 ProcessBuilder processBuilder = new ProcessBuilder("java", "-jar", jarFilePath,Testfile);

		            // Start the process
				 processBuilder.inheritIO();
		         Process process;
				process = processBuilder.start();
				int exitecode;
					exitecode = process.waitFor();
					if(exitecode==0)
		            {
		            	System.out.println("jar is Success");
		            }
		            else {
		            	System.out.println("Jar is Failed*****");
		            }
				
	            
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
            
    	
		
    	//"C:\Users\teamcv\Desktop\RestAPIjar\genVxFpNZ2KVcC_30_09_2023_08_48_56.json"
    	//new Thread(new Runnable()
		//{

			//@Override
			//public void run() 
			//{
				Bominstance bominstance=new Bominstance();
				bom1 = bominstance.getString(revisonuid);
				return bom1;
				
				
				
				// TODO Auto-generated method stub
				//hcadService.CreateTeamcenterBills(strLoginURL, strUserID, strUserPassword,strISCXmlContent);
				//Process process1=Runtime.getRuntime().exec("cd C:\\Users\\teamcv\\Desktop\\RestAPIjar");
				//Process process=Runtime.getRuntime().exec("java -jar RestCall.jar genVxFpNZ2KVcC C:\\Users\\teamcv\\Desktop\\RestAPIjar\\abc223.txt");
				/*
				 * try { Process process=Runtime.getRuntime().exec(new String[]{"java", "-jar",
				 * "C:\\Users\\teamcv\\Desktop\\RestAPIjar\\RestCall.jar",
				 * "genVxFpNZ2KVcC","C:\\Users\\teamcv\\Desktop\\RestAPIjar\\123344.txt"}); }
				 * catch (IOException e) { // TODO Auto-generated catch block
				 * e.printStackTrace(); }
				 */
		//	}

		//}).start();
		/*
		 * try { //Process process1=Runtime.getRuntime().
		 * exec("cd C:\\Users\\teamcv\\Desktop\\RestAPIjar"); //Process
		 * process=Runtime.getRuntime().
		 * exec("java -jar RestCall.jar genVxFpNZ2KVcC C:\\Users\\teamcv\\Desktop\\RestAPIjar\\abc223.txt"
		 * ); //Process process=Runtime.getRuntime().exec(new String[]{"java", "-jar",
		 * "C:\\Users\\teamcv\\Desktop\\RestAPIjar\\RestCall.jar",
		 * "genVxFpNZ2KVcC","C:\\Users\\teamcv\\Desktop\\RestAPIjar\\123344.txt"}); }
		 * catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

    	//return revisonuid;
    }
}
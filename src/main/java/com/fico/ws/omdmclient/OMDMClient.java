package com.fico.ws.omdmclient;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

import https.ort_bp_ws_pnc_fico_com.omdm_ps_icl.services.processserver.Invoke;
import https.ort_bp_ws_pnc_fico_com.omdm_ps_icl.services.processserver.InvokeService;

/**
 * Hello world!
 *
 */
public class OMDMClient 
{
    public static void main( String[] args )
    {
    	try {
			InvokeService service = new InvokeService (new URL ("https://ort-bp.ws.pnc.fico.com/OMDM_PS_ICL/services/ProcessServer?wsdl"));
			Invoke port = service.getProcessServer();
			String requestXML = "";
			try {
				requestXML = FileUtils.readFileToString(new File("./src/main/inputs/OMDMRequest.xml"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println(requestXML);
			
			String response = port.processRequest(requestXML);
			File file = new File("./src/main/outputs/test.xml");
			try {
				FileUtils.writeStringToFile(file, response);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(response);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

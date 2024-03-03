package com.distributed_systems_CSC408.Activities.Activity_3;

import java.net.*;
import java.io.*;

public class UDPServer{    
   public static void main(String args[]) {     	
    try{
	    byte[] buffer = new byte[1000];
	   	System.out.println("Server is ready and accepting clients' requests ... ");
		while(true){ 				
		}
 	}catch (SocketException e){System.out.println("Error Socket: " + e.getMessage());
 	}catch (IOException e) {System.out.println("Error IO: " + e.getMessage());
	}finally {
		if(aSocket != null) aSocket.close();
	}
   }
}

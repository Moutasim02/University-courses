package com.distributed_systems_CSC408.Activities.Activity_3;

import java.net.*;
import java.io.*;

public class UDPClient{    

    public static void main(String args[]) {  
    // args[0] = message to be sent to the server; 
    // args[1] = IP address of the server

        ...
        try {
            byte [] m = args[0].getBytes();
            InetAddress serverAddress = InetAddress.getByName(args[1]);
            int serverPort = 20000;
            byte[] buffer = new byte[1000];
            System.out.println("Received Reply: " + new String(reply.getData(), 0, reply.getLength()));
        }catch (SocketException e){System.out.println("Error Socket: " + e.getMessage());
        }catch (IOException e){System.out.println("Error IO: " + e.getMessage());
        }finally { 
            if(aSocket != null) aSocket.close();
        }
    }
}

                       
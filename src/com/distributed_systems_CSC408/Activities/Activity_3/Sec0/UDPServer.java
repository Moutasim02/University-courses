package com.distributed_systems_CSC408.Activities.Activity_3.Sec0;

import java.net.*;
import java.io.*;

public class UDPServer {
    public static void main(String[] args) {
        DatagramSocket aSocket = null;
        try {
            aSocket = new DatagramSocket(20000);
            byte[] buffer = new byte[1000];
            System.out.println("com.distributed_systems_CSC408.Activities.Activity_3.Sec2.Server is ready and accepting clients' requests ... ");
            while (true) {
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                aSocket.receive(request);
                DatagramPacket reply = new DatagramPacket(request.getData(), request.getLength(), request.getAddress(), request.getPort());
                aSocket.send(reply);
            }
        } catch (SocketException e) {
            System.out.println("Error Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error IO: " + e.getMessage());
        } finally {
            if (aSocket != null) aSocket.close();
        }
    }
}

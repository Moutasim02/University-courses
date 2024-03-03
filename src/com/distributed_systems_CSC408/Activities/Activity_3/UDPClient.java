package com.distributed_systems_CSC408.Activities.Activity_3;

import java.net.*;
import java.io.*;

public class UDPClient{    

    public static void main(String[] args) {
    // args[0] = message to be sent to the server;
    // args[1] = IP address of the server
        try (DatagramSocket aSocket = new DatagramSocket()) {
            byte[] m = args[0].getBytes();
            InetAddress serverAddress = InetAddress.getByName(args[1]);
            int serverPort = 3000;
            DatagramPacket request = new DatagramPacket(m, args[0].length(), serverAddress, serverPort);
            aSocket.send(request);
            byte[] buffer = new byte[1000];
            DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
            aSocket.receive(reply);
            System.out.println("Received Reply: " + new String(reply.getData(), 0, reply.getLength()));
        } catch (SocketException e) {
            System.out.println("Error Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error IO: " + e.getMessage());
        }
    }
}

                       
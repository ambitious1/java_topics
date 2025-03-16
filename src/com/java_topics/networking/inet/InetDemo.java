package com.java_topics.networking.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetDemo {
 
	
	/*
	 * 
	 * InetAddress
The InetAddress class is used to provide methods to get the IP address of any hostname. An IP address is expressed by 32-bit or 128-bit unsigned number. An object of InetAddress describes the IP address with its analogous hostname. InetAddress can control both IPv4 and IPv6 addresses. 

There are two different types of addresses:

Unicast – It is an identifier for a single interface.
Multicast – It is an identifier for a collection of interfaces.
Methods of InetAddress Class 

Java InetAddress class represents an IP address. The following given are the important methods of the InetAddress class –

# |                  Method                                   |                         Description                        
==============================================================================================================================================================
1	static InetAddress getByAddress(byte[] addr)	          | This method is used to return an object of the InetAddress class provided the raw IP address.
2	static InetAddress getByAddress(String host, byte[] addr) |	This method is used to create an InetAddress based on the given hostname and IP address.
3	static InetAddress getByName(String host)	              | This method is used to determine the IP address of a host when the host’s name is given.
4	static InetAddress InetAddress getLocalHost()	          | This method is used to return the localhost.
5	String getHostName()	                                  | This method is used to get the name of the IP address.
6	String getHostAddress()	                                  | This method returns the IP address in the form of a string in a textual display.
7	String toString()	                                      | This method is used to convert the IP address to a string.
Examples of Inet Address Class Methods:
The Java implementation of the Inet Address class to illustrate the usage of methods is shown below:
	 * 
	 * */
	
    public static void main(String[] args) throws UnknownHostException
        {
     
	    	 // To get and print InetAddress of the Local Host
	        InetAddress address = InetAddress.getLocalHost();
	 
	        System.out.println("InetAddress of the Local Host : "+address);
	 
	        // To get and print host name of the Local Host
	        String hostName=address.getHostName();
	 
	        System.out.println("\nHost name of the Local Host : "+hostName);
	      
    	
            // To get and print InetAddress of Named Hosts
            InetAddress address1 = InetAddress.getByName(
                               "write.geeksforgeeks.org");
     
            System.out.println("\n\n\n\nInet Address of named hosts : "
                                                   + address1);
     
            // To get and print ALL InetAddress of Named Host
            InetAddress arr[] = InetAddress.getAllByName(
                                "www.geeksforgeeks.org");
     
            System.out.println("\nInet Address of ALL named hosts :");
     
            for (int i = 0; i < arr.length; i++) {
     
                System.out.println(arr[i]);
            }
        }
	
}

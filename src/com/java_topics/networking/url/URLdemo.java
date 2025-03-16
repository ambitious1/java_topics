package com.java_topics.networking.url;

import java.net.MalformedURLException;
import java.net.URL;

public class URLdemo {

	/*
	 * 
	 * Components of a URL

A URL can have many forms. The most general however follows a three-components system-  
 

Protocol – The protocol in a URL defines how information is transported among the host and a client (or web browser).
Hostname – The hostname is the name of the device on which the resource exists.
File Name – The filename is the pathname to the file on the device.
Port Number – The port number is used to identify different applications uniquely. It is typically optional.
Methods of Java URL Class
There are many methods in Java URL Class that are commonly used in Java Networking. These methods are:

# |	        Methods				 |		                      Description
--------------------------------------------------------------------------------------------------------------------
1 | public String getProtocol()	 |  This method returns the protocol that is used by the URL.
2 |	public String getHost()	     |  This method returns the hostname of the URL in IPv6 composition.
3 |	public int getPort()         |  This method returns the port associated with the protocol specified by the URL.
4 |	public String getFile()	     |  This method returns the filename.
5 |	public String getPath()	     |  This method returns the path of the URL, or null if empty.
6 |	public String toString()	 |  This method is used to return the string representation of the provided URL object.
7 |	public int getDefaultPort()	 |  This method returns the default port used.

*
* 
* 
* 
* */
	
	public static void main(String[] args) throws MalformedURLException
    {
 
        URL url = new URL(
            "https://write.geeksforgeeks.org/post/3038131");
        
        // print the string representation of the URL
        String s = url.toString();
 
        System.out.println("URL :  " + s);
 
        // to get and print the default port of the URL
        int defaultPort = url.getDefaultPort();
 
        System.out.println("Default Port : " + defaultPort);
 
        // to get and print the path of the URL
        String path = url.getPath();
 
        System.out.println("Path : " + path);
        
        // to get and print the protocol of the URL
        String protocol = url.getProtocol();
 
        System.out.println("Protocol : " + protocol);
 
        // to get and print the hostName of the URL
        String host = url.getHost();
 
        System.out.println("HostName : " + host);
 
        // to get and print the file name of the URL
        String fileName = url.getFile();
 
        System.out.println("File Name : " + fileName);
    }
}

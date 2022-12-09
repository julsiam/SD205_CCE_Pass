How to install and run the sample program

Prerequisite:  
In order to run a Java program, first we need JDK or the java development kit. You can follow this link to download:
	
	https://download.oracle.com/java/19/latest/jdk-19_windows-x64_bin.exe

We also need an IDE, one of these which is commonly used is the Apache NetBeans. 

To download, just follow this link:
	 https://netbeans.apache.org/download/nb15/
 
This is the latest version of NetBeans.  
Click "Apache-NetBeans-15-bin-windows-x64.exe (SHA-512, PGP ASC)"
It will redirect you to the page where you can start the download. Or just directly follow this link. 

	https://dlcdn.apache.org/netbeans/netbeans-installers/15/Apache-NetBeans-15-bin-windows-x64.exe

Downloading starts. When download is done, open the exe file and install the program, just follow the steps and your preference for the program to run.  

After installing, open the app. To create a sample project, 
	-Click the folder icon with +sign on the upper left corner of the app. 
	-Double-click "Java Application" then name the file you want to create. It will create a package same as the file name (default). 
	-You can now modify the file. 

In my case, I am using one of the unique feature/property of Java Netbeans which is the JFrame. To do so, click the package you have made then choose the JFrame form, then that's it. Modify through its properties and run the file to test. 

For reference, you can explore through this link: 
	
	https://netbeans.apache.org/kb/docs/java/gui-functionality.html


To enable the connection between Java and any database management system, there should be a connector which is the JDBC. I have created a sample program that connects to Mongodb. If you dont have the Mongodb, just follow this link and install the program:
	MongoDB Community Server (v.6.0.1) 	https://www.mongodb.com/try/download/community

To have the Java™ database connectivity (JDBC) driver, I just follow this link: 
	https://jar-download.com/?search_box=mongo-java-driver

Scroll and download the zip file:
	-click the "Download mongo-java-drive.jar(3.12.11)"

After downloading, extract the zip file to your prefered folder. 
Go back to NetBeans, to your project and insert the driver on the libraries. 
	-Right click on "Libraries" and choose "Add jar/folder" then find the extracted file you just have saved and choose it then open. Then modify the file by putting the codes for connection. 
	- I used this links for reference
	Mongodb - Java 
	https://www.tutorialspoint.com/mongodb/mongodb_java.htm
	Sample Registration
	https://www.youtube.com/watch?v=ilAvtg11OJ0&t=2s

By putting the dabase name and the collection, (sample code below), once it's rightly executed, it will directly created to the Mongodb. You don't need to manually create database on Mongodb app. 
	 dbconnection = mongo.getDatabase("Java_sd205");
       collection = dbconnection.getCollection("accounts")


Open Mongodb, connect. 
Go back to Ntbeans, modify the project file and test if the data inputted reflects to database. Click the file and run. Input data and if it doesn't generate an error then perhaps, you did it perfectly. 
Go to mongodb and refresh, once you see the db name you have created on the project, then you did it will. Once you see the data on the collection you've made, then congratualations, YOU MADE IT! 























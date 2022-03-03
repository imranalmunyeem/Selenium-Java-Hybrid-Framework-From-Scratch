# Selenium-Java-Hybrid-Framework-From-Scratch
# Step 1: 
Create a Maven project
# Step 2: 
-> Go to src/test/java and create 4 packages in there
example: com.nopcommerce.testCases    //store all test cases here
	   com.nopcommerce.pageObjects  //store all page object classes or page factory here
	   com.nopcommerce.testData	  //store all test data here like excel,csv etc
	   com.nopcommerce.utilities    //store utility classes here like listeners
[You may have more packages according to your requirements]

# Step 3: 
Create 3 new folder from the project which are Configuration folder you will store configure stuffs, Drivers folder where you'll store different broswers driver's exe files, and Screenshot folder where you'll store failed test cases.

# Step 4: 
Update pom.xml by adding necessary dependencies from maven repositories (https://mvnrepository.com/)

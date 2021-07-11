 # Project Title
 
     Automation Test Senario 

 # Getting Started
 
     These instructions will help you to set project and running on your Local machine for testing purpose

 # Prerequisites
 
     Java Home and Maven Home set to System Variables
     Path variable set for Java and Maven
     Eclipse install to Local machine
     Before attempting to import Maven project in Eclipse, ensure that Eclipse is configured with the following:
        A Maven 3.3 or higher.
        A JDK 1.8  
     Natural 0.9 plugins install to your eclipse
     Chromedriver.exe is compatible with Chrome browser
     
 # Installing Project
 
     From the File menu, select Import.
     Expand Maven and select Existing Maven Projects.
     Click Next.
     For Root Directory, click Browse and select the top-level project folder. 
     Verify that the Projects pom.xml selected and click Finish.
  
 # Feature Files Location
 
     src/test/java/featureFiles
   
 # Step Definition Location
 
    src/test/java/stepDefinition
  
 # Test Runner Class Location
 
    src/test/java/cucumberTestRunner
  
 # Page Objects Location
 
    src/main/java/pageObjects
   
 # Selenium WebDriver Location
 
    src/main/java/webDriver
   
 # Drivers Location
 
    DemoProject/drivers
 
 #Reports Location
 
    DemoProject/target
  
 #Running the tests
 
     Test can be two ways
   
    1.Test can be run from TestRunner Class
   
     Right Click on TestRunner Class.Select Run As then select Junit Test
     
     
    2.Test can be run from command prompt
   
     Open the Command Prompt and Change directory to Project Location
     Type command : mvn clean test verify
 
 
    
    

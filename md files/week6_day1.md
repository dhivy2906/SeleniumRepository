## Steps to create TestNG class
1. Do right click on package
2. Choose 'TestNG' --> 'Create a TestNG Class'
3. In source folder location change from 'test' to 'main'
4. Provide a proper Class name
5. Enable the checkboxes and click on finish button.


## Steps to do Common Integration
1. Steps a class as ProjectSpecificMethod(Base class)
2. Declare a two methods which are preCondition() and postCondition() 
3. Add @BeforeMethod for preCondition() and @AfterMethod for postCondition()
4. Declare the driver variable globally
5. Write TestSteps for launch browser, load url , implicitlyWait, maximize window in preCondition()
6. Write testStep to close the browser in postCondition()
7. Do inheritance in Testcase class 
8. In Testcase method Remove or comment the testSteps written in base(ProjectSpecifcMethod)

## Possible Exception are:
1. nullPointerException - Check driver declaration 
2. noSuchSessionException - using driver.close() in multiple methods(Testcase() and postCondition())

### Parameterization: 
  - No hardcoding of data 

 - static
 - dynamic

#### Steps to implement Static Parameterization:
1. Identify the data that are common data across all testcases
   ex: url,username,password
   <parameter name="url"
		value="http://leaftaps.com/opentaps/control/main"></parameter>
2. Add parameter tag for each one of the data in the testng.xml file
3. Map the parameters in the java class using @Parameters
   Note: The name should exactly match the names in the xml
   @Parameters({"url","username","password"})
4. Use that parameters inside the mathod using arguments
   Note: Sequence matters but the name of the argument doesnot matter
   public void preCondition(String url,String uName,String pWord)
5. Finally, replace it with arguments
       driver.get(url);

Note: You should always run from the xml file when you use parameters


### Dynamic Parameterization
Steps to implement Dynamic Parameterization:
1. Identify the datas that are specific to the particular testcase
   ex: CreateLead - compnayname, firstname, lastname, phonenumber
       EditLead - phonenumber,companyname
2. Create a method sendData() inside the CreateLead class 
3. Annotate that method with @DataProvider
4. Inside sendData() create 2-Dimensional array with number of rows and columns
     - Add all the sets of data into the array and make sure the index starts from 0
5. Return the data back to the calling method
6. Receive this data in the test method
    - use dataprovider attibute
    - use that arguments inside the method.
7. Finally, replace the hardcoded values




------------------------------------------------------------------------
## Steps to achive Static Parameterization
1. Create a xml file for execution
2. Add parameter tag in xml and provide values for name(key) and value
3. In Base class(ProjectSpeficiMethod) at the top of the preCondition() declare @Parameters annotation from TestNG
4. Inside the @Parameters , declare a key in String[]
5. In the preCondition() input args declare arguments for the key in same order as @Parameters
6. Remove the hardcorded values and pass the method input arguments
7. In xml do right click --> Run as --> TestNG Suite





## Steps to achive Dynamic Parameterization
1. In TestCase class declare a method as sendData() and Use annotation as @DataProvider
2. Create obj for 2D String and pass  no.of.testdatas and testdata info count (row and col size) 
3. Declare values/testdatas  for data[][]
4. return data variable 
5. In @Test invoke the dataProvider(Attribute) and assign @DataProvider methodName
6. Add Method input argument for the testdata information (It should be a same order)
7. Remove hardcorded data and use variables





## Steps to take screenshot
1. Take a screenshot
2. Set path for screenshot
3. Store Screenshot to the file path

required dependency

<dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.11.0</version>
</dependency>









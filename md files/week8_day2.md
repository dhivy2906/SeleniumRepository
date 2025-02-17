## Explain your Framework used for Automation project - spilit into 3

1. High level explaination
--------------------------
  -> Hybrid Framework it support both TestNG and Cucumber
  -> design pattern used is page object model to maintain the framework scalable and maintainable
  -> Maven as project management tools to maintain the dependency easier
  -> Selenium is used for ui Automation
  -> testng is used to control the execution flow
  -> Cucumber is used for BDD Automation
  -> Apache poi is used to read test data from the excel file
  -> extent report is used to generate dashboard based report
  -> git used for version controling
  -> and also maven build life cycle is configured for pipeline execution

2. explain the internals
------------------------
   -> We have a interface called Browser where all the browser related actions are deisgned for eg: open the application , to find the webelement, to handle frame , alerts, windows, .....
   -> and we have another interface called elements where the webelement related actions are designed like click, to pass data to the element , handling dropdown, retrive text from the element,....
   -> enum is used to provide constant for locators which helps to avoid invalid locators or typo errors will be resolved
   -> Diver instance as a where the implementation for driver and webdriverwait is defined with proper exception handling and ThreadLocal implementation to work with parallel 
   -> reporter class where the report related functionalites are defined 
   -> Selenium base which is heart of our Framework because where all the major reuse methods/functionalites are written with proper wait handing and exception handling are done
   -> we can the selenium base also as wrapperClass becuase what the actions which is performed by selenium those actions are wrappered with proper exception handling
   -> ProjectSpecificMethod/BaseMethods where the common test steps for all the testcases like multiple test data, setup the environment and teardown are written
   ->testcase where the testcase flow is designed and test data for report is defined here

3. Execution flow
-----------------
   -> TestNG is used for execution flow
   The Annotations are BeforeSuite, BeforeTest, BeforeClass, DataProvider, BeforeMethod, Test, AfterMethod, AfterClass, AfterTest and AfterSuite.
   -> Here in the BeforeSuite the report will be started by creating dynamic report in every execution
   -> Then it will execute the BeforeTest where the report information are defined like testcaseName, testCaseDes, .......
   -> And BeforeClass will execute next where the testcase report is started here
   -> in DataProvider will read the data from excel file and store into the 2D array for multi test data purpose
   -> precondition will execute in the BeforeMethod
   -> Then testcase will execute in Test
   -> teardoewn process will done in AfterMethod
   -> And finally will endReport in AfterSuite
   -> for my case i dont have any option to use the AfterClass and AfterTest




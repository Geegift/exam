# spring-test

**You have 8 Hrs for this test**

**REQUIREMENT**
*  Create web application for managing inventory of products in each branch of the headquarter 
*  The PRODUCT is contains: ID, NAME, DETAIL, and PRICE
*  Create form for collecting and managing the data (Product, Branch, Inventory, and whatever upon your idea)
*  Display the data (UI whatever upon your idea) on web view
*  Create report for displaying the data

**HOW TO EARN POINT** [100+50]
*  [20] Database
     * [15/15] Well design
     * [5/5] brilliant idea
*  [20] Frontend
     * [5/5] Using frontend framework such as: angular1, angular2, and so on
     * [5/5] Using frontend css framework such as: bootstrap, foundation
     * [5/5] Well frontend code structure
     * [5/5] Create frontend with UI unit test
*  [30] Backend
     * [10] Database layer
        * [5/10] Connect database using hibernate
        * [10/10] Connect database using custom code with well design pattern
     * [10/10] Service layer
     * [5] Presentation layer
        * [3/5] Display data on webpage
        * [5/5] Display data on webpage with restful service
     * [5/5] Creating backend with unit test
*  [15] Report: Extra points
     * [5/5] Using jasper for creating a simple report
     * [10/10] Using jasper for creating a complex report
     * Note: You can use another report library
*  [5+50] Other: Extra points
     * [5/5] Well manage source code with git
     * [+] Add more idea to the web application
        * [5] Frontend: Add form validation
        * [5] Backend: Add service verification
        * [5] Using advanced css script such as: less, sass
        * [5] Using 3rd party worldwide service such as: facebook, google, twitter, and so on
        * [10] Overall: cover all features: create, update, delete, and display
        * [20] Using advanced techniques

**PROJECT STRUCTURE**
```
Project
-->.mvn
-->libs
-->src
  |-->main
     |-->java
        |-->com
           |-->g_able           
              |-->exam       
                 |-->spring
                    |-->template
                       |-->app
                          |-->controller
                          |-->model
                          |-->report
                          |-->repository
                          |-->security
                          |-->service
                       |-->core
                          |-->configuration
                          |-->filter
                          |-->model
     |-->resource
        |-->jasperreports
           |-->reports
     |-->webapp
        |-->pages
  |-->test
     |-->java
        |-->com
           |-->g_able           
              |-->exam       
                 |-->spring
                    |-->template
-->.gitignore
-->mvnw
-->mvnw.cmd
-->pom.xml
-->README.md
```

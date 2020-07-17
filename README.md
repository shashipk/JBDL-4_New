# JBDL-4_New

Minor Project Slides -> https://docs.google.com/presentation/d/1Vif4DYJbgNCpLLD9KKt-1tLdRCpsupLPtHfrwT5hcRk/edit#slide=id.g77b9bc1950_0_153
 
MT Assignment -> https://docs.google.com/document/d/1dh-QJCBNoMBUQsyfC0W7Tw1TrgJEwxRC3C82MEcQCPg/edit
MT Assignment Answers -> https://docs.google.com/document/d/1aiWKF6KuNQdHxMPMCvJP0fMUko3uO9cLSR1RrN9XLok/edit

Instructions for running Spring Beans project

Try to hit both the API (in two controllers i have autowired the same Bean, and when I use the singleton scope I have only 1 object created but when i change this to prototype, you can see 2 objects are created Try this out by yourself)

Useful links:

For logging -> https://www.youtube.com/watch?v=lGrcZsw-hKQ

For configuring properties in file -> https://www.youtube.com/watch?v=NFQDqEhx2e0

For REST APIs https://www.youtube.com/watch?v=xkKcdK1u95s&list=PLqq-6Pq4lTTZh5U8RbdXq0WaYvZBz2rbn (only first 7 videos of this playlist)

For core Java: https://www.geeksforgeeks.org/java/ https://www.w3schools.com/JAVA/default.asp https://www.youtube.com/watch?v=W-N2ltgU-X4

For Postman: https://www.postman.com/downloads/ https://www.youtube.com/watch?v=7E60ZttwIpY

For MySQL: https://www.youtube.com/watch?v=WuBcTJnIuzo https://linuxconfig.org/install-and-configure-mysql-workbench-on-ubuntu-linux

https://www.youtube.com/watch?v=7S_tz1z_5bA (only first one hour will be sufficient) https://www.mysqltutorial.org/

For Maven: https://www.youtube.com/watch?v=pt3uB0sd5kY https://maven.apache.org/install.html

For JSON: https://www.youtube.com/watch?v=iiADhChRriM

Adding few more links ( for core Java only): https://www.youtube.com/watch?v=pTAda7qU4LY&list=PL59LTecnGM1Mg6I4i_KbS0w5bPcDjl7oz&index=9 https://www.youtube.com/watch?v=70qy6_gw1Hc&list=PL59LTecnGM1Mg6I4i_KbS0w5bPcDjl7oz&index=13 https://www.youtube.com/watch?v=6q98thyEX4Q&list=PLonJJ3BVjZW6_q8gh7XoLUIhRIyBcYJLP https://www.youtube.com/watch?v=7GwptabrYyk

=============================================== The useful links

https://api.github.com/search/users?q=shashi

https://developer.github.com/v3/

https://start.spring.io/

============================= Useful YouTube Playlists:

https://www.youtube.com/watch?v=msXL2oDexqw&list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x

https://www.youtube.com/watch?v=sm-8qfMWEV8&list=PLqq-6Pq4lTTYTEooakHchTGglSvkZAjnE

https://www.youtube.com/watch?v=y8IQb4ofjDo&list=PLqq-6Pq4lTTZSKAFG6aCDVDP86Qx4lNas

https://www.youtube.com/watch?v=o8RO38KbWvA&list=PLqq-6Pq4lTTbXZY_elyGv7IkKrfkSrX5e

https://www.youtube.com/watch?v=upoIwn4rWCo&list=PLqq-6Pq4lTTaoaVoQVfRJPqvNTCjcTvJB

==============================================================

Next week (3rd), we will discuss details of JPA / Hibernate and exception handling in Spring/Spring Boot.
Assignments for next week (at end of 2nd week):

Create REST APIs (Get, POST, DELETE, PUT) for User, Book and save/update/search data to/from MySQL.
Implement GET APIs using query param / path param to search for a book (like using author name ) or user in the DB
Try hitting other GitHub APIs using RestTemplate
Try hitting other APIs with Postman/Browser/Spring code e.g. https://any-api.com/

https://www.youtube.com/watch?v=msXL2oDexqw&list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x You can watch some JPA videos from here (you can watch other videos from this playlist as well). Some other useful videos: https://www.youtube.com/watch?v=gq4S-ovWVlM https://www.youtube.com/watch?v=bNFoN956P2A

===============================

Next weekend, we will discuss following things:
minor project 1
Spring actuator
Loggers
will start Spring Security
Tasks/ Assignments need to be done by next (4th) weekend:
Run all the Apps we discussed in the class using JPA, MongoDB, Exception Handling etc.
Create minor project 1 (details given below)
Read the basics of upcoming topics (Spring actuator, Loggers, Spring Security)
Description for the minor Project 1:
Create Spring Boot App for a library management system, with (at least) following features

APIs for creating/updating/fetching/deleting users
APIs for creating/updating/fetching/deleting/searching books
User can rent a book from library using Spring Boot + REST APIs + MySQL + JPA .

simple-sakai-tool
=================

I created this tool to help me learn how to create tools for Sakai.

I followed this guide (http://tinyurl.com/simple-sakai-tool) to create the tool. The POM file on the website seems to be out of date. But the one in this repo works and is the one you should use. I used Maven 3.2.1.

To create and install this tool:

1. Create a directory called tasklist and copy src directory and pom.xml into it.
2. Copy tasklist directory into sakai-src-2.9.3 directory.
3. Run this command in tasklist directory: mvn clean install
4. A directory called target will be created. Copy the WAR file that is created into %CATALINA_HOME%\webapps directory.
5. Start up Tomcat and go to {server address}:{port}/portal.
6. Create a new site.
7. Go to Worksite Setup, select the site, and click Edit.
8. Click Edit Tools.

You should see a tool called Task List in the list of tools to include on the site.

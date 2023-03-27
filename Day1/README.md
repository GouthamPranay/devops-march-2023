# Day 1

## Apache Ant
- developed by Apache Foundatation as opensource project
- it uses a build.xml file to capture the build instructions
- Ant doesn't have standard convention for project directory structure, etc
- Ant doesn't any built-in mechnanism for dependency management
- Apache Foundation when they used Ant build tool for a complex project called Jakarta they realized Ant is very complex so they wanted to develop an alternated build tool which solves the issues in Ant tool.  This is how Maven was born.

## What is Maven?
- a build tool mostly used in Java projects
- Maven is a language agnostic(independent) tool
- developed by Apache foundation as an opensource project
- Maven has conventions for everything
  - on how we should name a project
  - project folder structure
  - it suggests a specific folder to keep the application source code
  - it suggests a specific folder to keep the automated test code
- Maven supports dependency management
- Maven supports plugin management
- Maven Repositories
  - has a collection of many opensource java library/framework jar files
  - has a collection of many opensource java plugin jar files
  - 3 types
    1. Local Repository
       - is a hidden folder normally created under user home
    2. Private Repository ( Optional )
      - optional
      - can be setup using registry:2 docker image for R&D or learning purpose
      - for production grade setup you can use Sonatype Nexus or JFrog Artifactory
    3. Central Repository ( website )
       search.maven.org is a website that has maven dependency and plugin jars

## What is Maven POM.xml
- POM stands for - Project Object Model
- it is a declarative file

## Maven Alternates
- Apache Ant
- Gradle

## What are Maven Co-ordinates?
There are 3 co-ordinates just like GPS co-ordinates
- groupId
  - is a string
  - recommendation is, it should be reverse domain name of your organization ( if tektutor.org is the domain, reverse domain name is org.tektutor)
  - each word is separated by a dot.
  - camel-case convention must be followed
    Pascal case - AccountNumber
    Camel case - accountNumber
- artifactId
  - follows camel case convention
  - each word is separated by a hypen(-)
  - this represents the name of the jar/war/ear/zip/exe etc
 
- version
  - it is a 3 number format
  - <major version>.<minor version>.<incremental version>
  - For example
    - 1.2.0
    - 1 - Major version
    - 2 - Minor version
    - 0 - incremental version
  
## What is Maven Convention over Configuration ?
- 80-20 Principle
- 80% of the times users only use 20% of the features of any product

  
## What is Maven Repository?

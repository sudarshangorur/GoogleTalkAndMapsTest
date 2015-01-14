GoogleTalkAndMapsTest
=====================

Sample automated tests for GTalk and google maps.

Tools used in project creation
==============================
1. Intellij IDEA (CE version 12)
2. Maven

Nature of the project
=====================
This project is configured as a maven module. If the project is downloaded as a zip, importing the pom.xml should setup the project and bring in dependencies. If the project is forked, import as a maven module for a complete setup.

Assumptions
===========
1. The screen resolution is 1280 X 800. This is important while using mouse events in GTalk client as the cursor is moved along x,y co-ordinates.

Running tests
=============
1. As of now tests can be run through IDE by creating a new JUnit configuration(Run > Edit configurations.. > + JUnit configuration) or from command line using junit.
2. All tests are under test/java

Improvements
============
1. Maven tasks to compile and run tests

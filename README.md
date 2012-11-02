m
=

Simple hello world example for us to test our maven plugin.

## Usage
1. clone the source
2. mvn package
3. java -jar bin/jar/MavenHelloWorld-*.jar

This will write "Hello World!" to the terminal and open a window.

Note that during the mvn package step, our mvn-p2-vt-plugin is called. Unless you have a sqlite database in the current directory, this will fail stating the db cannot be found; however, the plugin will display the correct information before failing.

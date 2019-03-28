docker run ^
       --rm ^
       --name compile ^
       -v "%cd%":/usr/src/mymaven ^
       -w /usr/src/mymaven ^
       maven:3.6.0-jdk-8 ^
       mvn clean install
	   
	   
	   
pause
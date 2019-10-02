all: dev jar clean

dev:
	javac *.java

jar:
	jar cvfe CHIP8.jar Main *

clean:
	rm *.class
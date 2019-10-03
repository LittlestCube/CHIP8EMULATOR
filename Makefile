all: dev clean

dev:
	javac *.java
	jar cvfe CHIP8.jar Main *

run:
	java -jar CHIP8.jar

clean:
	rm *.class || continue

cleanall: clean
	rm CHIP8.jar || continue
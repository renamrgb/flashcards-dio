gradle clean
gradle botJar
#java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005 -jar build/lib/flashcards-dio-1.0.0.jar
java -jar build/lib/flashcards-dio-1.0.0.jar
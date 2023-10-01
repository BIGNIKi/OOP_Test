javac -d .\out .\java\org\example\Main.java .\java\org\models\HeapSort.java
javadoc -d .\javadoc .\java\org\example\Main.java .\java\org\models\HeapSort.java
cd .\out
java -classpath . org.example.Main
pause

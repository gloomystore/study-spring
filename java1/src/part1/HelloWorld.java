package part1;

public class HelloWorld {
    public static void main(String[] args) {
        String a = "string1";
        String b = "퍽유";
        String c = a + b;
        System.out.println(c);
        // 한글이 있을 경우 encoding flag를 달면 됨
        //  javac.exe -d ../out/production/java1 part1.HelloWorld.java -encoding UTF-8
        //  java.exe -cp ../out/production/java1 part1.HelloWorld
    }
}

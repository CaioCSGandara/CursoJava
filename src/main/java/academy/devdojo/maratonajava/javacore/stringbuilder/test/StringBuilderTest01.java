package academy.devdojo.maratonajava.javacore.stringbuilder.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Renekton");
        sb.delete(0, 1);
        sb.insert(0, "R");
        sb.append(" 01");
        System.out.println(sb);
    }
}

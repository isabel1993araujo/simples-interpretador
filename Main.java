public class Main {
    public static void main(String[] args) {
        String program = """
            push 10
            push 20
            add
            pop a
            push 45
            push a
            sub
            print
        """;

        Interpretador i = new Interpretador(program);
        i.run();
    }
}

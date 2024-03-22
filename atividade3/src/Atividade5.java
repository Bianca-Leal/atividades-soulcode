public class Atividade5 {
    public static void main(String[] args) {
        int n = 20;

        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}

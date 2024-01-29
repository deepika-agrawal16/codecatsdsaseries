public class operations {
    public static void main(String[] args) {
        String[] operations = { "--X", "X++", "X++" };
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '+') {
                x = x + 1;

            } else {
                x = x - 1;
            }
        }
        System.out.println(x);

    }
}

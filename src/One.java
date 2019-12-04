    public interface One {
        public final static int EASY = 5;
    }
    class Main implements One {
        public static void main(String[] args) {
            int a = 5;
            test(++a);
        }

        private static void test(int a) {
            a += EASY + a++;
            System.out.println(a);
        }
    }
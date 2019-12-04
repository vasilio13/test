public class Fifteen {
    public static boolean methodOne(){
        System.out.print("methodOne ");
        return false;
    }
    public static boolean methodTwo(){
        System.out.print("methodTwo ");
        return true;
    }
    public static boolean methodThree(){
        System.out.print("methodThree ");
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Fifteen.methodOne()||Fifteen.methodTwo()||Fifteen.methodThree());
    }
}
import java.util.ArrayList;
class Seven {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(2);
        array.add(5);
        array.add(6);
        array.add(1,7);
        System.out.print(array.indexOf(6));
        array.remove(1);
        System.out.print(array.indexOf(6));
    }
}

interface Three {
    void print();
}
class TheClass implements Three {
    public void print() {
        System.out.println("TheClass");
    }
}
class ClassConversion {
    public static void main(String[] args) {
        TheClass c = new TheClass();
        Three i = c;
        i.print();
    }
}
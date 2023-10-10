public class BoyTest {
    public static void main(String[] args) {
        Boy haseeb = new Boy("Haseeb",20);
        Boy ahmad = new Boy();
        haseeb.setName("HASEEB");
        System.out.println(haseeb.getAge());
        System.out.println(haseeb.getName());
        System.out.println(haseeb.sum(9,56));
        System.out.println(haseeb.luckyNumber);
    }
}

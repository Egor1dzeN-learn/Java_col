public class Main {
    public static void main(String[] args) {
        MyArr arr = new MyArr();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        for(Integer el:arr){
            System.out.println(el);
        }
    }
}

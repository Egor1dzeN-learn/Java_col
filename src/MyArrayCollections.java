public class MyArrayCollections implements MyCollections{
    int[] a = new int[10];
    int cnt = 0;
    @Override
    public void add(int n) {
        if(cnt>10){
            System.out.println("out of range");
        }
        else{
            a[cnt] = n;
            cnt++;
        }
    }

    @Override
    public MyIteration iter() {
        return new ArrayItr(a, 10);
    }
}

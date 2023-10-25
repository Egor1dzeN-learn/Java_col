import java.util.Iterator;

public class MyArr implements Iterable<Integer>, Iterator<Integer> {
    int[] arr = new int[10];
    int cnt = 0;
    int i = 0;
    public void add(int el){
        if(cnt>10){
            System.out.println("out of range");
        }
        else{
            arr[cnt] = el;
            cnt++;
        }
    }
    @Override
    public Iterator<Integer> iterator() {
        i = 0;
        return this;
    }

    @Override
    public boolean hasNext() {
        return i<cnt;
    }

    @Override
    public Integer next() {
        if(!hasNext()){
            return -1;
        }
        i++;
        return arr[i-1];
    }
}

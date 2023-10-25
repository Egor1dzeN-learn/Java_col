public class ArrayItr implements MyIteration{
    int[] a;
    int i = 0;
    int N;

    public ArrayItr(int[] a, int N) {
        this.a = a;
        this.N = N;
    }

    @Override
    public boolean hasNext() {
        return i<N;
    }

    @Override
    public int next() {
        if(!hasNext()){
            System.out.println("out of range");
            return -1;
        }
        i++;
        return a[i-1];
    }
}

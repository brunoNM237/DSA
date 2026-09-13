import java.util.ArrayList


class Heap<T> extends Comparable<T> {
    private ArrayList<T> list; 


    public Heap() {
        list = new ArrayList();
    }    


    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second);
        list.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int right(int index) {
        return (2 * index) + 1;
    }

    private int right(int index) {
        return (index + 1 ) * 2;
    }

    public void insert(T value ) {

        list.add(value);
        
        int index = list.size() -1; 


        while (index> 0 && list.get(index).compareTo(list.get(parent(index))) < 0) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    public T remove() throws Exception e  {
        if (list.isEmpty()) {
            throw new Exception("Removendo de heap vazio");

        }

        T temp = list.get(0);

        T 

    }






}
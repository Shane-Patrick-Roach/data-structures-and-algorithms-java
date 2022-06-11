package datastructures.heap;

import java.util.ArrayList;

public class BinaryHeap {

    ArrayList<Integer> values;


    public BinaryHeap() {
        this.values = new ArrayList<>();
    }


    public void insert(int value){
        values.add(value);
        bubbleUp();
        System.out.println(values.toString());
    }




    public void bubbleUp(){
        int idx = values.size() - 1;
        int idx_val = values.get(idx);


        while(idx > 0){
            int parent_idx = (int) Math.floor((idx - 1) / 2);
            int parent_val = values.get(parent_idx);
            if (parent_val >= idx_val){
                values.set(parent_idx, idx_val);
                values.set(idx, parent_val);
                idx = parent_idx;
            } else {
                break;
            }

        }
    }

    @Override
    public String toString() {
        return "BinaryHeap{" +
                "values=" + values +
                '}';
    }
}

package comp.science.ds.queue;

import java.util.*;

public class LRUCache {

    private Deque<Integer> queue ;
    private Map<Integer, Employee> hashMap ;
    private int CACHE_SIZE;


    public LRUCache(int capacity) {
        this.queue = new LinkedList<>();
        this.hashMap = new HashMap<>();
        this.CACHE_SIZE = capacity;
    }

    public void refer(Employee employee){
        int page = employee.hashCode();

        if(hashMap.containsKey(page)){
            queue.remove(page);
        }else{
            if(CACHE_SIZE == queue.size()){
                int last = queue.pollLast();
                hashMap.remove(last);
            }
        }
        queue.addFirst(page);
        hashMap.put(page,employee);
    }

    public void display(){
        Iterator itr = queue.iterator();

        System.out.println("Cache Elements are:");
        while(itr.hasNext()){
            System.out.print("Value:"+itr.next()+"\t");
        }


        System.out.println("Cache Values are:");
        for(Map.Entry<Integer, Employee> value:hashMap.entrySet()){
            System.out.print("Hash:  key="+value.getKey() +" value="+value.getValue()+"\t");
        }

    }

}

package comp.science.ds.queue;

public class SampleQueue {

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(4);
        cache.refer(new Employee(1,"amit","IT"));
        cache.refer(new Employee(2,"anup","CONS"));
        cache.refer(new Employee(3,"riya","MEDI"));
        cache.refer(new Employee(1,"amit","IT"));
        cache.refer(new Employee(4,"rimi","NUT"));
        cache.refer(new Employee(5,"ritu","ADMIN"));
        cache.refer(new Employee(2,"anup","CONS"));
        cache.refer(new Employee(2,"anup","CONS"));
        cache.refer(new Employee(1,"amit","IT"));
        cache.display();

    }
}

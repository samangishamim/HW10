import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class MyHashMap<K, V> {
    private Entry<K, V>[] buckets;
    private int capacity;

    public MyHashMap(int capacity) {
        this.capacity = capacity;
        this.buckets = new Entry[capacity];
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        Entry<K, V> entry = new Entry<>(key, value);
        if (buckets[index] == null) {
            buckets[index] = entry;
        } else {
            Entry<K,V> current=buckets[index];
            while (current.next!=null){
                if (current.key.equals(key)){
                    current.value=value;
                    return;
                }else {
                    current=current.next;
                }
            }
        }
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    private static class Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}

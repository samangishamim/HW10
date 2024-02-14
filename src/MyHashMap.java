import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class MyHashMap<K, V> {
    private class Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        private final int SIZE = 5;
        private Entry<K, V> table[];

        public MyHashMap() {
            table = new Entry[SIZE];
        }

        public void put(K key, V value) {
            int hash = key.hashCode() % SIZE;//12345
            Entry<K, V> e = table[hash];

            if (e == null) {
                table[hash] = new Entry<K, V>(key, value);
            } else {
                while (e.next != null) {
                    if (e.getKey() == key) {
                        e.setValue(value);
                        return;
                    }
                    e = e.next;
                }
                if (e.getKey() == key) {
                    e.setValue(value);
                    return;
                }
                e.next = new Entry<K, V>(key, value);
            }
        }

        public V get(K key) {
            int hash = key.hashCode() % SIZE;//12345
            Entry<K, V> e = table[hash];

            if (e == null) {
                return null;
            }
            while (e != null) {
                if (e.getKey() == key) {
                    return e.getValue();
                }
            e=e.next;
            }
            return null;
        }
    }
}

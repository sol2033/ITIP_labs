import java.util.LinkedList;

public class HashTable <K,V> {
    private int size;
    private LinkedList<Entry<K,V>>[] table;

    @SuppressWarnings("unchecked")
    public HashTable() {
        size = 0;
        table = new LinkedList[16];
    }
    
    private static class Entry <K, V> {
        private K key;
        private V value;

        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }

        public K getKey(){
            return key;
        }

        public V getValue(){
            return value;
        }

        public void setValue(V value){
            this.value = value;
    }

}

    public int hash(K key){
        return Math.abs(key.hashCode()) % table.length;
    }

    public void put(K key, V value){
        int index = hash(key); 

        if (table[index] == null){
            table[index] = new LinkedList<Entry<K,V>>();
        }

        for (Entry <K,V> entry : table[index]){
            if (entry.getKey().equals(key)){
                entry.setValue(value);
                return;
            }
        }
        table[index].add(new Entry<K,V> (key,value));
        size++;
    }

    public V get(K key){
        int index = hash(key);
        
        if (table[index] == null) {
            return null;
        }
        for (Entry <K,V> entry : table[index]){
            if (entry.getKey().equals(key)){
                return entry.getValue();
            }
        }
        return null;
    }

    public V remove(K key){
        int index = hash(key);

        if (table[index] == null) {
            return null;
        }
        
        for (Entry <K,V> entry : table[index]){
            if (entry.getKey().equals(key)){
                V value = entry.getValue();
                table[index].remove(entry);
                size--;
                return value;
            }
        }
        return null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
}
}
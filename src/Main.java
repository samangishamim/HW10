public class Main {
    public static void main(String[] args) {
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        myHashMap.put("A", "Apple");
        myHashMap.put("B", "Banana");
        myHashMap.put("C", "Cherry");

        System.out.println("Contains key 'A': " + myHashMap.containsKey("A"));
        System.out.println("Is HashMap empty: " + myHashMap.isEmpty());
        System.out.println("All values: " + myHashMap);
        System.out.println("Value for key 'A': " + myHashMap.get("A"));

        myHashMap.replace("A", "Apricot");
        System.out.println("Value for key 'A' after replacement: " + myHashMap.get("A"));
    }
}

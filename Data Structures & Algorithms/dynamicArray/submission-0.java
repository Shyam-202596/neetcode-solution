class DynamicArray {
    private int capacity;
    private ArrayList<Integer> arrayList;
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arrayList = new ArrayList<>(capacity);
    }

    public int get(int i) {
        return arrayList.get(i);
    }

    public void set(int i, int n) {
        arrayList.set(i, n);
    }

    public void pushback(int n) {
        if(arrayList.size() == capacity){
            resize();
        }
        arrayList.add(n);
    }

    public int popback() {
        return arrayList.remove(arrayList.size() - 1);
    }

    private void resize() {
        capacity = 2 * capacity;
        arrayList.ensureCapacity(capacity);
    }

    public int getSize() {
        return arrayList.size();
    }

    public int getCapacity() {
        return capacity;
    }
}

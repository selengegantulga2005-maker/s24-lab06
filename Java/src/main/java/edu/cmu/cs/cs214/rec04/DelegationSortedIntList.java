package edu.cmu.cs.cs214.rec04;



public class DelegationSortedIntList implements IntegerList {
    private SortedIntList list = new SortedIntList(); // Хувийн объект үүсгэх [cite: 33]
    private int totalAdded = 0; // [cite: 91]

    @Override
    public boolean add(int value) {
        totalAdded++; // Нэмэх үйлдэл бүрийг тооцно [cite: 35]
        return list.add(value); // Үйлдлийг дамжуулах [cite: 34]
    }

    @Override
    public boolean addAll(IntegerList items) {
        totalAdded += items.size(); // [cite: 35]
        return list.addAll(items); // [cite: 34]
    }

    public int getTotalAdded() {
        return totalAdded; // [cite: 92]
    }

    // Бусад IntegerList-ийн функцуудыг мөн дамжуулах ёстой [cite: 34]
    @Override
    public int get(int index) { return list.get(index); }

    @Override
    public boolean remove(int value) { return list.remove(value); }

    @Override
    public boolean removeAll(IntegerList items) { return list.removeAll(items); }

    @Override
    public int size() { return list.size(); }
}
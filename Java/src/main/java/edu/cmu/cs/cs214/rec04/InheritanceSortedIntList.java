package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList {
    private int totalAdded = 0; // Нийт нэмэгдсэн элементийн тоог хадгалах [cite: 82]

    @Override
    public boolean add(int value) {
        // Элемент нэмэх оролдлого бүрд тоолуурыг нэмэгдүүлнэ [cite: 25]
        totalAdded++;
        return super.add(value);
    }

    @Override
    public boolean addAll(IntegerList list) {
        // Жагсаалтаар элемент нэмэхэд түүний хэмжээгээр тоолуурыг нэмэгдүүлнэ [cite: 25, 26]
        // Анхаар: AbstractIntList-ийн addAll нь add-г дотроо дууддаг бол 
        // тоолуур давхардаж магадгүйг анхаараарай 
        totalAdded += list.size();
        return super.addAll(list);
    }

    public int getTotalAdded() {
        return totalAdded; // Нийт нэмэгдсэн тоог буцаах [cite: 88]
    }
}
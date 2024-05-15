package lesson23.hw;

import java.util.List;

import java.util.*;

public class MyList<T> implements List<T> {
    private List<T> items;

    public MyList() {
        this.items = new ArrayList<>();
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return items.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }

    @Override
    public Object[] toArray() {
        return items.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return items.toArray(a);
    }

    @Override
    public boolean add(T t) {
        items.addFirst(t);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return items.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return new HashSet<>(items).containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return items.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return items.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return items.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return items.retainAll(c);
    }

    @Override
    public void clear() {
        items.clear();
    }

    @Override
    public T get(int index) {
        return items.get(index);
    }

    @Override
    public T set(int index, T element) {
        return items.set(index, element);
    }

    @Override
    public void add(int index, T element) {
        items.add(index, element);
    }

    @Override
    public T remove(int index) {
        return items.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return items.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return items.lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
        return items.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return items.listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return items.subList(fromIndex, toIndex);
    }

    public void addAtIndex(int index, T element) {
        if (index >= 0 && index <= size()) {
            items.add(index, element);
        } else {
            throw new IndexOutOfBoundsException("Недопустимый индекс: " + index);
        }
    }

    public T getMiddle() {
        if (size() == 0) {
            throw new NoSuchElementException("Список пуст.");
        }
        return items.get(size() / 2);
    }
}


package Lab7;

import Lab6.Knight;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySet implements Set<Knight> {

    private static final int Damage = 10;
    private Knight[] elements = new Knight[Damage];
    private int size = 0;

    public MySet() {

    }

    public MySet(Knight armorOfKnight) {
        add(armorOfKnight);

    }

    public MySet(Collection<Knight> collection) {
        addAll(collection);
    }


    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty() {

        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Iterator<Knight> iterator = iterator();
        while (iterator.hasNext()) {
            if (o.equals(iterator.next())) {
                return true;
            }

        }
        return false;
    }

    @Override
    public Iterator<Knight> iterator() {
        return new Iterator<Knight>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public String toString() {
                return "$classname{" + "index=" + index + '}';
            }

            @Override
            public Knight next() {
                return elements[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Knight knight) {
        if (size() == Damage) {
            Knight[] element = new Knight[(int) Math.round(Damage * 1.3)];
            System.arraycopy(elements, 0, element, 0, size());
            element[size++] = knight;
            elements = element;
        }
        if (size() < Damage) {
            elements[size++] = knight;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                for(int j=i;j<elements.length-1;j++){
                    elements[j] = elements[j+1];
                }

                size--;

            }

        }
        return true;
    }

    @Override
    public boolean containsAll (Collection < ? > c){
        if (c.equals(elements)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Knight> c) {
        Iterator<? extends Knight> iterator = c.iterator();
        while (iterator.hasNext()) {
            add(iterator.next());
        }
        return true;
    }
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}

package Lab7;

import Lab6.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySet implements Set<Knight> {

    private static final int Numbers = 20;
    private Knight [] elements = new Knight[Numbers];
    private int size = 0;

    public MySet() {

    }
    public MySet(Knight ArmorOfKnight) {
        add(ArmorOfKnight);

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
        //// isEmpty (): возвращает true, если коллекция пуста, иначе возвращает false

        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Iterator<Knight> iterator = iterator();//Iterator<E> iterator (): возвращает объект Iterator для обхода элементов коллекции
        while (iterator.hasNext()) {
            if (o.equals(iterator.next())) {
                return true;
            }

        }
        return false;
    }

    @Override
    public Iterator<Knight> iterator() {//terator<E> iterator (): возвращает объект Iterator для обхода элементов коллекции
        return new Iterator<>() {
            private int index = 0;
            // с помощью вызова метода next() можно получить следующий элемент. С помощью метода hasNext() можно узнать,
            // есть ли следующий элемент
            //метод remove() удаляет текущий элемент, который был получен последним вызовом next()
            @Override
            public boolean hasNext() {
                return index < size;
            }

           /* @Override
            public String toString() {

                return "$classname{" + "index=" + index + '}';
            }*/

            @Override
            public Knight next() {
                return elements[index++];
            }
        };
    }

    @Override
    public Object[] toArray()  {
        Iterator<Knight> iterator = iterator();
        Object[] o = new  Object[size];
        int index = 0;//Obj
        while (iterator.hasNext()){
            o[index++] = iterator.next();// ect[] toArray (): возвращает массив, содержащий все элементы коллекции
        }
        return o;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if(a.length >= size && a instanceof Knight[]){
            for (int i=0; i< a.length; i++){
                try{
                    a[i] = (T) elements[i];
                } catch (IndexOutOfBoundsException e){
                    a[i]= null;
                }
            }
        } else {
            a = (T[]) toArray();
        }
      return  a;
    }

    @Override
    public boolean add(Knight addedKnight) {
        boolean knightf = false;
        elements[size++] = addedKnight;
        return true;
        //add (E item): добавляет в коллекцию объект item. При удачном добавлении возвращает true, при неудачном - false
       /* if (size() == Numbers) {
            Knight[] element = new Knight[(int) Math.round(Numbers * 1.3)];
            System.arraycopy(elements, 0, element, 0, size());
            element[size++] = knight;
            elements = element;
        }
        if (size() < Numbers) {
            elements[size++] = knight;
        }
        return true;*/
    }

    @Override
    public boolean remove(Object o) {
        Iterator<Knight> iterator = iterator();
        int index =0;
        while (iterator.hasNext()){
            if (iterator.next()==o){
                for (int in= index; in < size; in++){
                    try {
                        elements[in] = elements [in+1];
                    } catch ( IndexOutOfBoundsException e){
                        elements[in]=null;
                    }
                }
                size--;
                return true;
            }
            index++;
        }
        //remove (Object item): возвращает true, если объект item удачно удален из коллекции, иначе возвращается false

        return false;
    }

    @Override
    public boolean containsAll (Collection <?> c){
        Iterator<Knight> iterator = iterator();
        Iterator<?> CIterator = c.iterator();
        while (CIterator.hasNext()){
            while (iterator.hasNext()){
                if (CIterator.next()== iterator.next()){
                    break;
                }
                return  false;
            }
        }
      return  true;
    }

    @Override
    public boolean addAll(Collection<? extends Knight> c) {
        boolean  knightf = false;
        try {
            for ( Knight addingKnight : c){
                if (add(addingKnight)){
                    knightf = true;//addAll (Collection<? extends E> col): добавляет в коллекцию
                }
                add(addingKnight);
            }
        } catch (IndexOutOfBoundsException e){
            return  false;
        }
        // все элементы из коллекции col. При удачном добавлении возвращает true, при неудачном - false
        /*Iterator<? extends Knight> iterator = c.iterator(); //Iterator<E> iterator (): возвращает объект Iterator для обхода элементов коллекции
        while (iterator.hasNext()) {
            add(iterator.next());
        }*/
        return knightf;
    }
    @Override
    public boolean retainAll(Collection<?> c) {
        boolean  knightf = false;
        Iterator<Knight> iterator = iterator();
        Iterator<?> CIterator = c.iterator();
        while (CIterator.hasNext()){
            while (iterator.hasNext()){
                if (CIterator.next() == iterator.next()){
                    break;
                }
                remove(iterator.next());
                size--;
                knightf = true;
            }
        }
        //retainAll (Collection<?> col): удаляет все объекты из текущей коллекции,
        // кроме тех, которые содержатся в коллекции col. Если текущая коллекция после удаления изменилась, возвращает true,
        // иначе возвращается false
        return knightf;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean knightf = false;
        Iterator<Knight> iterator = iterator();
        Iterator<?> CIterator = c.iterator();
        while (CIterator.hasNext()){
            while (iterator.hasNext()){
                if ( CIterator.next().equals(iterator.next())){
                    remove(iterator.next());
                    size--;
                    knightf = true;

                }
            }
        }
        //removeAll (Collection<?> col): удаляет все объекты коллекции col из
        // текущей коллекции. Если текущая коллекция изменилась, возвращает true, иначе возвращается false
        return knightf;
    }

    @Override
    public void clear() {
        for (int i =0; i< size; i++){
            elements[i] = null;//void clear (): удаляет все элементы из коллекции
        }

    }
}

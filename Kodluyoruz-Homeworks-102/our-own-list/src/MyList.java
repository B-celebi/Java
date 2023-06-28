import java.util.Arrays;

public class MyList<T> {
    private T[] liste;
    private int capacity = 10;
    private int size = 0;

    public void shift(int index) {
        for (int i = index; i < capacity; i++) {
            this.liste[i - 1] = this.liste[i];
        }
    }

    public void doubleIt() {
        this.capacity *= 2;
        T[] yeni = (T[]) new Object[this.getCapacity()];
        yeni = Arrays.copyOf(this.liste, this.capacity);
        this.liste = yeni;
    }

    public MyList() {
        this.liste = (T[]) new Object[10];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.liste = (T[]) new Object[this.getCapacity()];
    }

    public int size() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(T data) {
        if (this.size >= this.capacity) {
            doubleIt(); // and give it to the next person
        }
        liste[size] = data;
        size++;
    }

    public T get(int index) {
        if (index >= capacity)
            return null;
        return this.liste[index];
    }

    public T remove(int index) {
        if ((index < capacity - 1) || (this.liste[index] != null)) {
            T removed = liste[index];
            this.liste[index] = null;

            shift(index + 1);
            size--;
            return removed;
        } else {
            return null;
        }
    }

    public void set(int index, T data) {
        if (index < capacity) {
            liste[index] = data;
        }
    }

    public String toString() {
        return Arrays.toString(liste);
    }

    public int indexOf(T data) {
        for (int i = 0; i < capacity; i++) {
            if (liste[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = capacity - 1; i >= 0; i++) {
            if (liste[i] == data)
                return i;
        }
        return -1;
    }

    public T[] toArray() {
        T[] toArrayed = Arrays.copyOf(this.liste, this.liste.length);
        return toArrayed;
    }

    public void clear() {
        for (int i = 0; i < capacity; i++) {
            this.liste[i] = null;
        }
    }

    public MyList<T> sublist(int start, int finish) {
        MyList<T> yeni = new MyList<>();
        for (int i = start; i < finish; i++) {
            yeni.add(this.liste[i]);
        }
        return yeni;
    }

    public boolean contains(T data) {
        for (int i = 0; i < this.liste.length; i++) {
            if (liste[i] == data)
                return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }
}

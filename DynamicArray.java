package dynamicarray;

public class DynamicArray<T> {

    Object[] data;
    int size;

    public DynamicArray() {
        size = 0;
        data = new Object[2];
    }

    public DynamicArray(int releaseSize) {
        size = releaseSize;
    }

    public void Print() {
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }

    public int getCapacity() {
        return data.length;
    }

    public void add(T element) {
        ensureCapacity(size * 2);
        data[size] = element;
        size++;
    }

    public void insertAt(T element, int index) {
        ensureCapacity(size * 2);
        for (int i = data.length - 1; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = element;
        size++;
    }

    public void insertAll(int start, T[] colliction) {
        ensureCapacity(size + colliction.length);
        for (T element : colliction) {
            insertAt(element, start++);
        }

    }

    public void removeAt(int index) {

        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
        size--;
        ensureCapacity(size);
    }

    public void removeAll(int start, int end) {
        for (int i = start; i < end; i++) {
            removeAt(start);
        }

    }

    public int firstIndexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (element == data[i]) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T element) {
        for (int i = size; i > 0; i--) {
            if (element == data[i]) {
                return i;
            }
        }
        return -1;
    }

    public void removeElements(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i] == element) {
                removeAt(i);
            }
        }
    }

    public void revers() {
        for (int i = 0; i < size / 2; i++) {
            Object temp = data[i];
            data[i] = data[size - i - 1];
            data[size - i - 1] = temp;
        }
    }

    public void truncate() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
    }

    public void discharge() {
        for (int i = 0; i < 10; i++) {
            data[i] = null;
        }
        size = 10;
    }

    public T mode() {
        Object element;
        T result = null;
        int counter;
        int max = 0;
        for (int i = 0; i < size; i++) {
            counter = 0;
            element = data[i];
            for (int j = 0; j < size; j++) {
                if (element == data[j]) {
                    counter++;
                }
            }

            if (counter > max) {
                max = counter;
                result = (T) element;
            }
        }
        return result;
    }

    public void trim() {
        Object[] newData = new Object[size];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void ensureCapacity(int newSize) {
        if (data.length > 4 * size) {
            data = copyArray(size * 2);
        }

        if (size == data.length) {
            data = copyArray(newSize);
        }
    }

    private Object[] copyArray(int newSize) {
        Object[] destnation = new Object[newSize + 1];
        for (int i = 0; i < size; i++) {
            destnation[i] = data[i];
        }
        return destnation;
    }

}

package cl5.HOMEWORK;

import java.util.ArrayList;
import java.util.List;

public class IntLinkedList implements IntList {

    private class Element {
        private int value;
        private Element next;
        private Element previous;
        private Element first;
        private Element last;


        public Element(int value) {
            this.value = value;
        }
    }

    private int count = 0;
    private Element header;

    @Override
    public String toString() {
        List<Integer> list = new ArrayList<>();
        return list.toString();
    }

    @Override
    public void add(int value) {
        Element newElement = new Element(value);
        if (header == null) {
            header = newElement;

        } else {
            header.next = newElement;
            newElement.previous = header;

        }
        count++;
    }

    @Override
    public void clear() {
        count = 0;
        header = null;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < count; i++) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        Element result = header.first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }

        return result.value;
    }

    @Override
    public void set(int index, int element) {

    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void add(int index, int element) {

        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        Element newNode = new Element(element);
        if (index == 0) {
            add(element);
        }
        if (index == count) {
            header.next = newNode;
            header = newNode;
        }
        Element oldNode = header;
        for (int i = 0; i < index; i++) {
            oldNode = oldNode.next;
        }
        Element oldPrevious = oldNode.previous;
        oldPrevious.next = newNode;
        oldNode.previous = newNode;

        newNode.previous = oldPrevious;
        newNode.next = oldNode;
        count++;
    }

    @Override
    public int remove(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        return 0;
    }
}

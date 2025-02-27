package com.mycompany.app;

import java.util.AbstractList;
import java.util.List;
import java.util.NoSuchElementException;

public class StringList
    extends AbstractList<String>
    implements List<String> {

    @Override
    public int size() {
        // Implement the size method
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public String get(int index) {
        // Implement the get method
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public String getFirst() {
        if (size() == 0) {
            throw new NoSuchElementException("List is empty");
        }
        return get(0);
    }
}
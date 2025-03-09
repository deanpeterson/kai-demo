package com.mycompany.app;

import java.util.AbstractList;
import java.util.List;
import java.util.NoSuchElementException;

public class StringList
	extends AbstractList<String>
	implements List<String> {

    @Override
    public String getFirst() {
        if (size() == 0) {
            throw new NoSuchElementException("List is empty");
        }
        return get(0);
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public String get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
}
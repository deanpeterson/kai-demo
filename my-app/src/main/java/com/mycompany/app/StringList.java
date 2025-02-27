package com.mycompany.app;

import java.util.AbstractList;
import java.util.List;
import java.util.Optional;

public class StringList
	extends AbstractList<String>
	implements List<String> {

	public Optional<String> getFirst() {
		return size() == 0
				? Optional.empty()
				: Optional.of(get(0));
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
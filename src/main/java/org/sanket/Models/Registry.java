package org.sanket.Models;

import java.util.Set;

public interface Registry<E> {
    boolean add(E e);
    boolean remove(E e);
    boolean isEmpty();
    int size();
    boolean contains(E e);
}

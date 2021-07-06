package br.univille.estd.list;

public interface List<T> {

    void addFirst(T value);
    void addLast(T value);
    T getFirst();
    T getLast();
    T removeFirst();
    T removeLast();
    void add(T value);
    void add(int position, T value);
    T get(int position);
    T remove(int position);
    T set(int position, T value);
    int size();
    boolean isEmpty();
    void clear();
    boolean contains(T value);
    Object[] toArray();

}

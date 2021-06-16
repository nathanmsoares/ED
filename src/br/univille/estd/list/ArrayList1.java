package br.univille.estd.list;

public class ArrayList1<T>  implements List<T>  {

    // valor padr�o para a capacidade do vetor.
    private final static int DEFAULT_CAPACITY = 100;

    protected int size;
    protected int capacity;
    protected T array[];

    public ArrayList1(){
        this(DEFAULT_CAPACITY);
    }

    public ArrayList1(int capacity){
        System.out.println(capacity);
        size = 0;
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }


    @Override
    public void addFirst(T value) {
        add(0,value);
    }

    @Override
    public void addLast(T value) {
        add(value);
    }

    @Override
    public T getFirst() {
        checkPosition(0);
        return get(0);
    }

    @Override
    public T getLast() {
        checkPosition(size()-1);
        return get(size()-1);
    }

    @Override
    public T removeFirst() {
        checkPosition(0);
        return remove(0);
    }

    @Override
    public T removeLast() {
        checkPosition(size()-1);
        return remove(size()-1);
    }

    /**
     * Adiciona um elemento no final da lista.
     * @param value
     */
    @Override
    public void add(T value) {
        ensureCapacity(size+1);
        array[size()] = value;
        size++;
    }

    @Override
    public void add(int position, T value) {
        if(position < 0 || position > size())
        throw new IndexOutOfBoundsException("Posi��o ["+position+"] inv�lida para uma lista de tamanho ["+size()+"].");
        ensureCapacity(size+1);
        for(int i = size; i >= position; i--){
            array[i] = array[i-1];
        }
        array[position] = value;
        size++;
    }

    @Override
    public T get(int position) {
        checkPosition(position);
        return array[position];
    }

    @Override
    public T remove(int position) {
        checkPosition(position);
        T old = array[position];

        for(int i = position; i < size; i++){
            array[i] = array[i+1];
        }
        size--;
        return old;
    }

    @Override
    public T set(int position, T value) {
        checkPosition(position);
        T old = array[position];
        array[position] = value;
        return old;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {
        for(int i = 0; i < size(); i++){
            array[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean contains(T value) {
        for(int i = 0; i < size(); i++){
            if(array[i] != null && array[i].equals(value)){
                return true;
            }
            if(array[i]  == null && value == null){
                return true;
            }
        }
        return false;
    }

    private void checkPosition(int position){
        if(position < 0 || position >= size())
            throw new IndexOutOfBoundsException("Posi��o ["+position+"] inv�lida para uma lista de tamanho ["+size()+"].");

    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > this.capacity) {
            this.capacity *= 2;
            T newArray[] = (T[]) new Object[this.capacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
                array = newArray;
            }
        }
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        for(int i = 0; i < size; i++) {
            array[i] = this.array[i];
        }
        return array;
    }

}

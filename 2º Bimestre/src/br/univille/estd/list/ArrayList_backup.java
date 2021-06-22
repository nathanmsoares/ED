package br.univille.estd.list;

public class ArrayList_backup {
    private int size;
    private int capacity;
    private DataPackage array[];

    public ArrayList_backup(int capacity){
        size = 0;
        this.capacity = capacity;
        array = new DataPackage[capacity];
    }

    public void add(DataPackage data) {
        int newData = data.getData();
        int i = size;
        for(; (i >= 1) && (newData > array[i -1].getData()); i--){
            array[i] = array[i + 1];
            array[i] = data;
        }
    }
}

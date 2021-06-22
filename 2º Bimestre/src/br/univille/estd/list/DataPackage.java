package br.univille.estd.list;

public class DataPackage {
    private int position;
    private int data;

    
    public DataPackage(String data_string) {
        this.position = Integer.parseInt(data_string.substring(0, 4));
        this.data = Integer.parseInt(data_string.substring(4));
    }


    public int getPosition() {
        return position;
    }


    public void setPosition(int position) {
        this.position = position;
    }


    public int getData() {
        return data;
    }


    public void setData(int data) {
        this.data = data;
    }

    

}
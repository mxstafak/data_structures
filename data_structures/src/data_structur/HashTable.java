package data_structur;

/**
 *
 * @author ziade
 */
public class HashTable {

    final int Size = 257;
    int[] arrayHash = new int[Size];
    int[] repeat = new int[Size];

    public HashTable()
    {
    }

    public int getHash(int key) 
    {
        return key % Size;
    }

    public void put(int key)
    {
        int index = getHash(key);
        if ( search(key)){
            repeat[key]++;
    }else {
            arrayHash[index] = key;
        repeat[index]++;
        
    }}

    public boolean search(int key)
    {
        for (int i = 0; i < arrayHash.length; i++)
        {
            if (arrayHash[i] == key) {
                return true;}
        }
        return false;
    }
    public int get (int key)
    {
        int value =0 ;
        for (int i=0; i<Size; i++)
        {
            if(arrayHash[i]==arrayHash[key])
                value=arrayHash[i];
        }
        return value;
    }
    public void getmax()
    {
        int max=0;
        int max_value =0;
        for (int i=0; i<Size; i++)
        {
            if (repeat[i]>max){
                max= repeat[i];
                max_value =arrayHash[i];
            } }
        System.out.println(" ");
        if (max_value ==32 ){
            System.out.println("space " + max);
        }else {
        char casting = (char) max_value;
        System.out.println( casting +" " + max);
        }}

}

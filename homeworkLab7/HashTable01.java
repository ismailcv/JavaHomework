package homeworkLab7;

public class HashTable01 <T> {
    HT_Node[] hashDizisi;
    int size;
    int key;
    public  HashTable01(int size){
        this.size=size;
        hashDizisi = new HT_Node[size];
        for(int i=0;i<size;i++){
            hashDizisi[i]=new HT_Node();
        }
    }
    int getHash(int key){
        return key%size;
    }
    void delete(int key){
        hashDizisi[key]= null; 
    }
    
    public void ekle( String value,String value2){
        String sirala="abcdefgðhýijklmnoöprsþtuüvyz";
        char h=value.charAt(0);
        

        for(int i=0;i<sirala.length();i++){
            if(sirala.charAt(i)==h){
                key=getHash(i);
            }
        }
        int Hindex=getHash(key);
        HT_Node deger= hashDizisi[Hindex];
        HT_Node yeni = new HT_Node(key,value,value2);
        yeni.next=deger.next;
        deger.next=yeni;
    }
    
    public T get(int key){
        T value = null;
        int Hindex=getHash(key);
        HT_Node arrayValue=hashDizisi[Hindex];
        while(arrayValue != null){
            if(arrayValue.getKey()==key){
                value=(T)arrayValue.getObject();
            }
            arrayValue=arrayValue.next;
        }
        return value;
    }
}

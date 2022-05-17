package homeworkLab7;

public class HT_Node {
	int key;
    String value;
    String value2;
    HT_Node next;

    public HT_Node(int key, String value,String value2){
    this.key=key;
    this.value=value;
    this.value2=value2;
    next=null;
    }
    public HT_Node(){
        next=null;
    }
    public int getKey(){
        return key;
    }
    public Object getObject(){
        return value;
    }
}

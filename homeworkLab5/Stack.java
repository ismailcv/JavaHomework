package homeworkLab5;

public class Stack {
    StackNode head=null;
    
//push listenin ba��na yeni eleman eklemeye yarar.    
    void push( Object data){ 
        StackNode newNode = new StackNode();
        newNode.data = data;
        StackNode temp = head;
        
            head = newNode;
            newNode.next = temp;  
    }

//pop listenin ba��ndan eleman siler.    
    void pop(){
       StackNode temp = head;
       head = temp.next;
    }
 
//peek listenin ba��ndaki eleman� okumam�z� sa�lar.    
    void peek(){ 
        System.out.println("peek de�eri : " + head.data);
    }
    
    void isEmpty(){
        if(head == null){
            System.out.println("stack yap�s� bo�tur.");
        }else{
            System.out.println("stack var .");
        }   
    }
 
//Listeyi temizler.    
    void clear(){  
       if(head == null){
           System.out.println("zaten bo�");
       }
       else
            while(head != null){
                head = head.next;
            }
    }
    
    
    void println(){
         StackNode temp = head;
         while(temp != null){
             System.out.print(temp.data+"\n||\n");
             temp = temp.next;
         }   
    }
}

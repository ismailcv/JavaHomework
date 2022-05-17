package homeworkLab5;

public class Stack {
    StackNode head=null;
    
//push listenin baþýna yeni eleman eklemeye yarar.    
    void push( Object data){ 
        StackNode newNode = new StackNode();
        newNode.data = data;
        StackNode temp = head;
        
            head = newNode;
            newNode.next = temp;  
    }

//pop listenin baþýndan eleman siler.    
    void pop(){
       StackNode temp = head;
       head = temp.next;
    }
 
//peek listenin baþýndaki elemaný okumamýzý saðlar.    
    void peek(){ 
        System.out.println("peek deðeri : " + head.data);
    }
    
    void isEmpty(){
        if(head == null){
            System.out.println("stack yapýsý boþtur.");
        }else{
            System.out.println("stack var .");
        }   
    }
 
//Listeyi temizler.    
    void clear(){  
       if(head == null){
           System.out.println("zaten boþ");
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

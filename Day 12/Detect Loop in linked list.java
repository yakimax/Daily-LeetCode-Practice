import java.uitl.*;
class Solution1 {
    public static boolean detectLoop(Node head){                         //using hashSet of node address
        HashSet<Node>hs = new HashSet<>() ;
        while(head != null){
            hs.add(head);
            head = head.next ;
            if(hs.contains(head)){
                return true ;
            }
        }
        return false ;
    }
}

class Solution {
    public static boolean detectLoop(Node head){                           //using rabiit and turle floyed algorithms
        Node Rabbit = head ;
        Node turtle = head ;
        
        while( Rabbit != null && Rabbit.next != null ){
            Rabbit = Rabbit.next.next ;
            turtle = turtle.next ;
            if( Rabbit == turtle ){
                return true ;
            }
        }
        
        return false ;
    }

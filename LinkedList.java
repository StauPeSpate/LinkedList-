import java.util.NoSuchElementException;

public class LinkedList<T> {

    private Link<T> head; // the first element of the linked list
    private Link<T> tail; // the last element of the linked list

    /**
     * Constructor that sets the empty linked list
     * */

    public LinkedList(){
        head=null;
        tail=null;
    }

    /**
     * Method to test the linked list is empty or not
     * */
    public boolean isEmpty(){
        if(head==null && tail==null){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Methot that returns the element in position i in the linked list
     * @param i is the position in which we find the element that we want to output
     * */
    public T elementAt(int i) throws NoSuchElementException {
        if(i<0) {
            throw new NoSuchElementException();
        }
        Link<T> curItem = head;
        for(int j=0;j<i;j++){
            if(curItem.getNext()==null){
                throw new NoSuchElementException();
            }
            else{
                curItem = curItem.getNext();
            }
        }
        return curItem.getElement();
    }


    /**
     * Method that inserts an element in position i in the linked list
      * */
    public void insertAt(int i,T e) throws NoSuchElementException{
        if(i<0) {
            throw new NoSuchElementException();
        }
        Link<T> newNode=new Link<T>(e,null);
        if(isEmpty()){
            head=newNode;
            head.setNext(tail);
        }
        else{
            if(i==0){
                newNode.setNext(head);
                head=newNode;
            }
            else{
                Link<T> curItem = head;
                for (int j = 1; j < i-1; j++) {
                   
                        curItem = curItem.getNext();
                    
                }
                if(curItem==null){
                	throw new NoSuchElementException();
                }
                Link<T> temp = curItem.getNext();
                curItem.setNext(newNode);
                newNode.setNext(temp);
            }
        }
    }


public void printLink()
{
	Link <T> curItem = head;
	while(curItem != null)
	{
		System.out.println(curItem.getElement());
	    curItem = curItem.getNext();
	    
	}
	
}
}


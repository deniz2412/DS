package org.DSA;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;

    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }

    //Helper method isEmpty
    private boolean isEmpty(){
        return first == null;
    }
    //RemoveIndexed
    public void removeIndexed(int index){
        //Counter to get it there
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last){
            first = last = null;
            return;
        }
        //Go till you find the element while saving previous then stop
        int counter = 0;
        var current = first;
        Node previous = null;
        while(current.next!=null && counter < index){
            previous = current;
            current = current.next;
            counter++;

        }
        //When you find the current(to be deleted) and previous node
        //Copy the current next to previous next and detach current next

        previous.next = current.next;
        current.next=null;



    }


    //addFirst
    //Set first to inserted one and detach it from current; Link inserted to point to next
    public void addFirst(int item){
        var node = new Node(item);
        if(isEmpty()){
            first = last = node;
            }
        else{
            node.next = first;
            first = node;
        }
    }
    //addLast
    public void addLast(int item){
        var node = new Node(item);

        if(isEmpty()){
            first = last = node;
        }
        else{
            last.next = node;
            last = node;
        }

    }
    //deleteLast
    public void deleteLast(){
        if(isEmpty())
            throw new NoSuchElementException();

        if(first==last){
            first = last = null;
            return;
        }


        var current = first;
        while(current != null){
            if (current.next == last){
                break;
            }
            current = current.next;
        }
        last = current;
        current.next = null;
    }

    //deleteFirst
    public void deleteFirst(){
        //(first) 1-2-3 (last)
        //store first to temp de-link first and link it to 2
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(first == last){
            first = last = null;
            return;
        }
        
        var temp = first.next;
        first.next = null;
        first = temp;

    }

    //contains
    public boolean contains(int item){
        return indexOf(item) != -1;
    }
    //indexOf
    //Go through the list and count till you reach the element if next on last is null
    public int indexOf(int item){
        int index = 0;
        var current = first;
        while(current!=null){
            if(current.value == item){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
}

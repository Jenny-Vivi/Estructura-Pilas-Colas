package Materia;

import java.util.NoSuchElementException;

import Materia.Models.NodoGenerico;

public class ColaGenerica<T> {
    private NodoGenerico<T> firts;
    private NodoGenerico<T>last;
    
    public void addNode(T data){
        NodoGenerico<T> nuevoNodo=new NodoGenerico<>(data);
        if(isEmpty()){
            firts=nuevoNodo;
            last=nuevoNodo;
        }
        else{
            last.next=nuevoNodo;
            last=nuevoNodo;
        }
    }
    public T remove(){
        if(isEmpty()){
            throw new NoSuchElementException("La Cola esta vacia");

        }
        T value =firts.data;
        firts=firts.next;
        
        if(firts==null){
            last=null;
        }
        return value;
    }
    public  T peek(){
        if(isEmpty()){
            throw new NoSuchElementException("La Cola esta vacia");

        }
        return firts.data;

    }
    public boolean isEmpty(){
        return firts==null;
    }
}

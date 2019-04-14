package com.mycompany.mavenproject2;


public class Thproduce extends Thread implements Runnable{
    
    Item i;
    
    public Thproduce(Item item){
    
        i=item;
    }
    
    @Override
    public void run(){
    
        System.out.print("Uruchomiono: "+this.getName());
        i.produceMe();
    }
    
}

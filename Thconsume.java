package com.mycompany.mavenproject2;


public class Thconsume extends Thread{
    Item i;
    
    public Thconsume(Item item){
    
        i=item;
    }
    
    
        @Override
        public void run(){
    
        System.out.print("Uruchomiono: "+this.getName());
        i.consumeMe();
    }
    
}

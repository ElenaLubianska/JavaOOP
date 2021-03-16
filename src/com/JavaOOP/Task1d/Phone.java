package com.JavaOOP.Task1d;

public class Phone {
    private int numberPhone;
    private Network network;

    public Phone(int numberPhone){
        this.numberPhone = numberPhone;

    }

    public int getNumberPhone(){
        return numberPhone;
    }
    public void setNumberPhone(int numberPhone){
        this.numberPhone = numberPhone;
    }


    public void registrationInNetwork(){

    }

    public void call(int number){

    }

    @Override
    public String toString() {
        return "Phone{" +
                "numberPhone=" + numberPhone +
                '}';
    }
}

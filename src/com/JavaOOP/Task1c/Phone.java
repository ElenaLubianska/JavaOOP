package com.JavaOOP.Task1c;

public class Phone {
    private long number;
    private Network network;

    public Phone(long number) {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
    public void registrationNetwork(Network network){
        this.network = network;
        if(!this.network.addNumber(this)) this.network = null;
    }
    public void call(long number){
        if(this.network == null){
            System.out.println("your phone number " + number + "don't register in network");
        return;
        }

        Phone tempPhone = this.network.getPhoneNumber(number);

        if(tempPhone != null){
            tempPhone.incomingCall();
        } else{
            System.out.println("Abonent not aviable");
        }
    }
    public void incomingCall(){
        System.out.println(this + "dzz dzz");
    }

}

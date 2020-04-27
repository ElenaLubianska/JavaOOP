package com.JavaOOP.Task1c;

public class Network {
    private Phone [] arrayNetwork = new Phone[0];

    public Network() {
        super();
    }

    private int getPhoneInArray(Phone phone){
        for(int i = 0; i < arrayNetwork.length; i++){
            if(arrayNetwork[i].getNumber() == phone.getNumber()) return i;
        }
        return -1;
    }
    public boolean addNumber(Phone phone){
        if(getPhoneInArray(phone) != 1){
            System.out.println("phone number is " + phone.getNumber() + "in the network");
            return false;
            }
        Phone [] temp = new Phone[arrayNetwork.length + 1];
        System.arraycopy(arrayNetwork,0,temp,0,arrayNetwork.length);
        temp [temp.length - 1] = phone;
        arrayNetwork = temp;
        return true;
    }

    public Phone getPhoneNumber(long phoneNumber){
        for (Phone phone:arrayNetwork) {
            if(phone.getNumber() == phoneNumber) return phone;
        }
        return null;
    }
}

package com.JavaOOP.Task1d;

public class Network {
    private Phone[] phones = new Phone[0];

    public Network(){}

    public boolean addPhone(Phone phone){
        if(getPhoneIntoArr(phone) != -1){
            System.out.println("Phone number " + phone.getNumberPhone() + "is in network");
            return false;
        }
        Phone[] tmp = new Phone[phones.length + 1];
        System.arraycopy(phones,0,tmp, 0, phones.length);
        tmp[tmp.length - 1] = phone;
        phones = tmp;
        return true;
    }
    public int getPhoneIntoArr(Phone phone){
        for(int i = 0; i < phones.length; i++){
            if(phones[i].getNumberPhone() == phone.getNumberPhone()){
                return i;
            }
        }
        return -1;
    }
}

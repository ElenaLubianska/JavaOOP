package com.JavaOOP.Task1c;

public class Main {
    public static void main(String[] args) {
        Network network = new Network();


        Phone phone1 = new Phone(12345);
        Phone phone2 = new Phone(509321692);
        Phone phone3 = new Phone(982218319);

        phone1.registrationNetwork(network);
        phone1.call(509321692);

    }
}

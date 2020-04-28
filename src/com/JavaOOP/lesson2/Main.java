package com.JavaOOP.lesson2;

public class Main {
    public static void main(String[] args) {

        Body body = new Body();

        SmallHead sh = new SmallHead();
        MediumHead mh = new MediumHead();
        BigHead bh = new BigHead();
        Leg leg = new Leg();


        Robot <SmallHead> robot = new Robot <SmallHead>(body, sh);
        Robot <BigHead> robot1 = new Robot<BigHead>(body, bh);
        robot.getHead().burn();
        robot1.getHead().turn();

        Robot robot2 = new Robot(body, mh);



    }
}

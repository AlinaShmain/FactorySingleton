package com.company;

public class Subscriber extends User {

    @Override
    protected UserType getUserType() {
        return UserType.SUBSCRIBER;
    }
}

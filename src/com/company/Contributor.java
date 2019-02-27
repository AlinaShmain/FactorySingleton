package com.company;

public class Contributor extends User {

    @Override
    protected UserType getUserType() {
        return UserType.CONTRIBUTOR;
    }
}

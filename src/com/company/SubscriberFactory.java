package com.company;

import java.util.ArrayList;
import java.util.List;

public class SubscriberFactory extends UserWithRightsFactory {

    private static SubscriberFactory instance;

    private SubscriberFactory() {}

    public static SubscriberFactory getInstance(){
        if(instance == null){
            instance = new SubscriberFactory();
        }

        return instance;
    }

    @Override
    protected User createUser() {
        User user = new Subscriber();
        List<Right> rights = getRights();
        user.setRights(rights);
        return user;
    }

    @Override
    protected List<Right> getRights() {
        List<Right> subscriberRights = new ArrayList<Right>();
        subscriberRights.add(Right.EDIT_USER_LIMITED);

        return subscriberRights;
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class ContributorFactory extends UserWithRightsFactory {

    private static ContributorFactory instance;

    private ContributorFactory() {}

    public static ContributorFactory getInstance(){
        if(instance == null){
            instance = new ContributorFactory();
        }

        return instance;
    }

    @Override
    protected User createUser() {
        User user = new Contributor();
        List<Right> rights = getRights();
        user.setRights(rights);
        return user;
    }

    @Override
    protected List<Right> getRights() {
        List<Right> contributorRights = new ArrayList<Right>();
        contributorRights.add(Right.EDIT_USER_LIMITED);
        contributorRights.add(Right.CREATE_POST_LIMITED);
        contributorRights.add(Right.EDIT_USER_LIMITED);
        contributorRights.add(Right.DELETE_POST_LIMITED);

        return contributorRights;
    }
}

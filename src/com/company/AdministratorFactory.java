package com.company;

import java.util.ArrayList;
import java.util.List;

public class AdministratorFactory extends UserWithRightsFactory{

    private static AdministratorFactory instance;

    private AdministratorFactory() {}

    public static AdministratorFactory getInstance(){
        if(instance == null){
            instance = new AdministratorFactory();
        }

        return instance;
    }

    @Override
    protected User createUser() {
        User user = new Administrator();
        List<Right> rights = getRights();
        user.setRights(rights);
        return user;
    }

    protected List<Right> getRights(){
        List<Right> adminRights = new ArrayList<Right>();
        adminRights.add(Right.CREATE_USER);
        adminRights.add(Right.EDIT_USER_FULL);
        adminRights.add(Right.REMOVE_USER);
        adminRights.add(Right.CREATE_POST_FULL);
        adminRights.add(Right.EDIT_POST_FULL);
        adminRights.add(Right.PUBLISH_POST_FULL);
        adminRights.add(Right.MANAGE_COMMENTS_FULL);
        adminRights.add(Right.MODIFY_CORE_FILES);
        adminRights.add(Right.MANAGE_USERS);

        return adminRights;
    }
}
package com.company;

import java.util.ArrayList;
import java.util.List;

public class AuthorFactory extends UserWithRightsFactory {

    private static AuthorFactory instance;

    private AuthorFactory() {}

    public static AuthorFactory getInstance(){
        if(instance == null){
            instance = new AuthorFactory();
        }

        return instance;
    }

    @Override
    protected User createUser() {
        User user = new Author();
        List<Right> rights = getRights();
        user.setRights(rights);
        return user;
    }

    @Override
    protected List<Right> getRights() {
        List<Right> authorRights = new ArrayList<Right>();
        authorRights.add(Right.CREATE_POST_LIMITED);
        authorRights.add(Right.EDIT_POST_LIMITED);
        authorRights.add(Right.PUBLISH_POST_LIMITED);
        authorRights.add(Right.DELETE_POST_LIMITED);
        authorRights.add(Right.EDIT_USER_LIMITED);

        return authorRights;
    }


}

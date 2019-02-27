package com.company;

import java.util.ArrayList;
import java.util.List;

public class EditorFactory extends UserWithRightsFactory {

    private static EditorFactory instance;

    private EditorFactory() {}

    public static EditorFactory getInstance(){
        if(instance == null){
            instance = new EditorFactory();
        }

        return instance;
    }

    @Override
    protected User createUser() {
        User user = new Editor();
        List<Right> rights = getRights();
        user.setRights(rights);
        return user;
    }

    @Override
    protected List<Right> getRights(){
        List<Right> editorRights = new ArrayList<Right>();
        editorRights.add(Right.EDIT_USER_LIMITED);
        editorRights.add(Right.CREATE_POST_FULL);
        editorRights.add(Right.EDIT_POST_FULL);
        editorRights.add(Right.PUBLISH_POST_FULL);
        editorRights.add(Right.DELETE_POST_FULL);
        editorRights.add(Right.MANAGE_COMMENTS_LIMITED);

        return editorRights;
    }
}

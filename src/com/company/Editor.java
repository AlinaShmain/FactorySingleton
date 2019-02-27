package com.company;

import java.util.List;

public class Editor extends User {

    List<Post> managedPosts;
    List<String> managedComments;

    void setNewPost(Post post){
        managedPosts.add(post);
    }

    List<Post> getManagedPosts() { return managedPosts; }

    void setNewComment(String comment){
        managedComments.add(comment);
    }

    public List<String> getManagedComments() {
        return managedComments;
    }

    @Override
    protected UserType getUserType() {
        return UserType.EDITOR;
    }
}

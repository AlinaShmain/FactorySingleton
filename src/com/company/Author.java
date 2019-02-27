package com.company;

import java.util.List;

public class Author extends User {

    List<Post> managedPosts;

    void setNewPost(Post post){
        managedPosts.add(post);
    }

    List<Post> getManagedPosts() { return managedPosts; }

    @Override
    protected UserType getUserType() {
        return UserType.AUTHOR;
    }
}

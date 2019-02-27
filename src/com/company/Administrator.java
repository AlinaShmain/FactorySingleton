package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Administrator extends User {

    List<User> managedUsers;
    List<File> managedFiles;
    List<Post> managedPosts;
    List<String> managedComments;

    Administrator(){
        managedUsers = new ArrayList<User>();
        managedFiles = new ArrayList<File>();
        managedPosts = new ArrayList<Post>();
        managedComments = new ArrayList<String>();
    }

    void setNewUser(User user){
        managedUsers.add(user);
    }

    List<User> getManagedUsers(){
        return managedUsers;
    }

    void setNewPost(Post post){
         managedPosts.add(post);
    }

    List<Post> getManagedPosts() { return managedPosts; }

    void setNewFile(File file){
        managedFiles.add(file);
    }

    List<File> getManagedFiles() { return managedFiles; }

    void setNewComment(String comment){
        managedComments.add(comment);
    }

    public List<String> getManagedComments() {
        return managedComments;
    }

    @Override
    protected UserType getUserType() {
        return UserType.ADMINISTRATOR;
    }
}

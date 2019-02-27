package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class User {

    Name name;
    ContactInfo contactInfo;
    String id;
    List<Right> rights;

    void setName(Name name){
        this.name = name;
    }

    Name getName(){
        return name;
    }

    void setId(String id){
        this.id = id;
    }

    String getId(){
        return id;
    }

    void setContactInfo(ContactInfo contactInfo){
        this.contactInfo = contactInfo;
    }

    ContactInfo getContactInfo(){
        return contactInfo;
    }

    void setRights(List<Right> rights){
        this.rights = new ArrayList<Right>();
        this.rights.addAll(rights);
    }

    protected abstract UserType getUserType();

    void printInfo(){
        System.out.println("<<" + this.getUserType() + ">>");
        System.out.println("\t" + this.name.getFirstName() + " " + this.name.getLastName());
        if(this.getUserType() == UserType.ADMINISTRATOR) {
            System.out.println("\t\tManaged users: ");
            for (User mUser : ((Administrator)this).getManagedUsers()) {
                System.out.println("\t\t\t<" + mUser.getUserType() + ">");
                System.out.println("\t\t\t\t" + mUser.getName().getFirstName() + " " + mUser.getName().getLastName());
            }
        }
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();

        Name nameA = new Name();
        nameA.setFirstName("Anthon");
        nameA.setLastName("Voroncov");

        String idA = "7877ggt";

        ContactInfo contactInfoA = new ContactInfo();
        contactInfoA.setEmail("anthon_vor@mail.com");
        contactInfoA.setTelNumber("98377282263");

        User admin = createAdministrator(nameA, idA, contactInfoA);
        users.add(admin);

        Name nameE = new Name();
        nameE.setFirstName("Karina");
        nameE.setLastName("Suvorova");

        String idE = "938fjs";

        ContactInfo contactInfoE = new ContactInfo();
        contactInfoE.setEmail("karina_suv@mail.com");
        contactInfoE.setTelNumber("98338383944");

        User editor = createEditor(nameE, idE, contactInfoE);
        users.add(editor);

        Name nameAu = new Name();
        nameAu.setFirstName("Kirill");
        nameAu.setLastName("Soloviev");

        String idAu = "1033dks";

        ContactInfo contactInfoAu = new ContactInfo();
        contactInfoE.setEmail("kirill_sol@mail.com");
        contactInfoE.setTelNumber("9884579300");

        User author = createAuthor(nameAu, idAu, contactInfoAu);
        users.add(author);

        Name nameC = new Name();
        nameC.setFirstName("Pavel");
        nameC.setLastName("Shulov");

        String idC = "1383jkf";

        ContactInfo contactInfoC = new ContactInfo();
        contactInfoC.setEmail("pavel_shu@mail.com");
        contactInfoC.setTelNumber("948934823");

        User contributor = createContributor(nameC, idC, contactInfoC);
        users.add(contributor);


        ((Administrator)admin).setNewUser(editor);
        ((Administrator)admin).setNewUser(author);
        ((Administrator)admin).setNewUser(contributor);


        printAllUsers(users);
    }

    private static void printAllUsers(List<User> users){
        for(User user : users){
            user.printInfo();
        }
    }

    private static User createAdministrator(Name name, String id, ContactInfo contactInfo){
        UserWithRightsFactory administratorFactory = AdministratorFactory.getInstance();

        return createUser(administratorFactory, name, id, contactInfo);
    }

    private static User createEditor(Name name, String id, ContactInfo contactInfo){
        UserWithRightsFactory editorFactory = EditorFactory.getInstance();

        return createUser(editorFactory, name, id, contactInfo);
    }

    private static User createAuthor(Name name, String id, ContactInfo contactInfo){
        UserWithRightsFactory authorFactory = AuthorFactory.getInstance();

        return createUser(authorFactory, name, id, contactInfo);
    }

    private static User createContributor(Name name, String id, ContactInfo contactInfo){
        UserWithRightsFactory contributorFactory = ContributorFactory.getInstance();

        return createUser(contributorFactory, name, id, contactInfo);
    }

    private static User createSubscriber(Name name, String id, ContactInfo contactInfo){
        UserWithRightsFactory subscriberFactory = SubscriberFactory.getInstance();

        return createUser(subscriberFactory, name, id, contactInfo);
    }

    private static User createUser(UserWithRightsFactory factory, Name name, String id, ContactInfo contactInfo){
        User user = factory.createUser();
        user.setName(name);
        user.setId(id);
        user.setContactInfo(contactInfo);

        return user;
    }
}

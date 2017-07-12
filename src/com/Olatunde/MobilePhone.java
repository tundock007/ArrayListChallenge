package com.Olatunde;

import java.util.ArrayList;

/**
 * Created by tundo on 7/11/2017.
 */
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >=0 ) {
            System.out.println("Contact is already on file");
            return  false;

        }

        myContacts.add(contact);
    }
}

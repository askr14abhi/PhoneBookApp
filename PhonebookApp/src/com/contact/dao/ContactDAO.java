package com.contact.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactDAO {
    private static final Map<String, Contact> contactMap = new HashMap<String, Contact>();
    
    static {
    	initCncts();
    }

	private static void initCncts() {
		// TODO Auto-generated method stub
		
		Contact cnct1 = new Contact("Ashok Kumar","Raparthi Ashok kumar","9703845445");
		Contact cnct2 = new Contact("Amil","Kesavarapu Anil Kumar","9494874369");
		Contact cnct3 = new Contact("Amma","Raparthi Nanaji","9490306426");
		Contact cnct4 = new Contact("Swamy","Routhu Rama Swamy","9966535684");
		Contact cnct5 = new Contact("Sudha","Tundilam Sudha Rani","9894796412");
		Contact cnct6 = new Contact("Ruksana","Nishath Ruksana","8125356492");
		
		contactMap.put(cnct1.getContactName(), cnct1);
		contactMap.put(cnct2.getContactName(), cnct2);
		contactMap.put(cnct3.getContactName(), cnct3);
		contactMap.put(cnct4.getContactName(), cnct4);
		contactMap.put(cnct5.getContactName(), cnct5);
		contactMap.put(cnct6.getContactName(), cnct6);
		
		
	}
	
	public static List<Contact> getContact(String contactName) {
		List<Contact> list = new ArrayList<Contact>();
		
		list.add(contactMap.get(contactName));
		return list;
	}
	public static Contact addContact(Contact cnct) {
		contactMap.put(cnct.getContactName(), cnct);
		return cnct;
	}
	public static Contact modifyContact(Contact cnct) {
		contactMap.put(cnct.getContactName(), cnct);
		return cnct;
	}
	public static void deleteContact(String contactName) {
		contactMap.remove(contactName);
	}
	public static List<Contact> getAllContacts() {
		Collection<Contact> c = contactMap.values();
		List<Contact> list = new ArrayList<Contact>();
		list.addAll(c);
		return list;
	}
	List<Contact> list;
}

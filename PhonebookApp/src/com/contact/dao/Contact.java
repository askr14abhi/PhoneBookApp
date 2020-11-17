package com.contact.dao;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "contacts")
public class Contact {
		private String contactName;
		private String fullname;
		private String phoneNumber;
		
		public Contact() {
			
		}
		public Contact(String contactName, String fullname ,String phoneNumber) {
			this.contactName = contactName;
			this.fullname = fullname;
			this.phoneNumber = phoneNumber;
		}

		public String getContactName() {
			return contactName;
		}
		@XmlElement
		public void setContactName(String contactName) {
			this.contactName = contactName;
		}

		public String getFullname() {
			return fullname;
		}
		@XmlElement
		public void setFullname(String fullname) {
			this.fullname = fullname;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}
		@XmlElement
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		
/*
		public Contact(String contactName, String fullname ,String phoneNumber) {
			this.contactName = contactName;
			this.fullname = fullname;
			this.phoneNumber = phoneNumber;
		}

		public String getContactName() {
			return contactName;
		}
		
		@XmlElement
		public void setContactName(String contactName) {
			this.contactName = contactName;
		}

		public String getFullname() {
			return fullname;
		}
		
		@XmlElement
		public void setFullName(String fullname) {
			this.fullname = fullname;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}
		
		@XmlElement
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		*/
}

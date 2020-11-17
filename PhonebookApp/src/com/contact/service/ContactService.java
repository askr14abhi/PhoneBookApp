package com.contact.service;



import java.util.List;

//import javax.websocket.server.PathParam;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.contact.dao.Contact;
import com.contact.dao.ContactDAO;

@Path("/contacts")
public class ContactService {
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Contact> getContacts() {
		List<Contact> listOfContacts = ContactDAO.getAllContacts();
		return listOfContacts;
	}
	
	@GET
	@Path("/{contactName}")
	@Produces({ MediaType.APPLICATION_JSON })
	public List <Contact> getContact(@PathParam("contactName") String contactName) {
		return ContactDAO.getContact(contactName);
	}
	
	@POST
	@Path("/add")
	@Produces({ MediaType.APPLICATION_JSON })
	public Contact addContact(Contact cnct) {
		return ContactDAO.addContact(cnct);
	}
	
	@PUT
	@Path("/modify")
	@Produces({ MediaType.APPLICATION_JSON })
	public Contact modifyContact(Contact cnct) {
		return ContactDAO.modifyContact(cnct);
	}
	
	@DELETE
	@Path("/{contactName}")
	@Produces({ MediaType.APPLICATION_JSON })
	public void deleteContact(@PathParam("contactName") String contactName) {
		ContactDAO.deleteContact(contactName);
	}
}

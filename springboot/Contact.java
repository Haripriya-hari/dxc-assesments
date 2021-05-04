package com.spring.SpringBootWebAppExample;

public class Contact {
	 private String name;
	    private String email;
	    private String country;
	 
	    public Contact() {
	        super();
	    }
	 
	    public Contact(String name, String email, String country) {
	        super();
	        this.name = name;
	        this.email = email;
	        this.country = country;
	    }
	 
	   public String getname() {
		   return name;
	   }
	   public String getemail() {
		   return email;
	   }
	   public String getcountry() {
		   return country;
	   }

}

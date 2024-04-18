package com.example.Cinemaxify;

// Override the User Interface methods in Spouse class
public class Spouse implements User{
		private String name;
	    private String memberName = "self";
	    private int age;
	    private Long contact;
	    private String address;
	    private Plan plan;
	    public void setPlan(Plan plan) {
			this.plan = plan;
		}
		public Spouse(Plan plan) {
	    	this.plan=plan;
	    }
	    public Spouse() {
	        
	    }
		@Override
		public void setUserDetails(String name, int age, Long contact, String address) {
			// TODO Auto-generated method stub
			this.name=name;
			this.age=age;
			this.contact=contact;
			this.address=address;
			
		}
		@Override
		public void getUserDetails() {
			// TODO Auto-generated method stub
			//System.out.println(this.name);
			System.out.println("Hello "+this.name+" You have entered the following details for spouse\nage: "
			+this.age+"\ncontact: "+this.contact+"\naddress: "+this.address);
			System.out.println("You have selected a "+plan.getPlanName()+" plan for spouse");
			
		}
		@Override
		public Plan getUserPlan() {
			// TODO Auto-generated method stub
			return this.plan;
		}

    
}

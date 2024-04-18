package com.example.Cinemaxify;

// Override the User Interface methods in Self class
public class Self implements User{

    private String name;
    private String memberName = "self";
    private int age;
    private Long contact;
    private String address;
    private Plan plan;
    public Self(Plan plan) {
    	this.plan=plan;
    }
    public Self() {
    
    }
    public void setPlan(Plan plan) {
    	//System.out.println("-----------------"+plan.hashCode()+"------------------------");
		this.plan = plan;
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
		System.out.println("Hello "+this.name+" You have entered the following details for self\nage: "
		+this.age+"\ncontact: "+this.contact+"\naddress: "+this.address);
		System.out.println("You have selected a "+plan.getPlanName()+" plan for self");
	}
	@Override
	public Plan getUserPlan() {
		// TODO Auto-generated method stub
		return this.plan;
	}

}

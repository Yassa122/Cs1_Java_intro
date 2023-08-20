package week3;
import java.util.*;
public class Country {
	String CountryName;
	int noOfCitizens;
	boolean isRoyal;
	String continent;
	int politicalState;

	public Country() {
		
	}
	public Country(String CountryName,int noOfCitizens,boolean isRoyal,String continent,int politicalState) {
		this.CountryName=CountryName;
		this.noOfCitizens=noOfCitizens;
		this.isRoyal=isRoyal;
		this.continent=continent;
		this.politicalState=politicalState;
		
	}
	
	public void getState() {
		if(politicalState==1){
			System.out.println("war");
			}
		if(politicalState==2){
			System.out.println("Increase in force readiness");
			}
		if(politicalState==3){
			System.out.println("increase intelligence");
			}
		if(politicalState==4){
			System.out.println("peace");
			}else {
				System.out.println("invalid code");
			}
		
		}
	public boolean getRoyalState() {
		return isRoyal;
	}
	public void setDefCon(int p) {
		this.politicalState=politicalState;
	}
	public void increaseCitizen(int c) {
		this.noOfCitizens=noOfCitizens+c;
	}
	public void display() {
		System.out.println("country name: "+this.CountryName+"/n"+
							"number of citzens: "+this.noOfCitizens+"/n"+
								"is it royal: "+isRoyal+"/n+"+
								"continent: "+this.continent+"/n"+
								"political State: "+this.politicalState);
	}
	public void compareTo(Country a) {
		
	}
	
}

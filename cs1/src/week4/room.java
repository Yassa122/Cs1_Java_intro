package week4;

public class room {
	int roomNo;
	String guestName;
	double rate;
	int NoOfDaysRented;
	int noOFBeds;
	
	public room(String guestName,int roomNo,int noOFBeds,double rate,int NoOfDaysRented) {
		this.guestName=guestName;
		this.noOFBeds=noOFBeds;
		this.NoOfDaysRented=NoOfDaysRented;
		this.rate=rate;
		this.roomNo=roomNo;
	}
	public double calculateTotal() {
		return rate*NoOfDaysRented;
	}
	public void addBed() {
		if(noOFBeds<2) {
			 noOFBeds=2;
		}else {
			System.out.println("no more than 2 beds are allowed");
		}	
	}
	public String toString() {
		String s="name: "+guestName+"\n";
		s += "Room number : "+roomNo+"\n" ;
		s += "Room beds : "+noOFBeds+"\n" ;
		s += "Rate : "+rate+"\n" ;
		s += "Rented for: "+NoOfDaysRented+" days " ;	
		return s;
	}
	public static void main(String[] args) {
		room r1=new room("blake",123,1,123.5,5);
		System.out.println(r1);
		System.out.println(r1.calculateTotal());
		r1.addBed();
		System.out.println(r1);
		r1.addBed();
	}
}

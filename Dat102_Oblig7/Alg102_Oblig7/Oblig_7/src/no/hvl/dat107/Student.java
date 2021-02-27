package no.hvl.dat107;

public class Student {
	private int snr;    
	private String namn; 
	 
	   public Student(int snr, String namn) { 
		   this.snr = snr;      
		   this.namn = namn;     
		   }
	   
	   public int getSnr() {
		return snr;
	}

	public void setSnr(int snr) {
		this.snr = snr;
	}

	public String getNamn() {
		return namn;
	}

	public void setNamn(String namn) {
		this.namn = namn;
	}

	public boolean equals(Student s) {
		boolean lik=false;   
		if(this.snr==s.snr) {
			   if(this.namn==s.namn){
				   lik=true;
			   }
		   }
		
		return lik;
	   }
}

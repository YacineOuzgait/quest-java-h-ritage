public class Car extends Vehicle {  
      
    private boolean swimming;
    
	public Car(String brand,int kilometers) {  
	    super(brand,kilometers);  
	    this.swimming = false;  
	}


  
    @Override
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais vroum vroum !";
    }
  
    public boolean isSwimming() {  
        return swimming;  
    }  
  
    public void setSwimming(boolean swimming) {  
        this.swimming = swimming;  
    }  
}

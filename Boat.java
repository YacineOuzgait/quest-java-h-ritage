public class Boat extends Vehicle {  
      
    private boolean flying;
    
	public Boat(String brand, int kilometers) {  
	    super(brand, kilometers);  
	    this.flying = false;  
	}
  
    @Override
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais glou glou !";
    }
  
    public boolean isFlying() {  
        return flying;  
    }  
  
    public void setFlying(boolean flying) {  
        this.flying = flying;  
    }  
}

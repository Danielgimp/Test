
public enum Color {
	
	RED,BLACK,WHITE,GREEN,ORANGE,BLUEe;
	
	
	public static void main(String[] args) 
    { 
      Color c1=Color.RED;
      System.out.println("You are using: "+c1+" color");
      
      Color arr[]=Color.values();
      for(Color c:arr) System.out.println(c+" at index"+c.ordinal());
      
      
    }

}

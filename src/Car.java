import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Car implements Serializable { //must impelement Serializable for security reasons
	
			
		private String Model,Color,Manufacturer;
		private int prodYear;
		
		public Car(String Model,String Color,String Manufacturer,int prodYear)
		{
			this.Model=Model;
			this.Color=Color;
			this.Manufacturer=Manufacturer;
			this.prodYear=prodYear;
			
		}

		public String getModel() {
			return Model;
		}

		public void setModel(String model) {
			Model = model;
		}

		public String getColor() {
			return Color;
		}

		public void setColor(String color) {
			Color = color;
		}

		public String getManufacturer() {
			return Manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			Manufacturer = manufacturer;
		}

		public int getProdYear() {
			return prodYear;
		}

		public void setProdYear(int prodYear) {
			this.prodYear = prodYear;
		}

		@Override
		public String toString() {
			return "Car [Model=" + Model + ", Color=" + Color + ", Manufacturer=" + Manufacturer + ", prodYear="
					+ prodYear + "]";
		}
				
				
		
	


	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Car car1=new Car("A3","Black","Audi",2020);
		File objdata=new File("UbjData.obj"); //create new file
		FileOutputStream fos = new FileOutputStream(objdata); //make output stream
		ObjectOutputStream oos = new ObjectOutputStream(fos); // make object output stream out of it
		oos.writeObject(car1); //write object to file
		
		System.out.println("Exporting Object Data Is Done!");
		
		FileInputStream fis = new FileInputStream(objdata); //import the same f file
		ObjectInputStream ois = new ObjectInputStream(fis); //make it Data input stream
		
		Car car2=(Car) ois.readObject(); //get object data from it
		System.out.println(car2.toString()); // print what the object contains
		
		oos.close();
		ois.close();
		
		Days first=Days.FRIDAY;
		System.out.println(first);
			
				
	}

}

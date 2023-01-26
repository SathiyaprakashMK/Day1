package week1.day1;

public class Car {

	public static void main(String[] args) {
		
		Car f=new Car();
		f.applyBreak();
		f.applyGear();
		f.switchOnAc();
		f.applyAccelerator();

	}
	public void applyBreak() {
		System.out.println("Apply Break");
	}
	public void applyGear() {
		System.out.println("Apply Gear");
	}
	public void switchOnAc() {
		System.out.println("Switch On Ac");
	}
	public void applyAccelerator() {
		System.out.println("Apply Accelerator");
	}
}

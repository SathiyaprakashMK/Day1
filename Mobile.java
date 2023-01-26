package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		Mobile phone=new Mobile();
		phone.call();
		phone.sendMessage();
		phone.shareDocument();

	}
	public void call() {
		System.out.println("Call");
	}
	public void sendMessage() {
		System.out.println("Send Message");
	}
	public void shareDocument() {
		System.out.println("Share Document");
	}
}

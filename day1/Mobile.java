package week1.day1;

public class Mobile {
		public void makeCall () {
			System.out.println("Calling");
		}
		public void sendMsg () {
			System.out.println("Message");
		}
		public static void main (String[] args) {
			float mobileWeight = 25.5f;
	 		String mobileModel = "oneplus";
			boolean fullCharged = true;
			int cost = 25000;
			System.out.println("My Mobile Weight " +mobileWeight);
			System.out.println("My Mobile Model " +mobileModel);
			System.out.println("If My Mobile is Fully Charged " +fullCharged);
			System.out.println("My Mobile Cost " +cost);
			Mobile operation = new Mobile();
			operation.makeCall();
			operation.sendMsg();
			System.out.println("This is My Mobile");
		}
}
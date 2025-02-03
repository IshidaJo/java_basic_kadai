package kadai_015;

public class Car_Chapter15 {

	private int gear = 1;
	private int speed;

	public void gearChange(int afterGear) {

		if (afterGear == 1) {
			this.speed = 10;
			System.out.print("ギア" + gear + "から" + afterGear + "に切り替えました");
		} else if (afterGear == 2) {
			this.speed = 20;
			System.out.print("ギア" + gear + "から" + afterGear + "に切り替えました");
		} else if (afterGear == 3) {
			this.speed = 30;
			System.out.print("ギア" + gear + "から" + afterGear + "に切り替えました");
		} else if (afterGear == 4) {
			this.speed = 40;
			System.out.print("ギア" + gear + "から" + afterGear + "に切り替えました");
		} else if (afterGear == 5) {
			this.speed = 50;
			System.out.print("ギア" + gear + "から" + afterGear + "に切り替えました");
		}
		System.out.println();
	}

	public void run() {
		if (this.speed != 0) {
			System.out.print("速度は時速" + this.speed + "kmです");
		}

	}
}

package Ch13;

public class C06Car {
	int fuel = 100;
	int speed = 0;
	
	void accelMethod() {
		speed+=10;
		fuel-=1;
		if(speed<0) {
			speed=0;
		}
		if(fuel<0) {
			fuel=0;
		}
		System.out.println("가속합니다.");
	}
	
	void breakMethod() {
		speed-=10;
		if(speed<0) {
			speed=0;
		}
		System.out.println("브레이크!!!");
	}
	
	void showMethod() {
		System.out.println("speed: "+speed+", fuel: "+fuel);
	}
}

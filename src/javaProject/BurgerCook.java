//인터페이스
//자식클래스가 부모클래스를 상속할 때, 여러 부모클래스를 상속하고 싶을 때 사용
package javaProject;

public interface BurgerCook {
	//메서드의 기능 정의와 구현을 분리
	//메서드 정의만
		public void makeBurger();
		public void makeSalad();
		//접근자 리턴타입 메서드이름();
}

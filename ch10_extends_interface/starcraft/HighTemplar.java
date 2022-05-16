package ch10_extends_interface.starcraft;

public class HighTemplar extends ProtossUnit {
	// 필드 변수들을 복사, 붙여넣기 => 중복코드
	// 중복코드를 한데 묶어놓으면 편함 => 수정이 용이
	private int mp;
	
//	String name, int damage, int hp, int armor, int attackRange, int attackSpeed, int moveSpeed,
//	int mineral, int gas
	
	public HighTemplar() {
		super("하이템플러", 0, 40, 0, 0, 0, 1, 50, 150, 40);
		this.mp = 225;
	}

	public void psionicStorm() {
		System.out.println("사이오닉 스톰 시전!");
		mp -= 75;
	}
	
	public void hallucination() {
		System.out.println("할루시네이션 시전!");
		mp -= 100;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}


}

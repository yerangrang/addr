package addr;

public class AddrMain {

	public static void main(String[] args) {

		Addr addr = new Addr("OOO", "010-0000-0000", "AAA@naver.com", "서울", "친구");

		addr.printInfo();
		System.out.println("----------------");
		System.out.println("(그룹 정보 변경)");

		addr.setGroup("가족");

		System.out.println("----------------");
		addr.printInfo();

	}

}

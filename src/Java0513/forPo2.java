package Java0513;

public class forPo2 {
	public static void main(String[] args) {

		String str = "■";
		String spa = "□";

		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(spa);
			}

			for (int k = 1; k <= i*2-1; k++) {
				
				System.out.print(str);
			}
		
			for (int j = 3; j >= i; j--) {
				System.out.print(spa);
			}
			
			System.out.println();
		}

	}

}

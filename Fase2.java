
public class Fase2 {

	public static final short ANY_TRASPAS = 1948;

	public static void main(String[] args) {
		short quanAnyTraspas = 4;

		short numAnysTraspas = 0;

		for (short i = ANY_TRASPAS; i <= 1992; i += quanAnyTraspas) {
			numAnysTraspas++;
		}

		System.out.println("Anys traspàs: " + numAnysTraspas);
	}

}

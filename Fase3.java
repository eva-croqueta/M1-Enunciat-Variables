
public class Fase3 {
	

	public static void main(String[] args) {
		
		short quanAnyTraspas = 4;
		
		boolean naixementTraspas = false;
		
		String naixementTraspasSi = "El meu any de naixement és de traspàs.";
		
		String naixementTraspasNo = "El meu any de naixement no és de traspàs.";
		
		for (short i = Fase2.ANY_TRASPAS; i <= 1992; i += quanAnyTraspas) {
			System.out.println(i);
			
			if (1992 == i) {
				naixementTraspas = true;
			}
		}
		
		if (naixementTraspas) {
			System.out.println(naixementTraspasSi);
		} else {
			System.out.println(naixementTraspasNo);
		}

	}

}

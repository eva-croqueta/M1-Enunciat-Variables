
public class Fase4 {

	public static void main(String[] args) {
		
		String nomCognoms = "Eva Alabau Gragera";
		String anyNaixement = "01/11/1992";
		
		short quanAnyTraspas = 4;
		
		boolean naixementTraspas = false;
		
		String naixementTraspasSi = "El meu any de naixement �s de trasp�s.";
		
		String naixementTraspasNo = "El meu any de naixement no �s de trasp�s.";
		
		for (short i = Fase2.ANY_TRASPAS; i <= 1992; i += quanAnyTraspas) {
			
			if (1992 == i) {
				naixementTraspas = true;
			}
		}
		
		System.out.println("El meu nom �s " + nomCognoms + ".");
		System.out.println("Vaig n�ixer el " + anyNaixement + ".");
		
		if (naixementTraspas) {
			System.out.println(naixementTraspasSi);
		} else {
			System.out.println(naixementTraspasNo);
		}

	}

}

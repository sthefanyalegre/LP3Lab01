package proyecto;

public class regalo {

	public static String elegir(int vida) {
		String gift = "";
		switch(vida){
		case 1: gift = "UN pasaje al caribe"; break;
		case 2: gift = "Una visita al museo mas cercano a tu casa"; break;
		case 3: gift = "Una entrada al cine"; break;
		}
		return gift;
	}

}

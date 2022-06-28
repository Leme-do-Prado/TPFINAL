
public class AccessAmostraTemperatura {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		AmostraTemperatura T1 = new AmostraTemperatura(20, 5, 2010, 15, 30, 00, 500);
		T1.getData();
		T1.getHora();
		T1.getValor();
		AmostraTemperatura T2 = new AmostraTemperatura();
		T2.getData();
		T2.getHora();
		T2.getValor();
		T1.setData();
		T1.setHora();
		T2.setValor();
		T1.getData();
		T1.getHora();
		T1.getValor();
	}

}

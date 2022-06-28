import java.util.*;
import java.text.*;

public class AmostraTemperatura {
	Scanner read = new Scanner(System.in);
	private int numseq;
	private Data data;
	private Hora hora;
	private float valor;

	public AmostraTemperatura() {
		setData();
		setHora();
		setValor();
	}
	
	public AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v) {
		this.setData(a, b, c);
		this.setHora(d, e, f);
		this.setValor(v);	
	}
	
	public AmostraTemperatura(Data d, Hora h, float v) {
	this.data = d;
	this.hora = h;
	this.valor = v;
	}
	
	public void setData(int a, int b, int c) {
	this.data = new Data(a, b, c);
	}
	
	public void setData() {
	int a = read.nextInt();
	int b = read.nextInt();
	int c = read.nextInt();
	setData(a, b, c);
	}
	
	public void setHora(int a, int b, int c) {
	this.hora = new Hora(a, b, c);
	}
	
	public void setHora() {
	int a = read.nextInt();
	int b = read.nextInt();
	int c = read.nextInt();
	setHora(a, b, c);
	}
	
	public void setValor(float v) {
		this.valor = v;
	}
	
	public void setValor() {
		float v = read.nextFloat();
		setValor(v);
	}
	
	public int getNumSeq() {
		return numseq;
	}
	
	public String getData() {
		String f = data.mostra1();
		return f;
	}
	
	public String getHora() {
		String f = hora.getHora1();
		return f;
	}
	
	public float getValor() {
		return this.valor;
	}
}

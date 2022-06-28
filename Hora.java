import java.util.*;

public class Hora {
	Scanner read = new Scanner(System.in);
	private int hora;
	private int min;
	private int seg;
	
	public Hora() {
		setHora();
		setMin();
		setSeg();
	}
	
	public Hora(int h, int m, int s) {
		this.hora = h;
		this.min = m;
		this.seg = s;
	}
	
	public void setHora(int h) {
		this.hora = h;
	}
	
	public void setHora() {
		int h = read.nextInt();
		setHora(h);
	}
	
	public void setMin(int m) {
		this.min = m;
	}
	
	public void setMin() {
		int m = read.nextInt();
		setMin(m);
	}
	
	public void setSeg(int s) {
		this.seg = s;
	}
	
	public void setSeg() {
		int s = read.nextInt();
		setSeg(s);
	}
	
	public int getHor() {
		return hora;
	}
	
	public int getSeg() {
		return seg;
	}
	
	public int getMin() {
		return min;
	}
	
	public String getHora1() {
		String hf = hora + ":" + min + ":" + seg;
		return hf;
	}
	
	public String gethora2() {
		String hdia = "undefined";
		if(hora <= 12) {
			hdia = "AM"; 
		} else if(hora>12) {
			hdia = "PM";
		}
		String hf2 = hora + ":" + min + ":" + seg + hdia;
		return hf2;

	}
	
	public int getSegundos() {
		int s = seg;
		s += 60 * min;
		s += 3600 * hora;
		return s;
		}
}

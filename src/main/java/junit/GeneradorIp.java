package junit;

import java.util.Random;

public class GeneradorIp {
	public GeneradorIp() {}
	public int generarNumero(int min, int max) {
		Random rnd = new Random();
		int numRandom;
		do {
			numRandom=rnd.nextInt(max+1);
		}while(numRandom < min);
		return numRandom;
	}
	public String generarIp() {
		String ip = "";
		for(int i=0; i<4;i++) {
			if(i !=0) {
				ip+=".";
			}
			if(i == 0 || i ==3) {
				ip += generarNumero(1,255);
			}else {
				ip += generarNumero(0,255);
			}
		}
		return ip;
	}
}

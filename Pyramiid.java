public class Pyramiid{
	double a, m;
	
	public Pyramiid(double aluseKyljepikkus, double apoteem){
		if(aluseKyljepikkus<=0){throw new RuntimeException("aluse küljepikkus peab olema positiivne arv!");}
		if(apoteem <=0){throw new RuntimeException("apoteem peab olema positiivne arv!");}
		a = aluseKyljepikkus;
		m = apoteem;
	}
	
	public double p6hjaYmberm66t() {
		return 4*a;
	}

	public double alusePindala() {
		return a*a;
	}

	public double kylgpindala() {
		return 2*a*m;
	}
	
	public double t2ispindala() {
		return a*a+2*a*m;
	}
	
	public double ruumala() {
		return (a*a*(Math.sqrt(m*m-(Math.pow(a/2, 2)))))/3;
	}
	
	
	public String toString(){
		return "\n" + "Püramiidi mille aluse küljepikkus on " + a + "m ja apoteem " + m + "m:" + "\n" +
			"  põhja ümbermõõt: " + p6hjaYmberm66t() + " meetrit" + "\n" +
			"  aluse pindala: " + alusePindala() + " ruutmeetrit" + "\n" +
			"  külgpindala: " + kylgpindala() + " ruutmeetrit" + "\n" +
			"  täispindala: " + t2ispindala() + " ruutmeetrit" + "\n" +
			"  ruumala: " + ruumala() + " kuupmeetrit" + "\n";
	}
}
public class Main{
	public static void main(String[] args) {
		Pyramiid v2ike = new Pyramiid(2, 2);
		Pyramiid keskmine = new Pyramiid(8, 6);
		Pyramiid suur = new Pyramiid(25, 20);
		System.out.println(v2ike);
		System.out.println(keskmine);
		System.out.println(suur);
	}
}

/* [raitkeer@greeny t02klass]$ java Main

Püramiidi mille aluse küljepikkus on 2.0m ja apoteem 2.0m:
  põhja ümbermõõt: 8.0 meetrit
  aluse pindala: 4.0 ruutmeetrit
  külgpindala: 8.0 ruutmeetrit
  täispindala: 12.0 ruutmeetrit
  ruumala: 2.309401076758503 kuupmeetrit


Püramiidi mille aluse küljepikkus on 8.0m ja apoteem 6.0m:
  põhja ümbermõõt: 32.0 meetrit
  aluse pindala: 64.0 ruutmeetrit
  külgpindala: 96.0 ruutmeetrit
  täispindala: 160.0 ruutmeetrit
  ruumala: 95.40556703999103 kuupmeetrit


Püramiidi mille aluse küljepikkus on 25.0m ja apoteem 20.0m:
  põhja ümbermõõt: 100.0 meetrit
  aluse pindala: 625.0 ruutmeetrit
  külgpindala: 1000.0 ruutmeetrit
  täispindala: 1625.0 ruutmeetrit
  ruumala: 3252.6031241658325 kuupmeetrit

[raitkeer@greeny t02klass]$ */

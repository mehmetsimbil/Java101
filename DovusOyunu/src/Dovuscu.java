
public class Dovuscu {
String ad;
int hasar;
int can;
int agirlik;
int blok;
public Dovuscu(String ad, int hasar, int can, int agirlik,int blok) {

	this.ad = ad;
	this.hasar = hasar;
	this.can = can;
	this.agirlik = agirlik;
	this.blok = blok;
	}
int vurus(Dovuscu rakip) {
	System.out.println(this.ad+"=>"+rakip.ad+" "+this.hasar+" hasar vurdu.");
	if(rakip.isBlok()) {
		System.out.println(rakip.ad+" gelen hasarı blokladı.");
		return rakip.can;
	}
	if(rakip.can-this.hasar<0)
		return 0;
	
	return rakip.can-this.hasar;
	
}
boolean isBlok() {
	double randomNumber = Math.random()*100;
	return randomNumber <= this.blok;
}
}

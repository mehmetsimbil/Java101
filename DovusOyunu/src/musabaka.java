
public class musabaka {
Dovuscu d1;
Dovuscu d2;
int minAgirlik;
int maxAgirlik;
public musabaka(Dovuscu d1, Dovuscu d2, int minAgirlik, int maxAgirlik) {

	this.d1 = d1;
	this.d2 = d2;
	this.minAgirlik = minAgirlik;
	this.maxAgirlik = maxAgirlik;
}
void run() {
	if(isCheck()) {
		int sans= Math.round((float)Math.random());
		System.out.println("Sans : "+sans);
		while(this.d1.can >0 && this.d2.can >0) {
			if(sans==0) {
				this.d2.can=d1.vurus(this.d2);
				this.d1.can=d2.vurus(this.d1);
				if(isWin()) {
				break;}
			}
			if(sans==1) {
				this.d1.can=d2.vurus(this.d1);
				this.d2.can=d1.vurus(this.d2);
				if(isWin()) {
				break;}
			}
			
		}
		System.out.println(d1.ad+ " : "+d1.can + " / "+d2.ad+" : "+d2.can);
	}
	else {
		System.out.println("Sporcuların sikletleri uymuyor.");
	}
	
}
boolean isCheck() {
	return(this.d1.agirlik>= minAgirlik && this.d1.agirlik < maxAgirlik)&&(this.d2.agirlik>=minAgirlik && this.d2.agirlik < maxAgirlik);
	
}
boolean isWin() {
	if(this.d1.can == 0 ) {
		System.out.println(this.d2.ad+" kazandı.");
		return true;
	}
	if(this.d2.can==0) {
		System.out.println(this.d1.ad+" kazandı.");
		return true;
	}
return false;
}
}

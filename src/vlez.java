public class vlez<b> {

double a,b,c;

public vlez (double a,double b, double c) {

 this.a=a;
 this.b=b;
 this.c=c;

}
   public double a() {
        return a;
}
public double b() {
    return b;
}
public double c() {
	return c;
}

      public boolean rezultat() {
   return (a+b>c && a+c>b && b+c>a);

  }
}
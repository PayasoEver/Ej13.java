public class Cilindro extends Circulo {
    private double altura;

    public Cilindro(double altura, double radio){
        super(radio);
        if(altura<0){
            this.altura=0;
        }else {
            this.altura = altura;
        }
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
            return altura;
    }

    public double Volume(){
        return  getArea()*altura;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }


    public static void main(String[] args) {
        Circulo circo=new Circulo(-2.23);
        Cilindro cilo=new Cilindro(8.36,8.2);
        System.out.println("Radio circ. "+ circo.getRadio());
        System.out.println("Area circ. "+ circo.getArea());
        System.out.println("Area cili. "+ cilo.getArea());
        System.out.println("Volumen cili. "+ cilo.Volume());
    }
}

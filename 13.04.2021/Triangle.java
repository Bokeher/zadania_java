class Triangle{
    public Triangle(int a){
        System.out.println(((a*a)*Math.sqrt(3))/4);
    }
    
    public Triangle(int a, int h){
        System.out.println((a*h)/2);
    }

    public Triangle(int a, int b, int gamma){
        System.out.println(0.5*a*b*Math.sin(gamma));
    }

    public Triangle(int a, int alfa, int beta, int gamma){
        System.out.println(0.5*(a*a)*((Math.sin(beta)*Math.sin(gamma))/Math.sin(alfa)));
    }
}
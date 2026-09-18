class Tata_Motors{
    public static void main(String args[]){
        Cars c = new Cars();
        c.name = "Harrier";
        c.accelerate(220);
        System.out.println(c.name+" "+c.speed+"km/h");
        c.brake();
        System.out.println();
        Cars c1 = new Cars();
        c1.name = "Sierra";
        c1.accelerate(110);
        System.out.println(c1.name+" "+c1.speed+"km ");
        c1.brake();
        System.out.println();
        Cars c2 = new Cars();
        c2.name = "Tiago";
        c2.accelerate(100);
        System.out.println(c2.name+" "+c2.speed+"km/h ");
        c2.brake();
    }
}
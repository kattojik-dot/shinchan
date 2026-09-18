
class HimalayaBookStore{
    public static void main(String args[]){
        Book b;
        b = new Book();
        b.name = "Let Us C";
        b.author = "yashwant kanetkar";
        b.price = 600;
        b.restock(1000);
        System.out.println(b.name+"\n"+b.author+"\n"+b.price+"\n"+b.copies);
        Book b1 = new Book();
        b1.name = "The last Queen";
        b1.price = 600;
        b1.restock(900);
        b1.discount(18);
        System.out.println(b1.name+" "+b1.copies+" "+b1.price);
        Book b2 = new Book();
        b2.name = "Wings On Fire";
        b2.price = 600;
        b2.restock(800);
        double final_discount=b2.discount(15); 
        System.out.println(b2.name+" "+b2.copies+" "+b2.price+" "+final_discount);
       
    }
}
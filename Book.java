class Book{
    String name;
    String author;
    double price;
    int copies;
    void buy(){
        copies--;
    }
    void restock(int noOfCopies){
        copies+=noOfCopies;
    }
    double discount(float discount){
        return price-(price*discount/100);
    }
}
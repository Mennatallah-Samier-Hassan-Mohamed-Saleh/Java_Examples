public class Grocerytest {
    public static void main(String[] args) {
        Food one = new Food("Apple", 0, 5, 10, 12);
        Food Two = new Food("Bannnan", 1, 7, 9, 12);
        Grocery test = new Grocery();
        System.out.println(test.getShelf().length);
        test.addGroceryItem(one);
System.out.println(test.getShelf().length);
test.addGroceryItem(one);
System.out.println(test.getShelf().length);
System.out.println(test.getGroceryItem(0));

    }

}


class Test{
    public  <T> Test(T item){
System.out.println("Value of the item: " + item);
System.out.println("Type of the item: " + item.getClass().getName()); System.out.println();
}
}
 class GenericsTest {
public static void main(String args[]) {
Test testl=new Test ("Test String.");
Test test2 =new Test (100);
Test test3 = new Test (100.45f);
Test test4 = new Test (100.45d);
}
}

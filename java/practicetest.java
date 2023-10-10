
public class practicetest {
public static void main(String[] args) {
  
practise var1 = new practise(56);
practise var2 = new practise (20);

practise var3 = var2;
var3.agee =21;
System.out.println(var2.agee);

practise var4 =var2.copy();
System.out.println(var4.agee);
}    
}

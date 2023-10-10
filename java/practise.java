public class practise {
 
    static String name = "n"; 
    int agee;
    
    practise(int age ){
       this.agee = age;
    }
    
    public static void printit(){
        System.out.println("my name is saim");
    }
    public practise copy(){
        
        
        return  new practise (this.agee);
    }
    
}

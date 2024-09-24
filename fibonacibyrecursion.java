public class fibonacibyrecursion {
    static int a=0,b=1,sum=0;
    public static void main(String[] args) {
       
        System.out.println(a+" "+b);
        
        fibonacibyrecursion obj=new fibonacibyrecursion();
        obj.display(10);
    }
    void display(int i){
        if(i>=1){
        sum=a+b;
        System.out.println(sum);
        a=b;
        b=sum;
        display(i-1);
        }
    }
    
}

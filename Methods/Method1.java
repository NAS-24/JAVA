package Methods;

public class Method1 {
    static int logic(int x,int y){
        //Can also be written without static with particular conditions
        int z;
        if(x>y){
            z=x+y;

        }else{
            z=(x+y)*5;

        }
        return z;
    }
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int c;
        /* If in the syntax (static int name) "static" is not used then...
         Method invocation Using Object Creation.
         Method1 obj=new Method1();
         c=obj.logic(a,b)
         */
        c=logic(a,b);
        System.out.println(c);

        int a1=9;
        int b1=8;
        int c1=logic(a1,b1);
        System.out.println(c1);

    }
}


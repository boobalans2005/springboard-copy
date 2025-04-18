public class control {
    public static void main(String [] args){
        int num1=0;
        int num2=14;
        int num3=18;
        int maxnum =num1;
        if(num2>maxnum){
            maxnum=num2;
        }
        if(num3>maxnum){
            maxnum=num3;
        }
        System.out.println("maxnum:"+maxnum);
    }
}

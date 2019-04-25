package assignment5;

public class Main {

    public static void main(String[] args) {
        Long startTime=System.currentTimeMillis();
        int x,y;
        double f,Max,Min;
        Max = Function(-1000, -1000);
        Min = Max;
        for (int i = -1000; i <= 1000; i++) {
            for (int j = -1000; j <= 1000; j++) {
                x = i;
                y = j;
                f = Function(x, y);
                if(f>=Max){
                    Max=f;
                }else{
                    Min=f;
                }
                //Max = Math.max(f,Max);
                //Min = Math.min(f, Min);
            }
        }
        System.out.println("max= "+Max +"\n"+"min= "+Min);
        System.out.println("the programe take "+(System.currentTimeMillis()-startTime)+"ms");
    }

    public static double Function(int X, int Y) {
        double r;
        r = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2)) / (X * Math.sin(X + Y)) + (Y * Math.cos(X + Y));
        return r;
    }

}
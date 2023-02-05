import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите действительную и мнимую части");
        double real, imag;
        Scanner sc = new Scanner(System.in);
        real = sc.nextDouble();
        imag = sc.nextDouble();
        complex c = new complex(real, imag);
        System.out.print("Ваше комплексное число:");
        c.algebr();
        System.out.println("Введите действительную и мнимую части числа, с которым хотите сложить");
        double real1 = sc.nextDouble();
        double imag1 = sc.nextDouble();
        System.out.print("Ваше комплексное число:");
        complex x = new complex(real1, imag1);
        x.algebr();
        c.add(x);
        c.mult(x);
        c.trig();
        int x1=2; int y=2;
        System.out.println("vvod");
        complexMatrix a=new complexMatrix(x1,y);
        for (int i=0;i<x1;i++){
            for (int j=0;j<y;j++){
                double rea=sc.nextDouble();
                double ima=sc.nextDouble();
                complex l=new complex(rea,ima);
                a.create(i,j,l);
            }
        }
        System.out.println("vv");
        complexMatrix b=new complexMatrix(x1,y);
        for (int i=0;i<x1;i++){
            for (int j=0;j<y;j++){
                double rea=sc.nextDouble();
                double ima=sc.nextDouble();
                complex l=new complex(rea,ima);
                b.create(i,j,l);
            }
        }
        a.multi(b);
    }
}

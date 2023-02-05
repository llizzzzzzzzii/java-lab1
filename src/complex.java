import java.util.Optional;

/**
 * комплексные числа
 */
public class complex {
    /**
     * действительная и мнимая часть
     */
    double re,im;

    /**
     * конструктор по умолчанию
     */
    public complex(){
        this(0,0);
    }

    /**
     * конструктор действительного числа
     * @param re действительная часть
     */
    public complex(double re){
        this(re,0.0);
    }

    /**
     * конструктор копирования
     * @param x какое-то другое комплексное число
     */
    public complex(complex x){
        this.re=x.re;
        this.im=x.im;
    }

    /**
     * конструктор комплексного числа
     * @param re действительная часть
     * @param im мнимая часть
     */
    public complex(double re, double im){
        this.re=re;
        this.im=im;
    }

    /**
     * сложение
     * @param x комплексное число, с которым складываем
     * @return результат сложения
     */
    public complex add(complex x){
        complex res=new complex(this.re+x.re,this.im+x.im);
        return res;
//        System.out.print(res.re+"+"+res.im+"i"+" ");
    }

    /**
     * умножение
     * @param x комплексное число, на которое умножаем
     * @return результат умножения
     */
    public complex mult(complex x){
        complex res=new complex(this.re*x.re-this.im*x.im,this.re*x.im+this.im*x.re);
        return res;
        }

    /**
     * модуль
      * @return модуль числа
     */
    public double abs (){
        double res=Math.pow((Math.pow(this.re,2)+Math.pow(this.im,2)),0.5);
        return res;
    }

    /**
     * аргумент
     * @return аргумент числа
     */
    public double arg(){
        double res=Math.toRadians(Math.atan(this.im/this.re));
        return res;
    }

    /**
     * вывод в тригонометрической форме
     */
    public void trig(){
//        double res=this.abs()*(Math.cos(this.arg())+Math.sin(this.arg()));
        System.out.println(this.abs()+"*"+"(cos("+this.arg()+")"+"+isin("+this.arg()+"))");
    }

    /**
     * вывод в алгебраической форме
     */
    public void algebr(){
        if (this.im>0&&this.re!=0){
            System.out.print(this.re+"+"+this.im+"i"+" ");
        }
        else if (this.im<0&&this.re!=0){
            System.out.print(this.re+""+this.im+"i"+" ");
        }
        else if (this.im==0){
            System.out.print(this.re+" ");
        }
        else if(this.re==0){
            System.out.print(this.im+"i"+" ");
        }
    }
    }



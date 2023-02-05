/**
 * матрица, которая может состоять из комплексных чисел
 */
public class complexMatrix {
    /**
     * матрица
     */
    private complex[][] matr;
    /**
     * строки и столбцы
     */
    int row,col;

    /**
     * конструктор по умолчснию
     */
    public complexMatrix(){
        this(1,1);
    }

    /**
     * конструктор матрицы
     * @param row число строк
     * @param col число столбцов
     */
    public complexMatrix(int row,int col){
        this.matr=new complex[row][col];
        this.row=row;
        this.col=col;
    }

    /**
     *конструктор копирования
     * @param matr какая-то другая матрица
     */
    public complexMatrix(complex[][] matr){
        this.matr=matr;
        this.row=matr.length;
        this.col=matr[0].length;

    }

    /**
     *заполнение матрицы
     * @param x число строк
     * @param y число столбцов
     * @param l число, которое будет в матрице
     */
    public void create(int x,int y,complex l) {
        this.matr[x][y] = l;
    }

    /**
     *вывод матрицы
     */
    public void printMatr(){
        for (int i=0;i<this.row;i++){
            for (int j=0;j<this.col;j++){
                this.matr[i][j].algebr();
                if (j!=this.col-1){
                    System.out.print(", ");}
            }
            System.out.println();
        }
    }

    /**
     *сумма матриц
     * @param m матрица, с которой складываем
     */
    public void sum(complexMatrix m){
        if (this.row!=m.row || this.col!=m.col){
            System.out.println("Error");
        }
        else{
            for (int i=0;i<this.row;i++){
                for (int j=0;j<this.col;j++){
                    this.matr[i][j].add(m.matr[i][j]);
//                    this.matr[i][j].algebr();
                }
                System.out.println();
            }
        }
    }

    /**
     *умножение матриц
     * @param m матрица, на которую умножаем
     */
    public void multi(complexMatrix m){
        complexMatrix res=new complexMatrix(this.row,m.col);
        complex l=new complex(0,0);
        if (this.col!=m.row){
            System.out.println("Error");
        }
        else{
            for (int i=0;i<this.row;i++){
                for (int j=0;j<m.col;j++) {
                    res.create(i,j,l);
                    for (int k = 0; k < this.col; k++) {
                        res.matr[i][j]=res.matr[i][j].add(this.matr[i][k].mult(m.matr[k][j]));
                    }
                    res.matr[i][j].algebr();
                }
                System.out.println();
            }
        }
    }

    /**
     * транспонирование матрицы
     */
    public void transp(){
        complexMatrix res=new complexMatrix(this.col,this.row);
        for (int i=0;i<this.row;i++){
            for (int j=0;j<this.col;j++){
                res.matr[i][j]=this.matr[j][i];
                res.matr[i][j].algebr();
        }
        System.out.println();
    }
}
}

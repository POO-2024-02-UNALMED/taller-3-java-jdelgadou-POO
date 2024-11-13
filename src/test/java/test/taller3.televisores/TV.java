package taller3.televisores;
public class TV {
    private Marca marca;
    private int canal=1;
    private int precio=500;
    private boolean estado;
    private int volumen=1;
    private Control control;
    static int numTV;
    TV(Marca marca, boolean estado){
        this.marca=marca;
        this.estado=estado;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    public void setControl(Control control) {
        this.control = control;
    }
    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
    public Marca getMarca(){
        return this.marca;
    }
    public int getCanal(){
        return this.canal;
    }
    public int getPrecio(){
        return this.precio;
    }
    public int getVolumen(){
        return this.volumen;
    }
    public Control getControl(){
        return this.control;
    }
    public static int getNumTV() {
        return numTV;
    }
    public void turnOn(){
        this.estado=true;
    }
    public void turnOff(){
        this.estado=false;
    }
    public boolean getEstado(){
        return this.estado;
    }
    public void canalUp(){
        if (this.estado ==true && (1<=this.canal && this.canal<120)){
            this.canal+=1;
        }
    }
    public void canalDown(){
        if (this.estado ==true && (1<this.canal && this.canal<=120)){
            this.canal-=1;
        }
    }
    public void volumenUp(){
        if (this.estado ==true && (1<=this.volumen && this.volumen<7)){
            this.volumen+=1;
        }
    }
    public void volumenDown(){
        if (this.estado ==true && (1<this.volumen && this.volumen<=7)){
            this.volumen-=1;
        }
    }
}

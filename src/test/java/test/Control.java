package test;
public class Control {
    private TV tv;
    public void turnOn(){
        tv.turnOn();
    }
    public void turnOff(){
        tv.turnOff();
    }
    public void canalUp(){
        tv.canalUp();
    }
    public void canalDown(){
        tv.canalDown();
    }
    public void volumenUp(){
        tv.volumenUp();
    }
    public void volumenDown(){
        tv.volumenDown();
    }
    public void setCanal(int canal){
        tv.setCanal(canal);
    }
    public void setVolumen(int volumen){
        tv.setVolumen(volumen);
    }
    public void enlazar(TV Tv){
        this.tv=Tv;
        Tv.setControl(this);
    }
    public void setTv(TV nu){
        this.tv=nu;
    }
    public TV getTv() {
        return tv;
    }
}

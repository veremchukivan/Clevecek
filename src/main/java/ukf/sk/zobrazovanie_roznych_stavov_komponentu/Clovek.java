package ukf.sk.zobrazovanie_roznych_stavov_komponentu;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;



public class Clovek extends Canvas {
    private boolean PRhore;
    private boolean LRhore;
    private boolean drep;
    GraphicsContext gc;


    public Clovek() {
        super(35,130);
        PRhore=false;
        LRhore=false;
        drep=false;
        gc=this.getGraphicsContext2D();
        Vykresli();
    }

    public  void ZmenuPravu(){
        PRhore=!PRhore;
        Vykresli();
    }
    public  void ZmenuLavy(){
        LRhore=!LRhore;
        Vykresli();
    }

    public  void doDrepu(){
        drep=true;
        Vykresli();
    }
    public void postavSa(){
        drep=false;
        Vykresli();
    }



    public void Vykresli() {
        gc.clearRect(0, 0, this.getWidth(), this.getHeight());
        gc.setStroke(Color.BLACK);
        gc.strokeOval(20, 1, 10, 10);
        gc.strokeLine(25, 11, 25, 50);
        if (drep) {
            gc.strokeLine(25, 50, 35, 70);
            gc.strokeLine(35, 60, 35, 90);
            gc.strokeLine(25, 50, 15, 70);
            gc.strokeLine(15, 70, 15, 90);
        } else {
            gc.strokeLine(25, 50, 30, 120);
            gc.strokeLine(25, 50, 20, 120);
        }
        if (LRhore) {
            gc.strokeLine(25, 20, 35, 1);
        } else {
            gc.strokeLine(25, 20, 35, 45);
        }
        if (PRhore) {
            gc.strokeLine(25, 20, 15, 1);
        } else {
            gc.strokeLine(25, 20, 15, 45);
        }
    }
}

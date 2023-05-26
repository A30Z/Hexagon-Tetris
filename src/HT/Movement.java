package hextris_final;


import java.util.Random;
import javafx.scene.shape.Polygon;
public class Movement {

	public static final double MOVE = HextrisGame.MOVE;
        public static final double MOVE2 = HextrisGame.MOVE2;
	public static final double SIZE = HextrisGame.SIZE;
        public static final double SIZE2 = HextrisGame.SIZE2;
	public static double XMAX = HextrisGame.XMAX;
	public static double YMAX = HextrisGame.YMAX;
	public static double[][] SCREEN = HextrisGame.SCREEN;

        

	public static void MoveRight(Shape form) {
		if (form.a.getTranslateX() + MOVE <= 6 * MOVE && form.b.getTranslateX() + MOVE <= 6 * MOVE
				&& form.c.getTranslateX() + MOVE <= 6 * MOVE && form.d.getTranslateX() + MOVE <= 6 * MOVE) {
			double movea = SCREEN[((int) (form.a.getTranslateY() / MOVE2))][(int) (form.a.getTranslateX() / MOVE) + 7 + 1];
			double moveb = SCREEN[((int) (form.b.getTranslateY() / MOVE2))][(int) (form.b.getTranslateX() / MOVE) + 7 + 1];
			double movec = SCREEN[((int) (form.c.getTranslateY() / MOVE2))][(int) (form.c.getTranslateX() / MOVE) + 7 + 1];
			double moved = SCREEN[((int) (form.d.getTranslateY() / MOVE2))][(int) (form.d.getTranslateX() / MOVE) + 7 + 1];
			if (movea == 0 && movea == moveb && moveb == movec && movec == moved) {
				form.a.setTranslateX(form.a.getTranslateX() + MOVE);
				form.b.setTranslateX(form.b.getTranslateX() + MOVE);
				form.c.setTranslateX(form.c.getTranslateX() + MOVE);
				form.d.setTranslateX(form.d.getTranslateX() + MOVE);
                                
			}
		}
	}

	public static void MoveLeft(Shape form) {
		if (form.a.getTranslateX() - MOVE >= - 6 * MOVE && form.b.getTranslateX() - MOVE >= - 6 * MOVE && form.c.getTranslateX() - MOVE >= - 6 * MOVE
				&& form.d.getTranslateX() - MOVE >= - 6 * MOVE) {
			double movea = SCREEN[((int) (form.a.getTranslateY() / MOVE2))][(int) (form.a.getTranslateX() / MOVE) + 7 - 1];      
			double moveb = SCREEN[((int) (form.b.getTranslateY() / MOVE2))][(int) (form.b.getTranslateX() / MOVE) + 7 - 1];
			double movec = SCREEN[((int) (form.c.getTranslateY() / MOVE2))][(int) (form.c.getTranslateX() / MOVE) + 7 - 1];
			double moved = SCREEN[((int) (form.d.getTranslateY() / MOVE2))][(int) (form.d.getTranslateX() / MOVE) + 7 - 1];
			if (movea == 0 && movea == moveb && moveb == movec && movec == moved) {
				form.a.setTranslateX(form.a.getTranslateX() - MOVE);
				form.b.setTranslateX(form.b.getTranslateX() - MOVE);
				form.c.setTranslateX(form.c.getTranslateX() - MOVE);
				form.d.setTranslateX(form.d.getTranslateX() - MOVE);
			}
		}
	}
     

	public static Shape makeRect() {
            int r1=100;
     double r2=105;
     double r3=110;
     double r4=115;
     double r5=120;
     double r6=125;
		
	Polygon a = new Polygon();
        a.getPoints().addAll(new Double[]{
            r3,0.0,
            r5,0.0,
            r6,Math.sqrt(3)*5,
            r5,Math.sqrt(3)*10,
            r3,Math.sqrt(3)*10,
            r2,Math.sqrt(3)*5,
         
        });
        Polygon b = new Polygon();
        b.getPoints().addAll(new Double[]{
            r3,0.0,
            r5,0.0,
            r6,Math.sqrt(3)*5,
            r5,Math.sqrt(3)*10,
            r3,Math.sqrt(3)*10,
            r2,Math.sqrt(3)*5,
         
        });
        Polygon c = new Polygon();
        c.getPoints().addAll(new Double[]{
            r3,0.0,
            r5,0.0,
            r6,Math.sqrt(3)*5,
            r5,Math.sqrt(3)*10,
            r3,Math.sqrt(3)*10,
            r2,Math.sqrt(3)*5,
         
        });
        Polygon d = new Polygon();
        d.getPoints().addAll(new Double[]{
            r3,0.0,
            r5,0.0,
            r6,Math.sqrt(3)*5,
            r5,Math.sqrt(3)*10,
            r3,Math.sqrt(3)*10,
            r2,Math.sqrt(3)*5,
         
        });
        
        Random generator = new Random();
                  int   num= generator.nextInt(7)+1;
                  
		String name;
		if (num == 1) { 
			b.setTranslateY(SIZE2);
			c.setTranslateY(2 * SIZE2);
			d.setTranslateY(3 * SIZE2);
			name = "a";
		} else if (num == 2) { 
			b.setTranslateY(SIZE2);
			c.setTranslateX(- MOVE);
			c.setTranslateY(SIZE2 * 1.5);
			d.setTranslateX(- MOVE);
			d.setTranslateY(SIZE2 * 2.5);
                        
			name = "b";
		} else if (num == 3) { 
                        b.setTranslateY(SIZE2);
			c.setTranslateX(MOVE);
			c.setTranslateY(SIZE2/2);
			d.setTranslateX(- MOVE);
			d.setTranslateY(SIZE2/2);
			name = "c";
		} else if (num == 4) { 
                        b.setTranslateY(SIZE2);
			c.setTranslateX(MOVE);
			c.setTranslateY(SIZE2 * 1.5);
			d.setTranslateX(- MOVE);
			d.setTranslateY(SIZE2 * 1.5);
			name = "d";
		} else if (num == 5) { 
                        b.setTranslateY(SIZE2);
			c.setTranslateY(SIZE2 * 2);
			d.setTranslateX(MOVE);
                        d.setTranslateY(SIZE2 * 1.5);
			name = "e";
		} else if (num == 6) { 
                        b.setTranslateY(SIZE2);
			c.setTranslateY(SIZE2 * 2);
			d.setTranslateX(- SIZE * 0.75);
                        d.setTranslateY(SIZE2 * 1.5);
			name = "f";
		} else { 
                        b.setTranslateY(SIZE2);
			c.setTranslateY(SIZE2 * 2);
                        d.setTranslateX(MOVE);
                        d.setTranslateY(SIZE2 * 2.5);
			name = "g";
		}
                        
		return new Shape(a, b, c, d, name);
	}
}
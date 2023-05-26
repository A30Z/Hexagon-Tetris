package hextris_final;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Group;




public class HextrisGame extends Application {
	public static final double MOVE = 15;
        public static final double MOVE2 = 5 * Math.sqrt(3);
	public static final double SIZE = 20;
        public static final double SIZE2 = 10 * Math.sqrt(3);
	public static double XMAX = 230;
	public static double YMAX = SIZE2 * 20;
	public static double[][] SCREEN = new double [39][15];
	private static Pane group = new Pane();
	private static Shape object;
	private static Scene scene = new Scene(group, XMAX + 150, YMAX);
	public static int score = 0;
	private static int top = 0;
	private static boolean game = true;
	private static Shape nextObj = Movement.makeRect();
	private static int linesNo = 0;
        
        
        
        
	

	@Override
	public void start(Stage stage) throws Exception {
             scene.setFill(Color.BLACK);
             
            
        double s1 = 0;
        double s2 = 0;
        double s3 = Math.sqrt(3) * 5;
        double s4 = Math.sqrt(3) * 10;
        double s5 = Math.sqrt(3) * 10;
        double s6 = Math.sqrt(3) * 5;
        Group root = new Group();
      final  Polygon w1 = new Polygon();
        w1.getPoints().addAll(new Double[]{        
   5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6, 
});
        w1.setFill(Color.GREEN);
        group.getChildren().add(w1);
      
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
         final       Polygon w2 = new Polygon();
        w2.getPoints().addAll(new Double[]{        
    5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6, 
});
        w2.setFill(Color.GREEN);
        group.getChildren().add(w2);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
          final      Polygon w3 = new Polygon();
        w3.getPoints().addAll(new Double[]{        
    5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6, 
});
        w3.setFill(Color.GREEN);
        group.getChildren().add(w3);
       s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
         final       Polygon w4 = new Polygon();
        w4.getPoints().addAll(new Double[]{        
    5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6,  
});
        w4.setFill(Color.GREEN);
        group.getChildren().add(w4);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
            final    Polygon w5 = new Polygon();                
        w5.getPoints().addAll(new Double[]{        
   5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6,  
});
                
        w5.setFill(Color.GREEN);
        group.getChildren().add(w5);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
           final     Polygon w6 = new Polygon();
        w6.getPoints().addAll(new Double[]{        
    5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6, 
});
        w6.setFill(Color.GREEN);
        group.getChildren().add(w6);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
             final   Polygon w7 = new Polygon();
        w7.getPoints().addAll(new Double[]{        
    5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6, 
});
        w7.setFill(Color.GREEN);
        group.getChildren().add(w7);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
            final    Polygon w8 = new Polygon();
        w8.getPoints().addAll(new Double[]{        
   5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6, 
});
        w8.setFill(Color.GREEN);
        group.getChildren().add(w8);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
            final    Polygon w9 = new Polygon();
        w9.getPoints().addAll(new Double[]{        
    5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6, 
});
        w9.setFill(Color.GREEN);
        group.getChildren().add(w9);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
            final   Polygon w10 = new Polygon();
        w10.getPoints().addAll(new Double[]{        
    5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6, 
});
        w10.setFill(Color.GREEN);
        group.getChildren().add(w10);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
            final    Polygon w11 = new Polygon();
        w11.getPoints().addAll(new Double[]{        
    5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6, 
});
        w11.setFill(Color.GREEN);
        group.getChildren().add(w11);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
             final   Polygon w12 = new Polygon();
        w12.getPoints().addAll(new Double[]{        
    5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6, 
});
        w12.setFill(Color.GREEN);
        group.getChildren().add(w12);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
           final     Polygon w13 = new Polygon();
        w13.getPoints().addAll(new Double[]{        
    5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6, 
});
        w13.setFill(Color.GREEN);
        group.getChildren().add(w13);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
            final    Polygon w14 = new Polygon();
        w14.getPoints().addAll(new Double[]{        
    5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6, 
});
        w14.setFill(Color.GREEN);
        group.getChildren().add(w14);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
            final    Polygon w15 = new Polygon();
        w15.getPoints().addAll(new Double[]{        
   5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6,  
});
        w15.setFill(Color.GREEN);
        group.getChildren().add(w15);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
             final   Polygon w16 = new Polygon();
        w16.getPoints().addAll(new Double[]{        
    5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6, 
});
        w16.setFill(Color.GREEN);
        group.getChildren().add(w16);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
             final   Polygon w17 = new Polygon();
        w17.getPoints().addAll(new Double[]{        
    5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6, 
});
        w17.setFill(Color.GREEN);
        group.getChildren().add(w17);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
            final    Polygon w18 = new Polygon();
        w18.getPoints().addAll(new Double[]{        
   5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6, 
});
        w18.setFill(Color.GREEN);
        group.getChildren().add(w18);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
             final   Polygon w19 = new Polygon();
        w19.getPoints().addAll(new Double[]{        
    5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6, 
});
        w19.setFill(Color.GREEN);
        group.getChildren().add(w19);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
             final   Polygon w20 = new Polygon();
        w20.getPoints().addAll(new Double[]{        
   5.0, s1, 
   15.0, s2, 
   20.0, s3,          
   15.0, s4, 
   5.0, s5,                   
   0.0, s6, 
});
        w20.setFill(Color.GREEN);
        group.getChildren().add(w20);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
  
       
        
         s1=0;
         s2=0;
         s3=Math.sqrt(3)*5;
         s4=Math.sqrt(3)*10;
         s5=Math.sqrt(3)*10;
         s6=Math.sqrt(3)*5;
         final Polygon w22 = new Polygon();
        w22.getPoints().addAll(new Double[]{        
   215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6, 
});
        
        w22.setFill(Color.GREEN);
        group.getChildren().add(w22);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
       final Polygon w23 = new Polygon();
        w23.getPoints().addAll(new Double[]{        
   215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6, 
});
        w23.setFill(Color.GREEN);
        group.getChildren().add(w23);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
     final   Polygon w24 = new Polygon();
        w24.getPoints().addAll(new Double[]{        
   215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6, 
});
        w24.setFill(Color.GREEN);
        group.getChildren().add(w24);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
     final   Polygon w25 = new Polygon();
        w25.getPoints().addAll(new Double[]{        
    215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6, 
});
        w25.setFill(Color.GREEN);
        group.getChildren().add(w25);
       s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
     final   Polygon w26 = new Polygon();
        w26.getPoints().addAll(new Double[]{        
   215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6,
});
        w26.setFill(Color.GREEN);
        group.getChildren().add(w26);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
     final   Polygon w27 = new Polygon();
        w27.getPoints().addAll(new Double[]{        
   215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6,  
});
        w27.setFill(Color.GREEN);
        group.getChildren().add(w27);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
     final   Polygon w28 = new Polygon();
        w28.getPoints().addAll(new Double[]{        
    215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6, 
});
        w28.setFill(Color.GREEN);
        group.getChildren().add(w28);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
     final   Polygon w29 = new Polygon();
        w29.getPoints().addAll(new Double[]{        
    215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6,
});
        w29.setFill(Color.GREEN);
        group.getChildren().add(w29);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
    final   Polygon w30 = new Polygon();
        w30.getPoints().addAll(new Double[]{        
    215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6, 
});
        w30.setFill(Color.GREEN);
        group.getChildren().add(w30);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
     final   Polygon w31 = new Polygon();
        w31.getPoints().addAll(new Double[]{        
   215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6, 
});
        w31.setFill(Color.GREEN);
        group.getChildren().add(w31);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
    final    Polygon w32 = new Polygon();
        w32.getPoints().addAll(new Double[]{        
   215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6,
});
        w32.setFill(Color.GREEN);
        group.getChildren().add(w32);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
     final   Polygon w33 = new Polygon();
        w33.getPoints().addAll(new Double[]{        
   215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6,
});
        w33.setFill(Color.GREEN);
        group.getChildren().add(w33);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
     final   Polygon w34 = new Polygon();
        w34.getPoints().addAll(new Double[]{        
  215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6,
});
        w34.setFill(Color.GREEN);
        group.getChildren().add(w34);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      final  Polygon w35 = new Polygon();
        w35.getPoints().addAll(new Double[]{        
   215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6,
});
        w35.setFill(Color.GREEN);
        group.getChildren().add(w35);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
    final    Polygon w36 = new Polygon();
        w36.getPoints().addAll(new Double[]{        
   215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6,
});
        w36.setFill(Color.GREEN);
        group.getChildren().add(w36);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
     final   Polygon w37 = new Polygon();
        w37.getPoints().addAll(new Double[]{        
   215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6, 
});
        w37.setFill(Color.GREEN);
        group.getChildren().add(w37);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
     final   Polygon w38 = new Polygon();
        w38.getPoints().addAll(new Double[]{        
   215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6, 
});
        w38.setFill(Color.GREEN);
        group.getChildren().add(w38);
       s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
     final   Polygon w39 = new Polygon();
        w39.getPoints().addAll(new Double[]{        
   215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6,
});
        w39.setFill(Color.GREEN);
        group.getChildren().add(w39);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
     final   Polygon w40 = new Polygon();
        w40.getPoints().addAll(new Double[]{        
   215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6,
});
        w40.setFill(Color.GREEN);
        group.getChildren().add(w40);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
     final   Polygon w41 = new Polygon();
        w41.getPoints().addAll(new Double[]{        
    215.0, s1, 
   225.0, s2, 
   230.0, s3,          
   225.0, s4, 
   215.0, s5,                   
   210.0, s6,
});
        w41.setFill(Color.GREEN);
        group.getChildren().add(w41);
        s1+=Math.sqrt(3)*10;
        s2+=Math.sqrt(3)*10;
        s3+=Math.sqrt(3)*10;
        s4+=Math.sqrt(3)*10;
        s5+=Math.sqrt(3)*10;
        s6+=Math.sqrt(3)*10;
      
        
        
        double r1=35;
        double r2=45;
        double r3=50;
        double r4=45;
        double r5=35;
        double r6=30;
      final  Polygon w43 = new Polygon();
        w43.getPoints().addAll(new Double[]{        
   r1, Math.sqrt(3)*190, 
   r2, Math.sqrt(3)*190, 
   r3, Math.sqrt(3)*195,          
   r4, Math.sqrt(3)*200, 
   r5, Math.sqrt(3)*200,                   
   r6, Math.sqrt(3)*195, 
});
        w43.setFill(Color.GREEN);
        group.getChildren().add(w43);
        r1+=30;
        r2+=30;
        r3+=30;
        r4+=30;
        r5+=30;
        r6+=30;
      final    Polygon w44 = new Polygon();
        w44.getPoints().addAll(new Double[]{        
   r1, Math.sqrt(3)*190, 
   r2, Math.sqrt(3)*190, 
   r3, Math.sqrt(3)*195,          
   r4, Math.sqrt(3)*200, 
   r5, Math.sqrt(3)*200,                   
   r6, Math.sqrt(3)*195, 
});
        w44.setFill(Color.GREEN);
        group.getChildren().add(w44);
         r1+=30;
        r2+=30;
        r3+=30;
        r4+=30;
        r5+=30;
        r6+=30;
     final     Polygon w45 = new Polygon();
        w45.getPoints().addAll(new Double[]{        
   r1, Math.sqrt(3)*190, 
   r2, Math.sqrt(3)*190, 
   r3, Math.sqrt(3)*195,          
   r4, Math.sqrt(3)*200, 
   r5, Math.sqrt(3)*200,                   
   r6, Math.sqrt(3)*195,  
});
        w45.setFill(Color.GREEN);
        group.getChildren().add(w45);
         r1+=30;
        r2+=30;
        r3+=30;
        r4+=30;
        r5+=30;
        r6+=30;
      final    Polygon w46 = new Polygon();
        w46.getPoints().addAll(new Double[]{        
   r1, Math.sqrt(3)*190, 
   r2, Math.sqrt(3)*190, 
   r3, Math.sqrt(3)*195,          
   r4, Math.sqrt(3)*200, 
   r5, Math.sqrt(3)*200,                   
   r6, Math.sqrt(3)*195, 
});
        w46.setFill(Color.GREEN);
        group.getChildren().add(w46);
         r1+=30;
        r2+=30;
        r3+=30;
        r4+=30;
        r5+=30;
        r6+=30;
       final   Polygon w47 = new Polygon();
        w47.getPoints().addAll(new Double[]{        
   r1, Math.sqrt(3)*190, 
   r2, Math.sqrt(3)*190, 
   r3, Math.sqrt(3)*195,          
   r4, Math.sqrt(3)*200, 
   r5, Math.sqrt(3)*200,                   
   r6, Math.sqrt(3)*195, 
});
       w47.setFill(Color.GREEN);
        group.getChildren().add(w47);
         r1+=30;
        r2+=30;
        r3+=30;
        r4+=30;
        r5+=30;
        r6+=30;
    final  Polygon w48 = new Polygon();
        w48.getPoints().addAll(new Double[]{        
   r1, Math.sqrt(3)*190, 
   r2, Math.sqrt(3)*190, 
   r3, Math.sqrt(3)*195,          
   r4, Math.sqrt(3)*200, 
   r5, Math.sqrt(3)*200,                   
   r6, Math.sqrt(3)*195, 
   
});
     w48.setFill(Color.GREEN);
        group.getChildren().add(w48);
        r1=20;
        r2=30;
        r3=35;
        r4=30;
        r5=20;
        r6=15;
        
     final     Polygon w50 = new Polygon();
        w50.getPoints().addAll(new Double[]{        
   r1, Math.sqrt(3)*185, 
   r2, Math.sqrt(3)*185, 
   r3, Math.sqrt(3)*190,          
   r4, Math.sqrt(3)*195, 
   r5, Math.sqrt(3)*195,                   
   r6, Math.sqrt(3)*190, 
});
       w50.setFill(Color.GREEN);
        group.getChildren().add(w50);
        r1+=30;
        r2+=30;
        r3+=30;
        r4+=30;
        r5+=30;
        r6+=30;
     final      Polygon w51 = new Polygon();
        w51.getPoints().addAll(new Double[]{        
   r1, Math.sqrt(3)*185, 
   r2, Math.sqrt(3)*185, 
   r3, Math.sqrt(3)*190,          
   r4, Math.sqrt(3)*195, 
   r5, Math.sqrt(3)*195,                   
   r6, Math.sqrt(3)*190, 
});
       w51.setFill(Color.GREEN);
        group.getChildren().add(w51);
        r1+=30;
        r2+=30;
        r3+=30;
        r4+=30;
        r5+=30;
        r6+=30;
     final      Polygon w52 = new Polygon();
        w52.getPoints().addAll(new Double[]{        
   r1, Math.sqrt(3)*185, 
   r2, Math.sqrt(3)*185, 
   r3, Math.sqrt(3)*190,          
   r4, Math.sqrt(3)*195, 
   r5, Math.sqrt(3)*195,                   
   r6, Math.sqrt(3)*190, 
});
       w52.setFill(Color.GREEN);
        group.getChildren().add(w52);
       r1+=30;
        r2+=30;
        r3+=30;
        r4+=30;
        r5+=30;
        r6+=30;
     final      Polygon w53 = new Polygon();
        w53.getPoints().addAll(new Double[]{        
   r1, Math.sqrt(3)*185, 
   r2, Math.sqrt(3)*185, 
   r3, Math.sqrt(3)*190,          
   r4, Math.sqrt(3)*195, 
   r5, Math.sqrt(3)*195,                   
   r6, Math.sqrt(3)*190, 
});
       w53.setFill(Color.GREEN);
        group.getChildren().add(w53);
       r1+=30;
        r2+=30;
        r3+=30;
        r4+=30;
        r5+=30;
        r6+=30;
       final    Polygon w54 = new Polygon();
        w54.getPoints().addAll(new Double[]{        
  r1, Math.sqrt(3)*185, 
   r2, Math.sqrt(3)*185, 
   r3, Math.sqrt(3)*190,          
   r4, Math.sqrt(3)*195, 
   r5, Math.sqrt(3)*195,                   
   r6, Math.sqrt(3)*190, 
});
       w54.setFill(Color.GREEN);
        group.getChildren().add(w54);
        r1+=30;
        r2+=30;
        r3+=30;
        r4+=30;
        r5+=30;
        r6+=30;
      final     Polygon w55 = new Polygon();
        w55.getPoints().addAll(new Double[]{        
   r1, Math.sqrt(3)*185, 
   r2, Math.sqrt(3)*185, 
   r3, Math.sqrt(3)*190,          
   r4, Math.sqrt(3)*195, 
   r5, Math.sqrt(3)*195,                   
   r6, Math.sqrt(3)*190, 
});
       w55.setFill(Color.GREEN);
        group.getChildren().add(w55);
        r1+=30;
        r2+=30;
        r3+=30;
        r4+=30;
        r5+=30;
        r6+=30;
     final    Polygon w56 = new Polygon();
        w56.getPoints().addAll(new Double[]{        
   r1, Math.sqrt(3)*185, 
   r2, Math.sqrt(3)*185, 
   r3, Math.sqrt(3)*190,          
   r4, Math.sqrt(3)*195, 
   r5, Math.sqrt(3)*195,                   
   r6, Math.sqrt(3)*190, 
});
       w56.setFill(Color.GREEN);
        group.getChildren().add(w56);
		for (double[] a : SCREEN) {
			Arrays.fill(a, 0);
		}
for(int i=0;i<39;i++){
    SCREEN[i][0]=1;
    SCREEN[i][14]=1;
}
for(int i=0;i<15;i+=2){
    SCREEN[38][i]=1;
}
for(int i=0;i<15;i++){
    SCREEN[37][i]=1;
}
for(int i=1;i<14;i+=2){
    SCREEN[36][i]=1;
}

		
		Text scoretext = new Text("Score: ");
		scoretext.setStyle("-fx-font: 20 B-NAZANIN;");
                scoretext.setFill(Color.WHITE);
		scoretext.setY(50);
		scoretext.setX(XMAX + 25);
		
		group.getChildren().addAll(scoretext);

		Shape a = nextObj;
		group.getChildren().addAll(a.a, a.b, a.c, a.d);
		moveOnKeyPress(a);
		object = a;
		nextObj = Movement.makeRect();
		stage.setScene(scene);
		stage.setTitle("HEXTRIS");
		stage.show();

		Timer fall = new Timer();
		TimerTask task = new TimerTask() {
			public void run() {
				Platform.runLater(new Runnable() {
					public void run() {
						if (object.a.getTranslateY()== 0 || object.b.getTranslateY() == 0 || object.c.getTranslateY() == 0
								|| object.d.getTranslateY() == 0)
							top++;
						else
							top = 0;

						if (top == 2) {
							
							Text over = new Text("GAME OVER \n Your Score: "+Integer.toString(score));
                                                        
							over.setFill(Color.WHITE);
							over.setStyle("-fx-font: 40 B-TITR;");
							over.setY(80*Math.sqrt(3));
							over.setX(70);
							group.getChildren().add(over);
							game = false;
						}
						

						if (game) {
							MoveDown(object);
							scoretext.setText("Score: " + Integer.toString(score));
							
						}
					}
				});
			}
		};
		fall.schedule(task, 0, 300); 
	

                }
	private void moveOnKeyPress(Shape form) {
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				switch (event.getCode()) {
				case D:
					Movement.MoveRight(form);
					break;
				case S:
					MoveDown(form);
					break;
				case A:
					Movement.MoveLeft(form);
					break;
                                case W:
                                        Rotate(form);
				}
			}
		});
	}
        
	
	

	private void Rotate (Shape form){
            int f = form.form;
		Polygon a = form.a;
		Polygon b = form.b;
		Polygon c = form.c;
		Polygon d = form.d;
		switch (form.getName()) {
        
                case "a":
                         if(f==1){
                           form.a.setTranslateX(form.a.getTranslateX() + 2 * MOVE );
                           form.a.setTranslateY(form.a.getTranslateY() + (MOVE2));
                           form.b.setTranslateX(form.b.getTranslateX() + MOVE );
                           form.c.setTranslateY(form.c.getTranslateY() - (MOVE2));
                           form.d.setTranslateX(form.d.getTranslateX() - MOVE );
                           form.d.setTranslateY(form.d.getTranslateY() - 2*MOVE2);
                           form.setForm(2);				
                         }
                         if(f==2){
                           form.a.setTranslateY(form.a.getTranslateY() + 3 * MOVE2);
                           form.b.setTranslateY(form.b.getTranslateY() + MOVE2);
                           form.c.setTranslateY(form.c.getTranslateY() - MOVE2);
                           form.d.setTranslateY(form.d.getTranslateY() - 3 * MOVE2);
                           form.setForm(3);				
                         }
                         if(f==3){
                           form.a.setTranslateX(form.a.getTranslateX() - 2 * MOVE );
                           form.a.setTranslateY(form.a.getTranslateY() + (MOVE2));
                           form.b.setTranslateX(form.b.getTranslateX() - MOVE );
                           form.c.setTranslateY(form.c.getTranslateY() - (MOVE2));
                           form.d.setTranslateX(form.d.getTranslateX() + MOVE );
                           form.d.setTranslateY(form.d.getTranslateY() - 2*MOVE2);
                           form.setForm(4);
                         }
                         if(f==4){
                           form.a.setTranslateX(form.a.getTranslateX() - MOVE );
                           form.a.setTranslateY(form.a.getTranslateY() - 2*MOVE2);
                           form.b.setTranslateY(form.b.getTranslateY() - (MOVE2));
                           form.c.setTranslateX(form.c.getTranslateX() + MOVE );
                           form.d.setTranslateX(form.d.getTranslateX() + 2 * MOVE );
                           form.d.setTranslateY(form.d.getTranslateY() + (MOVE2));                   
                           form.setForm(5);
                         }  
                         if(f==5){
                           form.a.setTranslateY(form.a.getTranslateY() - 3 * MOVE2);
                           form.b.setTranslateY(form.b.getTranslateY() - MOVE2);
                           form.c.setTranslateY(form.c.getTranslateY() + MOVE2);
                           form.d.setTranslateY(form.d.getTranslateY() + 3 * MOVE2);
                           form.setForm(6);
                         }
                       if(f==6) {
                           form.a.setTranslateX(form.a.getTranslateX() + 2 * MOVE );
                           form.a.setTranslateY(form.a.getTranslateY() - (MOVE2));
                           form.b.setTranslateX(form.b.getTranslateX() + MOVE );
                           form.c.setTranslateY(form.c.getTranslateY() + (MOVE2));
                           form.d.setTranslateX(form.d.getTranslateX() - MOVE );
                           form.d.setTranslateY(form.d.getTranslateY() + 2*MOVE2);
                           form.setForm(1);
                         }
                break;
                case "b":
                         if(f==1){
                             form.a.setTranslateX(form.a.getTranslateX() + MOVE);
                             form.b.setTranslateY(form.b.getTranslateY() - MOVE2);
                             form.c.setTranslateY(form.c.getTranslateY() - 3* MOVE2);
                             form.d.setTranslateY(form.d.getTranslateY() - 4* MOVE2);
                             form.d.setTranslateX(form.d.getTranslateX() - MOVE);
                             form.setForm(2);
                         }
                         if(f==2){
                             form.a.setTranslateY(form.a.getTranslateY() +  MOVE2);
                             form.b.setTranslateY(form.b.getTranslateY() - MOVE2);
                             form.c.setTranslateY(form.c.getTranslateY() + MOVE2);
                             form.d.setTranslateY(form.d.getTranslateY() - MOVE2);
                             form.setForm(3);
                         }
                         if(f==3){
                             form.a.setTranslateX(form.a.getTranslateX() - MOVE);
                             form.b.setTranslateY(form.b.getTranslateY() - MOVE2);
                             form.c.setTranslateY(form.c.getTranslateY() - 3* MOVE2);
                             form.d.setTranslateY(form.d.getTranslateY() - 4* MOVE2);
                             form.d.setTranslateX(form.d.getTranslateX() + MOVE);
                             form.setForm(4);
                         }
                         if(f==4){
                             form.a.setTranslateY(form.a.getTranslateY() - 4* MOVE2);
                             form.a.setTranslateX(form.a.getTranslateX() + MOVE);
                             form.b.setTranslateY(form.b.getTranslateY() - 3* MOVE2);
                             form.c.setTranslateY(form.c.getTranslateY() - MOVE2);
                             form.d.setTranslateX(form.d.getTranslateX() - MOVE);  
                             form.setForm(5);
                         }  
                         if(f==5){
                             form.a.setTranslateY(form.a.getTranslateY() -  MOVE2);
                             form.b.setTranslateY(form.b.getTranslateY() + MOVE2);
                             form.c.setTranslateY(form.c.getTranslateY() - MOVE2);
                             form.d.setTranslateY(form.d.getTranslateY() + MOVE2);
                             form.setForm(6);
                         }
                         if(f==6) {
                             form.a.setTranslateY(form.a.getTranslateY() - 4 * MOVE2);
                             form.a.setTranslateX(form.a.getTranslateX() - MOVE);
                             form.b.setTranslateY(form.b.getTranslateY() - 3* MOVE2);
                             form.c.setTranslateY(form.c.getTranslateY() - MOVE2);
                             form.d.setTranslateX(form.d.getTranslateX() + MOVE);
                             form.setForm(1);
                             
                         }
                break;
                case "c":
                         if(f==1){
                             form.a.setTranslateX(form.a.getTranslateX() + MOVE);
                             form.b.setTranslateY(form.b.getTranslateY() -  MOVE2);
                             form.c.setTranslateY(form.c.getTranslateY() +  MOVE2);
                             form.d.setTranslateY(form.d.getTranslateY() - 2 * MOVE2);
                             form.d.setTranslateX(form.d.getTranslateX() +  MOVE);
                             form.setForm(2);
                         }
                         if(f==2){
                             form.a.setTranslateY(form.a.getTranslateY() - 2 * MOVE2);
                             form.c.setTranslateY(form.c.getTranslateY() - 2 * MOVE2);
                             form.setForm(3);
                         }
                         if(f==3){
                             form.c.setTranslateY(form.c.getTranslateY() -  MOVE2);
                             form.c.setTranslateX(form.c.getTranslateX() + MOVE);
                             form.b.setTranslateY(form.b.getTranslateY() -  MOVE2);
                             form.b.setTranslateX(form.b.getTranslateX() +  MOVE);
                             form.setForm(1);
                         }
                break;
                case "d":
                         if(f==1){
                             
                             form.a.setTranslateY(form.a.getTranslateY() + 4 * MOVE2);
                             form.c.setTranslateY(form.c.getTranslateY() - 2 * MOVE2);
                             form.d.setTranslateY(form.d.getTranslateY() - 2 * MOVE2);
                             form.setForm(2);
                         }
                         if(f==2){
                             form.a.setTranslateY(form.a.getTranslateY() - 4 * MOVE2);
                             form.c.setTranslateY(form.c.getTranslateY() + 2 * MOVE2);
                             form.d.setTranslateY(form.d.getTranslateY() + 2 * MOVE2);
                             form.setForm(1);
                         }
                break;
                case "e":
                         if(f==1){
                           form.d.setTranslateY(form.d.getTranslateY() + 3 * MOVE2);
                           form.d.setTranslateX(form.d.getTranslateX() - MOVE);
                         }
                         if(f==2){
                             form.d.setTranslateX(form.d.getTranslateX() - 2 * MOVE);
                         }
                         if(f==3){
                             form.d.setTranslateX(form.d.getTranslateX() - MOVE);
                             form.d.setTranslateY(form.d.getTranslateY() - 3 * MOVE2);
                         }
                         if(f==4){
                             form.d.setTranslateX(form.d.getTranslateX() + MOVE);
                             form.d.setTranslateY(form.d.getTranslateY() - 3 * MOVE2);
                         }  
                         if(f==5){
                             form.d.setTranslateX(form.d.getTranslateX() + 2 * MOVE);
                         }
                         if(f==6){
                             form.d.setTranslateX(form.d.getTranslateX() + MOVE);
                             form.d.setTranslateY(form.d.getTranslateY() + 3 * MOVE2);
                         }  
                
                case "f":
                         if(f==1){                           
                             form.a.setTranslateX(form.a.getTranslateX() + 2* MOVE);
                             form.a.setTranslateY(form.a.getTranslateY() + 2 * MOVE2);
                             form.b.setTranslateX(form.b.getTranslateX() + MOVE);
                             form.b.setTranslateY(form.b.getTranslateY() + MOVE2); 
                             form.d.setTranslateY(form.d.getTranslateY() -  MOVE2);
                             form.d.setTranslateX(form.d.getTranslateX() + MOVE);
                             form.setForm(2);
                         }
                         if(f==2){            
                             form.a.setTranslateY(form.a.getTranslateY() + 2 * MOVE2);
                             form.c.setTranslateY(form.c.getTranslateY() - 2 * MOVE2);
                             form.d.setTranslateY(form.d.getTranslateY() -  MOVE2);
                             form.d.setTranslateX(form.d.getTranslateX() + MOVE);
                             form.setForm(3);
                         }
                         if(f==3){
                             form.a.setTranslateY(form.a.getTranslateY() +  MOVE2);
                             form.a.setTranslateX(form.a.getTranslateX() -  MOVE); 
                             form.c.setTranslateY(form.c.getTranslateY() -  MOVE2);
                             form.c.setTranslateX(form.c.getTranslateX() +  MOVE);
                             form.d.setTranslateY(form.d.getTranslateY() +  MOVE2);
                             form.d.setTranslateX(form.d.getTranslateX() + MOVE);
                             form.setForm(4);
                         }
                         if(f==4){
                             form.a.setTranslateY(form.a.getTranslateY() -  MOVE2);
                             form.a.setTranslateX(form.a.getTranslateX() -  MOVE); 
                             form.c.setTranslateY(form.c.getTranslateY() +  MOVE2);
                             form.c.setTranslateX(form.c.getTranslateX() +  MOVE);
                             form.d.setTranslateY(form.d.getTranslateY() + 2 * MOVE2);
                             form.setForm(5);
                         }  
                         if(f==5){
                             form.a.setTranslateY(form.a.getTranslateY() - 2 * MOVE2);          
                             form.c.setTranslateY(form.c.getTranslateY() + 2 * MOVE2);
                             form.d.setTranslateY(form.d.getTranslateY() +  MOVE2);
                             form.d.setTranslateX(form.d.getTranslateX() - MOVE);
                             form.setForm(6);
                         }
                         if(f==6){
                             form.a.setTranslateY(form.a.getTranslateY() -  MOVE2);
                             form.a.setTranslateX(form.a.getTranslateX() +  MOVE); 
                             form.c.setTranslateY(form.c.getTranslateY() +  MOVE2);
                             form.c.setTranslateX(form.c.getTranslateX() -  MOVE);
                             form.d.setTranslateY(form.d.getTranslateY() -  MOVE2);
                             form.d.setTranslateX(form.d.getTranslateX() - MOVE);
                             form.setForm(1);
                             
                         } 
                break;
                case "g":
                         if(f==1){
                             form.a.setTranslateY(form.a.getTranslateY() +  MOVE2);
                             form.a.setTranslateX(form.a.getTranslateX() + 2 * MOVE);
                             form.b.setTranslateX(form.b.getTranslateX() +  MOVE);
                             form.c.setTranslateY(form.c.getTranslateY() -  MOVE2);
                             form.d.setTranslateX(form.d.getTranslateX() - MOVE);
                             form.setForm(2);
                         }
                         if(f==2){
                             form.a.setTranslateY(form.a.getTranslateY() + 4 * MOVE2);
                             form.b.setTranslateY(form.b.getTranslateY() + 2 * MOVE2);
                             form.d.setTranslateY(form.d.getTranslateY() -  MOVE2);
                             form.d.setTranslateX(form.d.getTranslateX() - MOVE);
                             form.setForm(3);
                         }
                         if(f==3){
                             form.a.setTranslateY(form.a.getTranslateY() + 2 * MOVE2);
                             form.a.setTranslateX(form.a.getTranslateX() - 2 * MOVE);
                             form.b.setTranslateY(form.b.getTranslateY() +  MOVE2);
                             form.b.setTranslateX(form.b.getTranslateX() - MOVE);
                             form.d.setTranslateY(form.d.getTranslateY() - 2 * MOVE2);
                             form.setForm(4);
                         }
                         if(f==4){
                             form.a.setTranslateY(form.a.getTranslateY() -  MOVE2);
                             form.a.setTranslateX(form.a.getTranslateX() -  MOVE);
                             form.c.setTranslateY(form.c.getTranslateY() +  MOVE2);
                             form.c.setTranslateX(form.c.getTranslateX() + MOVE);
                             form.d.setTranslateX(form.d.getTranslateX() + 2 * MOVE);
                             form.setForm(5);
                         }  
                         if(f==5){
                             form.a.setTranslateY(form.a.getTranslateY() - 2 * MOVE2);
                             form.c.setTranslateY(form.c.getTranslateY() + 2 * MOVE2);
                             form.d.setTranslateX(form.d.getTranslateX() +  MOVE);
                             form.d.setTranslateY(form.d.getTranslateY() + 3 * MOVE2);
                             form.setForm(6);
                         }
                         if(f==6){
                             form.a.setTranslateY(form.a.getTranslateY() -  MOVE2);
                             form.a.setTranslateX(form.a.getTranslateX() + MOVE);
                             form.c.setTranslateY(form.c.getTranslateY() +  MOVE2);
                             form.c.setTranslateX(form.c.getTranslateX() -  MOVE);
                             form.d.setTranslateX(form.d.getTranslateX() - MOVE);
                             form.d.setTranslateY(form.d.getTranslateY() + 3 * MOVE2);
                             form.setForm(1);
                         }
                                       
        }
        }
	private void MoveDown(Shape form) {
		        double movea = SCREEN[((int) (form.a.getTranslateY() / MOVE2)) + 1][(int) (form.a.getTranslateX() / MOVE) + 7];
			double moveb = SCREEN[((int) (form.b.getTranslateY() / MOVE2)) + 1][(int) (form.b.getTranslateX() / MOVE) + 7];
			double movec = SCREEN[((int) (form.c.getTranslateY() / MOVE2)) + 1][(int) (form.c.getTranslateX() / MOVE) + 7];
			double moved = SCREEN[((int) (form.d.getTranslateY() / MOVE2)) + 1][(int) (form.d.getTranslateX() / MOVE) + 7];
			if (movea == 1 || moveb == 1  || movec == 1 || moved == 1) {
                                   
			SCREEN[((int) (form.a.getTranslateY() / MOVE2))][(int) (form.a.getTranslateX() / MOVE) + 7] = 1;
			SCREEN[((int) (form.b.getTranslateY() / MOVE2))][(int) (form.b.getTranslateX() / MOVE) + 7] = 1;
			SCREEN[((int) (form.c.getTranslateY() / MOVE2))][(int) (form.c.getTranslateX() / MOVE) + 7] = 1;
			SCREEN[((int) (form.d.getTranslateY() / MOVE2))][(int) (form.d.getTranslateX() / MOVE) + 7] = 1;
                        SCREEN[((int) (form.a.getTranslateY() / MOVE2)) - 1][(int) (form.a.getTranslateX() / MOVE) + 7] = 1;
			SCREEN[((int) (form.b.getTranslateY() / MOVE2)) - 1][(int) (form.b.getTranslateX() / MOVE) + 7] = 1;
			SCREEN[((int) (form.c.getTranslateY() / MOVE2)) - 1][(int) (form.c.getTranslateX() / MOVE) + 7] = 1;
			SCREEN[((int) (form.d.getTranslateY() / MOVE2)) - 1][(int) (form.d.getTranslateX() / MOVE) + 7] = 1;
                     
                        RemoveRows(group);

			Shape a = nextObj;
			nextObj = Movement.makeRect();
			object = a;
			group.getChildren().addAll(a.a, a.b, a.c, a.d);
			moveOnKeyPress(a);
		}
                        
               
                	 movea = SCREEN[((int) (form.a.getTranslateY() / MOVE2)) + 1][(int) (form.a.getTranslateX() / MOVE) + 7];
			 moveb = SCREEN[((int) (form.b.getTranslateY() / MOVE2)) + 1][(int) (form.b.getTranslateX() / MOVE) + 7];
			 movec = SCREEN[((int) (form.c.getTranslateY() / MOVE2)) + 1][(int) (form.c.getTranslateX() / MOVE) + 7];
			 moved = SCREEN[((int) (form.d.getTranslateY() / MOVE2)) + 1][(int) (form.d.getTranslateX() / MOVE) + 7];
			if (movea == 0 && movea == moveb && moveb == movec && movec == moved) {
				form.a.setTranslateY(form.a.getTranslateY() + MOVE2);
				form.b.setTranslateY(form.b.getTranslateY() + MOVE2);
				form.c.setTranslateY(form.c.getTranslateY() + MOVE2);
				form.d.setTranslateY(form.d.getTranslateY() + MOVE2);
                                
			}
		
	
       }
	
        private void RemoveRows(Pane pane) {
		ArrayList<Node> polys = new ArrayList<Node>();
		ArrayList<Integer> lines = new ArrayList<Integer>();
		ArrayList<Node> newpolys = new ArrayList<Node>();
		int full = 0;
		for (int i = 0; i < 36; i++) {
			for (int j = 1; j < 14; j++) {
				if (SCREEN[i][j] == 1)
					full++;
			}
			if (full == 13){
			lines.add(i);
                        }
			full = 0;
		}
		if (lines.size() > 0)
			do {
				for (Node node : pane.getChildren()) {
					if (node instanceof Polygon)
						polys.add(node);
				}
				score += 10;

				for (Node node : polys) {
					Polygon a = (Polygon) node;
					if ((a.getTranslateY() / MOVE2 == lines.get(0) || a.getTranslateY() / MOVE2 == lines.get(0) + 1)&&(int) (a.getTranslateY() ) != 0  ) {
                                           
                                           SCREEN[(int)(a.getTranslateY() / MOVE2)] [(int)(a.getTranslateX() / MOVE + 7)] --;
                                           SCREEN[(int)(a.getTranslateY() / MOVE2 - 1)] [(int)(a.getTranslateX() / MOVE + 7)] --;
                                            
                                            
						pane.getChildren().remove(node);
					} else if(a.getTranslateY() / MOVE2 < lines.get(0) && (int) (a.getTranslateY() ) != 0  )
						{
                                                    
                                    
                                   SCREEN[(int) (a.getTranslateY() / MOVE2)][ (int) (a.getTranslateX() / MOVE) + 7]  --;
                                    SCREEN[(int) (a.getTranslateY() / MOVE2) - 1][ (int) (a.getTranslateX() / MOVE) + 7]  --;
                                   a.setTranslateY(a.getTranslateY() + SIZE2);
                                   SCREEN[(int) (a.getTranslateY() / MOVE2) - 1][ (int) (a.getTranslateX() / MOVE) + 7] ++;
                                  SCREEN[(int) (a.getTranslateY() / MOVE2)][ (int) (a.getTranslateX() / MOVE) + 7]  ++;
                                }
				}

				lines.remove(0);
				polys.clear();
				newpolys.clear();
				
			} while (lines.size() > 0);
	}
       
public static void main(String[] args) {
		launch(args);
	}
}

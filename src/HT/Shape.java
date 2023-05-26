package hextris_final;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Shape {
	Polygon a;
	Polygon b;
	Polygon c;
	Polygon d;
	Color color;
	private String name;
        public int form = 1;

	public Shape(Polygon a, Polygon b, Polygon c, Polygon d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
     

	public Shape(Polygon a, Polygon b, Polygon c, Polygon d, String name) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.name = name;

		switch (name) {
		case "a":
			color = Color.YELLOW;
			break;
		case "b":
			color = Color.GREENYELLOW;
			break;
		case "c":
			color = Color.ORANGE;
			break;
		case "d":
			color = Color.RED;
			break;
		case "e":
			color = Color.PURPLE;
			break;
		case "f":
			color = Color.PINK;
			break;
		case "g":
			color = Color.BLUE;
			break;

		}
		this.a.setFill(color);
		this.b.setFill(color);
		this.c.setFill(color);
		this.d.setFill(color);
	}
public void setForm(int n) {
		form=n;
	}

	public String getName() {
		return name;
	}
       
}
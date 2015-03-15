import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class DADACONF extends PApplet {

public void setup() {
  size(1024, 768);
}

public void draw() {
  if (mousePressed) {
    fill(0);
  } else {
    fill(random(255), random(255), random(255), random(255)); 
  }
  ellipse(mouseX, mouseY, random(120), random(120));
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--full-screen", "--bgcolor=#666666", "--stop-color=#AF9595", "DADACONF" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

void setup() {
  size(1024, 768);
}

void draw() {
  if (mousePressed) {
    fill(0);
  } else {
    fill(random(255), random(255), random(255), random(255)); 
  }
  ellipse(mouseX, mouseY, random(120), random(120));
}



void setup() {
PImage face = loadImage("pvz.jpg");
size(450, 500);
face.resize( width, height);
image(face, 1 , 1);
}
void draw() {
fill(mouseX, mouseY, 0);
  ellipse(50, 170, 50, 50);
  
  ellipse(170, 170, 50, 50);
  
  fill(13,13,13);
    ellipse(170, 170, 30, 30);
    fill(13,13,13);
    ellipse(50, 170, 30, 30);

} 

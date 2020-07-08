
void setup() {
PImage face = loadImage("face.jpg");
size(500,500);
face.resize(500,500);
image(face,0,0);
}
void draw() {
  if(mousePressed){
    print("x="+mouseX);
    print("y="+mouseY);
}
fill(mouseX,0,0);
ellipse(186,187,88,50);
ellipse(315,186,88,50);
fill(#000000);
ellipse(315,186,25,25);
ellipse(186,187,25,25);
}

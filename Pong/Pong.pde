
int x = 0;
int y = 0;
int speed = 5;
int deeps = 5;
void setup() {
  size(800,800);
  background(0,205,125);
  
  
  
  
  
  
  
  
}
void draw() {
  background(0,205,125);
 fill(250,250,250);
 stroke(0,0,0);
 ellipse(x,400,30,30);
 x+=speed;
 y+=deeps;
 
 if (x>800 || x<0) {
   speed=-speed;
 }
 if (y>800 || y<0) {
   deeps=-deeps;
 }
 
  
  
  
  
}
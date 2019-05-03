
PImage backgroundImage;
int x = 0;
int y = 0;
int speed = 5;
int deeps = 5;
void setup() {
  size(800,800);
  background(0,205,125);
  backgroundImage = loadImage("hi.jpg");
  backgroundImage.resize(width,height);

 
}
void draw() {
   image(backgroundImage, 0, 0 );
   fill(0,0,0);
   rect(mouseX,370, 20, 70);
 fill(124,252,0);
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
   

 if (intersects(x,400,mouseX,370,70) == true) {
   speed= -speed;
 }
 if (intersects(x, 400, mouseX,370,70) == true) {
  deeps=-deeps; 
 }
  
  
  
  
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}
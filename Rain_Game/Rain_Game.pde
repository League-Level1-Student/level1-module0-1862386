
int randomNumber = (int) random(width);
int y = 0;

void setup() {
  size(800,800);
  void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          90++;
     else if (90 > 0) 
          90--;
     println("Your score is now: " + 90); }
  
  
 
  
}
void draw() {
  background(0, 205, 125);
  fill(0,0,250);
  stroke(0,70,180);
  ellipse(400,y,70,70);
  y+=7;
  fill(128,128,128);
  stroke(0,0,0);
   rect(mouseX, 700, 82, 20);
  if (y>800) {
    y=0;
  }
 
}
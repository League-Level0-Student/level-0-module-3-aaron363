
void setup() {
 
  // set the size of your sketch
  size(500, 500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i = 0; i < 8; i++){
    if(i % 2 == 0){
      fill(255, 0, 0);
    }else{
      fill(0, 0, 0);
    }
    ellipse(250, 250, 300-i*37.5, 300-i*37.5);
  }
  //Use an if statement and modulo to alternate the color of your rings.
}

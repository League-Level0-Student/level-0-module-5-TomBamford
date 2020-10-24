 int x = 450;
  int y = 450;
  int x2 = 450;
  int y2 = 450;
  int z = 270;
  int z2 = 770;
  int speed1 = 3;
  int speed2 = -3;
void setup() {
  size(1000,1000);
}

void draw() {
  noFill();
  background(#FFFFFF);
  z = z + speed1; 
  z2 = z2 + speed2;
  for(int i = 0; i < 45; i++) {
  ellipse(z,500,x,y);
  x=x-10;
  y=y-10;
  }
    for(int j = 0; j < 45; j++) {
  ellipse(z2,500,x2,y2);
  x2=x2-10;
  y2=y2-10;
  }
  x= 450;
  y= 450;
  x2 = 450;
  y2 =450; 
  
  if ( z >= 1000) {
    speed1 = speed1 *-1;
  } else if (z < 0) {
    speed1 = speed1 * -1;
  }
  
  if ( z2 < 0 ) {
    speed2 = speed2 *-1;
  }
  else if ( z2 >= 1000) {
    speed2 = speed2 *-1;
  }


  
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
  

  
  
}
 

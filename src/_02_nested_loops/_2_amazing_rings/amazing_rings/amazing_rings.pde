
void setup() {
  size(500,500);
}

void draw() {
   int x = 450;
  int y = 450;
  for(int i = 0; i < 8; i++) {
  ellipse(250,250,x,y);
  x=x-50;
  y=y-50;
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}
}

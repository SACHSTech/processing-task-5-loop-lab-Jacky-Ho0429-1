import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    /*
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  
*/
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        
        intX = 3 + intRow * 10;  
        intY = 300 + 3 + intColumn * 10; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }


  public void draw_section2(){
    int intX = 0;
    int intY = 0;
    int intXTen;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        
        intX = 3 + intRow * 10 + 300;  
        intY = 300 + 3 + intColumn * 10; 
        intXTen = (intX / 10) % 10;

        if (intXTen % 2 == 0) {
          fill(255);
        } else {
          fill (0);
        }

        noStroke();
        rect(intX, intY, 5, 5);

      }
    }

  }

  public void draw_section3(){
    int intX = 0;
    int intY = 0;
    int intYTen;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        
        intX = 3 + intRow * 10 + 600;  
        intY = 300 + 3 + intColumn * 10; 
        intYTen = (intY / 10) % 10;

        if (intYTen % 2 != 0) {
          fill(255);
        } else {
          fill (0);
        }

        noStroke();
        rect(intX, intY, 5, 5);

      }
    }

  }

  public void draw_section4(){
    int intX = 0;
    int intY = 0;
    int intXTen;
    int intYTen;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        
        intX = 3 + intRow * 10 + 900;  
        intY = 300 + 3 + intColumn * 10; 
        intXTen = (intX / 10) % 10;
        intYTen = (intY / 10) % 10;

        if ((intYTen % 2 != 0) && (intXTen % 2 == 0)) {
          fill(255);
        } else {
          fill (0);
        }

        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  public void draw_section5(){
    int intX = 0;
    int intY = 0;

    for (int intColumn = 0; intColumn <= 30; intColumn++) {
      for (int intRow = 0; intRow <= 30 - intColumn; intRow++) {
       intX = 3 + (30 - intRow) * 10;
       intY = 3 + (30 - intColumn) * 10;

       fill(255);
       noStroke();
       rect(intX, intY, 5, 5);
    }
  }
}

  public void draw_section6(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = intRow; intColumn < 30; intColumn++){
        
        intX = 3 + intRow * 10 + 300;  
        intY = 3 + intColumn * 10; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  public void draw_section7(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30 - intRow; intColumn++){
        
        intX = 3 + intColumn * 10 + 600;  
        intY = 3 + intRow * 10; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }
  
  public void draw_section8(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn <= intRow; intColumn++){
        
        intX = 3 + intRow * 10 + 900;  
        intY = 3 + intColumn * 10; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  } 
}

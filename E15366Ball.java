
//package Ball;
/** E/15/366
 *
 * @author Thinesh
 */

public class E15366Ball {
 
     
     public static void main(String [] args) {
        
	/*  In this main method, Input the ball's x,y,speed and angle values using the constructor
         *  give the update time by using updateTime method
         *  willCollide method will give whether the balls are collided(true or false)
         *  then I put the if statement and give the result
         */
		 
    // test --> 1  
	
	Ball b1 = new Ball(0.0, 1.0, 10.0, 45.0);
	Ball.updateTime(5.0);
     
    Ball b2 = new Ball(0.0, 1.0, 20.0, 45.0);
	Ball.updateTime(5.0);
	
         if(b1.willCollide(b2)){
	        System.out.println("B1 and B2 will collide");
        }
        
        else
            System.out.println("B1 and B2 will not collide");
		
    //  we can check one by one or both test at the same time
	
	// test --> 2
	
    /*
    Ball b3 = new Ball(-10.0, 5.0, 3, 30);
	Ball.updateTime(20.0);
        
	    if(b2.willCollide(b3)){
	        System.out.println("B3 and B2 will collide");
		}
        else 
             System.out.println("B2 and B3 will not collide");
	
	
       */ 
    }

 }

   // ball class start 

 class Ball{
    
     
    private final double x;                   // variable store the x position in final type
    private final double y;                   // variable store the y position in final type
    private double speed;                     // variable store the speed of ball
    private double angleOfSpeedWithX;             // variable stroe the angle of speed with x axis
    private double time;                       //variable  store the current time
    public static double s_Time;             //variable store the initial time
    private double sinq;                       // sin value of angle
    private double cosq;                      //  cos value of angle
    
    // define the constructor
    public Ball(double x, double y, double speed, double angleOfSpeedWithX) {
        this.x=x;
        this.y=y;
        this.setSpeed(speed);
        this.setAngleOfSpeedWithX(angleOfSpeedWithX);
   
        this.sinq= Math.sin(Math.toRadians(angleOfSpeedWithX));        // sin value 
        this.cosq= Math.cos(Math.toRadians(angleOfSpeedWithX));        // cos value
        this.time=s_Time;
     
    }

	
	// start the set and get method to set values in the private variable
	// but the final variables x and y can not have set and get method
    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
    
    public double setAngleOfSpeedWithX() {
		return angleOfSpeedWithX;
	}

    public void setAngleOfSpeedWithX(double angleOfSpeedWithX) {
          this.angleOfSpeedWithX = angleOfSpeedWithX;
	}
    
    public double getCosq() {
	return cosq;
	}

    public void setCosq(double cosq) {
	this.cosq = cosq;
	}
   
    public double getSinq() {
	return sinq;
	}
    
    public void setSinq(double sinq) {
		this.sinq = sinq;
	}
   
    public double getSpeed() {
		return speed;
	}

    public void setSpeed(double speed) {
		this.speed = speed;
	}
	
     /*   
    public double getX() {
		return x;
    }
	 public void setX() {
		 this.x=x;
    }
	 public void setY() {
		 this.y=y;
    }
	 public double getY() {
		return y;
    }
    */
	
	
    // update the time when input the ball
    static double t ;
    public static double updateTime(double inpTime) {
        t=inpTime;                      // used to find the last ball distance
     
        s_Time = s_Time + inpTime;     // used to find the first ball distance
        return t;
    }
    
    double t2,t4;  // find the distance 
    
    public boolean willCollide(Ball ball) {
           t2=this.speed*s_Time;              // calculate the distance by using s=ut (last ball)
           t4=ball.speed*t;                   // calculate the distance by using total time (firstball)
           
           boolean rtrn = true;
           
           rtrn = (ball.x+cosq*t4)==(this.x+cosq*t2) && (ball.y+sinq*t4)==(this.y+sinq*t2); // condition will check the positions, whether balls will collide
         
        return rtrn;
         
    }
}

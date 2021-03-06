/**
 * WheelDriver for our robot. This will handle ONLY movement. This should (hopefully) be able to be used w/o any sensors.
 * All movement LOGIC (search for ball, follow line, etc), and sensor handling should be done in another file.
 * Fill in anything as needed, make clear notes either in here or preferrably on the Git.
 * Feel free to add your name to the author list when changes are made.
 * @author Grayson Lorenz
 *
 */

public class WheelDriver {
	//////////////////////////////////////////////
	//FIELDS//////////////////////////////////////
	boolean frontRight;
	boolean frontLeft;
	boolean backRight;
	boolean backLeft;
	
	int frontRightSpeed;
	int frontLeftSpeed;
	int backRightSpeed;
	int backLeftSpeed;
	
	//CONSTRUCTORS////////////////////////////////
	
	public WheelDriver(){
		setFrontRight(false);
		setFrontLeft(false);
		setBackRight(false);
		setBackLeft(false);
		
		setFrontRightSpeed(0);
		setFrontLeftSpeed(0);
		setBackRightSpeed(0);
		setBackLeftSpeed(0);
	}
	
	//MOVEMENT METHODS////////////////////////////
	
	/**
	 * Start all wheels in the forward direction.
	 * @param speed The speed in which the bot will move per... something.
	 */
	public static void MoveForward(int speed){
		
	}
	
	/**
	 * Start all wheels in the reverse direction.
	 * @param speed The speed in which the bot will move per... something.
	 */
	public static void MoveBackward(int speed){
		
	}
	
	/**
	 * Start front wheels and back wheels in the opposite direction
	 * Causing the robot to slide to the left using Omniwheels
	 * @param speed The speed in which the bot will move per... something.
	 */
	public static void MoveLeft(int speed){
		
	}
	
	/**
	 * Start front wheels and back wheels in the opposite direction
	 * Causing the robot to slide to the right using Omniwheels
	 * @param speed The speed in which the bot will move per... something.
	 */
	public static void MoveRight(int speed){
		
	}
	
	/**
	 * Start the left wheels and right wheels in the opposite direction
	 * Causing the robot to turn left.
	 * LEFT REVERSE
	 * RIGHT FORWARD
	 * @param speed The speed in which the bot will move per... something.
	 */
	public static void TurnLeft(int speed){
		
	}
	
	
	/**
	 * Start the left wheels and right wheels in the opposite direction
	 * Causing the robot to turn right.
	 * LEFT FORWARD
	 * RIGHT REVERSE 
	 * @param speed The speed in which the bot will move per... something.
	 */
	public static void TurnRight(int speed){
		
	}
	
	/**
	 * Stop all wheel movement
	 */
	public static void StopMovement(){
		
	}

	//GETTERS AND SETTERS/////////////////////////
	public String ToString(){
		return "WHEEL DRIVER: output";
	}

	/**
	 * @return the frontRight
	 */
	public boolean isFrontRight() {
		return frontRight;
	}

	/**
	 * @param frontRight the frontRight to set
	 */
	public void setFrontRight(boolean frontRight) {
		this.frontRight = frontRight;
	}

	/**
	 * @return the frontLeft
	 */
	public boolean isFrontLeft() {
		return frontLeft;
	}

	/**
	 * @param frontLeft the frontLeft to set
	 */
	public void setFrontLeft(boolean frontLeft) {
		this.frontLeft = frontLeft;
	}

	/**
	 * @return the backRight
	 */
	public boolean isBackRight() {
		return backRight;
	}

	/**
	 * @param backRight the backRight to set
	 */
	public void setBackRight(boolean backRight) {
		this.backRight = backRight;
	}

	/**
	 * @return the backLeft
	 */
	public boolean isBackLeft() {
		return backLeft;
	}

	/**
	 * @param backLeft the backLeft to set
	 */
	public void setBackLeft(boolean backLeft) {
		this.backLeft = backLeft;
	}

	/**
	 * @return the frontRightSpeed
	 */
	public int getFrontRightSpeed() {
		return frontRightSpeed;
	}

	/**
	 * @param frontRightSpeed the frontRightSpeed to set
	 */
	public void setFrontRightSpeed(int frontRightSpeed) {
		this.frontRightSpeed = frontRightSpeed;
	}

	/**
	 * @return the frontLeftSpeed
	 */
	public int getFrontLeftSpeed() {
		return frontLeftSpeed;
	}

	/**
	 * @param frontLeftSpeed the frontLeftSpeed to set
	 */
	public void setFrontLeftSpeed(int frontLeftSpeed) {
		this.frontLeftSpeed = frontLeftSpeed;
	}

	/**
	 * @return the backRightSpeed
	 */
	public int getBackRightSpeed() {
		return backRightSpeed;
	}

	/**
	 * @param backRightSpeed the backRightSpeed to set
	 */
	public void setBackRightSpeed(int backRightSpeed) {
		this.backRightSpeed = backRightSpeed;
	}

	/**
	 * @return the backLeftSpeed
	 */
	public int getBackLeftSpeed() {
		return backLeftSpeed;
	}

	/**
	 * @param backLeftSpeed the backLeftSpeed to set
	 */
	public void setBackLeftSpeed(int backLeftSpeed) {
		this.backLeftSpeed = backLeftSpeed;
	}
}

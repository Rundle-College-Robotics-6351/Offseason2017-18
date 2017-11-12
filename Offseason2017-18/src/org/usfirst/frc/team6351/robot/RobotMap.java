package org.usfirst.frc.team6351.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

/**
 * Rundle College Team 6351, 2017 Off-Season
 * Programmed in Java by Davis Carlson in 2016 and Max Gilmour in 2016
 * Programmed by various people in 2017
 * 
 */

public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	public static final double Tank_Drive_Scaling_Teleop = 0.6;
	public static final double Drive_Scaling_Auto = 0.6;
	public static final double Tank_Drive_Precision_Scaling_Teleop = 0.2;
	
	public static final double GTA_Drive_Scaling_Teleop = 0.5;
	public static final double GTA_Drive_Precision_Scaling_Teleop = 0.2;
	
	public static final int Motor_Front_Left = 1;
	public static final int Motor_Back_Left = 2;
	public static final int Motor_Front_Right = 3;
	public static final int Motor_Back_Right = 4;
	
	public static final int Spark_Controller_Spinner = 9;
	public static final int Spark_Controller_Shooter = 8;
	public static final int Spark_Controller_HopperMixer = 7;
	public static final int Spark_Controller_Climber = 6;
	
	public static final int Talon_Controller_LightRing = 5;
	
	public static final int Solenoid_1 = 4;
	public static final int Solenoid_2 = 3;

	public static final int Controller1_Left_Y_Axis = 1;
	public static final int Controller1_Right_Y_Axis = 5;
	
	public static final int Controller1_Left_X_Axis = 0;
	public static final int Controller1_Right_X_Axis = 4;
	
	public static final int Controller1_Right_Trigger = 3;
	public static final int Controller1_Left_Trigger = 2;
	
	public static final int Controller2_Right_Trigger = 8;
	public static final int Controller2_Left_Trigger = 7;
	
	public static final int Controller1_Right_Bumper = 6;
	public static final int Controller1_Left_Bumper = 5;

	public static final int Controller1_A_Button = 1;
	public static final int Controller1_B_Button = 2;
	public static final int Controller1_X_Button = 3;
	public static final int Controller1_Y_Button = 4;
	
	public static final int Controller2_A_Button = 2;
	public static final int Controller2_B_Button = 3;
	public static final int Controller2_X_Button = 1;
	public static final int Controller2_Y_Button = 4;
	
	public static final double TELEOP_MAX_ROBOT_SPEED = 0.99;
	public static final double TELEOP_MIN_ROBOT_SPEED = -0.99;
	

	public static final int MJPEG_WIDTH = 624;
	public static final int MJPEG_HEIGHT = 311;
	
	//LogitechJoystick
	
	public static final int Joy_Y_Axis = 1;
	public static final int Joy_Z_Axis = 2;
	public static final int Joy_X_Axis = 0;
	public static final int Joy_Throttle = 3;
	
	public static final int Joy_Button_10 = 10;
	public static final int Joy_Button_11 = 11;
	public static final int Joy_Button_12 = 12;
	public static final int Joy_Button_7 = 7;
	public static final int Joy_Button_3 = 3;
	public static final int Joy_Button_1 = 1;
}

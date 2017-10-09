package org.usfirst.frc.team6351.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team6351.robot.commands.ActivateShooter;
import org.usfirst.frc.team6351.robot.commands.InvertRobot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

/**
 * Rundle College Team 6351, 2016/17 Season
 * Programmed in Java by Davis Carlson and Max Gilmour
 * 
 */

public class OI {
	public Joystick driver1 = new Joystick(0);
	public Joystick controller1 = new Joystick(2);
	public Joystick flightstick1 = new Joystick(1);
	
	
	// Microsoft Controller for Controller
	
	public Button controllerA = new JoystickButton(controller1, RobotMap.Controller2_A_Button);
	public Button controllerB = new JoystickButton(controller1, RobotMap.Controller2_B_Button);
	public Button controllerX = new JoystickButton(controller1, RobotMap.Controller2_X_Button);
	public Button controllerY = new JoystickButton(controller1, RobotMap.Controller2_Y_Button);
	
	public Button controllerLeftBumper = new JoystickButton(controller1, RobotMap.Controller1_Left_Bumper);
	public Button controllerRightBumper = new JoystickButton(controller1, RobotMap.Controller1_Right_Bumper);
	
	public Button controllerLeftTrigger = new JoystickButton(controller1, RobotMap.Controller2_Left_Trigger);
	public Button controllerRightTrigger = new JoystickButton(controller1, RobotMap.Controller2_Right_Trigger);

	// Microsoft Controller for Driver
	
	public Button driverA = new JoystickButton(driver1, RobotMap.Controller1_A_Button);
	public Button driverB = new JoystickButton(driver1, RobotMap.Controller1_B_Button);
	public Button driverX = new JoystickButton(driver1, RobotMap.Controller1_X_Button);
	public Button driverY = new JoystickButton(driver1, RobotMap.Controller1_Y_Button);
		
	public Button driverLeftBumper = new JoystickButton(driver1, RobotMap.Controller1_Left_Bumper);
	public Button driverRightBumper = new JoystickButton(driver1, RobotMap.Controller1_Right_Bumper);
		
	//Logitech FLight Stick
	
	public Button joystick1 = new JoystickButton(flightstick1, RobotMap.Joy_Button_1);
	public Button joystick3 = new JoystickButton(flightstick1, RobotMap.Joy_Button_3);
	public Button joystick7 = new JoystickButton(flightstick1, RobotMap.Joy_Button_7);
	public Button joystick11 = new JoystickButton(flightstick1, RobotMap.Joy_Button_11);
	public Button joystick10 = new JoystickButton(flightstick1, RobotMap.Joy_Button_10);
	public Button joystick12 = new JoystickButton(flightstick1, RobotMap.Joy_Button_12);
	
	public OI() {

//		joystick3.toggleWhenPressed(new InvertRobot());
//		joystick1.whileHeld(new ActivateShooter());
//		joystick11.toggleWhenPressed(new ActivateBallCollector());
//		joystick12.toggleWhenPressed(new EvacuateBallCollector());
//		joystick7.whileHeld(new ActivateClimber());
		 
		driverLeftBumper.toggleWhenPressed(new InvertRobot());
		
		controllerRightTrigger.whileHeld(new ActivateShooter());
		
	}
	//Method for getting an axis value on the driver joystick
		public double controllerDriverAxisValue (int axis) {
			
			return driver1.getRawAxis(axis);
			
		}
		public double controllerControllerAxisValue (int axis) {
			
			return controller1.getRawAxis(axis);
			
		}
		public double joystickAxisValue (int axis) {
			
			return flightstick1.getRawAxis(axis);
			
		}
		public double joystickPOVAngle (int axis) {
			
			return flightstick1.getPOV();
			
		}
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}


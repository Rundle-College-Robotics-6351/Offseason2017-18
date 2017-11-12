package org.usfirst.frc.team6351.robot.commands;

import org.usfirst.frc.team6351.robot.Robot;
import org.usfirst.frc.team6351.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Rundle College Team 6351, 2017 Off-Season
 * Programmed in Java by Davis Carlson in 2016 and Max Gilmour in 2016
 * Programmed by various people in 2017
 * 
 */

public class GTADrive extends Command {

    public GTADrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	double rightTrigger = Robot.oi.controllerDriverAxisValue(RobotMap.Controller1_Right_Trigger);
    	double leftTrigger = Robot.oi.controllerDriverAxisValue(RobotMap.Controller1_Left_Trigger);
    	double leftJoystickXAxis = Robot.oi.controllerDriverAxisValue(RobotMap.Controller1_Left_X_Axis);
    	   
    	//Creating motor variables
    	double leftMotors = (rightTrigger - leftTrigger + leftJoystickXAxis)*RobotMap.GTA_Drive_Scaling_Teleop;
    	double rightMotors = (rightTrigger - leftTrigger - leftJoystickXAxis)*RobotMap.GTA_Drive_Scaling_Teleop*(-1);
    	
    	if (leftMotors > RobotMap.TELEOP_MAX_ROBOT_SPEED) {
    		   
    		leftMotors = RobotMap.TELEOP_MAX_ROBOT_SPEED;
    		   
    	}
    	if (rightMotors > RobotMap.TELEOP_MAX_ROBOT_SPEED) {
    		   
    		rightMotors = RobotMap.TELEOP_MAX_ROBOT_SPEED;
    		   
    	}
    	   if (leftMotors < RobotMap.TELEOP_MIN_ROBOT_SPEED) {
    		   
    		leftMotors = RobotMap.TELEOP_MIN_ROBOT_SPEED;
    		   
    	}
    	if (rightMotors < RobotMap.TELEOP_MIN_ROBOT_SPEED) {
    		   
    		rightMotors = RobotMap.TELEOP_MIN_ROBOT_SPEED;
    		   
    	}
    	Robot.driveTrain.setLeft(leftMotors);
    	Robot.driveTrain.setRight(rightMotors);
    	
    	//SmartDashboard.putNumber("GTA LEFT", leftMotors);
    	//SmartDashboard.putNumber("GTA RIGHT", rightMotors);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

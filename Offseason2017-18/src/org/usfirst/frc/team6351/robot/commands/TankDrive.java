
package org.usfirst.frc.team6351.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6351.robot.Robot;
import org.usfirst.frc.team6351.robot.RobotMap;

/**
 *
 */

/**
 * Rundle College Team 6351, 2017 Off-Season
 * Programmed in Java by Davis Carlson in 2016 and Max Gilmour in 2016
 * Programmed by various people in 2017
 * 
 */

public class TankDrive extends Command {

    public TankDrive() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double leftSpeed = Robot.oi.controllerDriverAxisValue(RobotMap.Controller1_Left_Y_Axis)*(RobotMap.Tank_Drive_Scaling_Teleop)*(-1);
    	double rightSpeed = Robot.oi.controllerDriverAxisValue(RobotMap.Controller1_Right_Y_Axis)*(RobotMap.Tank_Drive_Scaling_Teleop);
    	
    	Robot.driveTrain.setLeft(leftSpeed);
    	Robot.driveTrain.setRight(rightSpeed);
    	
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

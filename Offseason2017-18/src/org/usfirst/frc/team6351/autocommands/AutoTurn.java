package org.usfirst.frc.team6351.autocommands;

import org.usfirst.frc.team6351.robot.Robot;
import org.usfirst.frc.team6351.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Rundle College Team 6351, 2017 Off-Season
 * Programmed in Java by Davis Carlson in 2016 and Max Gilmour in 2016
 * Programmed by various people in 2017
 * 
 */

public class AutoTurn extends Command {

	double newAngle;
	double currentAngle;
	double angleChange;
	
    public AutoTurn(double angleChangeInit) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    	requires(Robot.sensors);
    	angleChange = angleChangeInit;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	currentAngle = Robot.sensors.getGyroAngle();
    	newAngle = currentAngle + angleChange;
    	
    	if (newAngle >= 360) {
    		//newAngle = newAngle - 360;
    	}
    	
    	if (newAngle < currentAngle){
    		Robot.driveTrain.setLeft(RobotMap.Drive_Scaling_Auto*(-1));
    		Robot.driveTrain.setRight(RobotMap.Drive_Scaling_Auto*(-1));
    	} else if (newAngle > currentAngle) {
    		Robot.driveTrain.setLeft(RobotMap.Drive_Scaling_Auto);
    		Robot.driveTrain.setRight(RobotMap.Drive_Scaling_Auto);
    	}
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (newAngle >= Robot.sensors.getGyroAngle() - 1.5 && newAngle <= Robot.sensors.getGyroAngle() + 1.5) {
    		return true;
    	} else {
    		return false;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.setLeft(0.0);
    	Robot.driveTrain.setRight(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

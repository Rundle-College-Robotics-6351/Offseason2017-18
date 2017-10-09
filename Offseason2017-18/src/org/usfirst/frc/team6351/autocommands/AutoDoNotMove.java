
package org.usfirst.frc.team6351.autocommands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6351.robot.Robot;

/**
 *
 */

/**
 * Rundle College Team 6351, 2017 Off-Season
 * Programmed in Java by Davis Carlson in 2016 and Max Gilmour in 2016
 * Programmed by various people in 2017
 * 
 */

public class AutoDoNotMove extends Command {

    public AutoDoNotMove() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//WARNING: THIS IS A TESTING METHOD ONLY. THE ROBOT SHOULD NOT BE PROGRAMMED TO
    	//MOVE AT ANY POINT
    	Robot.driveTrain.setLeft(0);
    	Robot.driveTrain.setRight(0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.setLeft(0);
    	Robot.driveTrain.setRight(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

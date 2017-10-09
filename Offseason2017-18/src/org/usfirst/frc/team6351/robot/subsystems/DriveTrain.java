
package org.usfirst.frc.team6351.robot.subsystems;

import org.usfirst.frc.team6351.robot.Robot;
import org.usfirst.frc.team6351.robot.RobotMap;
import org.usfirst.frc.team6351.robot.commands.FlightStickDrive;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */

/**
 * Rundle College Team 6351, 2017 Off-Season
 * Programmed in Java by Davis Carlson in 2016 and Max Gilmour in 2016
 * Programmed by various people in 2017
 * 
 */

public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	//Left Motors
    VictorSP frontLeft = new VictorSP(RobotMap.Motor_Front_Left);
    VictorSP backLeft = new VictorSP(RobotMap.Motor_Back_Left);
    //Right Motors
    VictorSP frontRight = new VictorSP(RobotMap.Motor_Front_Right);
    VictorSP backRight = new VictorSP(RobotMap.Motor_Back_Right);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new FlightStickDrive());
    }
    public void setLeft (double speed) {
    		frontLeft.set(speed);
    		backLeft.set(speed);
    	

    }
    public void setRight (double speed) {
    		frontRight.set(speed);
    		backRight.set(speed);
    
    }
}


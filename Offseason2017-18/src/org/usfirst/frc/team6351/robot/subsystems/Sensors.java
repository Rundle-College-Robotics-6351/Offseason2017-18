package org.usfirst.frc.team6351.robot.subsystems;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;


/**
 *
 */

/**
 * Rundle College Team 6351, 2017 Off-Season
 * Programmed in Java by Davis Carlson in 2016 and Max Gilmour in 2016
 * Programmed by various people in 2017
 * 
 */

public class Sensors extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public Gyro gyro;
	public Accelerometer accel;
	
	public Sensors() {
		
		gyro = new ADXRS450_Gyro();
		accel = new BuiltInAccelerometer();
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public double getGyroAngle() {
    	return gyro.getAngle();
    }
    public double getXAccel() {
    	return accel.getX();
    }
    public double getYAccel() {
    	return accel.getY();
    }
}


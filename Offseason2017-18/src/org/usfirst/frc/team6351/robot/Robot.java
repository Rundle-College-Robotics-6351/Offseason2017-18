
package org.usfirst.frc.team6351.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team6351.autocommands.AutoDriveStraight;
import org.usfirst.frc.team6351.robot.commands.FlightStickDrive;
import org.usfirst.frc.team6351.robot.commands.GTADrive;
import org.usfirst.frc.team6351.robot.subsystems.DriveTrain;
import org.usfirst.frc.team6351.robot.subsystems.Sensors;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */

/**
 * Rundle College Team 6351, 2017 Off-Season
 * Programmed in Java by Davis Carlson in 2016 and Max Gilmour in 2016
 * Programmed by various people in 2017
 * 
 */

/**
 * --
 */

public class Robot extends IterativeRobot {

	public static final DriveTrain driveTrain = new DriveTrain();
	public static final Sensors sensors = new Sensors();
	public static OI oi;

    Command autonomousStart;
    Command teleopStart;
    SendableChooser<Command> autoMode;
    SendableChooser<Command> driveMode;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
	
    public void robotInit() {
    	oi = new OI();
		
		//Autonomous Command Selector
		
		autoMode = new SendableChooser<Command>();
		
		// The robot will drive straight at <percent in decimal form> of its max speed for <seconds>
		autoMode.addObject("AUTO: Drive Straight", new AutoDriveStraight(0.2, 1));
		
        SmartDashboard.putData("Auto mode", autoMode);
        
      //Drive Mode Command Selector
        
       driveMode = new SendableChooser<Command>();
       driveMode.addObject("Flight Stick Control", new FlightStickDrive());
       driveMode.addDefault("Two Person GTA Control", new GTADrive());
       SmartDashboard.putData("Drive Control Mode", driveMode);
    }
	
	/**
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
     */
    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString code to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the chooser code above (like the commented example)
	 * or additional comparisons to the switch structure below with additional strings & commands.
	 */
    public void autonomousInit() {
    	autonomousStart = (Command) autoMode.getSelected();
    	
    	// schedule the autonomous command (example)
        if (autonomousStart != null) autonomousStart.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        SmartDashboard.putNumber("GyroAngle", sensors.getGyroAngle());
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousStart != null) autonomousStart.cancel();
        
        teleopStart = (Command) driveMode.getSelected(); 
        teleopStart.start();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run(); 
        SmartDashboard.putNumber("GyroAngle", sensors.getGyroAngle());
        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }

}

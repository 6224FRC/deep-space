/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
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
  public static int Leftdrive = 1; // these are PWM ports
  public static int Rightdrive = 0;
  public static int intake = 2;
  public static int elevator = 3;
  

  // buttons for driver joystick
  public static int moveAxis = 1; // LY (up and down)
  public static int rotateAxis = 4; // RX (left and right)
  
  //buttons for operator joystick
  public static int pushbutton = 5; //left bumper
  public static int pullbutton = 6; //right bumper
  public static int elevatorup = 4; //y button
  public static int elevatordown = 1; //A button
  public static int liftaxis = 5; //r y-xis
}

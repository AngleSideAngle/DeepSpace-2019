/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
<<<<<<< HEAD
import frc.robot.subsystems.DriveSubsystem;
=======
import frc.robot.subsystems.DriveSubsystem.Modes;
>>>>>>> 7ec28d974757f0c3a02e261dc6783b6de9736d91

public class RobotCentricDriveCommand extends Command {
    private Joystick rightStick, leftStick;
    
    public RobotCentricDriveCommand() {
        requires(Robot.driveSubsystem);

        rightStick = Robot.oi.rightStick;
        leftStick = Robot.oi.leftStick;
    }

    @Override
    protected void initialize() {
        Robot.driveSubsystem.setSpeedMecanum(0, 0, 0);
    }

    @Override
    protected void execute() {
<<<<<<< HEAD
        Robot.driveSubsystem.setSpeed(rightStick, leftStick, DriveSubsystem.Modes.ROBOT);
=======
        Robot.driveSubsystem.setSpeed(rightStick, leftStick, Modes.ROBOT);
>>>>>>> 7ec28d974757f0c3a02e261dc6783b6de9736d91
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        Robot.driveSubsystem.setSpeedMecanum(0, 0, 0);
    }

    @Override
    protected void interrupted() {
        end();
    }
}

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;


public class LineupCommand extends Command {
    
    public LineupCommand() {
    }

    @Override protected void    initialize()  {Robot.lineupSubsystem.resetFound();}
    @Override protected void    execute()     {
        //Robot.lineupSubsystem.autoResetInfo();
        Robot.lineupSubsystem.simpleResetInfo();
        Robot.lineupSubsystem.move();
    }
    @Override protected boolean isFinished()  {return Robot.lineupSubsystem.getShiftPID().targetReached() &&
                                                      Robot.lineupSubsystem.getForwardPID().targetReached();}
    @Override protected void    end()         {Robot.driveSubsystem.setSpeedTank(0, 0);}
    @Override protected void    interrupted() {end();}
}

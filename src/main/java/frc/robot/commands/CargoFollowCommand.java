package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;

public class CargoFollowCommand extends CommandGroup {

    public CargoFollowCommand() {
        requires(Robot.driveSubsystem);
        addParallel(new SuckCommand());
    }

    @Override protected void initialize() {
        return;
    }

	@Override protected void execute(){
        Robot.cargoFollowing.followBall();
	}

	@Override protected boolean isFinished(){
		return true;
	}

	@Override protected void end(){
		return;
	}

	@Override protected void interrupted(){
		end();
	}
}
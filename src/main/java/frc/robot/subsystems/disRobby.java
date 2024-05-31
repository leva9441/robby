package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class disRobby extends SubsystemBase {    
    // Instance variables
    double motorOne;
    
    public disRobby () {
        motorOne = 0;
    }

    public void robbySpeak() {
        System.out.println("Hey I'm robby! motorOne is at" + motorOne + "!");
    }

    public void setMotorOneSpeed(double speed){
        motorOne = speed;
    }


    @Override
    public void periodic() {
        // robbySpeak();
    }
    
}

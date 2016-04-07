/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.*;

/**
 *
 * @author benjamin.rose
 */
public class DriveController {
    private SpeedController left1,left2,right1,right2;
    private boolean turboMode;
    public DriveController() {
        left1 = new Talon(RobotMap.PORT_LEFT_1);
        left2 = new Talon(RobotMap.PORT_LEFT_2);
        right1 = new Talon(RobotMap.PORT_RIGHT_1);
        right2 = new Talon(RobotMap.PORT_RIGHT_2);
    }
    public void drive(double x,double y) {
        double left,right;
        left = ramp(y-x);
        right = ramp(y+x);
        driveRaw(left,right);
    }
    public void driveTank(double left,double right) {
        driveRaw(ramp(left),ramp(right));
    }
    public void setTurboMode(boolean mode) {
        turboMode = mode;
    }
    private void driveRaw(double left, double right) {
        double parkMult = 0.6;
        if (turboMode) {
            parkMult = 1;
        }
        left1.set(left*parkMult);
        left2.set(-left*parkMult);
        right1.set(right*parkMult);
        right2.set(-right*parkMult);
    }
    private double ramp(double first) {
        double result = first;
        result = Math.min(Math.max(-1,result),1);
        return result;
    }
}

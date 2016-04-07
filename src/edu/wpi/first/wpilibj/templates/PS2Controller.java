/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.Joystick;
/**
 *
 * @author benjamin.rose
 */
public class PS2Controller {
    /**
     * Face button IDs.
     */
    public static final int
            BTN_1=1,
            BTN_2=2,
            BTN_3=3,
            BTN_4=4,
            TRIGGER_LEFT=5,
            TRIGGER_RIGHT=6,
            BUMPER_LEFT=7,
            BUMPER_RIGHT=8;
            
    /**
     * Joystick axis IDs.
     */
    public static final int
            LEFT_X=0,
            LEFT_Y=1,
            RIGHT_X=2,
            RIGHT_Y=3;
    private Joystick stick;
    public PS2Controller(int port) {
        stick = new Joystick(port);
    }
    public boolean getButton(int id) {
        return stick.getRawButton(id);
    }
    public double getAxis(int id) {
        return stick.getRawAxis(id);
    }
}

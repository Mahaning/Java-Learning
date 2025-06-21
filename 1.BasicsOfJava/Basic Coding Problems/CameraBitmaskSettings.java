
/**
  Camera Bitmask Settings
Scenario:
A camera app has bitmask-based settings:

Flash: 1st bit

HDR: 2nd bit

Timer: 3rd bit

Task:
Toggle HDR and check if Timer is ON using bitwise operators.

Operators Used: Bitwise (&, |, ^, <<)



Scenario: Camera Bitmask Settings
In a camera app, you have settings stored in a single bitmask (an integer).
Each feature is represented using one bit:

Feature	Bit Position	Binary Value	Decimal
Flash	1st (bit 0)	0001	1
HDR	2nd (bit 1)	0010	2
Timer	3rd (bit 2)	0100	4

So a bitmask like 0110 (decimal 6) means:

Flash: OFF

HDR: ON

Timer: ON

🧩 Task
Given:
A bitmask integer settings

You need to:

Toggle HDR (i.e., flip ON → OFF or OFF → ON)

Check if Timer is ON

🧠 Bitwise Operators to Use
Operator	Symbol	What It Does
AND	&	Check if a bit is ON
OR	`	`
XOR	^	Toggle a bit
Left Shift	<<	Move bits left to get a position
 */
public class CameraBitmaskSettings {
    public static void main(String[] args) {
        int settings = 6; // Initial settings: 0110 (HDR ON, Timer ON)

        // Toggle HDR (2nd bit)
        settings ^= (1 << 1); // Toggle the 2nd bit

        // Check if Timer (3rd bit) is ON
        boolean isTimerOn = (settings & (1 << 2)) != 0;

        System.out.println("Updated Settings Bitmask: " + settings);
        System.out.println("Is Timer ON? " + isTimerOn);
    }
}
   

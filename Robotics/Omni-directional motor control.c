/* #include this file in programs that use the omni-directional motors in order to control the motors. */

// names of motors correspond to cardinal directions relative to front of robot
#pragma config(Motor,  mtr_S1_C1_1,     0,          tmotorTetrix, openLoop)
#pragma config(Motor,  mtr_S1_C1_2,     1,          tmotorTetrix, openLoop)
#pragma config(Motor,  mtr_S1_C2_1,     2,          tmotorTetrix, openLoop, reversed)
#pragma config(Motor,  mtr_S1_C2_2,     3,          tmotorTetrix, openLoop, reversed)

float motorValues [4]; // array containing motor powers to be put into motors using updateMotors()
short motorIndex [4]; // array containing names of motors with locations in array corresponding to motorValues

// psuedonyms used by motorIndex
float NW = 0;
float SW = 1;
float NE = 2;
float SE = 3;

void setupMotorIndex(){ // sets initial values for motorIndex. Values should correspond to pragmas. Must be called before any other functions
	motorIndex[0] = NW;
	motorIndex[1] = SW;
	motorIndex[2] = NE;
	motorIndex[3] = SE;
}

// sets motorValues[] based on direction inputted. Cardinal directions such as "NE" for northeast are valid, as well as "R" and "L" to spin. To stop all motors, input any valid direction and power 0
void getMotorValues(string direction, float power){
	if (direction == "N") {
			for(int i = 0; i < 4; i++) {
				motorValues[i] = power;
			}
	}
	if (direction == "NE") {
			for(int i = 0; i < 4; i++) {
				if(i == 0 || i == 3){motorValues[i] = power;} else {motorValues[i] = 0;}
			}
	}
	if (direction == "E") {
			for(int i = 0; i < 4; i++) {
				if(i ==  0|| i == 2) {motorValues[i] = power;} else {motorValues[i] = -power;}
			}
	}
	if (direction == "SE") {
			for(int i = 0; i < 4; i++) {
				if(i == 1|| i == 3){motorValues[i] = -power;}{motorValues[i] = 0;}
			}
	}
	if (direction == "S") {
			for(int i = 0; i < 4; i++) {
				motorValues[i] = -power;
			}
	}
	if (direction == "SW") {
			for(int i = 0; i < 4; i++) {
				if(i == 0|| i == 2){motorValues[i] = -power;}{motorValues[i] = 0;}
			}
	}
	if (direction == "W") {
			for(int i = 0; i < 4; i++) {
				if(i == 1|| i == 3){motorValues[i] = power;}{motorValues[i] = -power;}
			}
	}
	if (direction == "NW") {
			for(int i = 0; i < 4; i++) {
				if(i == 1|| i == 3){motorValues[i] = power;}{motorValues[i] = 0;}
			}
	}
	if (direction == "R"){
		for(int i = 0; i < 4; i++) {
				if(i == 0|| i == 3){motorValues[i] = power;}{motorValues[i] = -power;}
			}
	}
	if (direction == "L") {
			for(int i = 0; i < 4; i++) {
				if(i == 1|| i == 2){motorValues[i] = power;}{motorValues[i] = -power;}
			}
	}
}

void updateMotors(){ // injects values from motorValues into motor powers
	for(int i = 0; i < 4; i++){
		motor[motorIndex[i]] = motorValues[i];
	}
}

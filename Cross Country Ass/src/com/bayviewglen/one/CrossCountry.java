/*
 * Name: Scott (Yulin) Zhu
 * Course: ICS3U Computer Science
 * Title: Cross Country Assignment
 * Description:The Bayview Glen Cross-Country team is looking for a way to manage their team members running times better.  
 * in order to accomplish this task they would like to invest in a computerized solution.  
 * Due: October 31th, 14
 * Teacher: Professor DesLaurier
 */

package com.bayviewglen.one;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CrossCountry {

	final static int SECONDS_IN_MIN = 60;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// first dude x, second dude y, third dude, z, fourth dude v, fifth dude
		// w

		Scanner keyboard = new Scanner(System.in);
		System.out.println("First runner please enter your first and last name");
		String xFirst = keyboard.next();
		String xLast = keyboard.next();

		// This is to find the times in minutes and seconds for the 1st guy, 1st
		// split
		System.out.println(xFirst + ", please enter your Mile One Time <mm:ss,ssss>:   ");
		String fMileOne = keyboard.next();
		String fMileOneMiuntes = fMileOne.split(":")[0];
		int xMFMinutes = Integer.parseInt(fMileOneMiuntes);
		String fMileOneSeconds = fMileOne.split(":")[1];
		double fMFSeconds = Double.parseDouble(fMileOneSeconds);
		double xMFTotalSeconds = xMFMinutes * SECONDS_IN_MIN + fMFSeconds;

		// This is to find the times in minutes and seconds for the 1st guy, 2st
		// split
		System.out.println(xFirst + ", please enter end of mile two time <mm:ss,ssss>:   ");
		String EMileTwo = keyboard.next();
		String SMileTwoMinutes = EMileTwo.split(":")[0];
		int xMSMinutes = Integer.parseInt(SMileTwoMinutes);
		String sMileTwoSeconds = EMileTwo.split(":")[1];
		double xMSSeconds = Double.parseDouble(sMileTwoSeconds);
		double xMSTotalSeconds = xMSMinutes * SECONDS_IN_MIN + xMSSeconds;

		// This is to find the times in minutes and seconds for the 1st guy, 3st
		// split
		System.out.println(xFirst + ", please enter end of mile five time <mm:ss,ssss>:   ");
		String WMileFive = keyboard.next();
		String WMileFiveMiuntes = WMileFive.split(":")[0];
		int FMFMinutes = Integer.parseInt(WMileFiveMiuntes);
		String WMileFiveSeconds = WMileFive.split(":")[1];
		double xMFSeconds = Double.parseDouble(WMileFiveSeconds);
		double FMFTotalSeconds = FMFMinutes * SECONDS_IN_MIN + xMFSeconds;

		double xSplitEr = xMSTotalSeconds - xMFTotalSeconds; // find split time
																// by 2nd - 1st
																// time
		double xSplitThree = FMFTotalSeconds - xMSTotalSeconds;// find split time
																// by last - 2nd
																// time

		DecimalFormat formatter = new DecimalFormat("00.000");
		int xSplitYiMinute = xMFMinutes;
		String xSplitYiSecond = formatter.format(fMFSeconds);
		int xSplitErMinute = (int) (xSplitEr) / SECONDS_IN_MIN;
		String xSplitErSeconds = formatter.format((xSplitEr) % SECONDS_IN_MIN);
		int xSplitThreeMinute = (int) (xSplitThree) / SECONDS_IN_MIN;
		String xSplitThreeSeconds = formatter.format((xSplitThree) % SECONDS_IN_MIN);
		String FiveKilo = formatter.format(xMFSeconds); // All five k

		String xFinalSY = (xSplitYiMinute + ":" + xSplitYiSecond);
		// string cactusation to find split one
		String xFinalSE = (xSplitErMinute + ":" + xSplitErSeconds);
		// string cactusation to find split two
		String xFinalSS = (xSplitThreeMinute + ":" + xSplitThreeSeconds);
		// string cactusation split three
		String xFinalFiveKilo = (FMFMinutes + ":" + FiveKilo);
		// time for all together with cactusation of string

		System.out.println("\nFirst Runner Summary"); // Print all them stuff
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("Running Man:  " + xLast + "," + xFirst);
		System.out.println("Split 1: " + xFinalSY);
		System.out.println("Split 2: " + xFinalSE);
		System.out.println("Split 3: " + xFinalSS);
		System.out.println("Total Time for five K: " + xFinalFiveKilo);

		/*
		 * Running dude
		 * two======================================================
		 * ==============
		 * =========================================================
		 */

		// change the x in variable to y, all the other things stay the same.
		System.out.println("\n\nRunner 2 please enter your first and last name");
		String yFirst = keyboard.next();
		String yLast = keyboard.next();

		System.out.println(yFirst + ", please enter your Mile One Time <mm:ss,ssss>:   ");
		String yMileOne = keyboard.next();
		String yMileOneMiuntes = yMileOne.split(":")[0];
		int yMFMinutes = Integer.parseInt(yMileOneMiuntes);
		String yMileOneSeconds = yMileOne.split(":")[1];
		double yMFSeconds = Double.parseDouble(yMileOneSeconds);
		double yMFTotalSeconds = yMFMinutes * SECONDS_IN_MIN + yMFSeconds;

		System.out.println(yFirst + ", please enter end of mile two time <mm:ss,ssss>:   ");
		String yEMileTwo = keyboard.next();
		String ySMileTwoMinutes = yEMileTwo.split(":")[0];
		int yMSMinutes = Integer.parseInt(ySMileTwoMinutes);
		String yMileTwoSeconds = yEMileTwo.split(":")[1];
		double yMSSeconds = Double.parseDouble(yMileTwoSeconds);
		double yMSTotalSeconds = yMSMinutes * SECONDS_IN_MIN + yMSSeconds;

		System.out.println(yFirst + ", please enter end of mile five time <mm:ss,ssss>:   ");
		String yWMileFive = keyboard.next();
		String yWMileFiveMiuntes = yWMileFive.split(":")[0];
		int yFMFMinutes = Integer.parseInt(yWMileFiveMiuntes);
		String yWMileFiveSeconds = yWMileFive.split(":")[1];
		double yWMFSeconds = Double.parseDouble(yWMileFiveSeconds);
		double yFMFTotalSeconds = yFMFMinutes * SECONDS_IN_MIN + yWMFSeconds;

		double ySplitEr = yMSTotalSeconds - yMFTotalSeconds;
		double ySplitThree = yFMFTotalSeconds - yMSTotalSeconds;

		DecimalFormat formatter1 = new DecimalFormat("00.000");
		int ySplitYiMinute = yMFMinutes;
		String ySplitYiSecond = formatter1.format(yMFSeconds);
		int ySplitErMinute = (int) (ySplitEr) / SECONDS_IN_MIN;
		String ySplitErSeconds = formatter1.format((ySplitEr) % SECONDS_IN_MIN);
		int ySplitThreeMinute = (int) (ySplitThree) / SECONDS_IN_MIN;
		String ySplitThreeSeconds = formatter1.format((ySplitThree) % SECONDS_IN_MIN);
		String yFiveKilo = formatter1.format(yMFSeconds);

		String yFinalSY = (ySplitYiMinute + ":" + ySplitYiSecond);
		String yFinalSE = (ySplitErMinute + ":" + ySplitErSeconds);
		String yFinalSS = (ySplitThreeMinute + ":" + ySplitThreeSeconds);
		String yFinalFiveKilo = (yFMFMinutes + ":" + yFiveKilo);

		System.out.println("\nFirst Runner Summary" + "\n++++++++++++++++++++++++++++++");
		System.out.println("Running Man:  " + yLast + "," + yFirst);
		System.out.println("Split 1: " + yFinalSY);
		System.out.println("Split 2: " + yFinalSE);
		System.out.println("Split 3: " + yFinalSS);
		System.out.println("Total Time for five K: " + yFinalFiveKilo);

		/*
		 * Third Person
		 * runner====================================================
		 * ============
		 * ============================================================
		 */

		System.out.println("\n\nRunner Three please enter your first and last name:    ");
		String zFirst = keyboard.next();
		String zLast = keyboard.next();

		System.out.println(zFirst + ", please enter your Mile One Time <mm:ss,ssss>:   ");
		String zMileOne = keyboard.next();
		String zMileOneMiuntes = zMileOne.split(":")[0];
		int zMFMinutes = Integer.parseInt(zMileOneMiuntes);
		String zMileOneSeconds = zMileOne.split(":")[1];
		double zMFSeconds = Double.parseDouble(zMileOneSeconds);
		double zMFTotalSeconds = zMFMinutes * SECONDS_IN_MIN + zMFSeconds;

		System.out.println(zFirst + ", please enter end of mile two time <mm:ss,ssss>:   ");
		String zMileTwo = keyboard.next();
		String zSMileTwoMinutes = zMileTwo.split(":")[0];
		int zMSMinutes = Integer.parseInt(zSMileTwoMinutes);
		String zMileTwoSeconds = zMileTwo.split(":")[1];
		double zMSSeconds = Double.parseDouble(zMileTwoSeconds);
		double zMSTotalSeconds = zMSMinutes * SECONDS_IN_MIN + zMSSeconds;

		System.out.println(zFirst + ", please enter end of mile five time <mm:ss,ssss>:   ");
		String zWMileFive = keyboard.next();
		String zWMileFiveMiuntes = zWMileFive.split(":")[0];
		int zFMFMinutes = Integer.parseInt(zWMileFiveMiuntes);
		String zWMileFiveSeconds = zWMileFive.split(":")[1];
		double zWMFSeconds = Double.parseDouble(zWMileFiveSeconds);
		double zFMFTotalSeconds = zFMFMinutes * SECONDS_IN_MIN + zWMFSeconds;

		double zSplitEr = zMSTotalSeconds - zMFTotalSeconds;
		double zSplitThree = zFMFTotalSeconds - zMSTotalSeconds;

		DecimalFormat formatter2 = new DecimalFormat("00.000");
		int zSplitYiMinute = zMFMinutes;
		String zSplitYiSecond = formatter2.format(zMFSeconds);
		int zSplitErMinute = (int) (zSplitEr) / SECONDS_IN_MIN;
		String zSplitErSeconds = formatter2.format((zSplitEr) % SECONDS_IN_MIN);
		int zSplitThreeMinute = (int) (zSplitThree) / SECONDS_IN_MIN;
		String zSplitThreeSeconds = formatter2.format((zSplitThree) % SECONDS_IN_MIN);
		String zFiveKilo = formatter2.format(zWMFSeconds);

		String zFinalSY = (zSplitYiMinute + ":" + zSplitYiSecond);
		String zFinalSE = (zSplitErMinute + ":" + zSplitErSeconds);
		String zFinalSS = (zSplitThreeMinute + ":" + zSplitThreeSeconds);
		String zFinalFiveKilo = (zFMFMinutes + ":" + zFiveKilo);

		System.out.println("\nFirst Runner Summary" + "\n++++++++++++++++++++++++++++++");
		System.out.println("Running Man:  " + zLast + "," + zFirst);
		System.out.println("Split 1: " + zFinalSY);
		System.out.println("Split 2: " + zFinalSE);
		System.out.println("Split 3: " + zFinalSS);
		System.out.println("Total Time for five K: " + zFinalFiveKilo);

		/*
		 * Fourth
		 * person==========================================================
		 * ======
		 * ================================================================
		 */

		System.out.println("\n\nRunner four please enter your first and last name:");
		String vFirst = keyboard.next();
		String vLast = keyboard.next();

		System.out.println(vFirst + ", please enter your Mile One Time <mm:ss,ssss>:   ");
		String vMileOne = keyboard.next();
		String vMileOneMiuntes = vMileOne.split(":")[0];
		int vMFMinutes = Integer.parseInt(vMileOneMiuntes);
		String vMileOneSeconds = vMileOne.split(":")[1];
		double vMFSeconds = Double.parseDouble(vMileOneSeconds);
		double vMFTotalSeconds = vMFMinutes * SECONDS_IN_MIN + vMFSeconds;

		System.out.println(vFirst + ", please enter end of mile two time <mm:ss,ssss>:   ");
		String vMileTwo = keyboard.next();
		String vSMileTwoMinutes = vMileTwo.split(":")[0];
		int vMSMinutes = Integer.parseInt(vSMileTwoMinutes);
		String vMileTwoSeconds = vMileTwo.split(":")[1];
		double vMSSeconds = Double.parseDouble(vMileTwoSeconds);
		double vMSTotalSeconds = vMSMinutes * SECONDS_IN_MIN + vMSSeconds;

		System.out.println(vFirst + ", please enter end of mile five time <mm:ss,ssss>:   ");
		String vWMileFive = keyboard.next();
		String vWMileFiveMiuntes = vWMileFive.split(":")[0];
		int vFMFMinutes = Integer.parseInt(vWMileFiveMiuntes);
		String vWMileFiveSeconds = vWMileFive.split(":")[1];
		double vWMFSeconds = Double.parseDouble(vWMileFiveSeconds);
		double vFMFTotalSeconds = vFMFMinutes * SECONDS_IN_MIN + vWMFSeconds;

		double vSplitEr = vMSTotalSeconds - vMFTotalSeconds;
		double vSplitThree = vFMFTotalSeconds - vMSTotalSeconds;

		DecimalFormat formatter3 = new DecimalFormat("00.000");
		int vSplitYiMinute = vMFMinutes;
		String vSplitYiSecond = formatter3.format(vMFSeconds);
		int vSplitErMinute = (int) (vSplitEr) / SECONDS_IN_MIN;
		String vSplitErSeconds = formatter3.format((vSplitEr) % SECONDS_IN_MIN);
		int vSplitThreeMinute = (int) (vSplitThree) / SECONDS_IN_MIN;
		String vSplitThreeSeconds = formatter3.format((vSplitThree) % SECONDS_IN_MIN);
		String vFiveKilo = formatter3.format(vMFSeconds);

		String vFinalSY = (vSplitYiMinute + ":" + vSplitYiSecond);
		String vFinalSE = (vSplitErMinute + ":" + vSplitErSeconds);
		String vFinalSS = (vSplitThreeMinute + ":" + vSplitThreeSeconds);
		String vFinalFiveKilo = (vFMFMinutes + ":" + vFiveKilo);

		System.out.println("\nFirst Runner Summary" + "\n++++++++++++++++++++++++++++++");
		System.out.println("Running Man:  " + vLast + "," + vFirst);
		System.out.println("Split 1: " + vFinalSY);
		System.out.println("Split 2: " + vFinalSE);
		System.out.println("Split 3: " + vFinalSS);
		System.out.println("Total Time for five K: " + vFinalFiveKilo);

		/*
		 * Fifth runner
		 * ==========================================================
		 * ============
		 * ==========================================================
		 */

		System.out.println("\n\nRunner five please enter your first and last name");
		String wFirst = keyboard.next();
		String wLast = keyboard.next();

		System.out.println(wFirst + ", please enter your Mile One Time <mm:ss,ssss>:   ");
		String wMileOne = keyboard.next();
		String wMileOneMiuntes = wMileOne.split(":")[0];
		int wMFMinutes = Integer.parseInt(wMileOneMiuntes);
		String wMileOneSeconds = wMileOne.split(":")[1];
		double wMFSeconds = Double.parseDouble(wMileOneSeconds);
		double wMFTotalSeconds = wMFMinutes * SECONDS_IN_MIN + wMFSeconds;

		System.out.println(wFirst + ", please enter end of mile two time <mm:ss,ssss>:   ");
		String wMileTwo = keyboard.next();
		String wSMileTwoMinutes = wMileTwo.split(":")[0];
		int wMSMinutes = Integer.parseInt(wSMileTwoMinutes);
		String wMileTwoSeconds = wMileTwo.split(":")[1];
		double wMSSeconds = Double.parseDouble(wMileTwoSeconds);
		double wMSTotalSeconds = wMSMinutes * SECONDS_IN_MIN + wMSSeconds;

		System.out.println(wFirst + ", please enter end of mile five time <mm:ss,ssss>:   ");
		String wWMileFive = keyboard.next();
		String wWMileFiveMiuntes = wWMileFive.split(":")[0];
		int wFMFMinutes = Integer.parseInt(wWMileFiveMiuntes);
		String wWMileFiveSeconds = wWMileFive.split(":")[1];
		double wWMFSeconds = Double.parseDouble(wWMileFiveSeconds);
		double wFMFTotalSeconds = wFMFMinutes * SECONDS_IN_MIN + wWMFSeconds;

		double wSplitEr = wMSTotalSeconds - wMFTotalSeconds;
		double wSplitThree = wFMFTotalSeconds - wMSTotalSeconds;

		DecimalFormat formatter4 = new DecimalFormat("00.000");
		int wSplitYiMinute = wMFMinutes;
		String wSplitYiSecond = formatter4.format(wMFSeconds);
		int wSplitErMinute = (int) (wSplitEr) / SECONDS_IN_MIN;
		String wSplitErSeconds = formatter4.format((wSplitEr) % SECONDS_IN_MIN);
		int wSplitThreeMinute = (int) (wSplitThree) / SECONDS_IN_MIN;
		String wSplitThreeSeconds = formatter4.format((wSplitThree) % SECONDS_IN_MIN);
		String wFiveKilo = formatter4.format(wMFSeconds);

		String wFinalSY = (wSplitYiMinute + ":" + wSplitYiSecond);
		String wFinalSE = (wSplitErMinute + ":" + wSplitErSeconds);
		String wFinalSS = (wSplitThreeMinute + ":" + wSplitThreeSeconds);
		String wFinalFiveKilo = (wFMFMinutes + ":" + wFiveKilo);

		System.out.println("\nFirst Runner Summary" + "\n++++++++++++++++++++++++++++++");
		System.out.println("Running Man:  " + wLast + "," + wFirst);
		System.out.println("Split 1: " + wFinalSY);
		System.out.println("Split 2: " + wFinalSE);
		System.out.println("Split 3: " + wFinalSS);
		System.out.println("Total Time for five K: " + wFinalFiveKilo);

		/*
		 * Last Chart
		 */
		int runnerNum1 = 1;
		int runnerNum2 = 2;
		int runnerNum3 = 3;
		int runnerNum4 = 4;
		int runnerNum5 = 5;

		System.out.println("\n\nSummary Chart for the five runners");
		System.out.println("_________________________________________________________________________________________");
		System.out.printf("%5s %15s %15s %12s %12s %12s %12s", "  |#|", "Firstname|", "Lastname|", "1st split|", "2nd split|", "3rd split|", "All 5 K" + "|");
		System.out.printf("\n%5s %15s %15s %12s %12s %12s %12s", "|" + runnerNum1 + "|", xFirst + "|", xLast + "|", xFinalSY + "|", xFinalSE + "|", xFinalSS + "|", xFinalFiveKilo + "|");
		System.out.printf("\n%5s %15s %15s %12s %12s %12s %12s", "|" + runnerNum2 + "|", yFirst + "|", yLast + "|", yFinalSY + "|", yFinalSE + "|", yFinalSS + "|", yFinalFiveKilo + "|");
		System.out.printf("\n%5s %15s %15s %12s %12s %12s %12s", "|" + runnerNum3 + "|", zFirst + "|", zLast + "|", zFinalSY + "|", zFinalSE + "|", zFinalSS + "|", zFinalFiveKilo + "|");
		System.out.printf("\n%5s %15s %15s %12s %12s %12s %12s", "|" + runnerNum4 + "|", vFirst + "|", vLast + "|", vFinalSY + "|", vFinalSE + "|", vFinalSS + "|", vFinalFiveKilo + "|");
		System.out.printf("\n%5s %15s %15s %12s %12s %12s %12s", "|" + runnerNum5 + "|", wFirst + "|", wLast + "|", wFinalSY + "|", wFinalSE + "|", wFinalSS + "|", wFinalFiveKilo + "|");

		// %#s --->string
		// %#d ---> decimals

	}

}

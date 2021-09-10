package com.treidbot;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        long myMinShortValue = Short.MIN_VALUE;
        long myMaxShortValue = Short.MAX_VALUE;
        System.out.println("long Minimum Value = " + myMinShortValue);
        System.out.println("long Maximum Value = " + myMaxShortValue);
        
        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinLongValue);
        System.out.println("Short Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        // not valid number exceeding maximum of short
        // short bigShortLiteralValue = 32768;

        int myTotal = (myMinIntValue / 2);
        System.out.println("My New Total Value" + myTotal);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println("My New Byte Value = " + myNewByteValue);

        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println("My New Short Value " + myNewShortValue);

        // challenge

        byte myChallengeByteNumber = 10;
        System.out.println("Byte Challenge Number = " + myChallengeByteNumber);

        short myChallengeShortNumber = 20;
        System.out.println("Short Challenge Number = " + myChallengeShortNumber);

        int myChallengeIntNumber = 50;
        System.out.println("Int Challenge valid number = " + myChallengeIntNumber);

        long myChallengeLongNumber = 50000L + (10L * (myChallengeByteNumber + myChallengeShortNumber + myChallengeIntNumber));
        System.out.println("Long variable with multiplier and sum = " + myChallengeLongNumber);


    }
}

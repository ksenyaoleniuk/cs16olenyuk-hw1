package ua.edu.ucu.tempseries;

import java.util.InputMismatchException;

public class TemperatureSeriesAnalysis {
    double[] temperatureSeries;/////my string

    public TemperatureSeriesAnalysis() {

    }


    public double[] setValue(){

        for(int i = 0 ; i < temperatureSeries.length; i ++){
            if(temperatureSeries[i] < -273){
                /////і значення не мають додаватись до сиску
            throw new InputMismatchException();}
        }
        return temperatureSeries;
    }

    public TemperatureSeriesAnalysis(double[] temperatureSeries) {
        this.temperatureSeries = temperatureSeries;//// my string

    }

    public double average() {
        if (temperatureSeries.length == 0){
            throw new IllegalArgumentException();}
        else
            {double counter = 0.0d;
            for(int i = 0; i < temperatureSeries.length; i ++){
                counter += temperatureSeries[i];}
            double result = counter/temperatureSeries.length;
        return result;}
    }

    public double deviation() {
        if (temperatureSeries.length == 0){
            throw new IllegalArgumentException();}
        else{
            double myAverage = average();
            double counter = 0;
            for(int i = 0; i < temperatureSeries.length; i ++){
                counter += Math.pow(temperatureSeries[i] - myAverage,2);}
        double result = Math.sqrt(counter/temperatureSeries.length);

            return result;}}

    public double min() {
        if (temperatureSeries.length == 0){
            throw new IllegalArgumentException();}
        double myMin = temperatureSeries[0];
        for(int i = 1; i < temperatureSeries.length; i ++){
            if(myMin > temperatureSeries[i]){
                myMin = temperatureSeries[i];
            }
        }
        return myMin;
    }

    public double max() {
        if (temperatureSeries.length == 0){
            throw new IllegalArgumentException();}
        double myMax = temperatureSeries[0];
        for(int i = 1; i < temperatureSeries.length; i ++){
            if(myMax < temperatureSeries[i]){
                myMax = temperatureSeries[i];
            }
        }
        return myMax;}

    public double findTempClosestToZero() {
        if (temperatureSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        double returnValue = 0d;
        double nearZeroRight = 12345678.0d;
        double nearZeroLeft = 1234567876543.0d;
        for (int i = 0; i < temperatureSeries.length; i++) {
            if (temperatureSeries[i] < nearZeroLeft && temperatureSeries[i] < 0) {
                nearZeroLeft = temperatureSeries[i];
            }
            if (temperatureSeries[i] < nearZeroRight && temperatureSeries[i] > 0) {
                nearZeroRight = temperatureSeries[i];
            }}
        if(Math.abs(nearZeroLeft) == Math.abs(nearZeroRight)){
            returnValue =  Math.abs(nearZeroLeft);
        }
        else if(Math.abs(nearZeroLeft) > Math.abs(nearZeroRight)){
            returnValue =  nearZeroRight;}
        else if(Math.abs(nearZeroLeft) < Math.abs(nearZeroRight)) {
            returnValue =  nearZeroLeft;
        }
        return returnValue;}

    public double findTempClosestToValue(double tempValue) {
        if (temperatureSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        double returnValue = 0d;
        double tempZeroRight = 12345678.0d;
        double tempZeroLeft = 1234567876543.0d;
        for (int i = 0; i < temperatureSeries.length; i++) {
            if (temperatureSeries[i] < tempZeroLeft && temperatureSeries[i] <= tempValue) {
                tempZeroLeft = temperatureSeries[i];
            }
            if (temperatureSeries[i] < tempZeroRight && temperatureSeries[i] >= tempValue) {
                tempZeroRight = temperatureSeries[i];
            }}
        if(Math.abs(tempZeroLeft) == Math.abs(tempZeroRight)){
            returnValue =  Math.abs(tempZeroLeft);
        }
        else if(Math.abs(tempZeroLeft) > Math.abs(tempZeroRight)){
            returnValue =  tempZeroRight;}
        else if(Math.abs(tempZeroLeft) < Math.abs(tempZeroRight)) {
            returnValue =  tempZeroLeft;
        }
        return returnValue;}

    public double[] findTempsLessThen(double tempValue) {
        if (temperatureSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        int counter = 0;
        for (int i = 0; i < temperatureSeries.length; i ++){
            if(temperatureSeries[i] < tempValue){
                counter +=1;
            }
        }
        double[] arrayLessValue = new double[counter];
        int j = 0;
        for (int i = 0; i < temperatureSeries.length; i ++){
            if(temperatureSeries[i] < tempValue){
                arrayLessValue[j] = temperatureSeries[i];
                j += 1;}
        }
        return arrayLessValue;
        }

    public double[] findTempsGreaterThen(double tempValue) {
        if (temperatureSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        int counter = 0;
        for (int i = 0; i < temperatureSeries.length; i ++){
            if(temperatureSeries[i] >= tempValue){
                counter +=1;
            }
        }
        double[] arrayLessValue = new double[counter];
        int j = 0;
        for (int i = 0; i < temperatureSeries.length; i ++){
            if(temperatureSeries[i] >= tempValue){
                arrayLessValue[j] = temperatureSeries[i];
            j += 1;}
        }

        return arrayLessValue;
    }

    public TempSummaryStatistics summaryStatistics(){
        final TempSummaryStatistics result = new TempSummaryStatistics(this.average(), this.deviation(), this.min(), this.max());
    return result;}

    public int addTemps(double... temps){
        int Index = temperatureSeries.length;
        temperatureSeries = this.expand(temps.length);

        for(int i = 0; i <  temps.length; i++){
           temperatureSeries[Index] = temps[i];
                    Index += 1;
        }


        return Index;
    }


    private double[] expand(int newArray){
        double[] newExpandArray = new double[temperatureSeries.length + newArray];
        for(int i = 0; i < temperatureSeries.length; i ++){
            newExpandArray[i] = temperatureSeries[i];
        }
        return newExpandArray;
        }


    }


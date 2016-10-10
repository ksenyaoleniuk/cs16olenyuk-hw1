package ua.edu.ucu.tempseries;

import static org.junit.Assert.*;
import org.junit.Test;

public class TemperatureSeriesAnalysisTest {

    @Test
    public void testAverageWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.average();
        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAverageWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.average();
    }

    @Test
    public void testAverage() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        double actualResult = seriesAnalysis.average();
        
        assertEquals(expResult, actualResult, 0.00001);        
    }
    @Test
    public void testDeviationWithOneElementArray(){

        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 0.0;
        double actualResult = seriesAnalysis.deviation();
        assertEquals(expResult,actualResult, 0.00001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testDeviationWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.deviation();
    }
    @Test
    public void testDeviation() {
        double[] temperatureSeries = {2.0, 1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult =0.5;

        double actualResult = seriesAnalysis.deviation();

        assertEquals(expResult, actualResult, 0.00001);}
    @Test
    public void testMinWithOneElementArray(){

        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;
        double actualResult = seriesAnalysis.min();
        assertEquals(expResult,actualResult, 0.00001);}

    @Test(expected = IllegalArgumentException.class)
    public void testMinWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        seriesAnalysis.min();}

    @Test
    public void testMin() {
        double[] temperatureSeries = {2.0, 1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        double actualResult = seriesAnalysis.min();

        assertEquals(expResult, actualResult, 0.00001);}
    @Test
    public void testMaxWithOneElementArray(){

        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;
        double actualResult = seriesAnalysis.max();
        assertEquals(expResult,actualResult, 0.00001);}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        seriesAnalysis.max();}

    @Test
    public void testMax() {
        double[] temperatureSeries = {2.0, 1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 2.0;

        double actualResult = seriesAnalysis.max();

        assertEquals(expResult, actualResult, 0.00001);}
    @Test
    public void testFindTempClosestWithOneElementArray(){

        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;
        double actualResult = seriesAnalysis.findTempClosestToZero();
        assertEquals(expResult,actualResult, 0.00001);}

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        seriesAnalysis.findTempClosestToZero();}

    @Test
    public void testFindTempClosest() {
        double[] temperatureSeries = {2.0, 1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        double actualResult = seriesAnalysis.findTempClosestToZero();

        assertEquals(expResult, actualResult, 0.00001);}
    @Test
    public void testFindTempClosestToValueWithOneElementArray(){

        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(1);
        assertEquals(expResult,actualResult, 0.00001);}

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToVlaueWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        seriesAnalysis.findTempClosestToValue(1);}

    @Test
    public void testFindTempClosestToValue() {
        double[] temperatureSeries = {3.0, 1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        double actualResult = seriesAnalysis.findTempClosestToValue(1.0);

        assertEquals(expResult, actualResult, 0.00001);}
    @Test
    public void testFindTempsLessThenWithOneElementArray(){

        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {-1.0};
        double[] actualResult = seriesAnalysis.findTempsLessThen(2.0);
        assertEquals(expResult[0],actualResult[0], 0.00001);}

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempsLessThenWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        seriesAnalysis.findTempsLessThen(2.0);}

    @Test
    public void testFindTempsLessThen() {
        double[] temperatureSeries = {3.0, 1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {1.0};
        double[] actualResult = seriesAnalysis.findTempsLessThen(2.0);
        assertEquals(expResult[0], actualResult[0], 0.000001);}

    @Test
    public void testFindTempsGreaterThenWithOneElementArray(){

        double[] temperatureSeries = {3.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {3.0};
        double[] actualResult = seriesAnalysis.findTempsGreaterThen(2.0);
        assertEquals(expResult[0],actualResult[0], 0.00001);}

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempsGreaterThenWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        seriesAnalysis.findTempsGreaterThen(3.0);}

    @Test
    public void testFindTempsGreaterThen() {
        double[] temperatureSeries = {3.0, 1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {3.0};
        double[] actualResult = seriesAnalysis.findTempsGreaterThen(2.0);
        assertEquals(expResult[0], actualResult[0], 0.000001);}

    @Test
    public void testAddTempsWithOneElementArray(){

        double[] temperatureSeries = {3.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        int expResult = 2;
        int actualResult = seriesAnalysis.addTemps(2.0);
        assertEquals(expResult,actualResult, 0.00001);}


    @Test
    public void testAddTemps() {
        double[] temperatureSeries = {3.0,4.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        int expResult = 5;
        int actualResult = seriesAnalysis.addTemps(2.0,3.0);
        assertEquals(expResult,actualResult, 0.00001);}


    }



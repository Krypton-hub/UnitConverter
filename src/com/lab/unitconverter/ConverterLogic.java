package com.lab.unitconverter;

public class ConverterLogic {

    public double convert(double inputValue, String fromUnit, String toUnit) {
        double valueInMeters = toMeters(inputValue, fromUnit);
        return fromMeters(valueInMeters, toUnit);
    }

    private double toMeters(double value, String unit) {
        return switch (unit) {
            case "Meters" -> value;
            case "Feet" -> value * 0.3048;
            case "Inches" -> value * 0.0254;
            case "Centimeters" -> value / 100.0;
            default -> 0;
        };
    }

    private double fromMeters(double valueInMeters, String unit) {
        return switch (unit) {
            case "Meters" -> valueInMeters;
            case "Feet" -> valueInMeters / 0.3048;
            case "Inches" -> valueInMeters / 0.0254;
            case "Centimeters" -> valueInMeters * 100.0;
            default -> 0;
        };
    }
}
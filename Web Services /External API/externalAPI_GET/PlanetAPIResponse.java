package com.boot.externalAPI_GET;

public class PlanetAPIResponse {

    private String name;
    private double mass;
    private double radius;
    private int period;
    private double semi_major_axis;
    private int temperature;
    private double distance_light_year;
    private int host_star_mass;
    private int host_star_temperature;

    // Getter and setter methods for each field

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double getSemi_major_axis() {
        return semi_major_axis;
    }

    public void setSemi_major_axis(double semi_major_axis) {
        this.semi_major_axis = semi_major_axis;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getDistance_light_year() {
        return distance_light_year;
    }

    public void setDistance_light_year(double distance_light_year) {
        this.distance_light_year = distance_light_year;
    }

    public int getHost_star_mass() {
        return host_star_mass;
    }

    public void setHost_star_mass(int host_star_mass) {
        this.host_star_mass = host_star_mass;
    }

    public int getHost_star_temperature() {
        return host_star_temperature;
    }

    public void setHost_star_temperature(int host_star_temperature) {
        this.host_star_temperature = host_star_temperature;
    }
}

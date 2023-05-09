package com.luckxtech;

public class EnginesImpl {
    public static void main(String[] args) {
        PetrolEngines petrolEngines = new PetrolEngines(0,0,0,0,"","","");
        System.out.println("---------------------------------------------------------------");
        System.out.println("----------------Details Of Petrol Engines----------------------");
        System.out.println("---------------------------------------------------------------");
        petrolEngines.setModelNumber(101);
        petrolEngines.setDisplacement(345);
        petrolEngines.setMaxPower(8);
        petrolEngines.setMaxRpm(9);
        petrolEngines.setFuelType("Petrol");
        petrolEngines.setSpeed("120KMPH");
        System.out.println("Model Number of Petrol Engine is : "+petrolEngines.getModelNumber());
        System.out.println("Displacement Number of Petrol Engine is : "+petrolEngines.getDisplacement());
        System.out.println("Maximum Power which is Engine Has : "+petrolEngines.getMaxPower());
        System.out.println("Maximum RPM which is Engine Has : "+petrolEngines.getMaxRpm());
        System.out.println("Fuel which is required for Petrol Engine : "+petrolEngines.getFuelType());
        System.out.println("Speed Of a Petrol Engine is Hourly : "+petrolEngines.getSpeed());
        System.out.println("---------------------------------------------------------------");
        System.out.println("----------------Details Of Diesel Engines----------------------");
        System.out.println("---------------------------------------------------------------");
        DieselEngines dieselEngines = new DieselEngines(0,0,0,0,"","","");
        dieselEngines.setModelNumber(110);
        dieselEngines.setDisplacement(345);
        dieselEngines.setMaxPower(8);
        dieselEngines.setMaxRpm(9);
        dieselEngines.setFuelType("Diesel");
        dieselEngines.setSpeed("80KMPH");
        System.out.println("Model Number of Diesel Engine is : "+dieselEngines.getModelNumber());
        System.out.println("Displacement Number of Diesel Engine is : "+dieselEngines.getDisplacement());
        System.out.println("Maximum Power which is Diesel Engine Has : "+dieselEngines.getMaxPower());
        System.out.println("Maximum RPM which is Diesel Engine Has : "+dieselEngines.getMaxRpm());
        System.out.println("Fuel which is required for Diesel Engine : "+dieselEngines.getFuelType());
        System.out.println("Speed Of a Diesel Engine is Hourly : "+dieselEngines.getSpeed());
        System.out.println("---------------------------------------------------------------");
        System.out.println("----------------Details Of ENG Engines-------------------------");
        System.out.println("---------------------------------------------------------------");
        CngEngines cngEngines = new CngEngines(0,0,0,0,"","","");
        cngEngines.setModelNumber(120);
        cngEngines.setDisplacement(345);
        cngEngines.setMaxPower(8);
        cngEngines.setMaxRpm(9);
        cngEngines.setFuelType("Cylinder");
        cngEngines.setSpeed("150KMPH");
        System.out.println("Model Number of CNG Engine is : "+cngEngines.getModelNumber());
        System.out.println("Displacement Number of CNG Engine is : "+cngEngines.getDisplacement());
        System.out.println("Maximum Power which is CNG Engine Has : "+cngEngines.getMaxPower());
        System.out.println("Maximum RPM which is CNG Engine Has : "+cngEngines.getMaxRpm());
        System.out.println("Fuel which is required for CNG Engine : "+cngEngines.getFuelType());
        System.out.println("Speed Of a CNG Engine is Hourly : "+cngEngines.getSpeed());
        System.out.println("---------------------------------------------------------------");
        System.out.println("----------------Details Of Electrics Engines-------------------");
        System.out.println("---------------------------------------------------------------");
        ElectricEngines electricEngines = new ElectricEngines(0,0,0,0,"","");
        electricEngines.setModelNumber(130);
        electricEngines.setDisplacement(345);
        electricEngines.setMaxPower(8);
        electricEngines.setMaxRpm(9);
        electricEngines.setVoltage("45W");
        electricEngines.setSpeed("120KMPH");
        System.out.println("Model Number of Electric Engine is : "+electricEngines.getModelNumber());
        System.out.println("Displacement Number of Electric Engine is : "+electricEngines.getDisplacement());
        System.out.println("Maximum Power which is Electric Engine Has : "+electricEngines.getMaxPower());
        System.out.println("Maximum RPM which is Electric Engine Has : "+electricEngines.getMaxRpm());
        System.out.println("Fuel which is required for Electric Engine : "+electricEngines.getVoltage());
        System.out.println("Speed Of a Electric Engine is Hourly : "+electricEngines.getSpeed());
        System.out.println("---------------------------------------------------------------------------");
    }
}

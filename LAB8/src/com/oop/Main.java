package com.oop;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
		GeometricBody[] myGeometricBodies = new GeometricBody[] {
				new Cube(7),
				new Parallelepiped(6, 7, 8),
				new Sphere(4.5)
		};
		GeometricBodyController myGeometricBodiesController = new GeometricBodyController();
		System.out.println("Max volume figure: " + myGeometricBodiesController.maxVolume(myGeometricBodies).getClass().getSimpleName());
		System.out.println("Max surface figure: " + myGeometricBodiesController.maxSurface(myGeometricBodies).getClass().getSimpleName());
    }
}

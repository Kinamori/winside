package com.example.winside;

    
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ReadFile {

    public static List<Point> createPointFromFile(String file) {
        List<Point> list = new ArrayList<Point>();
        String[] line;
        String id;
        double lat, lon;
        try {
            Scanner scanner = new Scanner(new File(file));
            scanner.nextLine();             // Ignore header
            while (scanner.hasNextLine()) {
                line = scanner.nextLine().split(" ");
                id = line[0];
                lat = Double.parseDouble(line[1]);
                lon = Double.parseDouble(line[2]);
                try {
                    list.add(new Point(id, lat, lon));
                } catch(Exception e) {
                    e.printStackTrace();
                }
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        for(Point p : list) {
            System.out.println(p);
        }
        return list;
    }
}

import java.util.*;
import java.io.*;

public class AboveAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double n = in.nextDouble();
		for(double i = 0; i < n; i++) {
			double students = in.nextDouble();
			ArrayList<Double> scores = new ArrayList<>();
			double averageSum = 0;
			double average= 0;
			double aboveAverage = 0;
			for(int x = 0; x < students; x++) {
				scores.add(in.nextDouble());	
				averageSum += scores.get(x);
			}
			average = averageSum / students;
			//for(int y = 0; x < scores.size(); y++) {
			//	if(scores.get(y) < average) {
			//		scores.remove(y);
			//	}
			}
			aboveAverage = scores.size() / students * 100;
			System.out.printf("%.3f", aboveAverage);
			in.nextLine();
		}
		
	}

}
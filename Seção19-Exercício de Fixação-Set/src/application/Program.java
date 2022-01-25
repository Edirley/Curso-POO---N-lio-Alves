package application;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<Integer> totalStudents = new LinkedHashSet<>();
		Set<Integer> courseA = new LinkedHashSet<>();
		Set<Integer> courseB = new LinkedHashSet<>();
		Set<Integer> courseC = new LinkedHashSet<>();
		
		System.out.println("How many students for course A? ");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int student = scan.nextInt();
			courseA.add(student);
		}
		System.out.println("How many students for course B? ");
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int student = scan.nextInt();
			courseB.add(student);
		}
		System.out.println("How many students for course C? ");
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int student = scan.nextInt();
			courseC.add(student);
		}
		totalStudents.addAll(courseA);
		totalStudents.addAll(courseB);
		totalStudents.addAll(courseC);
		
		System.out.print("Total students: ");
		System.out.println(totalStudents.size());		
		
		scan.close();
	}
}

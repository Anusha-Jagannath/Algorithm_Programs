package com.algorithm;

import java.util.Scanner;

/*TaskSchedule class reads long list of tasks. 
 *To accomplish task you need M minutes, and the deadline for this task is D . 
 *You need not complete a task at a stretch.
 *optimum solution should be printed
 */
public class TaskSchedule {
	public static void main(String[] args) {

		System.out.println("Enter no of jobs");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Task task[] = new Task[n];
		for (int i = 0; i < n; i++) {
			task[i] = new Task();
			task[i].read(i);
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (task[j].deadline > task[j + 1].deadline) {
					int temp = task[j].deadline;
					task[j].deadline = task[j + 1].deadline;
					task[j + 1].deadline = temp;

				}
			}
		}
		for (int i = 1; i < n; i++) {
			task[i].minutes = task[i - 1].minutes + task[i - 1].deadline;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(task[i].minutes);
		}

	}
}

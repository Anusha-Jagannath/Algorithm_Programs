package com.algorithm;

import java.util.Scanner;

public class Task {

	int jobId;
	int minutes;
	int deadline;
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getDeadline() {
		return deadline;
	}
	public void setDeadline(int deadline) {
		this.deadline = deadline;
	}
	
	public void read(int job) {
		int i = job+1;
		System.out.println("Job"+i);
		System.out.println("Enter minutes for job"+i);
		Scanner sc = new Scanner(System.in);
		minutes = sc.nextInt();
		System.out.println("Enter deadline for job"+i);
		deadline = sc.nextInt();
	}
}

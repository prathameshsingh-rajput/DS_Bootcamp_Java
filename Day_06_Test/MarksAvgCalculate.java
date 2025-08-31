/*
Question 2 Problem Statement – Raj wants to know the maximum marks scored by him in each semester.
The mark should be between 0 to 100 ,if it goes beyond the range display “You have entered invalid mark.

Sample Input 1:
•	Enter no of semester:
3
•	Enter no of subjects in 1 semester:
3
•	Enter no of subjects in 2 semester:
4
•	Enter no of subjects in 3 semester:
2
•	Marks obtained in semester 1:
50
60
70
•	Marks obtained in semester 2:
90
98
76
67
•	Marks obtained in semester 3:
89
76
Sample Output 1:
•	Maximum mark in 1 semester:70
•	Maximum mark in 2 semester:98
•	Maximum mark in 3 semester:89
Sample Input 2:
•	Enter no of semester:
3
•	Enter no of subjects in 1 semester:
3
•	Enter no of subjects in 2 semester:
4
•	Enter no of subjects in 3 semester:
2
•	Marks obtained in semester 1:
55
67
98
•	Marks obtained in semester 2:
67
(-)98
Sample Output 2:
You have entered invalid mark.

*/

import java.util.Scanner;

public class MarksAvgCalculate{
	public static int [] getSemesterMarks(int arr[], int n){
		Scanner in = new Scanner(System.in);

		int maxMarks[] = new int[n];

		for(int i = 0; i < n; ++i){
			System.out.println("\nMarks obtained in semester "+(i+1)+":");
			int marks[] = new int[arr[i]];
			int max  = 0;
			for(int j = 0; j < marks.length; ++j){
				marks[j] = in.nextInt();
				if(marks[j] < 0){
					return null;
				}
				max = Math.max(marks[j], max);
			}
			maxMarks[i] = max;
		}

		in.close();
		return maxMarks;
	}
	public static void main(String[]a){
		Scanner sc = new Scanner(System.in);

		int no = 0;
		do{
			System.out.println("\nEnter no of semester: ");
			 no = sc.nextInt();

		}while(no <= 0);

		int semSubSize[] = new int[no];

		for(int i = 0; i < no; ++i){
			System.out.print("\nEnter no of subjects in "+(i+1)+" semester: ");
			semSubSize[i] = sc.nextInt();
		}

		int [] maxMarks = getSemesterMarks(semSubSize, no);
		if(maxMarks == null){
			System.out.println("\nYou have entered invalid mark.\n");
		}else{
			for(int i = 0; i < no; ++i){
				System.out.println("\nMaximum marks in "+(i+1)+" semester: "+maxMarks[i]);
			}
		}

		sc.close();
	}
}
package studentAward;


public class Sorting {


	public static void selectionSort(Comparable[] list) {


		int highest;

		for (int index = 0; index < list.length - 1; index++) {

			highest = index;

			for (int innerIndex = index + 1; innerIndex < list.length; innerIndex++) {

				if (list[innerIndex].compareTo(list[highest]) > 0) {

					highest = innerIndex;

				}

			}

			Comparable temp = list[highest];

			list[highest] = list[index];

			list[index] = temp;

		}

	}



}
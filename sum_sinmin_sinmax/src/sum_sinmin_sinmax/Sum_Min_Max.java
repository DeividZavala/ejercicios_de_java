package sum_sinmin_sinmax;

public class Sum_Min_Max {
	
	 public static int sum(int[] numbers)
	  {
	    if (numbers == null || numbers.length == 0 || numbers.length == 1) return 0;
	    int min,max,sum;
	    sum = min = max = numbers[0];
	    for (int i = 1; i < numbers.length; i++)
	    {
	      sum += numbers[i];
	      if (numbers[i] < min) min = numbers[i];
	      if (numbers[i] > max) max = numbers[i];
	    }
	    System.out.print(sum-min-max);
	    return sum - min - max;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		sum(test);
	}

}

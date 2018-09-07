class SumOfN{
	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System,in)
		//scanner.useDelimiter("\\D");
		System.out.println(getSum(10)+getSum(100)+getSum(200));
	}
	static int getSum(int n){
		return (n*(n+1))/2;
	}
}
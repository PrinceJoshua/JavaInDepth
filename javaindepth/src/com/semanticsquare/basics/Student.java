class Student {
	int id;
	byte age = 18;
	byte rank = 111; //[-128, 127]
	long phone = 2234567890L;// Java 7 --readaility
	
	//Integers literals: int Literal, Long Literal
	
	byte minValue = Byte.MIN_VALUE;
	byte maxValue = Byte.MAX_VALUE;
	
	void compute(){
		
		int nextId = id + 1;
		
		
		System.out.println("id: "+ id);
		System.out.println("nextId: " + nextId);
		System.out.println("age: " + age);
		System.out.println("phone: " + phone);
		
		System.out.println("minValue: " + minValue);
		System.out.println("maxValue: " + maxValue);
		
	}


	public static void main (String[] args)
	{
		Student s = new Student();
		s.compute();
	}
}
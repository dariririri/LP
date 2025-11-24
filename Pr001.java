class Cow{
	int a;
	void printCow(){
		System.out.println("Значение переменной a: "+ a);
	}
	int addInt(int b){
		return a + b;
	}

}
class Pr001 {
	public static void main(String args[]){
		Cow  clCow = new Cow();
		clCow.printCow();
		clCow.a = 10;
		clCow.printCow();
		System.out.println("Результат выполнения метода addInt() для clCow: "+clCow.addInt(15));
	
	}
}

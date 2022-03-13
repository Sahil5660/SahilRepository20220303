package Assignment_Day9;

public class CommandLineArgument {
	//String[]args/Can also write as String[]sahil---Command Line Argument or we can say array of string
	

	public static void main(String[] Sahil) {
		// TODO Auto-generated method stub
		System.out.println("Total Argument="+Sahil.length); //to Find the length
		int L=Sahil.length;
		for(int i=0;i<L;i++) {
			System.out.println(Sahil[i]); //to find the values given in Command Line Arguments
		}

	}

}

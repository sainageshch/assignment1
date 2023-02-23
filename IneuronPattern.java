
public class IneuronPattern {

	public static void main(String[] args) {
		int n=10;
		System.out.println();//just to look neet
		for(int i=0;i<n;i++) {
			//For letter "I"
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||j==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.print("  ");//Space between the letters
			
			//For letter "N"
			for(int j=0;j<n;j++) {
				if(j==0||j==n-1||i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");//Space between the letters
			
			//For letter "E"
			for(int j=0;j<n;j++) {
				if(i==0||i==(n-1)/2||i==n-1||j==0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");//Space between the letters
			
		
			//For letter "U"
			for(int j=0;j<n;j++) {
				if(j==0&&i!=n-1||i==n-1&&j!=0&&j!=n-1||j==n-1&&i!=n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");//Space between the letters
		
		
			//For letter "R"
			for(int j=0;j<n;j++) {
				if(j==0||i==0&&j!=n-1||j==n-1&&i!=0&&i<(n-1)/2||i==(n-1)/2&&j!=n-1||i==j&&i>(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");//Space between the letters
			
			//For letter "O"
			for(int j=0;j<n;j++) {
				if(i==0&&j!=0&&j!=n-1||j==0&&i!=0&&i!=n-1||i==n-1&&j!=0&&j!=n-1||j==n-1&&i!=0&&i!=n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");//Space between the letters
			
			//For letter "N"
			for(int j=0;j<n;j++) {
				if(j==0||j==n-1||i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
			
		}

	}

}

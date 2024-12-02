import java.util.Scanner;
class L36{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int c=0;
	int arr1[][]=new int[3][3];
	int arr2[][]=new int[3][3];
	int arr3[][]=new int[3][3];
	for(int i=0;i<arr1.length;i++){
		for(int j=0;j<arr1.length;j++){
			arr1[i][j]=sc.nextInt();

		}
	}
	for(int i=0;i<arr1.length;i++){
		for(int j=0;j<arr1.length;j++){
			System.out.print("\t"+arr1[i][j]);

		}
	System.out.println();
	}







	for(int i=0;i<arr1.length;i++){
		for(int j=0;j<arr1.length;j++){
			arr2[i][j]=sc.nextInt();

		}
	}

	for(int i=0;i<arr1.length;i++){
		for(int j=0;j<arr1.length;j++){
			System.out.print("\t"+arr2[i][j]);

		}
	System.out.println();
	}




	
	System.out.println("Addition MatrixSSSSS");
	
	for(int i=0;i<arr1.length;i++){
		for(int j=0;j<arr1.length;j++){
			for(int k=0;k<arr1.length;k++){
				arr3[i][j]+=arr1[i][k]*arr2[k][j];

		}
	}
}
	for(int i=0;i<arr1.length;i++){
		for(int j=0;j<arr1.length;j++){
			System.out.print("\t"+arr3[i][j]);

		}
	System.out.println();
	}


	
}
}
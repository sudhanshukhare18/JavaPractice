class L25{
	public static void main(String args[]){
	int arr[]={10,20,50,65,485,23,812,13};
	System.out.println("Before Sorting");
	for(int i=0;i<arr.length;i++){
	System.out.print("\t"+arr[i]);
	}
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
		if(arr[i]>arr[j]){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
		}

	}
	System.out.println("\n After Sorting");
	for(int i=0;i<arr.length;i++){
	System.out.print("\t"+arr[i]);
	}
}
}
	
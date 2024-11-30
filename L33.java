class L33{
	public static void main(String args[]){
	int c=0;
	int arr[]={1,2,3,4,1,3,4,5};
	int freq[] = new int[10];
	for(int i =0;i<arr.length;i++){
	freq[arr[i]]++;
	}
	System.out.println("Duplicate Element Of array");
	for(int i=0;i<freq.length;i++){
	if(freq[i]>1){
		System.out.print("\t"+i);
	}
}
}
}
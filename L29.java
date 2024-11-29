class L29{
	public static void main(String args[]){
	int c=0;
	int arr[]={10,20,30,40};
	for(int i=0;i<arr.length-1;i++){
	if(arr[i]<arr[i+1]){
	c++;
	}}
	if(c==arr.length-1){
	System.out.println("Sorted");
	}
	else{
	System.out.println("Not Sorted");
	}
}
}
class L23{
	public static void main(String args[]){
	int arr[]={100,2,504,48,0,-2};
	int max=arr[0];
	for(int i=1;i<arr.length;i++){
	if(max<arr[i]){
	max=arr[i];
	}
	}
	System.out.println("Largest Element : "+max);
}
}
class Singlenumber {
	public static int singlenumber(int arr[]) {
		int n=arr.length; 
		for(int i=0;i<n;i++){
			int count=0;
			for(int j=0;j<n;j++){
				if(arr[i]==arr[j]){
					count++; 
					} }if(count==1) 
					return arr[i]; } 
					return -1; } 
					public static void main(String[] args) {
						int arr[]={1,3,3,1,1,4}; 
						System.out.println(singlenumber(arr)); } }
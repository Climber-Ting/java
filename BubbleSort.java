package day07;


public class BubbleSort {
	 public static void main(String[] args){
		 int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
		 for(int i=0;i<arr.length-1;i++) {
			 for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			 }
		 }	 
		 for(int i=0;i<arr.length;i++)
			 System.out.print(arr[i]+" ");
		 System.out.println();
		 //复制数组
		 int[] arr1=new int[arr.length];
		 for(int i=0;i<arr.length;i++) {
			 arr1[i]=arr[i];
			 System.out.print(arr1[i]+" ");
		 }
		 System.out.println();
		 //反转数组arr
		 //方法一
		 for(int i=0;i<arr.length/2;i++) {
			 int temp=arr[arr.length-1-i];
			 arr[arr.length-1-i]=arr[i];
			 arr[i]=temp;
		 }
		 
		 for(int i=0;i<arr.length;i++)
			 System.out.print(arr[i]+" ");
		 
		 System.out.println();
		 //方法二
		 for(int i=0,j=arr.length-1;i<j;i++,j--) {
			 int temp=arr[j];
			 arr[j]=arr[i];
			 arr[i]=temp;
		 }
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
	 }
}


package day07;

import org.junit.Test;

//线性查找
//使用线性查找，从上述数组中查找22是否存在。存在，返回所在位置的索引。不存在，输出提示信息。
public class SelectTest {
@Test
	public void test() {
	    int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
		int dest=22;
		boolean flag=false;
		for(int i=0;i<arr.length;i++){
			 if(dest==arr[i]) {
				 System.out.print(i); 
				 flag=true;
			 }
		}
		if(flag==false) {
			System.out.println("未找到！");
		}
}

@Test
	public void test1() {
		int num1 = 12;
		int num2 = -num1;
        System.out.println("num2=" + num2);
	}


@Test
public void test2() {
	
	int x=0,y=1;
	if(++x==y-- & x++==1||--y==0)
	System.out.println("x="+x+",y="+y);   //x = 2,y = 0;
	else
		        System.out.println("y="+y+",x="+x);

}
	@Test
	//交换两个数的值
	public void test3() {
		//方法一
		int m=3,n=5;
		int temp ;
		temp = m;
		m = n;
		n = temp;
		System.out.println("m="+m+",n="+n);
		//方法二
		int a=4,b=6;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+",b="+b);
		//方法三
		int c=5,d=8;
		c=c^d;
		d=c^d;
		c=c^d;
		System.out.println("c="+c+",d="+d);
	}
	@Test
	public void test4() {
		int h = 80;
		double s = (h - 32) / 1.8;
		System.out.println(h + "华氏度，是摄氏度" + Math.round(s));//s+0.5 向下取值
	}
	@Test
	public void test5() {
		int a=3,b=8;

		int c=(a>b)?a++:b++;
		System.out.println("a="+a+"\tb="+b+"\tc="+c);  //  a=3  b=9  c=8

		int d=(a>b)?++a:++b;
		System.out.println("a="+a+"\tb="+b+"\td="+d);  //  a=3  b=10  d=10

		int e=(a<b)?a++:b++;
		System.out.println("a="+a+"\tb="+b+"\te="+e);  //   a=4  b=10  e=3

		int f=(a<b)?++a:++b;
		System.out.println("a="+a+"\tb="+b+"\tf="+f);  //    a=5  b=10  f=5
	}

}







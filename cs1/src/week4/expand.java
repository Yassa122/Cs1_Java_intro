package week4;

public class expand {
	public static int[] expand(int[]a,int n) {
			if(n==1) {
				return a;
			}else if(n<=0) {
				return new int[0];
			}else {
				int[]b=new int[a.length];
				for(int i=0;i<a.length;i++) {
					for(int j=0;j<n;j++) {
						b[i*n+j]=a[i/n];
				}
			}
			return b;
		}
	}
	public static void main(String[] args) {
	
		
	}	
}


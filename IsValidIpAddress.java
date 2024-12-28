
public class IsValidIpAddress {

	public static void main(String[] args) {
		//write a program to validate an IPv4 Address
		//174.16.254.1
		//172--0---255
		//16
		//254
		//1
		String input="172.16.254.1";
		input=input.replace('.',' ');
		String[] data=input.split(" ");
		int num=0;
		boolean isValid=true;
		if(data.length !=4) isValid=false;
		else {
			for(int i=0;i<data.length;i++) {
				System.out.println(data[i]+" ");
				
				num=Integer.parseInt(data[i]);
				if((num <0)||(num > 255)) {
					isValid=false;
					break;
					
				}
			
				
	       }
		}
			
		if(isValid==true) {
			System.out.println("Valid IPv4 Address");
		}
		else {
			System.out.println("not a valid IPv4 Address");
		}
	}

}

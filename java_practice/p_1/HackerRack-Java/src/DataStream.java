

	public class DataStream {

	    public static void main(String[] args) {
	        String dataStream = "alphxxdida";
	        int count = 0;
	        StringBuilder reversed = new StringBuilder(dataStream).reverse();
	        for (int i = 0; i < dataStream.length(); i++) {
	            if (dataStream.charAt(i) == reversed.charAt(i)) {
	                count++;
	            }
	        }
	        System.out.println("Number of characters that do not change position: " + count);
	    }
	}



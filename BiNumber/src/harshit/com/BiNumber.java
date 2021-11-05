package harshit.com;


public class BiNumber {
	private int x,y;
	

		public BiNumber(int x, int y){
			this.x = x;
			this.y = y;
		}
	
		public int add(){
		return x+y;			
		}
		
		public int multiplication() {
			return x*y;
		}
		
		public void doubleValue() {
			this.x *= 2;
			this.y *= 2;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		
		
		

}
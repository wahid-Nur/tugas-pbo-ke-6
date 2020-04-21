class buah {
	String nama="apel";
	
	String getNama() {
		return nama;
	}
}

class  manis extends buah{
	public static void main(String[] args) {
		manis m = new manis();
		System.out.println(m.getNama());
	}

}


//superClass
class pakaian {
	String warna;
	
	// method untuk mengembalikan nilai variable warna
	String getWarna() {
		return warna;
	}
}

//subClass
class  baju extends pakaian{
	public static void main(String[] args) {
		baju b = new baju();
		b.setWarna("hitam");
		System.out.println(b.getWarna());
	}
	//method untuk set variabel warna
	void setWarna(String warna) {
		this.warna=warna;
	}
}

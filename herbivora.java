class binatang {
	int umur=20;
	
	int getUmur() {
		return umur;
	}
}

class  herbivora extends binatang{
	public static void main(String[] args) {
		herbivora h = new herbivora();
		System.out.println(h.getUmur());
	}

}

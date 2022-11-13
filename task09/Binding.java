package by.jonline.pr04.prwclass.task09;

public enum Binding {

	COPTIC("Coptic stitch binding"), HARDCOVER("Hardcover or case binding"), INTERSCREW("Interscrew binding"),
	JAPANESE("Japanese binding"), PUR("PUR binding"), SADDLE("Saddle stitch binding"), SECTION("Section sewn binding"),
	SINGER("Singer sewn binding"), SLIPCASE("Solander box and slipcase"), SPIRAL("Wiro, comb or spiral binding");

	private String methodType;

	private Binding() {

	}

	private Binding(String methodType) {
		this.methodType = methodType;
	}

	public String getMethodType() {
		return methodType;
	}

}
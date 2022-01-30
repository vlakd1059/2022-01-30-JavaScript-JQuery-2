
public class WebtoonInfo {
	// Á¦¸ñ
	private String title;
	// ÀÛ°¡
	private String writer;
	// ¿¬ÀçÀÏ
	private String openDay;
	
	
	public WebtoonInfo(String title, String writer, String openDay) {
		this.title = title;
		this.writer = writer;
		this.openDay = openDay;
	}
	
	
	public String getTitle() {
		return title;
	}
	public String getWriter() {
		return writer;
	}
	public String getOpenDay() {
		return openDay;
	}
}

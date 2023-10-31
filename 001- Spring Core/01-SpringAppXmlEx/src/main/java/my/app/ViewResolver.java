package my.app;

public class ViewResolver {
	
	private String prefix;
	private String sufix;
	
	public ViewResolver() {
		
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSufix() {
		return sufix;
	}

	public void setSufix(String sufix) {
		this.sufix = sufix;
	}

	@Override
	public String toString() {
		return "ViewResolver [prefix=" + prefix + ", sufix=" + sufix + "]";
	}
	
	

}

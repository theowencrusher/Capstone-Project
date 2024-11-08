package emailMangement;

import java.util.ArrayList;

public abstract class Filter {
	public String name;
	private String script;
	
	public String getScript() {
		return script;
	}
	
	public void setscript(String script) {
		this.script = script;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class DateFilter extends Filter{
	String date;
}

class SenderFilter extends Filter{
	int amountSenders;
	String[] senderName;
}


class AttachmentFilter extends Filter{
	int attachmentType;
}

class KeywordFilter extends Filter{
	int amountKeywords;
	String[] keywords;
}


class Category {
	public String name;
	private ArrayList<Filter> filters;
	public ArrayList<Filter> getFilters() {
		return filters;
	}
	public void setFilters(ArrayList<Filter> filters) {
		this.filters = filters;
	}
	
	public ArrayList<Category> getCategories() {
		return categories;
	}
	public void setCategories(ArrayList<Category> categories) {
		this.categories = categories;
	}

	private ArrayList<Category> categories;
	
}
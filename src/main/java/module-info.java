module org.jspace {
	requires com.google.gson;

	opens org.jspace to com.google.gson;
	opens org.jspace.protocol to com.google.gson;
}

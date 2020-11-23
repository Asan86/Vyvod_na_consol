package Objects_as_method_parameters;

public class Book {
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    Book(String name){
    this.name = name;
    }
}

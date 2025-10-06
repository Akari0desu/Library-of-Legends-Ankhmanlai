public class Book {
    /// attributes 
    private String title ;
    private String author ; 
    private int number_of_pages ;
    private String skill ;
    /// a
    public Book(String title, String author, int number_of_pages, String skill){
        this.title = title ;
        this.author = author ;
        this.number_of_pages = number_of_pages ;
        this.skill = skill ;

    }
    ///get
    public String getTitle (){
        return title;
    }
    public String getAuthor (){
        return author;
    }
    public int getNumber_of_pages (){
        return number_of_pages;
    }
    public String getSkill (){
        return skill;
    }
    /// set 
    ///public void setTitle (String title) {
        //this.title = title;
    //}
    ///public void setAuthor (String author) {
        //this.author = author;
    //}
    ///public void setNumber_of_pages (int number_of_pages) {
        //this.number_of_pages = number_of_pages;
    //}
    ///public void setSkill (String skill) {
        //this.skill = skill;
    //}
    ///print
    public void printDetails () {
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Number Of Pages:" + number_of_pages);
        System.out.println("Skill:" + skill);
    }
}
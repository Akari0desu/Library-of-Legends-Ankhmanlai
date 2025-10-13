public class SkillBook extends Book {
    private String skillToLearn ;
    
    public SkillBook(String title, String author, int numPages, String skillToLearn){
        super(title,author,numPages);
        this.skillToLearn = skillToLearn ;
    }

    public String getSkillToLearn() {
        return skillToLearn;
    }
    
    public String toString(){
        return super.toString() + skillToLearn ;
     }
     
}
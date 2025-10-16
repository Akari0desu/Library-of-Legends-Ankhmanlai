public class LoreBook extends Book {
    private String loreinfo;

    public LoreBook(String title, String author, int numPages, String loreinfo) {
        super(title, author, numPages);
        this.loreinfo = loreinfo;
    }
    
    public String getLoreInfo() {
        return loreinfo;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Lore" + loreinfo;
    }

    @Override
    public void doRead(Hero hero) {
        boolean added = hero.addJournalEntry(loreinfo);
        if (added) {
            System.out.println(hero.getName() + " has read " + getTitle() + "and learned " + loreinfo);
        } else {
            System.out.println(hero.getName() + "has read" + getTitle() + "but their journal is full");

        }
    }
}

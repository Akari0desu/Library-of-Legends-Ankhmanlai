public class Hero {
    private String name;
    private String currentSkill;
    private String[] journal = new String[5];
    private int journalCount = 0;


    public Hero(String name) {
        this.name = name;
        this.currentSkill = "none";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentSkill() {
        return currentSkill;
    }
    
    public boolean addJournalEntry(String fact) {
        if (journalCount < journal.length) {
            journal[journalCount++] = fact;
            return true;
        } else {
            return false;
        }
     }

    public void setCurrentSkill(String currentSkill) {
        this.currentSkill = currentSkill;
    }

    public void readBook (Book book) {
        book.doRead(this);
    }

    public void useSkill (String skillName) {
        if (!currentSkill.equals("none") && skillName.equals(currentSkill)) {
            System.out.println(this.name + " uses " + skillName);
        } else {
            System.out.println (this.name +" does not know how to do that");
        }
    }

    public void printDetails() {
        System.out.println("Hero name: '" + name + "', equipped skill: " + currentSkill);
    }

    public void printJournal() {
        System.out.println("===" + name + " 's Journal ===");
        if (journalCount == 0) {
            System.out.println("Journal is empty!");
        } else {
            for (int i = 0; i < journalCount; i++) {
                System.out.println((i+1) + " . " + journal[i]);
            }
        }
    }
}


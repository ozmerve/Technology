import java.util.List;

public class Technology {
    private int id;
    private String name;
    private List<String> programmingLanguageNames;

    // Constructor
    public Technology(int id, String name, List<String> programmingLanguageNames) {
        this.id = id;
        this.name = name;
        this.programmingLanguageNames = programmingLanguageNames;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for programmingLanguageNames
    public List<String> getProgrammingLanguageNames() {
        return programmingLanguageNames;
    }

    // Setter for programmingLanguageNames
    public void setProgrammingLanguageNames(List<String> programmingLanguageNames) {
        this.programmingLanguageNames = programmingLanguageNames;
    }

    // Method to add a programming language
    public void addProgrammingLanguage(String languageName) {
        programmingLanguageNames.add(languageName);
    }

    // Method to update a programming language
    public void updateProgrammingLanguage(int index, String newLanguageName) {
        if (index >= 0 && index < programmingLanguageNames.size()) {
            programmingLanguageNames.set(index, newLanguageName);
        } else {
            System.out.println("Invalid index");
        }
    }

    // Method to delete a programming language
    public void deleteProgrammingLanguage(int index) {
        if (index >= 0 && index < programmingLanguageNames.size()) {
            programmingLanguageNames.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    // Method to get a programming language by its index
    public String getProgrammingLanguageById(int index) {
        if (index >= 0 && index < programmingLanguageNames.size()) {
            return programmingLanguageNames.get(index);
        } else {
            return null;
        }
    }
}

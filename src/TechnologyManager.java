import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TechnologyManager {
    private final List<Technology> technologies;

    public TechnologyManager() {
        technologies = new ArrayList<>();
        
    }

    public List<Technology> getAll() {
        return technologies;
    }

    public void addTechnology(Technology technology) {
        technologies.add(technology);
    }

    public Technology getById(int id) {
        for (Technology tech : technologies) {
            if (tech.getId() == id) {
                return tech;
            }
        }
        return null;
    }

    public void updateTechnology(Technology updatedTech) {
        for (Technology tech : technologies) {
            if (tech.getId() == updatedTech.getId()) {
                tech.setName(updatedTech.getName());
                tech.setProgrammingLanguageNames(updatedTech.getProgrammingLanguageNames());
                break;
            }
        }
    }

    public void deleteTechnology(int id) {
        Iterator<Technology> iterator = technologies.iterator();
        while (iterator.hasNext()) {
            Technology tech = iterator.next();
            if (tech.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class TechnologyMain {
    public static void main(String[] args) {
        TechnologyManager techManager = new TechnologyManager();

        // Varsayılan teknolojileri oluştur
        List<String> programmingLanguages1 = new ArrayList<>();
        programmingLanguages1.add("Java");
        programmingLanguages1.add("Python");
        Technology tech1 = new Technology(1, "Backend Development", programmingLanguages1);

        List<String> programmingLanguages2 = new ArrayList<>();
        programmingLanguages2.add("HTML");
        programmingLanguages2.add("CSS");
        programmingLanguages2.add("JavaScript");
        Technology tech2 = new Technology(2, "Frontend Development", programmingLanguages2);

        techManager.addTechnology(tech1);
        techManager.addTechnology(tech2);

        // Tüm teknolojileri alma
        List<Technology> allTechs = techManager.getAll();
        for (Technology tech : allTechs) {
            System.out.println("Technology ID: " + tech.getId());
            System.out.println("Technology Name: " + tech.getName());
            System.out.println("Programming Languages: " + tech.getProgrammingLanguageNames());
            System.out.println();
        }

        // Bir teknolojiyi güncelleme
        Technology updatedTech = new Technology(2, "Frontend Development (Updated)", programmingLanguages2);
        techManager.updateTechnology(updatedTech);

        // Teknolojiyi güncelledikten sonra tüm teknolojileri yeniden alma ve yazdırma
        allTechs = techManager.getAll();
        for (Technology tech : allTechs) {
            System.out.println("Technology ID: " + tech.getId());
            System.out.println("Technology Name: " + tech.getName());
            System.out.println("Programming Languages: " + tech.getProgrammingLanguageNames());
            System.out.println();
        }

        // Bir teknolojiyi silme
        techManager.deleteTechnology(1);

        // Teknolojiyi sildikten sonra tüm teknolojileri yeniden alma ve yazdırma
        allTechs = techManager.getAll();
        for (Technology tech : allTechs) {
            System.out.println("Technology ID: " + tech.getId());
            System.out.println("Technology Name: " + tech.getName());
            System.out.println("Programming Languages: " + tech.getProgrammingLanguageNames());
            System.out.println();
        }
    }
}

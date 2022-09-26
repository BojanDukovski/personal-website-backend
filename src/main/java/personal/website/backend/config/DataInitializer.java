//package personal.website.backend.config;
//
//import org.springframework.stereotype.Component;
//import personal.website.backend.model.Project;
//import personal.website.backend.service.ProjectService;
//
//import javax.annotation.PostConstruct;
//import javax.transaction.Transactional;
//
//@Component
//public class DataInitializer {
//
//    private final ProjectService projectRepository;
//
//    public DataInitializer(ProjectService projectRepository) {
//        this.projectRepository = projectRepository;
//    }
//
//
//    @PostConstruct
//    @Transactional
//    public void initData() {
//        Project project1 = new Project("KinoIS Project", "Developed an application for purchasing tickets for movies and making reservations in the cinema. In the\n" +
//                "background of this application is .Net Core and it is made in Visual Studio 2022. This was school project.",
//                "/", "https://github.com/BojanDukovski/kinoIS");
//        this.projectRepository.save(project1);
//
//        Project project2 = new Project("Library Project", "Library is web application developed in Java Spring Boot. It was school homework that was very fun to do.",
//                "/", "https://library-lab2-emt-front.herokuapp.com/");
//        this.projectRepository.save(project2);
//
//        Project project3 = new Project("CovidLess Project", "This is project for school. It is a web application made in Java Spring Boot named CovidLess. The name\n" +
//                "references the activity of getting rid of Covid-19 virus.", "/", "https://covidless.herokuapp.com/");
//        this.projectRepository.save(project3);
//
//        Project project4 = new Project("Sfera international (nonprofit organization)", "I participated in many activities and projects mostly correlated with art (drawing, painting and taking\n" +
//                "photos). Developed great communication skills and hung out with many people from around the world.", "01/04/2016 – 01/01/2017", "/");
//        this.projectRepository.save(project4);
//
//        Project project5 = new Project("Inkognito (nonprofit organization)", "Youth exchange project where we had a task to represent Republic of Macedonia to the world. We were staying at " +
//                "Turkey for 6 days and brought specialities from our country to bring Macedonia close to the world. So much friendship and love was " +
//                "floating in the air and the feeling was amazing.", "/", "/");
//        this.projectRepository.save(project5);
//
//        Project project6 = new Project("ARS Longa exhibition", "Prints of photos that i took was for sale in front of Turkish museum in Bitola. All the money that was earned" +
//                " was given to charity.", "Interakt shiroksokak Bitola", "/");
//        this.projectRepository.save(project6);
//
//        Project project7 = new Project("Computer games developer – M3DS Academy",
//                "Team work at making games. Made a custom game at Maya and Unity software in 9-16\n" +
//                        "hours and got first place in the competition.", "10/03/2020 – 11/03/2020", "/");
//        this.projectRepository.save(project7);
//
//
//    }
//}

package fakerLibraryDemo;

public class FakerLibDemo {
	
	//link : https://github.com/DiUS/java-faker
	
	//add dependecny in POM.xml
	//<dependency>
    //<groupId>com.github.javafaker</groupId>
    //<artifactId>javafaker</artifactId>
    //<version>1.0.2</version>
   //</dependency>

	public static void main(String[] args) {
		
		Faker faker = new Faker();

		String name = faker.name().fullName(); // Miss Samanta Schmidt
		String firstName = faker.name().firstName(); // Emory
		String lastName = faker.name().lastName(); // Barton

		String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449

	}

}

package Resume;
import java.util.Scanner;

public class ResumePortfolio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Resume Portfolio =====");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("\n=== About Me ===");
        System.out.print("Write a brief introduction about yourself: ");
        String aboutMe = scanner.nextLine();

        System.out.println("\n=== Skills ===");
        System.out.println("Enter your skills (one per line, enter 'done' to finish):");
        String skill;
        StringBuilder skills = new StringBuilder();
        while (true) {
            skill = scanner.nextLine();
            if (skill.equals("done")) {
                break;
            }
            skills.append("- ").append(skill).append("\n");
        }

        System.out.println("\n=== Experience ===");
        System.out.println("Enter your work experience (one per line, enter 'done' to finish):");
        String experience;
        StringBuilder experiences = new StringBuilder();
        while (true) {
            experience = scanner.nextLine();
            if (experience.equals("done")) {
                break;
            }
            experiences.append("- ").append(experience).append("\n");
        }

        System.out.println("\n=== Education ===");
        System.out.println("Enter your educational background (one per line, enter 'done' to finish):");
        String education;
        StringBuilder educations = new StringBuilder();
        while (true) {
            education = scanner.nextLine();
            if (education.equals("done")) {
                break;
            }
            educations.append("- ").append(education).append("\n");
        }

        System.out.println("\n===== Resume =====");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("\n=== About Me ===");
        System.out.println(aboutMe);
        System.out.println("\n=== Skills ===");
        System.out.println(skills);
        System.out.println("\n=== Experience ===");
        System.out.println(experiences);
        System.out.println("\n=== Education ===");
        System.out.println(educations);
    }
}

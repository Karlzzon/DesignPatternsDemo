package Composite;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("C");
        Folder programFiles = new Folder("Program Files");
        Folder documents = new Folder("Documents");
        File readme = new File("readme.txt");
        File fibonacci = new File("fibonacci.exe");

        root.add(programFiles);
        root.add(documents);
        documents.add(readme);
        programFiles.add(fibonacci);

        root.display();
    }
}


package FormLetterWriter;

public class FormLetterWriter {
    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void displaySalutation(String lastName){
        System.out.print("Dear Mr. o Ms."+ " " + lastName+ " ");
    }
    
    public void displaySalutation(String name, String lastName){
        System.out.print("\nDear"+" " + name + " "+ lastName + " ");
        System.out.print("\nThank you for your recent order\n");   
    }
}

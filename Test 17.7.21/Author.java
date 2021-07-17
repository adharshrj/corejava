class Author {

    private String name;
    private String email;
    private char gender;  
    
    public Author (String name,String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;   
    }
   
    public String getName(){
        return name;  
    }
    
    public String getEmail(){
        return email;
    }

    public char getGender(){
        return gender;
    }

    public String toString() {
        return "Name " + name +"\t Email: " +email + "\t Gender: " + gender + "\n"; 
     }
}


class run{
    public static void main(String a[]){
        Author author = new Author("JK Rowling", "jkrowling@gmail.com", 'F');
        System.out.println(author);
    }
}

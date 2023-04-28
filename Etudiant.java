public class Etudiant() {
    private String nom;
    private int age;
    private int numeroetudiant;
    private String genre;
    private String cours;
    private int matricule;
    private double moyenne;
    private int[] telephone;


    public static String ecole = " goldencollar";

    public Etudiant(String nom,int age, String genre) {
        this.nom = nom;
        this.age = age;
        this.genre = genre;
        this.matricule = matricule;
        this.moyenne = moyenne;
        this.telephone = telephone;
        this.cours = cours;
        this.numeroetudiant = numeroetudiant

public Etudiant(String nom, String genre, int age) {
            this(nom, genre, age, "a definir");
        }

    public Etudiant(String nom, String genre) {
            this(nom, genre, age " a definir");
        }

    public Etudiant(String nom) {
            this(nom, 30, " masculin", );
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return this.nom;
        }

        public void setPrenom(String genre) {
            this.genre = genre;


    public Etudiant (String nom, int age) {
            this (nom, age, genre "a definir")

    public Etudiant (String nom) {
            this(nom "a definir", genre "Masculin" )
        }

        public void setAge(int age) {
            if (age < 0) {
                System.out.println("L'âge doit être superieur a 25 ");
            } else {
                this.age = age;
        }

        public int getage() {
            return this.age;
        }

        public void setgenre(String genre) {
            this.genre = genre;
        }

        public String getgenre() {
            return this.genre;
        }
         public void setnumeroetudiant (int numeroetudiant){

                this.numeroetudiant= numeroetudiant;

         public void getnumeroetudiant=( int numeroetudiant){

             return this.numeroetudiant;

         public void setmatricule ( int matricule){
             this.matricule= matricule;

          public void getmatricule(int matricule){
              return this.matricule;

         public void setcours (String cours){
             this.cours=cours;

         public void getcours( String cours) {
               return this.cours;

         public void setmoyenne (Double moyenne){
             this.moyenne=moyenne;

         public void getmoyenne( Double moyenne ){
             return this.moyenne;

         public void settelephone(Double telephone){
             this.telephone=telephone;

         public void gettelephone(Double telephone){
             return this.telephone;

             // autre methoide//


         }



         }




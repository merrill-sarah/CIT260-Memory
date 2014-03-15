/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

/**
 *
 * @author Janis
 */
public abstract class Author {
   private final String firstName;
   private final String lastName;
   private final String major;
   private final String locale;  // earning degree on-campus or online?
   private final String classLvl; // Freshman, Sophamore, Junior, or Senior
   private final String credits; // total credits earned at this time
   private final String gradSem; //Semester plan to graduate
   private final String gradYr; // Year plan to graduate
   private final String pronoun; // use he or she?

  
   
   public Author(String fN, String lN, String m, String l, String cLvl,
           String cr, String gSem, String gYr, String pn){ 
       firstName = fN;
       lastName = lN; 
       major = m;  
       locale = l; 
       classLvl = cLvl; 
       credits = cr; 
       gradSem = gSem;
       gradYr = gYr; 
       pronoun = pn;
   }

   
   public void displayBio(){ 
      
       System.out.print("\n\tIntroducing Memory Game Author " + firstName + " " + lastName+ ":"
                 + "\n\t"+ firstName+ " is a " + major + " major "
               + "\n\tin the "+ locale+ " program."
               + "\n\t"+ pronoun+ " is a "+classLvl+ " with " + credits+ " completed credits."
               + "\n\t" +firstName + " plans to graduate at the end of the "
               + gradSem+ " "+ gradYr+" semester."
               + "\n\t"+ pronoun+ " has a message for you: \n");
   }
   
   public abstract void getBio();
   
}

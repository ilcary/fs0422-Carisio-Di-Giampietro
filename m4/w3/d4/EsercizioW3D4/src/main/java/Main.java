import java.util.HashSet;
import java.util.Set;

import DAO.SchoolDAO;
import models.Gender;
import models.Presence;
import models.Student;
import models.Vote;

/*
Creare l'applicazione EpicodeSchool che gestisce studenti.
Utilizzare le JPA e i Database.
NomeDatabse: epicodeschool

Tabelle:
Student[ id (step di 3), fullname, gender (Enum M / F)  ]
Vote[ id (increment), vote, student_id ]  uno studente ha N voti, un voto appartiene a uno studente
Presenze [ id, (increment) num, student_id ]  uno studente ha UNA row di presenze, e una ROW di presenze appartiene a uno studente
BadNotes [ id, (increment) text ] N studenti possono avere N note, e viceversa (usare tabella di join)


Nell' applicazione principale, abbiamo i metodi:

addStudent( fullname, gender )
addStudentVote( idStudent, vote )
setStudentPresences( idStudent, num )
increaseStudentPresences( idStudent )
descreaseStudentPresences( idStudent )
addBadNoteToStudent( idStudent, note )
showStudentInfo( id ) -> stampa info studente, voti e media voto, presenze e tutte le eventuali note 

Per le query utilizzare JQPL e CriteriaAPI 
*/

public class Main {

	public static void main(String[] args) {

		SchoolDAO.makeIstances();
		
	}

	

}

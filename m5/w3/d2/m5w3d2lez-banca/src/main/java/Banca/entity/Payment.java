package Banca.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*La classe Payment
 * gestisce una transazione tra un utente il suo conto (gestisce le date di
 * prelievo, deposito, conto e utente).
 */

@Entity
@Table(name = "payments")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private User user;
	
	@ManyToOne
	private BankAccount bankAccount;
	
	private int deposit;
	
	private LocalDate date;

	public Payment(User user, BankAccount bankAccount, int deposit, LocalDate date) {
		this.user = user;
		this.bankAccount = bankAccount;
		this.deposit = deposit;
		this.date = date;
	}
	
	

}

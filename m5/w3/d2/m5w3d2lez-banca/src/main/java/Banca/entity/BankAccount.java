package Banca.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "bank_accounts")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true, nullable = false)
	@SequenceGenerator(name = "accountCodeGen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "accountCodeGen", strategy = GenerationType.SEQUENCE)
	private int IBAN;
	
	@ManyToMany
	@JoinTable(
			name = "accounts_users",
			joinColumns =  @JoinColumn(name = "account_id"),
			inverseJoinColumns = @JoinColumn(name = "user_id")
			 )
	private Set<User> user;
	
	private int balance = 0;

	public BankAccount( Set<User> user) {
		this.user = user;
	}
	
	
	
}

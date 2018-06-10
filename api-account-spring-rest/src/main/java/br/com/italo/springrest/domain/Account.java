package br.com.italo.springrest.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "account")
public class Account implements Serializable{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAccount;
	
	@Column(name = "id_user", nullable = false)
	private Long idUser;
	
	@Column(name = "balance", nullable = false)
	private float balance;
	
	@Column(name="limit_sake_diary", nullable=false)
	private float limitSakeDiary;
	
	@Column(name="is_active", nullable=false)
	private boolean isActivite;
	
	@Column(name="type_account", nullable=false)
	private int typeAccount;
	
	@Column(name="date_created", nullable=false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dateCreated;

	public Account(Long idAccount, Long idUser, float balance, float limitSakeDiary, boolean isActivite,
			int typeAccount, Date dateCreated) {
		super();
		this.idAccount = idAccount;
		this.idUser = idUser;
		this.balance = balance;
		this.limitSakeDiary = limitSakeDiary;
		this.isActivite = isActivite;
		this.typeAccount = typeAccount;
		this.dateCreated = dateCreated;
	}

	public Account(Long idUser, float balance, float limitSakeDiary, boolean isActivite, int typeAccount,
			Date dateCreated) {
		super();
		this.idUser = idUser;
		this.balance = balance;
		this.limitSakeDiary = limitSakeDiary;
		this.isActivite = isActivite;
		this.typeAccount = typeAccount;
		this.dateCreated = dateCreated;
	}

	public Account(float balance, float limitSakeDiary, boolean isActivite, int typeAccount, Date dateCreated) {
		super();
		this.balance = balance;
		this.limitSakeDiary = limitSakeDiary;
		this.isActivite = isActivite;
		this.typeAccount = typeAccount;
		this.dateCreated = dateCreated;
	}

	public Account() {
		super();
	}

	public Long getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(Long idAccount) {
		this.idAccount = idAccount;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getLimitSakeDiary() {
		return limitSakeDiary;
	}

	public void setLimitSakeDiary(float limitSakeDiary) {
		this.limitSakeDiary = limitSakeDiary;
	}

	public boolean isActivite() {
		return isActivite;
	}

	public void setActivite(boolean isActivite) {
		this.isActivite = isActivite;
	}

	public int getTypeAccount() {
		return typeAccount;
	}

	public void setTypeAccount(int typeAccount) {
		this.typeAccount = typeAccount;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
 
        Account account = (Account) o;
 
        return idAccount != null ? idAccount.equals(account.idAccount) : account.idAccount == null;
    }
 
    @Override
    public int hashCode() {
        return idAccount != null ? idAccount.hashCode() : 0;
    }
 
    @Override
    public String toString() {
        return "Curso{" +
                "id=" + idAccount +
                '}';
    }
	
}

package br.com.webfinance.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FinancialEntry {

	@Id
	private int entryId;
	private String name;
	private String description;
	@Reference
	private Category category;
	private int maturityMonth;
	private int maturityYear;
	private int maturityDay;
	private Date paymentDate;
	private double value;
	private double totalValue;
	
	@Reference
	private EntryType entryType;
	private boolean closed;
	
	public FinancialEntry(String name, double totalValue,
			EntryType entryType) {
		super();
		this.name = name;
		this.totalValue = totalValue;
		this.entryType = entryType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((category == null) ? 0 : category.hashCode());
		result = prime * result + entryId;
		result = prime * result
				+ ((entryType == null) ? 0 : entryType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof FinancialEntry))
			return false;
		FinancialEntry other = (FinancialEntry) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (entryId != other.entryId)
			return false;
		if (entryType == null) {
			if (other.entryType != null)
				return false;
		} else if (!entryType.equals(other.entryType))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getEntryId() {
		return entryId;
	}

	public void setEntryId(int entryId) {
		this.entryId = entryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}


	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	public EntryType getEntryType() {
		return entryType;
	}

	public void setEntryType(EntryType entryType) {
		this.entryType = entryType;
	}
	
	@Override
	public String toString() {
		return name+" - "+description;
	}

	public int getMaturityMonth() {
		return maturityMonth;
	}

	public void setMaturityMonth(int maturityMonth) {
		this.maturityMonth = maturityMonth;
	}

	public int getMaturityYear() {
		return maturityYear;
	}

	public void setMaturityYear(int maturityYear) {
		this.maturityYear = maturityYear;
	}

	public int getMaturityDay() {
		return maturityDay;
	}

	public void setMaturityDay(int maturityDay) {
		this.maturityDay = maturityDay;
	}
	
}

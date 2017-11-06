package hw.gorovtsov.gift.entity;

public class MilkChocolate extends SweetStuff{
	private int weight; // вес сладости
	private int containsSugar; // количество сахара на 100 г сладости
	private String name; // название сладости
	
	public MilkChocolate() {
		this.weight = 100;
		this.containsSugar = 65;
		this.name = "Nestle";
	}
	
	public MilkChocolate(int weight, int containsSugar, String name) {
		this.weight = weight;
		this.containsSugar = containsSugar;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + containsSugar;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MilkChocolate other = (MilkChocolate) obj;
		if (containsSugar != other.containsSugar)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	
	public String toString() {
		return name + "[Молочная шоколадка | вес =" + weight + ", Сахара на 100г=" + containsSugar + "]";
	}
}

package hw.gorovtsov.gift.entity;

public class SweetStuff{
	private int weight; // вес сладости
	private int containsSugar; // количество сахара на 100 г сладости
	private String name; // название сладости

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getContainsSugar() {
		return containsSugar;
	}

	public void setContainsSugar(int containsSugar) {
		this.containsSugar = containsSugar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
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
		SweetStuff other = (SweetStuff) obj;
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
}
